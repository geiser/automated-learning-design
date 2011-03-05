package br.usp.ime.cg.automatedld.server.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph<N, R> implements Cloneable {
	
	public Graph<N, R> clone() {
		Graph<N, R> obj = new Graph<N, R>(this.getNodes());
		for(N nodeFrom : this.getOutgoingEdges().keySet()) {
			List<Edge> edges = this.getOutgoingEdges().get(nodeFrom);
			for (Edge edge : edges) {				
				obj.addEdge(nodeFrom, edge.getRelation(), edge.getNode());
			}
		}
		return obj;
	}
	
	public class Edge {
		
		private R relation;
		
		private N node;

		public Edge(R relation, N node) {
			this.relation = relation;
			this.node = node;
		}

		public void setRelation(R relation) {
			this.relation = relation;
		}

		public R getRelation() {
			return relation;
		}

		public void setNode(N node) {
			this.node = node;
		}

		public N getNode() {
			return node;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == this) { return true; }
	        if (!(obj instanceof Graph.Edge) || (obj == null)) { return false; }
	        @SuppressWarnings("unchecked")
			Edge edge = (Edge) obj;
			return (this.relation.equals(edge.getRelation()) &&
					this.node.equals(edge.getNode()));
		}
		
	}
	
	private final Map<N,List<Edge>> outgoingEdges = new HashMap<N, List<Edge>>();
	private final Map<N,List<Edge>> incomingEdges = new HashMap<N, List<Edge>>();
	
	public Graph() {
		this(new ArrayList<N>());
	}
	
	public Graph(List<N> nodes) {
		for (N node : nodes) {
			this.outgoingEdges.put(node, new ArrayList<Edge>());
			this.incomingEdges.put(node, new ArrayList<Edge>());
		}
	}

	public Map<N,List<Edge>> getOutgoingEdges() {
		return this.outgoingEdges;
	}
	
	public List<Edge> getOutgoingEdges(N node) {
		return this.getOutgoingEdges().get(node);
	}
	
	
	public Map<N, List<Edge>> getIncomingEdges() {
		return this.incomingEdges;
	}
	
	public List<Edge> getIncomingEdges(N node) {
		return this.getIncomingEdges().get(node);
	}
	
	public List<N> getNodes() {
		return new ArrayList<N>(this.getOutgoingEdges().keySet());
	}
	
	public List<N> breadthTransverse(N node, R relation) {
		Queue<N> queue = new LinkedList<N>();
		queue.add(node);		
		List<N> toReturn = breadthTransverseHelper(queue,
											relation,
											new HashMap<N,Boolean>(),
											new ArrayList<N>());
		return toReturn;
	}

	private List<N> breadthTransverseHelper(Queue<N> queue, R relation,
			HashMap<N, Boolean> visited, List<N> toReturn) {
		if (queue.isEmpty()) {
			return toReturn; 
		} else{
			// insert the node in result
			N node = queue.poll();
			toReturn.add(node);
			visited.put(node, true);
			
			// iterate over edges related with node
			List<Edge> outgoingEdges = this.outgoingEdges.get(node);
			for (Edge edge : outgoingEdges) {
				N nodeTo = edge.getNode();
				if ((relation.equals(edge.getRelation())) && (visited.get(nodeTo)!=null) && (!visited.get(nodeTo))) {
					queue.add(nodeTo);
				}
			}
			
			return breadthTransverseHelper(queue, relation, visited, toReturn);
		}
	}

	public Graph<N, R> addEdge(N nodeFrom, R relation, N nodeTo) {
		// add in outgoing edges
		if (this.outgoingEdges.get(nodeFrom) == null) {
			this.outgoingEdges.put(nodeFrom, new ArrayList<Edge>());
		}
		List<Edge> outgoingEdges = this.outgoingEdges.get(nodeFrom);
		outgoingEdges.add(new Edge(relation, nodeTo));
		this.outgoingEdges.put(nodeFrom, outgoingEdges);
		
		// add in incoming edges
		if (this.incomingEdges.get(nodeTo) == null) {
			this.incomingEdges.put(nodeTo, new ArrayList<Edge>());
		}
		List<Edge> incomingEdges = this.incomingEdges.get(nodeTo);
		incomingEdges.add(new Edge(relation, nodeFrom));
		this.incomingEdges.put(nodeTo, incomingEdges);
		
		return this;
	}

	public Graph<N,R> removeEdge(N nodeFrom, R relation, N nodeTo) {
		// remove from outgoing edges
		if (this.outgoingEdges.get(nodeFrom) != null) {
			List<Edge> edges = this.outgoingEdges.get(nodeFrom);
			edges.remove(new Edge(relation, nodeTo));
			this.outgoingEdges.put(nodeFrom, edges);
		}
		
		// remove from incoming edges
		if (this.incomingEdges.get(nodeTo)!=null) {
			List<Edge> edges = this.incomingEdges.get(nodeTo);
			edges.remove(new Edge(relation, nodeFrom));
			this.incomingEdges.put(nodeTo, edges);
		}
		
		return this;
	}
	
	public Graph<N, R> addNode(N node) {
		if (!this.outgoingEdges.containsKey(node)){
			this.outgoingEdges.put(node, new ArrayList<Edge>());
		}
		if (!this.incomingEdges.containsKey(node)){
			this.incomingEdges.put(node, new ArrayList<Edge>());
		}
		return this;
	}
	
	public Graph<N, R> removeNode(N node) {
		if (this.outgoingEdges.containsKey(node)) {
			this.outgoingEdges.remove(node);			
		}
		if (this.incomingEdges.containsKey(node)) {
			this.incomingEdges.remove(node);
		}
		return this;
	}
	
	/**
	 * Topological sort in a graph
	 * 
	 * @param relation that used to do topological sort
	 * @return list of node in sort way
	 */
	public List<N> topologicalSort(R relation) {
		Graph<N, R> graph = this.clone();
		
		List<N> sorted = new ArrayList<N>();
		Queue<N> queue = new LinkedList<N>();

		// put nodes in queue that doesn't have incoming edges
		Map<N, List<Edge>> incomingEdges = graph.getIncomingEdges();
		for (N node : incomingEdges.keySet()) {
			if (incomingEdges.get(node).isEmpty()) {
				queue.add(node);
			}
		}
		
		while(!queue.isEmpty()) {
			N node = queue.poll();
			sorted.add(node);
			
			List<Edge> outgoing = new ArrayList<Edge>(graph.getOutgoingEdges(node));
			for (Edge edge : outgoing) {
				graph = graph.removeEdge(node, edge.getRelation(), edge.getNode());
				if (graph.getIncomingEdges(edge.getNode()).isEmpty()) {
					sorted.add(edge.getNode());
				}
			}
		}
		
		Map<N, List<Edge>> outgoing = graph.getOutgoingEdges();
		for (N node: outgoing.keySet()) {
			if (!outgoing.get(node).isEmpty()) {
				throw new Error("ERROR: The graph has at least one cycle!!");
			}
		}
		
		return sorted;
	}

}
