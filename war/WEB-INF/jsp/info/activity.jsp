<%@page isELIgnored="false"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<title><c:out value="${theoryName}" /></title>
</head>
<body>

<c:choose>
	<c:when test="${theoryName eq 'anchoredInstruction'}">
		<h1>Anchored Instruction</h1>
		<hr />
		<p>The main focus of the Anchored Instruction theory developed by
		the Cognition &amp; Technology Group at Vanderbilt (CTGV) under the
		supervision of Dr. John Bransford is to create an environment that
		encourages learners to solve <strong>real and complex
		problems</strong>. The term anchor in the title of the theory refers to the
		context of the problem being solved. An anchor holder is the term used
		to specify a learner trying to solve a problem in the given context.
		The main intention of the theory is to <strong>create
		realistic and interesting situations</strong> where learners can actively
		construct their knowledge.</p>
	</c:when>
	<c:when test="${theoryName eq 'cognitiveApprenticeship'}">
		<h1>Cognitive Apprenticeship</h1>
		<hr />
		<p>The Cognitive Apprenticeship theory focuses on supporting a
		more skilled individual (master) to teach a lesser skilled individual
		(apprentice). Cognitive Apprenticeship provides practical steps for <i>creating
		authentic situations</i> that lead individuals to act and interact to <i>acquire
		skills</i> in a <i>specific context, and generalize these skills to
		other situations afterwards</i>. The theory is comprised of the following
		five main characteristics that support the interactions among
		individuals and the teaching-learning process: <strong>modeling,
		coaching (scaffolding), reflection, articulation, and exploration</strong>.</p>
	</c:when>
	<c:when test="${theoryName eq 'cognitiveFlexibility'}">
		<h1>Cognitive Flexibility</h1>
		<hr />
		<p>Learning in <i>complex and ill-structured domains</i> is the
		main focus of this theory. Cognitive flexibility requires that
		individuals have some expertise in the domain knowledge being tackled.
		The environment created by this theory emphasizes on <strong>presentation
		of information in multiple perspectives</strong>. One example:</p>
		<ul>
			<li>A learner (panelist) providing many options (or possible
			solutions) to deal with one single problem (case study) and give the
			opportunity to other learners (audience) to think and interact in
			order to restructure their knowledge in response to the complexity of
			the situation.</li>
		</ul>
		<p>It has been specially developed to <strong>support the
		use of interactive technology</strong>, in particular, hypertexts.</p>
	</c:when>
	<c:when test="${theoryName eq 'distributedCognition'}">
		<h1>Distributed Cognition</h1>
		<hr />
		<p>The main characteristic of this theory is the <i>emphasis
		on interactions between individual- individual,
		individual-environment, and individual-artifacts</i>. The idea is that
		learning and development occurs as an interactive and reciprocal
		process. The claim is that <strong>human knowledge and
		cognition</strong> do not belong to an individual. Instead, it <strong>is
		distributed among the things (people, objects, tools) individuals</strong>
		interact with. In Distributed Cognition, learners who already have
		some knowledge/skill can improve their performance by engaging in
		interactive processes with tools and other learners allowing the
		construction of new knowledge and the growth of cognitive
		capabilities.</p>
	</c:when>
	<c:when test="${theoryName eq 'lpp'}">
		<h1>Legitimate Peripheral Participation</h1>
		<hr />
		<p>The Legitimate Peripheral Participation (LPP) theory describes
		the <i>evolution of a newcomer (peripheral participant) towards
		becoming an experienced member (full participant)</i> and eventually
		leaving the group. In LPP, a newcomer initially completes only simple
		tasks that require low level of cognitive skills. Then, through <strong>gradual
		interaction with other newcomers and experienced members</strong>, the <strong>activities
		given to newcomers increases in terms of importance and complexity</strong>
		(less peripheral) until newcomers reach the status of full
		participants where they are able to solve difficult tasks requiring
		high level of skills and knowledge.</p>
	</c:when>
	<c:when test="${theoryName eq 'observationalLearning'}">
		<h1>Observational Learning</h1>
		<hr />
		<p>The Observational Learning theory describes the process of
		learning through observation (and replication). According to the
		theory, there are four key elements to learn by observation: <i>attention,
		retention, reproduction, and motivation</i>. Thus, a learner can learn by
		carefully <strong>observing his/her peers during the solution
		of a problem</strong>. In such case, if the solution of his/her peers is
		correct a learner learns what to do with similar problems and if the
		solution is incorrect he/she learns what not to do.</p>
	</c:when>
	<c:when test="${theoryName eq 'peerTutoring'}">
		<h1>Peer Tutoring</h1>
		<hr />
		<p>The Peer Tutoring theory considers that both tutor and tutee
		can gain benefits from their interactions. As same as individual
		learning the tutor is a more knowledgeable individual and the tutee is
		a less knowledgeable individual. Yet, both <i>tutor and tutee are
		learners who do not have the complete knowledge about the content</i>.
		Thus, by facing difficulties in teaching, the tutor will have to
		acquire more knowledge in order to <strong>teach and organize
		his thoughts in an understandable manner</strong>; and by being helped, the
		tutee will acquire or construct his/her knowledge as well.</p>
	</c:when>
	<c:when test="${theoryName eq 'socioCultural'}">
		<h1>Socio Cultural</h1>
		<hr />
		<p>The Socio-cultural theory tries to explain the result of
		interactions on learning development. It states that development
		appears <i>in a social level (interpsychological) and then in an
		individual level (intrapsychological)</i>. It also introduces the concept
		of zone of proximal development (ZPD) that indicates the potential for
		cognitive development. A learner can only achieve his/her full
		potential by <strong>interacting effectively with peers</strong>.
		According to this theory, the engagement of learners in activities
		that <strong>support thinking processes and the diagnosis of
		other learners thinking processes are key to develop (meta) cognitive
		skills</strong>.</p>
	</c:when>
	<c:otherwise>
		<strong>ERROR :: this activity theory doesn't exits</strong>
	</c:otherwise>
</c:choose>

<div>
<table>
	<thead>
		<tr>
			<td>
			<b>Instructor Role</b><br/>
			<c:if test="${ not empty instructorIds }">
				<c:forEach var="instructorId" items="${instructorIds}">${instructorId}, </c:forEach>
			</c:if>
			</td>
			<td>
			<b>Learner Role</b><br/>
			<c:if test="${ not empty learnerIds }">
				<c:forEach var="learnerId" items="${learnerIds}">${learnerId}, </c:forEach>
			</c:if>
			</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<center>Instructor Activities (secondary focus)</center>
			<c:if test="${ (not empty skill) && (not empty knowledge) }">
			<center>In <c:out value="${skill.propertyMap['title'][0].value}" /> <c:out value="${knowledge.propertyMap['title'][0].value}" /></center>
			</c:if>
			<c:choose>
				<c:when test="${theoryName eq 'anchoredInstruction'}">
				<p>Anchored Instructor (adviser):: Learning by diagnosing<br/>
				Expected Benefits:: s(2,1),s(3,1),s(3,2) ou s(2,1),s(2,2),s(3,2) ou s(2,3),s(3,3)
				</p>
				<ol type="a">
					<li>(Requisting problem's details) (&rarr; i)
					<ol type="i">
						<li>(Notifying how the learner is) (&rarr; a)</li>
					</ol>
					</li>
					<li>(Diagnosing the problem) (&rarr; i, iv)
					<ol type="i">
						<li>(Setting up learning context) (&rarr; ii)</li>
						<li>(Eliciting performance) (&rarr; iii)</li>
						<li>(Monitoring) (&rarr; b)</li>
						<li>(Showing a solution) (&rarr; v)</li>
						<li>(Instigating discussion) (&rarr; iv)</li>
					</ol>
					</li>
					<li>(Affirmative reaction)</li>
				</ol>
				</c:when>
				<c:when test="${theoryName eq 'cognitiveApprenticeship'}">
				<p>Master (guide):: Learning by guiding<br/>
				Expected Benefits:: s(3,y),s(4,y) y={0..3}
				</p>
				<ul>
					<li></li>
				</ul>
				</c:when>
				<c:when test="${theoryName eq 'cognitiveFlexibility'}">
				<p>Panelist (presenter):: Learning by self-expression<br/>
				Expected Benefits:: s(2,y),s(3,y) y={1..3}
				</p>
				<ol type="a">
					<li>(Knowledge transmission) (&rarr; i, iv)
					<ol type="i">
						<li>(Setting up learning context) (&rarr; ii)</li>
						<li>(Eliciting performance) (&rarr; iii)</li>
						<li>(Monitoring) (&rarr; b)</li>
						<li>(Instigating discussion) (&rarr; v)</li>
						<li>(Instigating thinking) (&rarr; a)</li>
					</ol>
					</li>
					<li>(Affirmative reaction)</li>
				</ol>
				</c:when>
				<c:when test="${theoryName eq 'distributedCognition'}">
				<p>Full participant (problem solver):: Learning by discussion<br/>
				Expected Benefits:: s(2,y),s(3,y) ou s(x,2),s(x,3) x={3,4} y={2,3}
				</p>
				<ul>
					<li></li>
				</ul>
				</c:when>
				<c:when test="${theoryName eq 'lpp'}">
				<p>Full participant (problem solver):: Learning by discussion<br/>
				Expected Benefits:: s(3,y),s(4,y) ou s(x,2),s(x,3) x={3,4} y={2,3}
				</p>
				<ol type="a">
					<li>(Demonstrating how to solve a problem) (&rarr; i)
					<ol type="i">
						<li>(Instigating discussion) (&rarr; a)</li>
					</ol>
					</li>
					<li>(Requesting problem details)</li>
					<li>(Notifying how the learner is) (&rarr; i)
					<ol type="i">
						<li>(Demonstrating how to solve a problem) (&rarr; ii)</li>
						<li>(Instigating discussion) (&rarr; i)</li>
					</ol>
					</li>
					<li>(Affirmative reaction)</li>
				</ol>
				</c:when>
				<c:when test="${theoryName eq 'peerTutoring'}">
				<p>Peer Tutor (explainer):: Learning by teaching<br/>
				Expected Benefits:: s(x,1),s(x,2) x={0..4}
				</p>
				<ul>
					<li></li>
				</ul>
				</c:when>
			</c:choose>
			</td>
			<td>
			<center>Learner Activities (primary focus)</center>
			<c:if test="${ (not empty skill) && (not empty knowledge) }">
			<center>In <c:out value="${skill.propertyMap['title'][0].value}" /> <c:out value="${knowledge.propertyMap['title'][0].value}" /></center>
			</c:if>
			<c:choose>
				<c:when test="${theoryName eq 'anchoredInstruction'}">
				<p>Anchor Holder (presenter):: Learning by being taught<br/>
				Expected Benefits:: s(x,0),s(x,1),s(x,2) x={0..4}
				</p>
				<ol type="a">
					<li>(Requisting problem's details) (&rarr; i)
					<ol type="i">
						<li>(Notifying how the learner is) (&rarr; a)</li>
					</ol>
					</li>
					<li>(Diagnosing the problem) (&rarr; i, iv)
					<ol type="i">
						<li>(Setting up learning context) (&rarr; ii)</li>
						<li>(Eliciting performance) (&rarr; iii)</li>
						<li>(Monitoring) (&rarr; b)</li>
						<li>(Showing a solution) (&rarr; v)</li>
						<li>(Instigating discussion) (&rarr; iv)</li>
					</ol>
					</li>
					<li>(Affirmative reaction)</li>
				</ol>
				</c:when>
				<c:when test="${theoryName eq 'cognitiveApprenticeship'}">
				<p>Apprenticeship (imitator):: Learning by apprenticeship<br/>
				Expected Benefits:: s(0,y),s(1,y),s(2,y),s(3,y) y={0..3}
				</p>
				<ul>
					<li></li>
				</ul>
				</c:when>
				<c:when test="${theoryName eq 'cognitiveFlexibility'}">
				<p>Audience (reviwer/evaluator):: Learning by reflection<br/>
				Expected Benefits:: s(x,2),s(x,3) x={0..4}
				</p>
				<ol type="a">
					<li>(Knowledge transmission) (&rarr; i, iv)
					<ol type="i">
						<li>(Setting up learning context) (&rarr; ii)</li>
						<li>(Eliciting performance) (&rarr; iii)</li>
						<li>(Monitoring) (&rarr; a)</li>
						<li>(Instigating discussion) (&rarr; v)</li>
						<li>(Instigating thinking) (&rarr; a)</li>
					</ol>
					</li>
					<li>(Affirmative reaction)</li>
				</ol>
				</c:when>
				<c:when test="${theoryName eq 'distributedCognition'}">
				<p>Full participant (problem solver):: Learning by discussion<br/>
				Expected Benefits:: s(3,y),s(4,y) ou s(x,2),s(x,3) x={3,4} y={2,3}
				</p>
				<ul>
					<li></li>
				</ul>
				</c:when>
				<c:when test="${theoryName eq 'lpp'}">
				<p>Peripheral participant (problem solver):: Learning by practice<br/>
				Expected Benefits:: s(0,y),s(1,y),s(3,y) y={0..3}
				</p>
				<ol type="a">
					<li>(Demonstrating how to solve a problem) (&rarr; i)
					<ol type="i">
						<li>(Instigating discussion) (&rarr; a)</li>
					</ol>
					</li>
					<li>(Requesting problem details)</li>
					<li>(Notifying how the learner is) (&rarr; i)
					<ol type="i">
						<li>(Demonstrating how to solve a problem) (&rarr; ii)</li>
						<li>(Instigating discussion) (&rarr; i)</li>
					</ol>
					</li>
					<li>(Affirmative reaction)</li>
				</ol>
				</c:when>
				<c:when test="${theoryName eq 'peerTutoring'}">
				<p>Peer Tutee (passive learner):: Learning by being taught<br/>
				Expected Benefits:: s(x,0),s(x,1) x={0..4}
				</p>
				<ul>
					<li></li>
				</ul>
				</c:when>
			</c:choose>
			</td>
		</tr>
	</tbody>
</table>
</div>

</body>
</html>