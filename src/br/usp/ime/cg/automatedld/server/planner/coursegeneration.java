package br.usp.ime.cg.automatedld.server.planner;
import com.gamalocus.jshop2rt.*;

public class coursegeneration extends Domain
{
	private static final long serialVersionUID = -1473652519000651972L;


	/**
	 * Operator #-1 for primitive task !!addInWorldState
	 * Source: (line:63, col:4) to (line:66, col:13)
	 */
	public static class Operator0 extends Operator
{
	/**
	 * Operator #-1 for primitive task !!addInWorldState
	 */
		public Operator0(Domain owner)
		{
			super(owner, new Predicate(0, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[1];
			addIn[0] = new DelAddAtomic(new Predicate(0, 1));

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !!addInWorldState [line:63,4 to 66,13]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(1)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !!removeFromWorldState
	 * Source: (line:68, col:4) to (line:71, col:8)
	 */
	public static class Operator1 extends Operator
{
	/**
	 * Operator #-1 for primitive task !!removeFromWorldState
	 */
		public Operator1(Domain owner)
		{
			super(owner, new Predicate(1, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[1];
			delIn[0] = new DelAddAtomic(new Predicate(0, 1));

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !!removeFromWorldState [line:68,4 to 71,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(1)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !startLDElement
	 * Source: (line:85, col:4) to (line:85, col:44)
	 */
	public static class Operator2 extends Operator
{
	/**
	 * Operator #-1 for primitive task !startLDElement
	 */
		public Operator2(Domain owner)
		{
			super(owner, new Predicate(2, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !startLDElement [line:85,4 to 85,44]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(1)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !startLDElement
	 * Source: (line:86, col:4) to (line:86, col:56)
	 */
	public static class Operator3 extends Operator
{
	/**
	 * Operator #-1 for primitive task !startLDElement
	 */
		public Operator3(Domain owner)
		{
			super(owner, new Predicate(2, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !startLDElement [line:86,4 to 86,56]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(2)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !startLDElement
	 * Source: (line:87, col:4) to (line:87, col:62)
	 */
	public static class Operator4 extends Operator
{
	/**
	 * Operator #-1 for primitive task !startLDElement
	 */
		public Operator4(Domain owner)
		{
			super(owner, new Predicate(2, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !startLDElement [line:87,4 to 87,62]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(3)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !endLDElement
	 * Source: (line:88, col:4) to (line:88, col:42)
	 */
	public static class Operator5 extends Operator
{
	/**
	 * Operator #-1 for primitive task !endLDElement
	 */
		public Operator5(Domain owner)
		{
			super(owner, new Predicate(3, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !endLDElement [line:88,4 to 88,42]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(1)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !insertLearningService
	 * Source: (line:90, col:4) to (line:90, col:80)
	 */
	public static class Operator6 extends Operator
{
	/**
	 * Operator #-1 for primitive task !insertLearningService
	 */
		public Operator6(Domain owner)
		{
			super(owner, new Predicate(4, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !insertLearningService [line:90,4 to 90,80]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(3)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !insertLearningService
	 * Source: (line:91, col:4) to (line:91, col:93)
	 */
	public static class Operator7 extends Operator
{
	/**
	 * Operator #-1 for primitive task !insertLearningService
	 */
		public Operator7(Domain owner)
		{
			super(owner, new Predicate(4, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !insertLearningService [line:91,4 to 91,93]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(4)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !text
	 * Source: (line:92, col:4) to (line:92, col:47)
	 */
	public static class Operator8 extends Operator
{
	/**
	 * Operator #-1 for primitive task !text
	 */
		public Operator8(Domain owner)
		{
			super(owner, new Predicate(5, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !text [line:92,4 to 92,47]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(2)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !dynamicTask
	 * Source: (line:93, col:4) to (line:93, col:69)
	 */
	public static class Operator9 extends Operator
{
	/**
	 * Operator #-1 for primitive task !dynamicTask
	 */
		public Operator9(Domain owner)
		{
			super(owner, new Predicate(6, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !dynamicTask [line:93,4 to 93,69]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(2)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !addUserToRole
	 * Source: (line:109, col:4) to (line:112, col:26)
	 */
	public static class Operator10 extends Operator
{
	/**
	 * Operator #-1 for primitive task !addUserToRole
	 */
		public Operator10(Domain owner)
		{
			super(owner, new Predicate(7, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[1];
			addIn[0] = new DelAddAtomic(new Predicate(16, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !addUserToRole [line:109,4 to 112,26]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(2)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !removeUserFromRole
	 * Source: (line:128, col:4) to (line:131, col:8)
	 */
	public static class Operator11 extends Operator
{
	/**
	 * Operator #-1 for primitive task !removeUserFromRole
	 */
		public Operator11(Domain owner)
		{
			super(owner, new Predicate(8, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[1];
			delIn[0] = new DelAddAtomic(new Predicate(16, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !removeUserFromRole [line:128,4 to 131,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(2)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !insertResource
	 * Source: (line:158, col:4) to (line:161, col:21)
	 */
	public static class Operator12 extends Operator
{
	/**
	 * Operator #-1 for primitive task !insertResource
	 */
		public Operator12(Domain owner)
		{
			super(owner, new Predicate(9, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[1];
			addIn[0] = new DelAddAtomic(new Predicate(17, 1, new TermList(owner.getTermVariable(0), TermList.NIL)));

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !insertResource [line:158,4 to 161,21]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(1)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Operator #-1 for primitive task !insertResource
	 * Source: (line:163, col:4) to (line:166, col:24)
	 */
	public static class Operator13 extends Operator
{
	/**
	 * Operator #-1 for primitive task !insertResource
	 */
		public Operator13(Domain owner)
		{
			super(owner, new Predicate(9, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[1];
			addIn[0] = new DelAddAtomic(new Predicate(17, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !insertResource [line:163,4 to 166,24]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			p = (new PreconditionNil(2)).setComparator(null);
			p.reset(state);

			return p;
		}
	}

	/**
	 * Method -1 for compound task addUsersToRole
	 * Source: (line:96, col:4) to (line:96, col:43)
	 */
	public static class Method0 extends Method
	{
	/**
	 * Method -1 for compound task addUsersToRole
	 */
		public Method0(Domain owner)
		{
			super(owner, new Predicate(0, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addUsersToRole [line:96,4 to 96,43]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method0Branch0(text:addUsersToRole,line:96,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task addUsersToRole
	 * Source: (line:97, col:4) to (line:100, col:37)
	 */
	public static class Method1 extends Method
	{
	/**
	 * Method -1 for compound task addUsersToRole
	 */
		public Method1(Domain owner)
		{
			super(owner, new Predicate(0, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addUsersToRole [line:97,4 to 100,37]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method1Branch0(text:addUsersToRole,line:97,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task addUserToRole
	 * Source: (line:102, col:4) to (line:107, col:8)
	 */
	public static class Method2 extends Method
	{
	/**
	 * Method -1 for compound task addUserToRole
	 */
		public Method2(Domain owner)
		{
			super(owner, new Predicate(1, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(7, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addUserToRole [line:102,4 to 107,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(16, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 2)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method2Branch0(text:addUserToRole,line:102,col:14)";
				case 1: return "Method2Branch1(text:addUserToRole,line:102,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task removeUsersFromRole
	 * Source: (line:115, col:4) to (line:115, col:48)
	 */
	public static class Method3 extends Method
	{
	/**
	 * Method -1 for compound task removeUsersFromRole
	 */
		public Method3(Domain owner)
		{
			super(owner, new Predicate(2, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task removeUsersFromRole [line:115,4 to 115,48]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method3Branch0(text:removeUsersFromRole,line:115,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task removeUsersFromRole
	 * Source: (line:116, col:4) to (line:119, col:42)
	 */
	public static class Method4 extends Method
	{
	/**
	 * Method -1 for compound task removeUsersFromRole
	 */
		public Method4(Domain owner)
		{
			super(owner, new Predicate(2, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task removeUsersFromRole [line:116,4 to 119,42]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method4Branch0(text:removeUsersFromRole,line:116,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task removeUserFromRole
	 * Source: (line:121, col:4) to (line:126, col:8)
	 */
	public static class Method5 extends Method
	{
	/**
	 * Method -1 for compound task removeUserFromRole
	 */
		public Method5(Domain owner)
		{
			super(owner, new Predicate(3, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(8, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task removeUserFromRole [line:121,4 to 126,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(16, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method5Branch0(text:removeUserFromRole,line:121,col:14)";
				case 1: return "Method5Branch1(text:removeUserFromRole,line:121,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertResourceForAllLearners!
	 * Source: (line:134, col:4) to (line:136, col:28)
	 */
	public static class Method6 extends Method
	{
	/**
	 * Method -1 for compound task insertResourceForAllLearners!
	 */
		public Method6(Domain owner)
		{
			super(owner, new Predicate(4, 1, new TermList(owner.getTermVariable(0), new TermList(TermList.NIL, TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertResourceForAllLearners! [line:134,4 to 136,28]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method6Branch0(text:insertResourceForAllLearners!,line:134,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertResourceForAllLearners!
	 * Source: (line:138, col:4) to (line:141, col:44)
	 */
	public static class Method7 extends Method
	{
	/**
	 * Method -1 for compound task insertResourceForAllLearners!
	 */
		public Method7(Domain owner)
		{
			super(owner, new Predicate(4, 3, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), owner.getTermVariable(2)), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(new TermList(owner.getTermConstant(17) /*inserted*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertResourceForAllLearners! [line:138,4 to 141,44]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method7Branch0(text:insertResourceForAllLearners!,line:138,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertResource
	 * Source: (line:144, col:4) to (line:149, col:8)
	 */
	public static class Method8 extends Method
	{
	/**
	 * Method -1 for compound task insertResource
	 */
		public Method8(Domain owner)
		{
			super(owner, new Predicate(5, 1, new TermList(owner.getTermVariable(0), TermList.NIL)));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertResource [line:144,4 to 149,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), unifier), 1)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method8Branch0(text:insertResource,line:144,col:14)";
				case 1: return "Method8Branch1(text:insertResource,line:144,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertResource
	 * Source: (line:151, col:4) to (line:156, col:8)
	 */
	public static class Method9 extends Method
	{
	/**
	 * Method -1 for compound task insertResource
	 */
		public Method9(Domain owner)
		{
			super(owner, new Predicate(5, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertResource [line:151,4 to 156,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 2)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method9Branch0(text:insertResource,line:151,col:14)";
				case 1: return "Method9Branch1(text:insertResource,line:151,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertResourceOnce!
	 * Source: (line:169, col:4) to (line:171, col:28)
	 */
	public static class Method10 extends Method
	{
	/**
	 * Method -1 for compound task insertResourceOnce!
	 */
		public Method10(Domain owner)
		{
			super(owner, new Predicate(6, 1, new TermList(owner.getTermVariable(0), TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertResourceOnce! [line:169,4 to 171,28]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), unifier), 1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method10Branch0(text:insertResourceOnce!,line:169,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertResourceOnce!
	 * Source: (line:173, col:4) to (line:175, col:31)
	 */
	public static class Method11 extends Method
	{
	/**
	 * Method -1 for compound task insertResourceOnce!
	 */
		public Method11(Domain owner)
		{
			super(owner, new Predicate(6, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertResourceOnce! [line:173,4 to 175,31]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method11Branch0(text:insertResourceOnce!,line:173,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAllResources
	 * Source: (line:178, col:4) to (line:178, col:41)
	 */
	public static class Method12 extends Method
	{
	/**
	 * Method -1 for compound task insertAllResources
	 */
		public Method12(Domain owner)
		{
			super(owner, new Predicate(7, 0, new TermList(TermList.NIL, TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAllResources [line:178,4 to 178,41]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method12Branch0(text:insertAllResources,line:178,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAllResources
	 * Source: (line:179, col:4) to (line:182, col:34)
	 */
	public static class Method13 extends Method
	{
	/**
	 * Method -1 for compound task insertAllResources
	 */
		public Method13(Domain owner)
		{
			super(owner, new Predicate(7, 2, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(7, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAllResources [line:179,4 to 182,34]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method13Branch0(text:insertAllResources,line:179,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAllResources
	 * Source: (line:184, col:4) to (line:184, col:44)
	 */
	public static class Method14 extends Method
	{
	/**
	 * Method -1 for compound task insertAllResources
	 */
		public Method14(Domain owner)
		{
			super(owner, new Predicate(7, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAllResources [line:184,4 to 184,44]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method14Branch0(text:insertAllResources,line:184,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAllResources
	 * Source: (line:185, col:4) to (line:188, col:37)
	 */
	public static class Method15 extends Method
	{
	/**
	 * Method -1 for compound task insertAllResources
	 */
		public Method15(Domain owner)
		{
			super(owner, new Predicate(7, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(7, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAllResources [line:185,4 to 188,37]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method15Branch0(text:insertAllResources,line:185,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 * Source: (line:191, col:4) to (line:191, col:48)
	 */
	public static class Method16 extends Method
	{
	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 */
		public Method16(Domain owner)
		{
			super(owner, new Predicate(8, 0, new TermList(TermList.NIL, TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addInWorldStateAsInserted [line:191,4 to 191,48]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method16Branch0(text:addInWorldStateAsInserted,line:191,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 * Source: (line:192, col:4) to (line:195, col:41)
	 */
	public static class Method17 extends Method
	{
	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 */
		public Method17(Domain owner)
		{
			super(owner, new Predicate(8, 2, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(new TermList(owner.getTermConstant(17) /*inserted*/, new TermList(owner.getTermVariable(0), TermList.NIL)), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(8, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addInWorldStateAsInserted [line:192,4 to 195,41]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method17Branch0(text:addInWorldStateAsInserted,line:192,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 * Source: (line:197, col:4) to (line:197, col:51)
	 */
	public static class Method18 extends Method
	{
	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 */
		public Method18(Domain owner)
		{
			super(owner, new Predicate(8, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addInWorldStateAsInserted [line:197,4 to 197,51]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method18Branch0(text:addInWorldStateAsInserted,line:197,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 * Source: (line:198, col:4) to (line:201, col:44)
	 */
	public static class Method19 extends Method
	{
	/**
	 * Method -1 for compound task addInWorldStateAsInserted
	 */
		public Method19(Domain owner)
		{
			super(owner, new Predicate(8, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(new TermList(owner.getTermConstant(17) /*inserted*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(8, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task addInWorldStateAsInserted [line:198,4 to 201,44]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method19Branch0(text:addInWorldStateAsInserted,line:198,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task insertWithVariantsIfReady!
	 * Source: (line:294, col:6) to (line:297, col:63)
	 */
	public static class Precondition16 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition16(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:294, col:7) to (line:294, col:28)
			p[1] = new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 4);
			// Source: (line:295, col:7) to (line:295, col:22)
			p[2] = new PreconditionAtomic(new Predicate(21, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:296, col:7) to (line:296, col:50)
			p[3] = new PreconditionAtomic(new Predicate(9, 4, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(22) /*hasEducationalLevel*/, new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:297, col:7) to (line:297, col:62)
			p[4] = new PreconditionAssign(new TermCall(new List(new TermList(owner.getTermVariable(0), TermList.NIL), new TermList(new TermNumber(-1.0), new TermList(owner.getTermConstant(39) /*isVariantOf*/, TermList.NIL))), ((coursegeneration)owner).calculateGetRelated, "((coursegeneration)owner).calculateGetRelated"), unifier, 3);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task insertWithVariantsIfReady! [line:294,6 to 297,63]";
		}
	}

	/**
	 * Method -1 for compound task insertWithVariantsIfReady!
	 * Source: (line:293, col:4) to (line:299, col:48)
	 */
	public static class Method20 extends Method
	{
	/**
	 * Method -1 for compound task insertWithVariantsIfReady!
	 */
		public Method20(Domain owner)
		{
			super(owner, new Predicate(9, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(8, 4, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertWithVariantsIfReady! [line:293,4 to 299,48]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition16(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method20Branch0(text:insertWithVariantsIfReady!,line:293,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAllAuxOnceIfReady
	 * Source: (line:302, col:4) to (line:302, col:49)
	 */
	public static class Method21 extends Method
	{
	/**
	 * Method -1 for compound task insertAllAuxOnceIfReady
	 */
		public Method21(Domain owner)
		{
			super(owner, new Predicate(10, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAllAuxOnceIfReady [line:302,4 to 302,49]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method21Branch0(text:insertAllAuxOnceIfReady,line:302,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAllAuxOnceIfReady
	 * Source: (line:303, col:4) to (line:306, col:42)
	 */
	public static class Method22 extends Method
	{
	/**
	 * Method -1 for compound task insertAllAuxOnceIfReady
	 */
		public Method22(Domain owner)
		{
			super(owner, new Predicate(10, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(11, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(10, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAllAuxOnceIfReady [line:303,4 to 306,42]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method22Branch0(text:insertAllAuxOnceIfReady,line:303,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAuxOnceIfReady
	 * Source: (line:308, col:4) to (line:313, col:8)
	 */
	public static class Method23 extends Method
	{
	/**
	 * Method -1 for compound task insertAuxOnceIfReady
	 */
		public Method23(Domain owner)
		{
			super(owner, new Predicate(13, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(12, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAuxOnceIfReady [line:308,4 to 313,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method23Branch0(text:insertAuxOnceIfReady,line:308,col:14)";
				case 1: return "Method23Branch1(text:insertAuxOnceIfReady,line:308,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task insertAuxOnceIfReady!
	 * Source: (line:316, col:6) to (line:317, col:23)
	 */
	public static class Precondition17 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition17(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:316, col:7) to (line:316, col:28)
			p[1] = new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 2);
			// Source: (line:317, col:7) to (line:317, col:22)
			p[2] = new PreconditionAtomic(new Predicate(21, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task insertAuxOnceIfReady! [line:316,6 to 317,23]";
		}
	}

	/**
	 * Method -1 for compound task insertAuxOnceIfReady!
	 * Source: (line:315, col:4) to (line:318, col:31)
	 */
	public static class Method24 extends Method
	{
	/**
	 * Method -1 for compound task insertAuxOnceIfReady!
	 */
		public Method24(Domain owner)
		{
			super(owner, new Predicate(12, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(9, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAuxOnceIfReady! [line:315,4 to 318,31]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition17(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method24Branch0(text:insertAuxOnceIfReady!,line:315,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task generatecourse
	 * Source: (line:366, col:6) to (line:367, col:69)
	 */
	public static class Precondition23 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition23(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:366, col:7) to (line:366, col:40)
			p[1] = new PreconditionAtomic(new Predicate(43, 2, new TermList(owner.getTermVariable(0), new TermList(TermList.NIL, TermList.NIL))), unifier);
			// Source: (line:367, col:7) to (line:367, col:68)
			p[2] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(0), new TermList(owner.getTermConstant(45) /*isRequieredBy*/, TermList.NIL)), ((coursegeneration)owner).calculateSort, "((coursegeneration)owner).calculateSort"), unifier, 1);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task generatecourse [line:366,6 to 367,69]";
		}
	}

	/**
	 * Method -1 for compound task generatecourse
	 * Source: (line:365, col:4) to (line:368, col:34)
	 */
	public static class Method25 extends Method
	{
	/**
	 * Method -1 for compound task generatecourse
	 */
		public Method25(Domain owner)
		{
			super(owner, new Predicate(15, 2, TermList.NIL));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(14, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task generatecourse [line:365,4 to 368,34]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition23(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method25Branch0(text:generatecourse,line:365,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task generateTopics
	 * Source: (line:370, col:4) to (line:370, col:37)
	 */
	public static class Method26 extends Method
	{
	/**
	 * Method -1 for compound task generateTopics
	 */
		public Method26(Domain owner)
		{
			super(owner, new Predicate(14, 0, new TermList(TermList.NIL, TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task generateTopics [line:370,4 to 370,37]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method26Branch0(text:generateTopics,line:370,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task generateTopics
	 * Source: (line:371, col:4) to (line:374, col:34)
	 */
	public static class Method27 extends Method
	{
	/**
	 * Method -1 for compound task generateTopics
	 */
		public Method27(Domain owner)
		{
			super(owner, new Predicate(14, 2, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(16, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(14, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task generateTopics [line:371,4 to 374,34]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method27Branch0(text:generateTopics,line:371,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * premise of Precondition #0 of Method -1 for compound task generateTopic
	 * Source: (line:378, col:15) to (line:378, col:62)
	 */
	public static class Precondition24 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition24(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:378, col:16) to (line:378, col:29)
			p[1] = new PreconditionAtomic(new Predicate(46, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), unifier);
			// Source: (line:378, col:30) to (line:378, col:61)
			p[2] = new PreconditionAtomic(new Predicate(26, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(45) /*isRequieredBy*/, new TermList(owner.getTermVariable(0), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "premise of Precondition #0 of Method -1 for compound task generateTopic [line:378,15 to 378,62]";
		}
	}

	/**
	 * Precondition #1 of Method -1 for compound task generateTopic
	 * Source: (line:383, col:6) to (line:384, col:33)
	 */
	public static class Precondition25 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition25(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:383, col:7) to (line:383, col:38)
			p[1] = new PreconditionAtomic(new Predicate(26, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(45) /*isRequieredBy*/, new TermList(owner.getTermVariable(0), TermList.NIL)))), unifier);
			// Source: (line:384, col:7) to (line:384, col:32)
			p[2] = new PreconditionNegation(new PreconditionAtomic(new Predicate(47, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), unifier), 2);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #1 of Method -1 for compound task generateTopic [line:383,6 to 384,33]";
		}
	}

	/**
	 * Method -1 for compound task generateTopic
	 * Source: (line:376, col:4) to (line:389, col:31)
	 */
	public static class Method28 extends Method
	{
	/**
	 * Method -1 for compound task generateTopic
	 */
		public Method28(Domain owner)
		{
			super(owner, new Predicate(16, 2, new TermList(owner.getTermVariable(0), TermList.NIL)));
			TaskList[] subsIn = new TaskList[3];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();
			subsIn[2] = createTaskList2();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(17, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(new TermList(owner.getTermConstant(47) /*generateTopic*/, new TermList(owner.getTermVariable(0), TermList.NIL)), TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(16, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(17, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), false, false));

			return retVal;
		}

		TaskList createTaskList2()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(17, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task generateTopic [line:376,4 to 389,31]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionForAll(new Precondition24(owner, unifier), new PreconditionAtomic(new Predicate(47, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), unifier), 2)).setComparator(null);
				break;
				case 1:
					p = (new Precondition25(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method28Branch0(text:generateTopic,line:376,col:14)";
				case 1: return "Method28Branch1(text:generateTopic,line:376,col:14)";
				case 2: return "Method28Branch2(text:generateTopic,line:376,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAndPlanTopic
	 * Source: (line:391, col:4) to (line:396, col:8)
	 */
	public static class Method29 extends Method
	{
	/**
	 * Method -1 for compound task insertAndPlanTopic
	 */
		public Method29(Domain owner)
		{
			super(owner, new Predicate(17, 1, new TermList(owner.getTermVariable(0), TermList.NIL)));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(18, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAndPlanTopic [line:391,4 to 396,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method29Branch0(text:insertAndPlanTopic,line:391,col:14)";
				case 1: return "Method29Branch1(text:insertAndPlanTopic,line:391,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task insertAndPlanTopic!
	 * Source: (line:404, col:6) to (line:406, col:75)
	 */
	public static class Precondition27 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition27(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:404, col:7) to (line:404, col:79)
			p[1] = new PreconditionAtomic(new Predicate(28, 3, new TermList(owner.getTermVariable(1), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(49) /*inverseHasObjective*/, new TermList(owner.getTermVariable(0), TermList.NIL))), TermList.NIL), TermList.NIL))), unifier);
			// Source: (line:406, col:7) to (line:406, col:74)
			p[2] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermConstant(45) /*isRequieredBy*/, TermList.NIL)), ((coursegeneration)owner).calculateSort, "((coursegeneration)owner).calculateSort"), unifier, 2);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task insertAndPlanTopic! [line:404,6 to 406,75]";
		}
	}

	/**
	 * Method -1 for compound task insertAndPlanTopic!
	 * Source: (line:403, col:4) to (line:415, col:26)
	 */
	public static class Method30 extends Method
	{
	/**
	 * Method -1 for compound task insertAndPlanTopic!
	 */
		public Method30(Domain owner)
		{
			super(owner, new Predicate(18, 3, new TermList(owner.getTermVariable(0), TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(owner.getTermConstant(50) /*ld*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(0), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(52) /*uri*/, new TermList(owner.getTermVariable(0), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(53) /*level*/, new TermList(owner.getTermConstant(54) /*C*/, TermList.NIL)), TermList.NIL))), new TermList(new TermList(owner.getTermConstant(55) /*insertAndPlanTopic!*/, new TermList(new TermList(owner.getTermVariable(0), TermList.NIL), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(19, 3, new TermList(owner.getTermConstant(56) /*discover*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(0), TermList.NIL)))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 3, new TermList(owner.getTermConstant(50) /*ld*/, TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAndPlanTopic! [line:403,4 to 415,26]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition27(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method30Branch0(text:insertAndPlanTopic!,line:403,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task insertAndPlanGoal
	 * Source: (line:430, col:4) to (line:446, col:4)
	 */
	public static class Method31 extends Method
	{
	/**
	 * Method -1 for compound task insertAndPlanGoal
	 */
		public Method31(Domain owner)
		{
			super(owner, new Predicate(19, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(20, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task insertAndPlanGoal [line:430,4 to 446,4]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(56) /*discover*/, TermList.NIL))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method31Branch0(text:insertAndPlanGoal,line:430,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task discover
	 * Source: (line:454, col:4) to (line:464, col:26)
	 */
	public static class Method32 extends Method
	{
	/**
	 * Method -1 for compound task discover
	 */
		public Method32(Domain owner)
		{
			super(owner, new Predicate(20, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(21, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task discover [line:454,4 to 464,26]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method32Branch0(text:discover,line:454,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task learnFundamentalsDiscover
	 * Source: (line:466, col:4) to (line:466, col:51)
	 */
	public static class Method33 extends Method
	{
	/**
	 * Method -1 for compound task learnFundamentalsDiscover
	 */
		public Method33(Domain owner)
		{
			super(owner, new Predicate(21, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task learnFundamentalsDiscover [line:466,4 to 466,51]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method33Branch0(text:learnFundamentalsDiscover,line:466,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task learnFundamentalsDiscover
	 * Source: (line:467, col:4) to (line:471, col:52)
	 */
	public static class Method34 extends Method
	{
	/**
	 * Method -1 for compound task learnFundamentalsDiscover
	 */
		public Method34(Domain owner)
		{
			super(owner, new Predicate(21, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(22, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(21, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task learnFundamentalsDiscover [line:467,4 to 471,52]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method34Branch0(text:learnFundamentalsDiscover,line:467,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task learnFundamentalDiscover
	 * Source: (line:475, col:6) to (line:476, col:33)
	 */
	public static class Precondition28 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition28(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:475, col:7) to (line:475, col:28)
			p[1] = new PreconditionAtomic(new Predicate(11, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(57) /*skill*/, new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:476, col:7) to (line:476, col:32)
			p[2] = new PreconditionAtomic(new Predicate(11, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(58) /*knowledge*/, new TermList(owner.getTermVariable(3), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task learnFundamentalDiscover [line:475,6 to 476,33]";
		}
	}

	/**
	 * Method -1 for compound task learnFundamentalDiscover
	 * Source: (line:474, col:4) to (line:485, col:28)
	 */
	public static class Method35 extends Method
	{
	/**
	 * Method -1 for compound task learnFundamentalDiscover
	 */
		public Method35(Domain owner)
		{
			super(owner, new Predicate(22, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 4, new TermList(owner.getTermConstant(59) /*play*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(2), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(3), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), TermList.NIL), new TermList(new TermList(owner.getTermConstant(60) /*learnFundamentalDiscover*/, new TermList(new TermList(owner.getTermVariable(0), TermList.NIL), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(23, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 4, new TermList(owner.getTermConstant(59) /*play*/, TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task learnFundamentalDiscover [line:474,4 to 485,28]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition28(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method35Branch0(text:learnFundamentalDiscover,line:474,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task practiceInCollaborativeWay
	 * Source: (line:488, col:6) to (line:492, col:27)
	 */
	public static class Precondition29 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition29(Domain owner, Term[] unifier)
		{
			p = new Precondition[6];
			// Source: (line:488, col:7) to (line:488, col:28)
			p[1] = new PreconditionAtomic(new Predicate(11, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(57) /*skill*/, new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:489, col:7) to (line:489, col:32)
			p[2] = new PreconditionAtomic(new Predicate(11, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(58) /*knowledge*/, new TermList(owner.getTermVariable(3), TermList.NIL)))), unifier);
			// Source: (line:490, col:7) to (line:490, col:39)
			p[3] = new PreconditionAtomic(new Predicate(11, 8, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(61) /*hasObjective*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), TermList.NIL))))), unifier);
			// Source: (line:491, col:7) to (line:491, col:29)
			p[4] = new PreconditionAtomic(new Predicate(62, 8, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(4), TermList.NIL)))), unifier);
			// Source: (line:492, col:7) to (line:492, col:26)
			p[5] = new PreconditionAtomic(new Predicate(63, 8, new TermList(owner.getTermVariable(7), TermList.NIL)), unifier);
			b = new Term[6][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[5] == null)
			{
				boolean b4changed = false;
				while (b[4] == null)
				{
					boolean b3changed = false;
					while (b[3] == null)
					{
						boolean b2changed = false;
						while (b[2] == null)
						{
							boolean b1changed = false;
							while (b[1] == null)
							{
								b[1] = p[1].nextBinding(state);
								if (b[1] == null)
									return null;
								else
									bestMatch = Math.max(bestMatch, 1);
								b1changed = true;
							}
							if ( b1changed ) {
								p[2].reset(state);
								p[2].bind(Term.merge(b, 2));
							}
							b[2] = p[2].nextBinding(state);
							if (b[2] == null)
								b[1] = null;
							else
								bestMatch = Math.max(bestMatch, 2);
							b2changed = true;
						}
						if ( b2changed ) {
							p[3].reset(state);
							p[3].bind(Term.merge(b, 3));
						}
						b[3] = p[3].nextBinding(state);
						if (b[3] == null)
							b[2] = null;
						else
							bestMatch = Math.max(bestMatch, 3);
						b3changed = true;
					}
					if ( b3changed ) {
						p[4].reset(state);
						p[4].bind(Term.merge(b, 4));
					}
					b[4] = p[4].nextBinding(state);
					if (b[4] == null)
						b[3] = null;
					else
						bestMatch = Math.max(bestMatch, 4);
					b4changed = true;
				}
				if ( b4changed ) {
					p[5].reset(state);
					p[5].bind(Term.merge(b, 5));
				}
				b[5] = p[5].nextBinding(state);
				if (b[5] == null)
					b[4] = null;
				else
					bestMatch = Math.max(bestMatch, 5);
			}

			Term[] retVal = Term.merge(b, 6);
			b[5] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task practiceInCollaborativeWay [line:488,6 to 492,27]";
		}
	}

	/**
	 * Method -1 for compound task practiceInCollaborativeWay
	 * Source: (line:487, col:4) to (line:497, col:8)
	 */
	public static class Method36 extends Method
	{
	/**
	 * Method -1 for compound task practiceInCollaborativeWay
	 */
		public Method36(Domain owner)
		{
			super(owner, new Predicate(23, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(24, 8, new TermList(new TermList(new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(6), TermList.NIL)))), TermList.NIL), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(0), TermList.NIL)))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task practiceInCollaborativeWay [line:487,4 to 497,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition29(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(8)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method36Branch0(text:practiceInCollaborativeWay,line:487,col:14)";
				case 1: return "Method36Branch1(text:practiceInCollaborativeWay,line:487,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningCLUoL
	 * Source: (line:878, col:4) to (line:878, col:49)
	 */
	public static class Method37 extends Method
	{
	/**
	 * Method -1 for compound task planningCLUoL
	 */
		public Method37(Domain owner)
		{
			super(owner, new Predicate(24, 2, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLUoL [line:878,4 to 878,49]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method37Branch0(text:planningCLUoL,line:878,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningCLUoL
	 * Source: (line:879, col:4) to (line:886, col:49)
	 */
	public static class Method38 extends Method
	{
	/**
	 * Method -1 for compound task planningCLUoL
	 */
		public Method38(Domain owner)
		{
			super(owner, new Predicate(24, 8, new TermList(new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), owner.getTermVariable(4)), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(25, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL))))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(26, 8, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(5), new TermList(new TermNumber(1.0), new TermList(owner.getTermVariable(7), TermList.NIL)))))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(24, 8, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLUoL [line:879,4 to 886,49]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(64, 8, new TermList(owner.getTermVariable(7), TermList.NIL)), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method38Branch0(text:planningCLUoL,line:879,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task setSkillKnowledge
	 * Source: (line:888, col:4) to (line:888, col:49)
	 */
	public static class Method39 extends Method
	{
	/**
	 * Method -1 for compound task setSkillKnowledge
	 */
		public Method39(Domain owner)
		{
			super(owner, new Predicate(25, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(TermList.NIL, new TermList(owner.getTermVariable(2), TermList.NIL))))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task setSkillKnowledge [line:888,4 to 888,49]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method39Branch0(text:setSkillKnowledge,line:888,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task setSkillKnowledge
	 * Source: (line:890, col:6) to (line:891, col:30)
	 */
	public static class Precondition106 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition106(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:890, col:7) to (line:890, col:58)
			p[1] = new PreconditionAtomic(new Predicate(9, 8, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(132) /*hasCompetenceLevel*/, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), TermList.NIL))))), unifier);
			// Source: (line:891, col:7) to (line:891, col:29)
			p[2] = new PreconditionAtomic(new Predicate(62, 8, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(5), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task setSkillKnowledge [line:890,6 to 891,30]";
		}
	}

	/**
	 * Method -1 for compound task setSkillKnowledge
	 * Source: (line:889, col:4) to (line:894, col:46)
	 */
	public static class Method40 extends Method
	{
	/**
	 * Method -1 for compound task setSkillKnowledge
	 */
		public Method40(Domain owner)
		{
			super(owner, new Predicate(25, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(new TermList(owner.getTermVariable(2), owner.getTermVariable(3)), new TermList(owner.getTermVariable(4), TermList.NIL))))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 8, new TermList(new TermList(owner.getTermConstant(57) /*skill*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(6), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 8, new TermList(new TermList(owner.getTermConstant(58) /*knowledge*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(7), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(25, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL))))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task setSkillKnowledge [line:889,4 to 894,46]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition106(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method40Branch0(text:setSkillKnowledge,line:889,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task planningWithCLSteps
	 * Source: (line:898, col:6) to (line:900, col:80)
	 */
	public static class Precondition107 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition107(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:898, col:7) to (line:898, col:43)
			p[1] = new PreconditionAtomic(new Predicate(57, 12, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:899, col:7) to (line:899, col:55)
			p[2] = new PreconditionAtomic(new Predicate(58, 12, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(10), TermList.NIL)))), unifier);
			// Source: (line:900, col:7) to (line:900, col:79)
			p[3] = new PreconditionAtomic(new Predicate(68, 12, new TermList(owner.getTermVariable(11), new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), TermList.NIL)))))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task planningWithCLSteps [line:898,6 to 900,80]";
		}
	}

	/**
	 * Method -1 for compound task planningWithCLSteps
	 * Source: (line:896, col:4) to (line:907, col:50)
	 */
	public static class Method41 extends Method
	{
	/**
	 * Method -1 for compound task planningWithCLSteps
	 */
		public Method41(Domain owner)
		{
			super(owner, new Predicate(26, 12, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(5)), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), TermList.NIL)))))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(27, 12, new TermList(owner.getTermVariable(11), new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), TermList.NIL))))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(26, 12, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), TermList.NIL)))))), false, false));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(26, 12, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), TermList.NIL)))))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningWithCLSteps [line:896,4 to 907,50]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition107(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(12)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method41Branch0(text:planningWithCLSteps,line:896,col:14)";
				case 1: return "Method41Branch1(text:planningWithCLSteps,line:896,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningWithCLSteps
	 * Source: (line:909, col:4) to (line:917, col:61)
	 */
	public static class Method42 extends Method
	{
	/**
	 * Method -1 for compound task planningWithCLSteps
	 */
		public Method42(Domain owner)
		{
			super(owner, new Predicate(26, 7, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(TermList.NIL, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)))))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = TaskList.empty;
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(28, 7, new TermList(new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), TermList.NIL), new TermList(owner.getTermVariable(4), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(26, 7, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(4), new TermList(new TermCall(new List(owner.getTermVariable(5), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), new TermList(owner.getTermVariable(6), TermList.NIL)))))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningWithCLSteps [line:909,4 to 917,61]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionCall(new TermCall(new List(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)), StdLib.more, "StdLib.more"), unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(7)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method42Branch0(text:planningWithCLSteps,line:909,col:14)";
				case 1: return "Method42Branch1(text:planningWithCLSteps,line:909,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task setGoalsForStep
	 * Source: (line:921, col:4) to (line:921, col:65)
	 */
	public static class Method43 extends Method
	{
	/**
	 * Method -1 for compound task setGoalsForStep
	 */
		public Method43(Domain owner)
		{
			super(owner, new Predicate(27, 3, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task setGoalsForStep [line:921,4 to 921,65]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method43Branch0(text:setGoalsForStep,line:921,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task setGoalsForStep
	 * Source: (line:924, col:6) to (line:925, col:51)
	 */
	public static class Precondition108 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition108(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:924, col:7) to (line:924, col:42)
			p[1] = new PreconditionAtomic(new Predicate(95, 12, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(10), TermList.NIL)))), unifier);
			// Source: (line:925, col:7) to (line:925, col:50)
			p[2] = new PreconditionAtomic(new Predicate(95, 12, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(11), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task setGoalsForStep [line:924,6 to 925,51]";
		}
	}

	/**
	 * Method -1 for compound task setGoalsForStep
	 * Source: (line:922, col:4) to (line:933, col:69)
	 */
	public static class Method44 extends Method
	{
	/**
	 * Method -1 for compound task setGoalsForStep
	 */
		public Method44(Domain owner)
		{
			super(owner, new Predicate(27, 12, new TermList(new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), TermList.NIL)))))), owner.getTermVariable(6)), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(4, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 12, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(10), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 12, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(11), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(0, 12, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(4), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(0, 12, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(5), TermList.NIL)))), TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 12, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(4), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 12, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(5), TermList.NIL)))), TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task setGoalsForStep [line:922,4 to 933,69]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition108(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(12)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method44Branch0(text:setGoalsForStep,line:922,col:14)";
				case 1: return "Method44Branch1(text:setGoalsForStep,line:922,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task createCLPhase
	 * Source: (line:938, col:6) to (line:939, col:47)
	 */
	public static class Precondition109 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition109(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:938, col:7) to (line:938, col:30)
			p[1] = new PreconditionAtomic(new Predicate(66, 4, new TermList(owner.getTermVariable(2), TermList.NIL)), unifier);
			// Source: (line:939, col:7) to (line:939, col:46)
			p[2] = new PreconditionAtomic(new Predicate(97, 4, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(0), TermList.NIL))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task createCLPhase [line:938,6 to 939,47]";
		}
	}

	/**
	 * Method -1 for compound task createCLPhase
	 * Source: (line:937, col:4) to (line:943, col:8)
	 */
	public static class Method45 extends Method
	{
	/**
	 * Method -1 for compound task createCLPhase
	 */
		public Method45(Domain owner)
		{
			super(owner, new Predicate(28, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(29, 4, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(30, 4, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createCLPhase [line:937,4 to 943,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition109(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method45Branch0(text:createCLPhase,line:937,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task removeGroupsForLearners
	 * Source: (line:946, col:4) to (line:946, col:46)
	 */
	public static class Method46 extends Method
	{
	/**
	 * Method -1 for compound task removeGroupsForLearners
	 */
		public Method46(Domain owner)
		{
			super(owner, new Predicate(29, 0, new TermList(TermList.NIL, TermList.NIL)));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task removeGroupsForLearners [line:946,4 to 946,46]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method46Branch0(text:removeGroupsForLearners,line:946,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task removeGroupsForLearners
	 * Source: (line:947, col:4) to (line:953, col:43)
	 */
	public static class Method47 extends Method
	{
	/**
	 * Method -1 for compound task removeGroupsForLearners
	 */
		public Method47(Domain owner)
		{
			super(owner, new Predicate(29, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL)));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(8, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(29, 3, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(29, 3, new TermList(owner.getTermVariable(1), TermList.NIL)), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task removeGroupsForLearners [line:947,4 to 953,43]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(16, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method47Branch0(text:removeGroupsForLearners,line:947,col:14)";
				case 1: return "Method47Branch1(text:removeGroupsForLearners,line:947,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningCLPhase
	 * Source: (line:955, col:4) to (line:955, col:53)
	 */
	public static class Method48 extends Method
	{
	/**
	 * Method -1 for compound task planningCLPhase
	 */
		public Method48(Domain owner)
		{
			super(owner, new Predicate(30, 2, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLPhase [line:955,4 to 955,53]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method48Branch0(text:planningCLPhase,line:955,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task planningCLPhase
	 * Source: (line:957, col:6) to (line:962, col:7)
	 */
	public static class Precondition110 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition110(Domain owner, Term[] unifier)
		{
			p = new Precondition[8];
			// Source: (line:957, col:7) to (line:957, col:78)
			p[1] = new PreconditionAtomic(new Predicate(94, 12, new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:958, col:7) to (line:958, col:78)
			p[2] = new PreconditionAtomic(new Predicate(94, 12, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:959, col:7) to (line:959, col:36)
			p[3] = new PreconditionAtomic(new Predicate(98, 12, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(7), TermList.NIL))), unifier);
			// Source: (line:959, col:37) to (line:959, col:61)
			p[4] = new PreconditionCall(new TermCall(new List(owner.getTermVariable(9), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.moreEq, "StdLib.moreEq"), unifier);
			// Source: (line:960, col:7) to (line:960, col:36)
			p[5] = new PreconditionAtomic(new Predicate(98, 12, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(8), TermList.NIL))), unifier);
			// Source: (line:960, col:37) to (line:960, col:61)
			p[6] = new PreconditionCall(new TermCall(new List(owner.getTermVariable(10), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.moreEq, "StdLib.moreEq"), unifier);
			// Source: (line:961, col:7) to (line:961, col:51)
			p[7] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), TermList.NIL)), ((coursegeneration)owner).calculateConcat, "((coursegeneration)owner).calculateConcat"), unifier, 11);
			b = new Term[8][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[7] == null)
			{
				boolean b6changed = false;
				while (b[6] == null)
				{
					boolean b5changed = false;
					while (b[5] == null)
					{
						boolean b4changed = false;
						while (b[4] == null)
						{
							boolean b3changed = false;
							while (b[3] == null)
							{
								boolean b2changed = false;
								while (b[2] == null)
								{
									boolean b1changed = false;
									while (b[1] == null)
									{
										b[1] = p[1].nextBinding(state);
										if (b[1] == null)
											return null;
										else
											bestMatch = Math.max(bestMatch, 1);
										b1changed = true;
									}
									if ( b1changed ) {
										p[2].reset(state);
										p[2].bind(Term.merge(b, 2));
									}
									b[2] = p[2].nextBinding(state);
									if (b[2] == null)
										b[1] = null;
									else
										bestMatch = Math.max(bestMatch, 2);
									b2changed = true;
								}
								if ( b2changed ) {
									p[3].reset(state);
									p[3].bind(Term.merge(b, 3));
								}
								b[3] = p[3].nextBinding(state);
								if (b[3] == null)
									b[2] = null;
								else
									bestMatch = Math.max(bestMatch, 3);
								b3changed = true;
							}
							if ( b3changed ) {
								p[4].reset(state);
								p[4].bind(Term.merge(b, 4));
							}
							b[4] = p[4].nextBinding(state);
							if (b[4] == null)
								b[3] = null;
							else
								bestMatch = Math.max(bestMatch, 4);
							b4changed = true;
						}
						if ( b4changed ) {
							p[5].reset(state);
							p[5].bind(Term.merge(b, 5));
						}
						b[5] = p[5].nextBinding(state);
						if (b[5] == null)
							b[4] = null;
						else
							bestMatch = Math.max(bestMatch, 5);
						b5changed = true;
					}
					if ( b5changed ) {
						p[6].reset(state);
						p[6].bind(Term.merge(b, 6));
					}
					b[6] = p[6].nextBinding(state);
					if (b[6] == null)
						b[5] = null;
					else
						bestMatch = Math.max(bestMatch, 6);
					b6changed = true;
				}
				if ( b6changed ) {
					p[7].reset(state);
					p[7].bind(Term.merge(b, 7));
				}
				b[7] = p[7].nextBinding(state);
				if (b[7] == null)
					b[6] = null;
				else
					bestMatch = Math.max(bestMatch, 7);
			}

			Term[] retVal = Term.merge(b, 8);
			b[7] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task planningCLPhase [line:957,6 to 962,7]";
		}
	}

	/**
	 * Method -1 for compound task planningCLPhase
	 * Source: (line:956, col:4) to (line:977, col:8)
	 */
	public static class Method49 extends Method
	{
	/**
	 * Method -1 for compound task planningCLPhase
	 */
		public Method49(Domain owner)
		{
			super(owner, new Predicate(30, 12, new TermList(new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), owner.getTermVariable(4)), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(4, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 12, new TermList(owner.getTermConstant(133) /*act*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(134) /*CLPhase*/, new TermList(owner.getTermConstant(135) /*for*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(0), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(1), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)))), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(31, 12, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(6), TermList.NIL))))))))))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 12, new TermList(owner.getTermConstant(133) /*act*/, TermList.NIL)), false, true));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(30, 12, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)))), false, false));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(30, 12, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLPhase [line:956,4 to 977,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition110(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(12)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method49Branch0(text:planningCLPhase,line:956,col:14)";
				case 1: return "Method49Branch1(text:planningCLPhase,line:956,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task planningByTheory
	 * Source: (line:982, col:6) to (line:983, col:44)
	 */
	public static class Precondition111 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition111(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:982, col:7) to (line:982, col:43)
			p[1] = new PreconditionCall(new TermCall(new List(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL)), StdLib.lessEq, "StdLib.lessEq"), unifier);
			// Source: (line:983, col:7) to (line:983, col:43)
			p[2] = new PreconditionCall(new TermCall(new List(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL)), StdLib.lessEq, "StdLib.lessEq"), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task planningByTheory [line:982,6 to 983,44]";
		}
	}

	/**
	 * Precondition #1 of Method -1 for compound task planningByTheory
	 * Source: (line:986, col:6) to (line:988, col:79)
	 */
	public static class Precondition112 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition112(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:986, col:7) to (line:986, col:67)
			p[1] = new PreconditionAtomic(new Predicate(123, 13, new TermList(owner.getTermVariable(10), new TermList(new TermList(new TermList(owner.getTermVariable(5), new TermList(new TermNumber(1.0), TermList.NIL)), new TermList(new TermList(owner.getTermVariable(8), new TermList(new TermNumber(1.0), TermList.NIL)), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:987, col:7) to (line:987, col:78)
			p[2] = new PreconditionAtomic(new Predicate(122, 13, new TermList(owner.getTermVariable(11), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(10), TermList.NIL)))))), unifier);
			// Source: (line:988, col:7) to (line:988, col:78)
			p[3] = new PreconditionAtomic(new Predicate(122, 13, new TermList(owner.getTermVariable(12), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(10), TermList.NIL)))))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #1 of Method -1 for compound task planningByTheory [line:986,6 to 988,79]";
		}
	}

	/**
	 * Method -1 for compound task planningByTheory
	 * Source: (line:979, col:4) to (line:989, col:87)
	 */
	public static class Method50 extends Method
	{
	/**
	 * Method -1 for compound task planningByTheory
	 */
		public Method50(Domain owner)
		{
			super(owner, new Predicate(31, 13, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))))))))))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(32, 13, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(new TermList(owner.getTermVariable(4), TermList.NIL), new TermList(new TermList(owner.getTermVariable(7), TermList.NIL), TermList.NIL))))))), false, false));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(32, 13, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(11), new TermList(owner.getTermVariable(12), TermList.NIL))))))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningByTheory [line:979,4 to 989,87]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition111(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition112(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method50Branch0(text:planningByTheory,line:979,col:14)";
				case 1: return "Method50Branch1(text:planningByTheory,line:979,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task createByInstruction
	 * Source: (line:991, col:4) to (line:991, col:86)
	 */
	public static class Method51 extends Method
	{
	/**
	 * Method -1 for compound task createByInstruction
	 */
		public Method51(Domain owner)
		{
			super(owner, new Predicate(32, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(TermList.NIL, new TermList(TermList.NIL, TermList.NIL))))))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createByInstruction [line:991,4 to 991,86]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(4)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method51Branch0(text:createByInstruction,line:991,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task createByInstruction
	 * Source: (line:994, col:6) to (line:996, col:34)
	 */
	public static class Precondition113 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition113(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:994, col:7) to (line:994, col:51)
			p[1] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)), ((coursegeneration)owner).calculateConcat, "((coursegeneration)owner).calculateConcat"), unifier, 8);
			// Source: (line:995, col:7) to (line:995, col:33)
			p[2] = new PreconditionAtomic(new Predicate(120, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier);
			// Source: (line:996, col:7) to (line:996, col:33)
			p[3] = new PreconditionAtomic(new Predicate(120, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(3), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task createByInstruction [line:994,6 to 996,34]";
		}
	}

	/**
	 * Method -1 for compound task createByInstruction
	 * Source: (line:992, col:4) to (line:1004, col:87)
	 */
	public static class Method52 extends Method
	{
	/**
	 * Method -1 for compound task createByInstruction
	 */
		public Method52(Domain owner)
		{
			super(owner, new Predicate(32, 11, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(5)), new TermList(new TermList(owner.getTermVariable(6), owner.getTermVariable(7)), TermList.NIL))))))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(8, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(9), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(10), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(0, 11, new TermList(new TermList(owner.getTermConstant(136) /*pGroup*/, new TermList(owner.getTermVariable(4), TermList.NIL)), TermList.NIL)), false, true));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(0, 11, new TermList(new TermList(owner.getTermConstant(137) /*sGroup*/, new TermList(owner.getTermVariable(6), TermList.NIL)), TermList.NIL)), false, true));
			retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(33, 11, new TermList(new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), TermList.NIL), new TermList(owner.getTermVariable(8), TermList.NIL))), false, false));
			retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(1, 11, new TermList(new TermList(owner.getTermConstant(136) /*pGroup*/, new TermList(owner.getTermVariable(4), TermList.NIL)), TermList.NIL)), false, true));
			retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(1, 11, new TermList(new TermList(owner.getTermConstant(137) /*sGroup*/, new TermList(owner.getTermVariable(6), TermList.NIL)), TermList.NIL)), false, true));
			retVal.subtasks[7] = new TaskList(new TaskAtom(new Predicate(32, 11, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(7), TermList.NIL))))))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createByInstruction [line:992,4 to 1004,87]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition113(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method52Branch0(text:createByInstruction,line:992,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task createCLGroupActivity
	 * Source: (line:1006, col:4) to (line:1013, col:33)
	 */
	public static class Method53 extends Method
	{
	/**
	 * Method -1 for compound task createCLGroupActivity
	 */
		public Method53(Domain owner)
		{
			super(owner, new Predicate(33, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(4, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(owner.getTermConstant(138) /*role-part*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(139) /*group-activity-for-learners*/, new TermList(owner.getTermVariable(1), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(140) /*role-ref*/, new TermList(owner.getTermVariable(2), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(10) /*learner*/, new TermList(owner.getTermVariable(1), TermList.NIL)), TermList.NIL))), TermList.NIL))), false, true));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(34, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), false, false));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 3, new TermList(owner.getTermConstant(138) /*role-part*/, TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createCLGroupActivity [line:1006,4 to 1013,33]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), TermList.NIL), ((coursegeneration)owner).calculateGetNewRole, "((coursegeneration)owner).calculateGetNewRole"), unifier, 2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method53Branch0(text:createCLGroupActivity,line:1006,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningCLGroupActivity
	 * Source: (line:1015, col:4) to (line:1015, col:56)
	 */
	public static class Method54 extends Method
	{
	/**
	 * Method -1 for compound task planningCLGroupActivity
	 */
		public Method54(Domain owner)
		{
			super(owner, new Predicate(34, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLGroupActivity [line:1015,4 to 1015,56]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method54Branch0(text:planningCLGroupActivity,line:1015,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningCLGroupActivity
	 * Source: (line:1016, col:4) to (line:1019, col:55)
	 */
	public static class Method55 extends Method
	{
	/**
	 * Method -1 for compound task planningCLGroupActivity
	 */
		public Method55(Domain owner)
		{
			super(owner, new Predicate(34, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(35, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(34, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLGroupActivity [line:1016,4 to 1019,55]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method55Branch0(text:planningCLGroupActivity,line:1016,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task createCLSession
	 * Source: (line:1038, col:6) to (line:1041, col:7)
	 */
	public static class Precondition114 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition114(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1038, col:7) to (line:1038, col:67)
			p[1] = new PreconditionAtomic(new Predicate(124, 8, new TermList(owner.getTermVariable(5), new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), TermList.NIL))), unifier);
			// Source: (line:1039, col:7) to (line:1039, col:22)
			p[2] = new PreconditionAtomic(new Predicate(136, 8, new TermList(owner.getTermVariable(6), TermList.NIL)), unifier);
			// Source: (line:1040, col:7) to (line:1040, col:22)
			p[3] = new PreconditionAtomic(new Predicate(137, 8, new TermList(owner.getTermVariable(7), TermList.NIL)), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task createCLSession [line:1038,6 to 1041,7]";
		}
	}

	/**
	 * Method -1 for compound task createCLSession
	 * Source: (line:1037, col:4) to (line:1057, col:8)
	 */
	public static class Method56 extends Method
	{
	/**
	 * Method -1 for compound task createCLSession
	 */
		public Method56(Domain owner)
		{
			super(owner, new Predicate(35, 8, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(4), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(7, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 8, new TermList(owner.getTermConstant(141) /*learning-activity*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(141) /*learning-activity*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(142) /*description*/, new TermList(owner.getTermVariable(5), TermList.NIL)), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(143) /*createCLSession*/, new TermList(new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(4), TermList.NIL)), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 8, new TermList(owner.getTermConstant(144) /*activity-description*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermVariable(5), new TermList(owner.getTermConstant(135) /*for*/, new TermList(owner.getTermVariable(4), TermList.NIL))), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(9, 8, new TermList(new TermCall(new List(owner.getTermConstant(145) /*__basePath__resources__info__activity__*/, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(146) /*___instructors_____*/, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(147) /*____learners_____*/, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(148) /*____skillId_____*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(149) /*____knowledgeId_____*/, new TermList(owner.getTermVariable(1), TermList.NIL)))))))))), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), false, true));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 8, new TermList(owner.getTermConstant(144) /*activity-description*/, TermList.NIL)), false, true));
			retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(36, 8, new TermList(owner.getTermVariable(5), new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(4), TermList.NIL)))), false, false));
			retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(3, 8, new TermList(owner.getTermConstant(141) /*learning-activity*/, TermList.NIL)), false, true));
			retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(37, 8, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(4), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createCLSession [line:1037,4 to 1057,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition114(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(8)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method56Branch0(text:createCLSession,line:1037,col:14)";
				case 1: return "Method56Branch1(text:createCLSession,line:1037,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task planningCLSession
	 * Source: (line:1059, col:4) to (line:1061, col:58)
	 */
	public static class Method57 extends Method
	{
	/**
	 * Method -1 for compound task planningCLSession
	 */
		public Method57(Domain owner)
		{
			super(owner, new Predicate(36, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(38, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task planningCLSession [line:1059,4 to 1061,58]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method57Branch0(text:planningCLSession,line:1059,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task createCLEnvironment
	 * Source: (line:1069, col:6) to (line:1073, col:7)
	 */
	public static class Precondition116 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition116(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:1069, col:7) to (line:1069, col:32)
			p[1] = new PreconditionAtomic(new Predicate(11, 10, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(57) /*skill*/, new TermList(owner.getTermVariable(1), TermList.NIL)))), unifier);
			// Source: (line:1070, col:7) to (line:1070, col:40)
			p[2] = new PreconditionAtomic(new Predicate(11, 10, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(58) /*knowledge*/, new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:1071, col:7) to (line:1071, col:18)
			p[3] = new PreconditionAtomic(new Predicate(46, 10, new TermList(owner.getTermVariable(7), TermList.NIL)), unifier);
			// Source: (line:1072, col:7) to (line:1072, col:39)
			p[4] = new PreconditionAtomic(new Predicate(11, 10, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(61) /*hasObjective*/, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(8), TermList.NIL))))), unifier);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task createCLEnvironment [line:1069,6 to 1073,7]";
		}
	}

	/**
	 * Method -1 for compound task createCLEnvironment
	 * Source: (line:1068, col:4) to (line:1080, col:8)
	 */
	public static class Method58 extends Method
	{
	/**
	 * Method -1 for compound task createCLEnvironment
	 */
		public Method58(Domain owner)
		{
			super(owner, new Predicate(38, 10, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))), new TermList(owner.getTermVariable(5), TermList.NIL)))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 10, new TermList(owner.getTermConstant(151) /*environment*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(152) /*environment-for*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(5), TermList.NIL))), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), TermList.NIL), new TermList(new TermList(owner.getTermConstant(153) /*createCLEnvironment*/, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(9), new TermList(owner.getTermVariable(5), TermList.NIL))), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(39, 10, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(5), TermList.NIL))))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 10, new TermList(owner.getTermConstant(151) /*environment*/, TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createCLEnvironment [line:1068,4 to 1080,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition116(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(10)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method58Branch0(text:createCLEnvironment,line:1068,col:14)";
				case 1: return "Method58Branch1(text:createCLEnvironment,line:1068,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task createCLObject
	 * Source: (line:1085, col:6) to (line:1088, col:44)
	 */
	public static class Precondition117 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition117(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1085, col:7) to (line:1085, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(125) /*anchoredInstruction*/, TermList.NIL))), unifier);
			// Source: (line:1086, col:7) to (line:1087, col:75)
			p[2] = new PreconditionAtomic(new Predicate(32, 6, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(154) /*hasLearningResourceType*/, new TermList(owner.getTermConstant(155) /*exercise*/, TermList.NIL))), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(156) /*hasEducationalObjective*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:1088, col:7) to (line:1088, col:43)
			p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task createCLObject [line:1085,6 to 1088,44]";
		}
	}

	/**
	 * Precondition #1 of Method -1 for compound task createCLObject
	 * Source: (line:1095, col:6) to (line:1098, col:44)
	 */
	public static class Precondition118 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition118(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1095, col:7) to (line:1095, col:44)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(126) /*cognitiveApprenticeship*/, TermList.NIL))), unifier);
			// Source: (line:1096, col:7) to (line:1097, col:75)
			p[2] = new PreconditionAtomic(new Predicate(32, 6, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(154) /*hasLearningResourceType*/, new TermList(owner.getTermConstant(155) /*exercise*/, TermList.NIL))), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(156) /*hasEducationalObjective*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:1098, col:7) to (line:1098, col:43)
			p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #1 of Method -1 for compound task createCLObject [line:1095,6 to 1098,44]";
		}
	}

	/**
	 * Precondition #2 of Method -1 for compound task createCLObject
	 * Source: (line:1105, col:6) to (line:1108, col:44)
	 */
	public static class Precondition119 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition119(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1105, col:7) to (line:1105, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(127) /*cognitiveFlexibility*/, TermList.NIL))), unifier);
			// Source: (line:1106, col:7) to (line:1107, col:75)
			p[2] = new PreconditionAtomic(new Predicate(32, 6, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(154) /*hasLearningResourceType*/, new TermList(owner.getTermConstant(155) /*exercise*/, TermList.NIL))), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(156) /*hasEducationalObjective*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:1108, col:7) to (line:1108, col:43)
			p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #2 of Method -1 for compound task createCLObject [line:1105,6 to 1108,44]";
		}
	}

	/**
	 * Precondition #3 of Method -1 for compound task createCLObject
	 * Source: (line:1115, col:6) to (line:1118, col:44)
	 */
	public static class Precondition120 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition120(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1115, col:7) to (line:1115, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(128) /*distributedCognition*/, TermList.NIL))), unifier);
			// Source: (line:1116, col:7) to (line:1117, col:75)
			p[2] = new PreconditionAtomic(new Predicate(32, 6, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(154) /*hasLearningResourceType*/, new TermList(owner.getTermConstant(155) /*exercise*/, TermList.NIL))), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(156) /*hasEducationalObjective*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:1118, col:7) to (line:1118, col:43)
			p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #3 of Method -1 for compound task createCLObject [line:1115,6 to 1118,44]";
		}
	}

	/**
	 * Precondition #4 of Method -1 for compound task createCLObject
	 * Source: (line:1125, col:6) to (line:1128, col:44)
	 */
	public static class Precondition121 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition121(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1125, col:7) to (line:1125, col:24)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(129) /*lpp*/, TermList.NIL))), unifier);
			// Source: (line:1126, col:7) to (line:1127, col:75)
			p[2] = new PreconditionAtomic(new Predicate(32, 6, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(154) /*hasLearningResourceType*/, new TermList(owner.getTermConstant(155) /*exercise*/, TermList.NIL))), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(156) /*hasEducationalObjective*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:1128, col:7) to (line:1128, col:43)
			p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #4 of Method -1 for compound task createCLObject [line:1125,6 to 1128,44]";
		}
	}

	/**
	 * Precondition #5 of Method -1 for compound task createCLObject
	 * Source: (line:1136, col:6) to (line:1139, col:44)
	 */
	public static class Precondition122 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition122(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:1136, col:7) to (line:1136, col:33)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermConstant(130) /*peerTutoring*/, TermList.NIL))), unifier);
			// Source: (line:1137, col:7) to (line:1138, col:75)
			p[2] = new PreconditionAtomic(new Predicate(32, 6, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(154) /*hasLearningResourceType*/, new TermList(owner.getTermConstant(155) /*exercise*/, TermList.NIL))), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(156) /*hasEducationalObjective*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), TermList.NIL)), TermList.NIL))), unifier);
			// Source: (line:1139, col:7) to (line:1139, col:43)
			p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #5 of Method -1 for compound task createCLObject [line:1136,6 to 1139,44]";
		}
	}

	/**
	 * Method -1 for compound task createCLObject
	 * Source: (line:1083, col:4) to (line:1148, col:8)
	 */
	public static class Method59 extends Method
	{
	/**
	 * Method -1 for compound task createCLObject
	 */
		public Method59(Domain owner)
		{
			super(owner, new Predicate(39, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))));
			TaskList[] subsIn = new TaskList[7];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();
			subsIn[2] = createTaskList2();
			subsIn[3] = createTaskList3();
			subsIn[4] = createTaskList4();
			subsIn[5] = createTaskList5();
			subsIn[6] = TaskList.empty;

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(158) /*lo-exercise-*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(159) /*type*/, new TermList(owner.getTermConstant(160) /*knowledge-object*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(158) /*lo-exercise-*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(159) /*type*/, new TermList(owner.getTermConstant(160) /*knowledge-object*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList2()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(158) /*lo-exercise-*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(159) /*type*/, new TermList(owner.getTermConstant(160) /*knowledge-object*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList3()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(158) /*lo-exercise-*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(159) /*type*/, new TermList(owner.getTermConstant(160) /*knowledge-object*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList4()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(158) /*lo-exercise-*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(159) /*type*/, new TermList(owner.getTermConstant(160) /*knowledge-object*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, TermList.NIL)), false, true));

			return retVal;
		}

		TaskList createTaskList5()
		{
			TaskList retVal;

			retVal = new TaskList(3, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(51) /*title*/, new TermList(new TermCall(new List(owner.getTermConstant(158) /*lo-exercise-*/, new TermList(new TermCall(new List(owner.getTermConstant(51) /*title*/, new TermList(owner.getTermVariable(5), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), TermList.NIL)), ((coursegeneration)owner).calculateConcatText, "((coursegeneration)owner).calculateConcatText"), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(159) /*type*/, new TermList(owner.getTermConstant(160) /*knowledge-object*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL))), false, false));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(owner.getTermConstant(157) /*learning-object*/, TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task createCLObject [line:1083,4 to 1148,8]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition117(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition118(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition119(owner, unifier)).setComparator(null);
				break;
				case 3:
					p = (new Precondition120(owner, unifier)).setComparator(null);
				break;
				case 4:
					p = (new Precondition121(owner, unifier)).setComparator(null);
				break;
				case 5:
					p = (new Precondition122(owner, unifier)).setComparator(null);
				break;
				case 6:
					p = (new PreconditionNil(6)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method59Branch0(text:createCLObject,line:1083,col:14)";
				case 1: return "Method59Branch1(text:createCLObject,line:1083,col:14)";
				case 2: return "Method59Branch2(text:createCLObject,line:1083,col:14)";
				case 3: return "Method59Branch3(text:createCLObject,line:1083,col:14)";
				case 4: return "Method59Branch4(text:createCLObject,line:1083,col:14)";
				case 5: return "Method59Branch5(text:createCLObject,line:1083,col:14)";
				case 6: return "Method59Branch6(text:createCLObject,line:1083,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task onCLSessionCompletedForLearners
	 * Source: (line:1154, col:4) to (line:1154, col:96)
	 */
	public static class Method60 extends Method
	{
	/**
	 * Method -1 for compound task onCLSessionCompletedForLearners
	 */
		public Method60(Domain owner)
		{
			super(owner, new Predicate(37, 4, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(TermList.NIL, TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = TaskList.empty;

			setSubs(subsIn);
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task onCLSessionCompletedForLearners [line:1154,4 to 1154,96]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(4)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method60Branch0(text:onCLSessionCompletedForLearners,line:1154,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition #0 of Method -1 for compound task onCLSessionCompletedForLearners
	 * Source: (line:1156, col:6) to (line:1159, col:48)
	 */
	public static class Precondition123 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition123(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:1156, col:7) to (line:1156, col:43)
			p[1] = new PreconditionAtomic(new Predicate(57, 10, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:1157, col:7) to (line:1157, col:55)
			p[2] = new PreconditionAtomic(new Predicate(58, 10, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:1158, col:7) to (line:1158, col:39)
			p[3] = new PreconditionAtomic(new Predicate(95, 10, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:1159, col:7) to (line:1159, col:47)
			p[4] = new PreconditionAtomic(new Predicate(95, 10, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition #0 of Method -1 for compound task onCLSessionCompletedForLearners [line:1156,6 to 1159,48]";
		}
	}

	/**
	 * Method -1 for compound task onCLSessionCompletedForLearners
	 * Source: (line:1155, col:4) to (line:1170, col:93)
	 */
	public static class Method61 extends Method
	{
	/**
	 * Method -1 for compound task onCLSessionCompletedForLearners
	 */
		public Method61(Domain owner)
		{
			super(owner, new Predicate(37, 10, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(5)), TermList.NIL))));
			TaskList[] subsIn = new TaskList[2];

			subsIn[0] = createTaskList0();
			subsIn[1] = createTaskList1();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(7, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 10, new TermList(new TermList(owner.getTermConstant(57) /*skill*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 10, new TermList(new TermList(owner.getTermConstant(58) /*knowledge*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(7), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(1, 10, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(8), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(1, 10, new TermList(new TermList(owner.getTermConstant(95) /*goal*/, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(9), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(new TermList(owner.getTermConstant(57) /*skill*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(new TermList(owner.getTermConstant(58) /*knowledge*/, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(9), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(37, 10, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), TermList.NIL))), false, false));

			return retVal;
		}

		TaskList createTaskList1()
		{
			TaskList retVal;

			retVal = new TaskList(2, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(new TermList(owner.getTermConstant(161) /*algoErrado*/, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL)))), TermList.NIL)), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(37, 10, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task onCLSessionCompletedForLearners [line:1155,4 to 1170,93]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition123(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionNil(10)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Method61Branch0(text:onCLSessionCompletedForLearners,line:1155,col:14)";
				case 1: return "Method61Branch1(text:onCLSessionCompletedForLearners,line:1155,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom same
	 * Source: (line:9, col:4) to (line:9, col:9)
	 */
	public static class Axiom0 extends Axiom
{
	/**
	 * Branch -1 for axiom same
	 */
		public Axiom0(Domain owner)
		{
			super(owner, new Predicate(0, 1, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(0), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom same [line:9,4 to 9,9]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom0Branch0(line:9,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom different
	 * Source: (line:10, col:4) to (line:10, col:10)
	 */
	public static class Axiom1 extends Axiom
{
	/**
	 * Branch -1 for axiom different
	 */
		public Axiom1(Domain owner)
		{
			super(owner, new Predicate(1, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom different [line:10,4 to 10,10]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier), 2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom1Branch0(line:10,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom first
	 * Source: (line:12, col:4) to (line:12, col:12)
	 */
	public static class Axiom2 extends Axiom
{
	/**
	 * Branch -1 for axiom first
	 */
		public Axiom2(Domain owner)
		{
			super(owner, new Predicate(2, 2, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom first [line:12,4 to 12,12]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom2Branch0(line:12,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom first
	 * Source: (line:13, col:4) to (line:13, col:13)
	 */
	public static class Axiom3 extends Axiom
{
	/**
	 * Branch -1 for axiom first
	 */
		public Axiom3(Domain owner)
		{
			super(owner, new Predicate(2, 0, new TermList(TermList.NIL, new TermList(TermList.NIL, TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom first [line:13,4 to 13,13]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom3Branch0(line:13,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom rest
	 * Source: (line:15, col:4) to (line:15, col:15)
	 */
	public static class Axiom4 extends Axiom
{
	/**
	 * Branch -1 for axiom rest
	 */
		public Axiom4(Domain owner)
		{
			super(owner, new Predicate(3, 2, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), owner.getTermVariable(0)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom rest [line:15,4 to 15,15]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom4Branch0(line:15,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom rest
	 * Source: (line:16, col:4) to (line:16, col:16)
	 */
	public static class Axiom5 extends Axiom
{
	/**
	 * Branch -1 for axiom rest
	 */
		public Axiom5(Domain owner)
		{
			super(owner, new Predicate(3, 0, new TermList(TermList.NIL, new TermList(TermList.NIL, TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom rest [line:16,4 to 16,16]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom5Branch0(line:16,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom assignIterator
	 * Source: (line:18, col:4) to (line:18, col:18)
	 */
	public static class Axiom6 extends Axiom
{
	/**
	 * Branch -1 for axiom assignIterator
	 */
		public Axiom6(Domain owner)
		{
			super(owner, new Predicate(4, 3, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), owner.getTermVariable(2)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom assignIterator [line:18,4 to 18,18]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(owner.getTermVariable(1), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom6Branch0(line:18,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom assignIterator
	 * Source: (line:19, col:4) to (line:19, col:19)
	 */
	public static class Axiom7 extends Axiom
{
	/**
	 * Branch -1 for axiom assignIterator
	 */
		public Axiom7(Domain owner)
		{
			super(owner, new Predicate(4, 3, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), owner.getTermVariable(2)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom assignIterator [line:19,4 to 19,19]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(4, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom7Branch0(line:19,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom removeElements
	 * Source: (line:21, col:4) to (line:22, col:21)
	 */
	public static class Axiom8 extends Axiom
{
	/**
	 * Branch -1 for axiom removeElements
	 */
		public Axiom8(Domain owner)
		{
			super(owner, new Predicate(5, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom removeElements [line:21,4 to 22,21]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)), ((coursegeneration)owner).calculateRemoveList, "((coursegeneration)owner).calculateRemoveList"), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom8Branch0(line:21,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom removeElement
	 * Source: (line:24, col:4) to (line:25, col:24)
	 */
	public static class Axiom9 extends Axiom
{
	/**
	 * Branch -1 for axiom removeElement
	 */
		public Axiom9(Domain owner)
		{
			super(owner, new Predicate(6, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom removeElement [line:24,4 to 25,24]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(7, 3, new TermList(owner.getTermVariable(0), new TermList(TermList.NIL, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom9Branch0(line:24,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom removeH
	 * Source: (line:26, col:4) to (line:27, col:26)
	 */
	public static class Axiom10 extends Axiom
{
	/**
	 * Branch -1 for axiom removeH
	 */
		public Axiom10(Domain owner)
		{
			super(owner, new Predicate(7, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(TermList.NIL, TermList.NIL))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom removeH [line:26,4 to 27,26]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), TermList.NIL), ((coursegeneration)owner).calculateReverse, "((coursegeneration)owner).calculateReverse"), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom10Branch0(line:26,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom removeH
	 * Source: (line:28, col:4) to (line:29, col:28)
	 */
	public static class Axiom11 extends Axiom
{
	/**
	 * Branch -1 for axiom removeH
	 */
		public Axiom11(Domain owner)
		{
			super(owner, new Predicate(7, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(new TermList(owner.getTermVariable(2), owner.getTermVariable(3)), TermList.NIL))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom removeH [line:28,4 to 29,28]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(7, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom11Branch0(line:28,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom removeH
	 * Source: (line:31, col:6) to (line:32, col:62)
	 */
	public static class Precondition0 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition0(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:31, col:7) to (line:31, col:34)
			p[1] = new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier), 5);
			// Source: (line:32, col:7) to (line:32, col:61)
			p[2] = new PreconditionAtomic(new Predicate(7, 5, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), TermList.NIL))))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom removeH [line:31,6 to 32,62]";
		}
	}

	/**
	 * Branch -1 for axiom removeH
	 * Source: (line:30, col:4) to (line:32, col:30)
	 */
	public static class Axiom12 extends Axiom
{
	/**
	 * Branch -1 for axiom removeH
	 */
		public Axiom12(Domain owner)
		{
			super(owner, new Predicate(7, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(4)), TermList.NIL))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom removeH [line:30,4 to 32,30]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition0(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom12Branch0(line:30,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom restrict
	 * Source: (line:34, col:4) to (line:35, col:34)
	 */
	public static class Axiom13 extends Axiom
{
	/**
	 * Branch -1 for axiom restrict
	 */
		public Axiom13(Domain owner)
		{
			super(owner, new Predicate(8, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom restrict [line:34,4 to 35,34]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)), ((coursegeneration)owner).calculateRestrict, "((coursegeneration)owner).calculateRestrict"), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom13Branch0(line:34,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom learnerProperty
	 * Source: (line:39, col:6) to (line:40, col:43)
	 */
	public static class Precondition1 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition1(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:39, col:7) to (line:39, col:24)
			p[1] = new PreconditionAtomic(new Predicate(10, 3, new TermList(owner.getTermVariable(0), TermList.NIL)), unifier);
			// Source: (line:40, col:7) to (line:40, col:42)
			p[2] = new PreconditionAtomic(new Predicate(11, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom learnerProperty [line:39,6 to 40,43]";
		}
	}

	/**
	 * Branch -1 for axiom learnerProperty
	 * Source: (line:38, col:4) to (line:41, col:38)
	 */
	public static class Axiom14 extends Axiom
{
	/**
	 * Branch -1 for axiom learnerProperty
	 */
		public Axiom14(Domain owner)
		{
			super(owner, new Predicate(9, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom learnerProperty [line:38,4 to 41,38]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition1(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL)), ((coursegeneration)owner).calculateLearnerProperty, "((coursegeneration)owner).calculateLearnerProperty"), unifier, 2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom14Branch0(line:38,col:5)";
				case 1: return "Axiom14Branch1(line:38,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom learnerProperty
	 * Source: (line:43, col:6) to (line:44, col:53)
	 */
	public static class Precondition2 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition2(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:43, col:7) to (line:43, col:24)
			p[1] = new PreconditionAtomic(new Predicate(10, 4, new TermList(owner.getTermVariable(0), TermList.NIL)), unifier);
			// Source: (line:44, col:7) to (line:44, col:52)
			p[2] = new PreconditionAtomic(new Predicate(11, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom learnerProperty [line:43,6 to 44,53]";
		}
	}

	/**
	 * Branch -1 for axiom learnerProperty
	 * Source: (line:42, col:4) to (line:45, col:42)
	 */
	public static class Axiom15 extends Axiom
{
	/**
	 * Branch -1 for axiom learnerProperty
	 */
		public Axiom15(Domain owner)
		{
			super(owner, new Predicate(9, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom learnerProperty [line:42,4 to 45,42]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition2(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), ((coursegeneration)owner).calculateLearnerProperty, "((coursegeneration)owner).calculateLearnerProperty"), unifier, 3)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom15Branch0(line:42,col:5)";
				case 1: return "Axiom15Branch1(line:42,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom learningServiceAvailable
	 * Source: (line:48, col:4) to (line:49, col:48)
	 */
	public static class Axiom16 extends Axiom
{
	/**
	 * Branch -1 for axiom learningServiceAvailable
	 */
		public Axiom16(Domain owner)
		{
			super(owner, new Predicate(12, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom learningServiceAvailable [line:48,4 to 49,48]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionCall(new TermCall(new List(owner.getTermVariable(0), TermList.NIL), ((coursegeneration)owner).calculateLearningServiceAvailable, "((coursegeneration)owner).calculateLearningServiceAvailable"), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom16Branch0(line:48,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom getRelatedSet
	 * Source: (line:56, col:4) to (line:57, col:56)
	 */
	public static class Axiom17 extends Axiom
{
	/**
	 * Branch -1 for axiom getRelatedSet
	 */
		public Axiom17(Domain owner)
		{
			super(owner, new Predicate(13, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getRelatedSet [line:56,4 to 57,56]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))), ((coursegeneration)owner).calculateGetRelated, "((coursegeneration)owner).calculateGetRelated"), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom17Branch0(line:56,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom typicalLearningTime
	 * Source: (line:59, col:4) to (line:60, col:59)
	 */
	public static class Axiom18 extends Axiom
{
	/**
	 * Branch -1 for axiom typicalLearningTime
	 */
		public Axiom18(Domain owner)
		{
			super(owner, new Predicate(14, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom typicalLearningTime [line:59,4 to 60,59]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermConstant(15) /*hasTypicalLearningTime*/, new TermList(owner.getTermVariable(0), TermList.NIL)), ((coursegeneration)owner).calculateGetMetadata, "((coursegeneration)owner).calculateGetMetadata"), unifier, 1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom18Branch0(line:59,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom allInserted
	 * Source: (line:208, col:4) to (line:208, col:208)
	 */
	public static class Axiom19 extends Axiom
{
	/**
	 * Branch -1 for axiom allInserted
	 */
		public Axiom19(Domain owner)
		{
			super(owner, new Predicate(18, 0, new TermList(TermList.NIL, TermList.NIL)), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom allInserted [line:208,4 to 208,208]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom19Branch0(line:208,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom allInserted
	 * Source: (line:210, col:6) to (line:210, col:42)
	 */
	public static class Precondition3 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition3(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:210, col:7) to (line:210, col:22)
			p[1] = new PreconditionAtomic(new Predicate(17, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), unifier);
			// Source: (line:210, col:23) to (line:210, col:41)
			p[2] = new PreconditionAtomic(new Predicate(18, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom allInserted [line:210,6 to 210,42]";
		}
	}

	/**
	 * Branch -1 for axiom allInserted
	 * Source: (line:209, col:4) to (line:210, col:209)
	 */
	public static class Axiom20 extends Axiom
{
	/**
	 * Branch -1 for axiom allInserted
	 */
		public Axiom20(Domain owner)
		{
			super(owner, new Predicate(18, 2, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL)), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom allInserted [line:209,4 to 210,209]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition3(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom20Branch0(line:209,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom allInserted
	 * Source: (line:212, col:4) to (line:212, col:212)
	 */
	public static class Axiom21 extends Axiom
{
	/**
	 * Branch -1 for axiom allInserted
	 */
		public Axiom21(Domain owner)
		{
			super(owner, new Predicate(18, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom allInserted [line:212,4 to 212,212]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom21Branch0(line:212,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom allInserted
	 * Source: (line:214, col:6) to (line:214, col:48)
	 */
	public static class Precondition4 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition4(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:214, col:7) to (line:214, col:25)
			p[1] = new PreconditionAtomic(new Predicate(17, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier);
			// Source: (line:214, col:26) to (line:214, col:47)
			p[2] = new PreconditionAtomic(new Predicate(18, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom allInserted [line:214,6 to 214,48]";
		}
	}

	/**
	 * Branch -1 for axiom allInserted
	 * Source: (line:213, col:4) to (line:214, col:213)
	 */
	public static class Axiom22 extends Axiom
{
	/**
	 * Branch -1 for axiom allInserted
	 */
		public Axiom22(Domain owner)
		{
			super(owner, new Predicate(18, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom allInserted [line:213,4 to 214,213]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition4(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom22Branch0(line:213,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom getNonInserted
	 * Source: (line:217, col:4) to (line:218, col:217)
	 */
	public static class Axiom23 extends Axiom
{
	/**
	 * Branch -1 for axiom getNonInserted
	 */
		public Axiom23(Domain owner)
		{
			super(owner, new Predicate(19, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getNonInserted [line:217,4 to 218,217]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(20, 2, new TermList(owner.getTermVariable(0), new TermList(new TermCall(new List(owner.getTermVariable(1), TermList.NIL), ((coursegeneration)owner).calculateReverse, "((coursegeneration)owner).calculateReverse"), new TermList(TermList.NIL, TermList.NIL)))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom23Branch0(line:217,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getNIH
	 * Source: (line:220, col:6) to (line:221, col:29)
	 */
	public static class Precondition5 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition5(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:220, col:7) to (line:220, col:27)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(1), new TermList(TermList.NIL, TermList.NIL))), unifier);
			// Source: (line:221, col:7) to (line:221, col:28)
			p[2] = new PreconditionAssign(owner.getTermVariable(2), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getNIH [line:220,6 to 221,29]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getNIH
	 * Source: (line:223, col:6) to (line:226, col:35)
	 */
	public static class Precondition6 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition6(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:223, col:7) to (line:223, col:28)
			p[1] = new PreconditionAtomic(new Predicate(2, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:224, col:7) to (line:224, col:20)
			p[2] = new PreconditionAtomic(new Predicate(17, 5, new TermList(owner.getTermVariable(3), TermList.NIL)), unifier);
			// Source: (line:225, col:7) to (line:225, col:29)
			p[3] = new PreconditionAtomic(new Predicate(3, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:226, col:7) to (line:226, col:34)
			p[4] = new PreconditionAtomic(new Predicate(20, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getNIH [line:223,6 to 226,35]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom getNIH
	 * Source: (line:228, col:6) to (line:230, col:43)
	 */
	public static class Precondition7 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition7(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:228, col:7) to (line:228, col:28)
			p[1] = new PreconditionAtomic(new Predicate(2, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:229, col:7) to (line:229, col:29)
			p[2] = new PreconditionAtomic(new Predicate(3, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:230, col:7) to (line:230, col:42)
			p[3] = new PreconditionAtomic(new Predicate(20, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(4), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(2)), TermList.NIL)))), unifier);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom getNIH [line:228,6 to 230,43]";
		}
	}

	/**
	 * Branch -1 for axiom getNIH
	 * Source: (line:219, col:4) to (line:230, col:219)
	 */
	public static class Axiom24 extends Axiom
{
	/**
	 * Branch -1 for axiom getNIH
	 */
		public Axiom24(Domain owner)
		{
			super(owner, new Predicate(20, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 3);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getNIH [line:219,4 to 230,219]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition5(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition6(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition7(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom24Branch0(line:219,col:5)";
				case 1: return "Axiom24Branch1(line:219,col:5)";
				case 2: return "Axiom24Branch2(line:219,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom getNonInserted
	 * Source: (line:232, col:4) to (line:233, col:232)
	 */
	public static class Axiom25 extends Axiom
{
	/**
	 * Branch -1 for axiom getNonInserted
	 */
		public Axiom25(Domain owner)
		{
			super(owner, new Predicate(19, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getNonInserted [line:232,4 to 233,232]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(20, 3, new TermList(owner.getTermVariable(0), new TermList(new TermCall(new List(owner.getTermVariable(1), TermList.NIL), ((coursegeneration)owner).calculateReverse, "((coursegeneration)owner).calculateReverse"), new TermList(TermList.NIL, new TermList(owner.getTermVariable(2), TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom25Branch0(line:232,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getNIH
	 * Source: (line:235, col:6) to (line:236, col:29)
	 */
	public static class Precondition8 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition8(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:235, col:7) to (line:235, col:27)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(TermList.NIL, TermList.NIL))), unifier);
			// Source: (line:236, col:7) to (line:236, col:28)
			p[2] = new PreconditionAssign(owner.getTermVariable(2), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getNIH [line:235,6 to 236,29]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getNIH
	 * Source: (line:238, col:6) to (line:241, col:35)
	 */
	public static class Precondition9 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition9(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:238, col:7) to (line:238, col:28)
			p[1] = new PreconditionAtomic(new Predicate(2, 6, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:239, col:7) to (line:239, col:23)
			p[2] = new PreconditionAtomic(new Predicate(17, 6, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(3), TermList.NIL))), unifier);
			// Source: (line:240, col:7) to (line:240, col:29)
			p[3] = new PreconditionAtomic(new Predicate(3, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:241, col:7) to (line:241, col:34)
			p[4] = new PreconditionAtomic(new Predicate(20, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getNIH [line:238,6 to 241,35]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom getNIH
	 * Source: (line:243, col:6) to (line:246, col:46)
	 */
	public static class Precondition10 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition10(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:243, col:7) to (line:243, col:28)
			p[1] = new PreconditionAtomic(new Predicate(2, 6, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:244, col:7) to (line:244, col:29)
			p[2] = new PreconditionNegation(new PreconditionAtomic(new Predicate(17, 6, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(3), TermList.NIL))), unifier), 6);
			// Source: (line:245, col:7) to (line:245, col:29)
			p[3] = new PreconditionAtomic(new Predicate(3, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:246, col:7) to (line:246, col:45)
			p[4] = new PreconditionAtomic(new Predicate(20, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(5), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(2)), new TermList(owner.getTermVariable(3), TermList.NIL))))), unifier);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom getNIH [line:243,6 to 246,46]";
		}
	}

	/**
	 * Branch -1 for axiom getNIH
	 * Source: (line:234, col:4) to (line:246, col:234)
	 */
	public static class Axiom26 extends Axiom
{
	/**
	 * Branch -1 for axiom getNIH
	 */
		public Axiom26(Domain owner)
		{
			super(owner, new Predicate(20, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))), 3);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getNIH [line:234,4 to 246,234]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition8(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition9(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition10(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom26Branch0(line:234,col:5)";
				case 1: return "Axiom26Branch1(line:234,col:5)";
				case 2: return "Axiom26Branch2(line:234,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom readyAux
	 * Source: (line:250, col:6) to (line:258, col:34)
	 */
	public static class Precondition11 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition11(Domain owner, Term[] unifier)
		{
			p = new Precondition[6];
			// Source: (line:250, col:7) to (line:250, col:50)
			p[1] = new PreconditionAtomic(new Predicate(9, 5, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(22) /*hasEducationalLevel*/, new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:251, col:7) to (line:253, col:69)
			p[2] = new PreconditionAtomic(new Predicate(28, 5, new TermList(owner.getTermVariable(3), new TermList(new TermList(new TermList(owner.getTermConstant(23) /*class*/, new TermList(owner.getTermConstant(24) /*Competence*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(25) /*hasLearningContext*/, new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(new TermList(owner.getTermConstant(26) /*relation*/, new TermList(owner.getTermConstant(27) /*inverseHasPrerequisite*/, new TermList(owner.getTermVariable(0), TermList.NIL))), TermList.NIL))), TermList.NIL))), unifier);
			// Source: (line:254, col:7) to (line:254, col:37)
			p[3] = new PreconditionAtomic(new Predicate(29, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:255, col:7) to (line:257, col:60)
			p[4] = new PreconditionAtomic(new Predicate(32, 5, new TermList(owner.getTermVariable(4), new TermList(new TermList(new TermList(owner.getTermConstant(23) /*class*/, new TermList(owner.getTermConstant(30) /*Auxiliary*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermConstant(25) /*hasLearningContext*/, new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(new TermList(owner.getTermConstant(26) /*relation*/, new TermList(owner.getTermConstant(31) /*isRequiredBy*/, new TermList(owner.getTermVariable(0), TermList.NIL))), TermList.NIL))), TermList.NIL))), unifier);
			// Source: (line:258, col:7) to (line:258, col:33)
			p[5] = new PreconditionAtomic(new Predicate(18, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			b = new Term[6][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[5] == null)
			{
				boolean b4changed = false;
				while (b[4] == null)
				{
					boolean b3changed = false;
					while (b[3] == null)
					{
						boolean b2changed = false;
						while (b[2] == null)
						{
							boolean b1changed = false;
							while (b[1] == null)
							{
								b[1] = p[1].nextBinding(state);
								if (b[1] == null)
									return null;
								else
									bestMatch = Math.max(bestMatch, 1);
								b1changed = true;
							}
							if ( b1changed ) {
								p[2].reset(state);
								p[2].bind(Term.merge(b, 2));
							}
							b[2] = p[2].nextBinding(state);
							if (b[2] == null)
								b[1] = null;
							else
								bestMatch = Math.max(bestMatch, 2);
							b2changed = true;
						}
						if ( b2changed ) {
							p[3].reset(state);
							p[3].bind(Term.merge(b, 3));
						}
						b[3] = p[3].nextBinding(state);
						if (b[3] == null)
							b[2] = null;
						else
							bestMatch = Math.max(bestMatch, 3);
						b3changed = true;
					}
					if ( b3changed ) {
						p[4].reset(state);
						p[4].bind(Term.merge(b, 4));
					}
					b[4] = p[4].nextBinding(state);
					if (b[4] == null)
						b[3] = null;
					else
						bestMatch = Math.max(bestMatch, 4);
					b4changed = true;
				}
				if ( b4changed ) {
					p[5].reset(state);
					p[5].bind(Term.merge(b, 5));
				}
				b[5] = p[5].nextBinding(state);
				if (b[5] == null)
					b[4] = null;
				else
					bestMatch = Math.max(bestMatch, 5);
			}

			Term[] retVal = Term.merge(b, 6);
			b[5] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom readyAux [line:250,6 to 258,34]";
		}
	}

	/**
	 * Branch -1 for axiom readyAux
	 * Source: (line:249, col:4) to (line:258, col:249)
	 */
	public static class Axiom27 extends Axiom
{
	/**
	 * Branch -1 for axiom readyAux
	 */
		public Axiom27(Domain owner)
		{
			super(owner, new Predicate(21, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom readyAux [line:249,4 to 258,249]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition11(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom27Branch0(line:249,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom allHaveCompetences
	 * Source: (line:260, col:4) to (line:260, col:260)
	 */
	public static class Axiom28 extends Axiom
{
	/**
	 * Branch -1 for axiom allHaveCompetences
	 */
		public Axiom28(Domain owner)
		{
			super(owner, new Predicate(29, 1, new TermList(TermList.NIL, new TermList(owner.getTermVariable(0), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom allHaveCompetences [line:260,4 to 260,260]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(1)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom28Branch0(line:260,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom allHaveCompetences
	 * Source: (line:262, col:6) to (line:263, col:36)
	 */
	public static class Precondition12 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition12(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:262, col:7) to (line:262, col:30)
			p[1] = new PreconditionAtomic(new Predicate(33, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier);
			// Source: (line:263, col:7) to (line:263, col:35)
			p[2] = new PreconditionAtomic(new Predicate(29, 3, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom allHaveCompetences [line:262,6 to 263,36]";
		}
	}

	/**
	 * Branch -1 for axiom allHaveCompetences
	 * Source: (line:261, col:4) to (line:263, col:261)
	 */
	public static class Axiom29 extends Axiom
{
	/**
	 * Branch -1 for axiom allHaveCompetences
	 */
		public Axiom29(Domain owner)
		{
			super(owner, new Predicate(29, 3, new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), new TermList(owner.getTermVariable(2), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom allHaveCompetences [line:261,4 to 263,261]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition12(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom29Branch0(line:261,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom hasCompetence
	 * Source: (line:265, col:4) to (line:269, col:265)
	 */
	public static class Axiom30 extends Axiom
{
	/**
	 * Branch -1 for axiom hasCompetence
	 */
		public Axiom30(Domain owner)
		{
			super(owner, new Predicate(33, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom hasCompetence [line:265,4 to 269,265]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom30Branch0(line:265,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom sortByAlreadySeen
	 * Source: (line:272, col:4) to (line:273, col:272)
	 */
	public static class Axiom31 extends Axiom
{
	/**
	 * Branch -1 for axiom sortByAlreadySeen
	 */
		public Axiom31(Domain owner)
		{
			super(owner, new Predicate(34, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom sortByAlreadySeen [line:272,4 to 273,272]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(35, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(TermList.NIL, new TermList(TermList.NIL, new TermList(owner.getTermVariable(2), TermList.NIL)))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom31Branch0(line:272,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom sortByAlreadySeenH
	 * Source: (line:275, col:6) to (line:276, col:52)
	 */
	public static class Precondition13 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition13(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:275, col:7) to (line:275, col:22)
			p[1] = new PreconditionAtomic(new Predicate(0, 8, new TermList(owner.getTermVariable(1), new TermList(TermList.NIL, TermList.NIL))), unifier);
			// Source: (line:276, col:7) to (line:276, col:51)
			p[2] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)), ((coursegeneration)owner).calculateConcat, "((coursegeneration)owner).calculateConcat"), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom sortByAlreadySeenH [line:275,6 to 276,52]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom sortByAlreadySeenH
	 * Source: (line:278, col:6) to (line:282, col:72)
	 */
	public static class Precondition14 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition14(Domain owner, Term[] unifier)
		{
			p = new Precondition[6];
			// Source: (line:278, col:7) to (line:278, col:28)
			p[1] = new PreconditionAtomic(new Predicate(2, 8, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:279, col:7) to (line:279, col:57)
			p[2] = new PreconditionAtomic(new Predicate(9, 8, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(36) /*hasAlreadySeen*/, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL))))), unifier);
			// Source: (line:280, col:7) to (line:280, col:25)
			p[3] = new PreconditionAtomic(new Predicate(0, 8, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(37) /*false*/, TermList.NIL))), unifier);
			// Source: (line:281, col:7) to (line:281, col:24)
			p[4] = new PreconditionAtomic(new Predicate(3, 8, new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:282, col:7) to (line:282, col:71)
			p[5] = new PreconditionAtomic(new Predicate(35, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(7), new TermList(new TermList(owner.getTermVariable(5), owner.getTermVariable(2)), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			b = new Term[6][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[5] == null)
			{
				boolean b4changed = false;
				while (b[4] == null)
				{
					boolean b3changed = false;
					while (b[3] == null)
					{
						boolean b2changed = false;
						while (b[2] == null)
						{
							boolean b1changed = false;
							while (b[1] == null)
							{
								b[1] = p[1].nextBinding(state);
								if (b[1] == null)
									return null;
								else
									bestMatch = Math.max(bestMatch, 1);
								b1changed = true;
							}
							if ( b1changed ) {
								p[2].reset(state);
								p[2].bind(Term.merge(b, 2));
							}
							b[2] = p[2].nextBinding(state);
							if (b[2] == null)
								b[1] = null;
							else
								bestMatch = Math.max(bestMatch, 2);
							b2changed = true;
						}
						if ( b2changed ) {
							p[3].reset(state);
							p[3].bind(Term.merge(b, 3));
						}
						b[3] = p[3].nextBinding(state);
						if (b[3] == null)
							b[2] = null;
						else
							bestMatch = Math.max(bestMatch, 3);
						b3changed = true;
					}
					if ( b3changed ) {
						p[4].reset(state);
						p[4].bind(Term.merge(b, 4));
					}
					b[4] = p[4].nextBinding(state);
					if (b[4] == null)
						b[3] = null;
					else
						bestMatch = Math.max(bestMatch, 4);
					b4changed = true;
				}
				if ( b4changed ) {
					p[5].reset(state);
					p[5].bind(Term.merge(b, 5));
				}
				b[5] = p[5].nextBinding(state);
				if (b[5] == null)
					b[4] = null;
				else
					bestMatch = Math.max(bestMatch, 5);
			}

			Term[] retVal = Term.merge(b, 6);
			b[5] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom sortByAlreadySeenH [line:278,6 to 282,72]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom sortByAlreadySeenH
	 * Source: (line:284, col:6) to (line:288, col:72)
	 */
	public static class Precondition15 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition15(Domain owner, Term[] unifier)
		{
			p = new Precondition[6];
			// Source: (line:284, col:7) to (line:284, col:28)
			p[1] = new PreconditionAtomic(new Predicate(2, 8, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:285, col:7) to (line:285, col:57)
			p[2] = new PreconditionAtomic(new Predicate(9, 8, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(36) /*hasAlreadySeen*/, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL))))), unifier);
			// Source: (line:286, col:7) to (line:286, col:24)
			p[3] = new PreconditionAtomic(new Predicate(0, 8, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(38) /*true*/, TermList.NIL))), unifier);
			// Source: (line:287, col:7) to (line:287, col:24)
			p[4] = new PreconditionAtomic(new Predicate(3, 8, new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(1), TermList.NIL))), unifier);
			// Source: (line:288, col:7) to (line:288, col:71)
			p[5] = new PreconditionAtomic(new Predicate(35, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(7), new TermList(owner.getTermVariable(2), new TermList(new TermList(owner.getTermVariable(5), owner.getTermVariable(3)), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			b = new Term[6][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[5] == null)
			{
				boolean b4changed = false;
				while (b[4] == null)
				{
					boolean b3changed = false;
					while (b[3] == null)
					{
						boolean b2changed = false;
						while (b[2] == null)
						{
							boolean b1changed = false;
							while (b[1] == null)
							{
								b[1] = p[1].nextBinding(state);
								if (b[1] == null)
									return null;
								else
									bestMatch = Math.max(bestMatch, 1);
								b1changed = true;
							}
							if ( b1changed ) {
								p[2].reset(state);
								p[2].bind(Term.merge(b, 2));
							}
							b[2] = p[2].nextBinding(state);
							if (b[2] == null)
								b[1] = null;
							else
								bestMatch = Math.max(bestMatch, 2);
							b2changed = true;
						}
						if ( b2changed ) {
							p[3].reset(state);
							p[3].bind(Term.merge(b, 3));
						}
						b[3] = p[3].nextBinding(state);
						if (b[3] == null)
							b[2] = null;
						else
							bestMatch = Math.max(bestMatch, 3);
						b3changed = true;
					}
					if ( b3changed ) {
						p[4].reset(state);
						p[4].bind(Term.merge(b, 4));
					}
					b[4] = p[4].nextBinding(state);
					if (b[4] == null)
						b[3] = null;
					else
						bestMatch = Math.max(bestMatch, 4);
					b4changed = true;
				}
				if ( b4changed ) {
					p[5].reset(state);
					p[5].bind(Term.merge(b, 5));
				}
				b[5] = p[5].nextBinding(state);
				if (b[5] == null)
					b[4] = null;
				else
					bestMatch = Math.max(bestMatch, 5);
			}

			Term[] retVal = Term.merge(b, 6);
			b[5] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom sortByAlreadySeenH [line:284,6 to 288,72]";
		}
	}

	/**
	 * Branch -1 for axiom sortByAlreadySeenH
	 * Source: (line:274, col:4) to (line:288, col:274)
	 */
	public static class Axiom32 extends Axiom
{
	/**
	 * Branch -1 for axiom sortByAlreadySeenH
	 */
		public Axiom32(Domain owner)
		{
			super(owner, new Predicate(35, 8, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 3);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom sortByAlreadySeenH [line:274,4 to 288,274]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition13(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition14(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition15(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom32Branch0(line:274,col:5)";
				case 1: return "Axiom32Branch1(line:274,col:5)";
				case 2: return "Axiom32Branch2(line:274,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom applyFilters
	 * Source: (line:323, col:4) to (line:324, col:323)
	 */
	public static class Axiom33 extends Axiom
{
	/**
	 * Branch -1 for axiom applyFilters
	 */
		public Axiom33(Domain owner)
		{
			super(owner, new Predicate(40, 2, new TermList(owner.getTermVariable(0), new TermList(TermList.NIL, new TermList(owner.getTermVariable(1), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom applyFilters [line:323,4 to 324,323]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(owner.getTermVariable(1), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom33Branch0(line:323,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom applyFilters
	 * Source: (line:326, col:6) to (line:327, col:52)
	 */
	public static class Precondition18 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition18(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:326, col:7) to (line:326, col:42)
			p[1] = new PreconditionAtomic(new Predicate(41, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), TermList.NIL)))), unifier);
			// Source: (line:327, col:7) to (line:327, col:51)
			p[2] = new PreconditionAtomic(new Predicate(40, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom applyFilters [line:326,6 to 327,52]";
		}
	}

	/**
	 * Branch -1 for axiom applyFilters
	 * Source: (line:325, col:4) to (line:327, col:325)
	 */
	public static class Axiom34 extends Axiom
{
	/**
	 * Branch -1 for axiom applyFilters
	 */
		public Axiom34(Domain owner)
		{
			super(owner, new Predicate(40, 5, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), owner.getTermVariable(2)), new TermList(owner.getTermVariable(3), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom applyFilters [line:325,4 to 327,325]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition18(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom34Branch0(line:325,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom filter
	 * Source: (line:329, col:4) to (line:330, col:329)
	 */
	public static class Axiom35 extends Axiom
{
	/**
	 * Branch -1 for axiom filter
	 */
		public Axiom35(Domain owner)
		{
			super(owner, new Predicate(41, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom filter [line:329,4 to 330,329]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(42, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(TermList.NIL, TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom35Branch0(line:329,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom filterH
	 * Source: (line:331, col:4) to (line:332, col:331)
	 */
	public static class Axiom36 extends Axiom
{
	/**
	 * Branch -1 for axiom filterH
	 */
		public Axiom36(Domain owner)
		{
			super(owner, new Predicate(42, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(TermList.NIL, new TermList(owner.getTermVariable(2), TermList.NIL))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom filterH [line:331,4 to 332,331]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(owner.getTermVariable(2), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom36Branch0(line:331,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom filterH
	 * Source: (line:334, col:6) to (line:335, col:70)
	 */
	public static class Precondition19 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition19(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:334, col:7) to (line:334, col:35)
			p[1] = new PreconditionAtomic(new Predicate(11, 6, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:335, col:7) to (line:335, col:69)
			p[2] = new PreconditionAtomic(new Predicate(42, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(owner.getTermVariable(4), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(5)), TermList.NIL))))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom filterH [line:334,6 to 335,70]";
		}
	}

	/**
	 * Branch -1 for axiom filterH
	 * Source: (line:333, col:4) to (line:336, col:333)
	 */
	public static class Axiom37 extends Axiom
{
	/**
	 * Branch -1 for axiom filterH
	 */
		public Axiom37(Domain owner)
		{
			super(owner, new Predicate(42, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(4)), new TermList(owner.getTermVariable(5), TermList.NIL))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom filterH [line:333,4 to 336,333]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition19(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAtomic(new Predicate(42, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom37Branch0(line:333,col:5)";
				case 1: return "Axiom37Branch1(line:333,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom filterH
	 * Source: (line:338, col:6) to (line:339, col:80)
	 */
	public static class Precondition20 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition20(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:338, col:7) to (line:338, col:45)
			p[1] = new PreconditionAtomic(new Predicate(11, 7, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL))))), unifier);
			// Source: (line:339, col:7) to (line:339, col:79)
			p[2] = new PreconditionAtomic(new Predicate(42, 7, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(6)), TermList.NIL))))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom filterH [line:338,6 to 339,80]";
		}
	}

	/**
	 * Branch -1 for axiom filterH
	 * Source: (line:337, col:4) to (line:340, col:337)
	 */
	public static class Axiom38 extends Axiom
{
	/**
	 * Branch -1 for axiom filterH
	 */
		public Axiom38(Domain owner)
		{
			super(owner, new Predicate(42, 7, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(5)), new TermList(owner.getTermVariable(6), TermList.NIL))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom filterH [line:337,4 to 340,337]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition20(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAtomic(new Predicate(42, 7, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(11) /*property*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), TermList.NIL)))), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(6), TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom38Branch0(line:337,col:5)";
				case 1: return "Axiom38Branch1(line:337,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom filterH
	 * Source: (line:342, col:6) to (line:343, col:70)
	 */
	public static class Precondition21 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition21(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:342, col:7) to (line:342, col:35)
			p[1] = new PreconditionAtomic(new Predicate(26, 6, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			// Source: (line:343, col:7) to (line:343, col:69)
			p[2] = new PreconditionAtomic(new Predicate(42, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(26) /*relation*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(owner.getTermVariable(4), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(5)), TermList.NIL))))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom filterH [line:342,6 to 343,70]";
		}
	}

	/**
	 * Branch -1 for axiom filterH
	 * Source: (line:341, col:4) to (line:344, col:341)
	 */
	public static class Axiom39 extends Axiom
{
	/**
	 * Branch -1 for axiom filterH
	 */
		public Axiom39(Domain owner)
		{
			super(owner, new Predicate(42, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(26) /*relation*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(new TermList(owner.getTermVariable(3), owner.getTermVariable(4)), new TermList(owner.getTermVariable(5), TermList.NIL))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom filterH [line:341,4 to 344,341]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition21(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAtomic(new Predicate(42, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermConstant(26) /*relation*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL))), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(5), TermList.NIL))))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom39Branch0(line:341,col:5)";
				case 1: return "Axiom39Branch1(line:341,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getConcepts
	 * Source: (line:348, col:6) to (line:349, col:48)
	 */
	public static class Precondition22 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition22(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:348, col:7) to (line:348, col:26)
			p[1] = new PreconditionAtomic(new Predicate(44, 3, new TermList(owner.getTermVariable(2), TermList.NIL)), unifier);
			// Source: (line:349, col:7) to (line:349, col:47)
			p[2] = new PreconditionAtomic(new Predicate(40, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getConcepts [line:348,6 to 349,48]";
		}
	}

	/**
	 * Branch -1 for axiom getConcepts
	 * Source: (line:347, col:4) to (line:349, col:347)
	 */
	public static class Axiom40 extends Axiom
{
	/**
	 * Branch -1 for axiom getConcepts
	 */
		public Axiom40(Domain owner)
		{
			super(owner, new Predicate(43, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getConcepts [line:347,4 to 349,347]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition22(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom40Branch0(line:347,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getCompetences
	 * Source: (line:400, col:6) to (line:401, col:51)
	 */
	public static class Precondition26 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition26(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:400, col:7) to (line:400, col:32)
			p[1] = new PreconditionAtomic(new Predicate(48, 3, new TermList(owner.getTermVariable(2), TermList.NIL)), unifier);
			// Source: (line:401, col:7) to (line:401, col:50)
			p[2] = new PreconditionAtomic(new Predicate(40, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getCompetences [line:400,6 to 401,51]";
		}
	}

	/**
	 * Branch -1 for axiom getCompetences
	 * Source: (line:399, col:4) to (line:401, col:399)
	 */
	public static class Axiom41 extends Axiom
{
	/**
	 * Branch -1 for axiom getCompetences
	 */
		public Axiom41(Domain owner)
		{
			super(owner, new Predicate(28, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getCompetences [line:399,4 to 401,399]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition26(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom41Branch0(line:399,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getMaxAttempts
	 * Source: (line:504, col:6) to (line:504, col:57)
	 */
	public static class Precondition30 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition30(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:504, col:7) to (line:504, col:32)
			p[1] = new PreconditionAtomic(new Predicate(65, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), unifier);
			// Source: (line:504, col:33) to (line:504, col:56)
			p[2] = new PreconditionAssign(owner.getTermVariable(1), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getMaxAttempts [line:504,6 to 504,57]";
		}
	}

	/**
	 * Branch -1 for axiom getMaxAttempts
	 * Source: (line:503, col:4) to (line:505, col:503)
	 */
	public static class Axiom42 extends Axiom
{
	/**
	 * Branch -1 for axiom getMaxAttempts
	 */
		public Axiom42(Domain owner)
		{
			super(owner, new Predicate(64, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getMaxAttempts [line:503,4 to 505,503]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition30(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAssign(new TermNumber(4.0), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom42Branch0(line:503,col:5)";
				case 1: return "Axiom42Branch1(line:503,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getMaxPerStrategy
	 * Source: (line:508, col:6) to (line:508, col:66)
	 */
	public static class Precondition31 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition31(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:508, col:7) to (line:508, col:38)
			p[1] = new PreconditionAtomic(new Predicate(67, 2, new TermList(owner.getTermVariable(1), TermList.NIL)), unifier);
			// Source: (line:508, col:39) to (line:508, col:65)
			p[2] = new PreconditionAssign(owner.getTermVariable(1), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getMaxPerStrategy [line:508,6 to 508,66]";
		}
	}

	/**
	 * Branch -1 for axiom getMaxPerStrategy
	 * Source: (line:507, col:4) to (line:509, col:507)
	 */
	public static class Axiom43 extends Axiom
{
	/**
	 * Branch -1 for axiom getMaxPerStrategy
	 */
		public Axiom43(Domain owner)
		{
			super(owner, new Predicate(66, 2, new TermList(owner.getTermVariable(0), TermList.NIL)), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getMaxPerStrategy [line:507,4 to 509,507]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition31(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAssign(new TermNumber(1.0), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom43Branch0(line:507,col:5)";
				case 1: return "Axiom43Branch1(line:507,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:515, col:6) to (line:515, col:97)
	 */
	public static class Precondition32 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition32(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:515, col:7) to (line:515, col:37)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), TermList.NIL))), unifier);
			// Source: (line:515, col:38) to (line:515, col:76)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), TermList.NIL))), unifier);
			// Source: (line:515, col:77) to (line:515, col:96)
			p[3] = new PreconditionAssign(TermList.NIL, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:515,6 to 515,97]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:514, col:4) to (line:515, col:514)
	 */
	public static class Axiom44 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom44(Domain owner)
		{
			super(owner, new Predicate(68, 5, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:514,4 to 515,514]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition32(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom44Branch0(line:514,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:518, col:6) to (line:523, col:84)
	 */
	public static class Precondition33 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition33(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:518, col:7) to (line:518, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:519, col:7) to (line:520, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(70) /*tuning*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:521, col:7) to (line:523, col:83)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(71) /*learningByBeingTaught*/, new TermList(owner.getTermConstant(72) /*anchorHolder*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(69) /*nothing*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:518,6 to 523,84]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:517, col:4) to (line:523, col:517)
	 */
	public static class Axiom45 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom45(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:517,4 to 523,517]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition33(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom45Branch0(line:517,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:526, col:6) to (line:532, col:81)
	 */
	public static class Precondition34 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition34(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:526, col:7) to (line:526, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(73) /*explanatory*/, TermList.NIL))), unifier);
			// Source: (line:527, col:7) to (line:527, col:40)
			p[2] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(74) /*accretion*/, TermList.NIL))), unifier);
			// Source: (line:528, col:7) to (line:529, col:53)
			p[3] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermConstant(70) /*tuning*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:530, col:7) to (line:532, col:80)
			p[4] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(76) /*learningByDiagnosing*/, new TermList(owner.getTermConstant(77) /*anchoredInstructor*/, new TermList(owner.getTermConstant(73) /*explanatory*/, new TermList(owner.getTermConstant(74) /*accretion*/, new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:526,6 to 532,81]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getPath
	 * Source: (line:533, col:6) to (line:539, col:88)
	 */
	public static class Precondition35 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition35(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:533, col:7) to (line:533, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(73) /*explanatory*/, TermList.NIL))), unifier);
			// Source: (line:534, col:7) to (line:534, col:44)
			p[2] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);
			// Source: (line:535, col:7) to (line:536, col:53)
			p[3] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermConstant(78) /*restructuring*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:537, col:7) to (line:539, col:87)
			p[4] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(76) /*learningByDiagnosing*/, new TermList(owner.getTermConstant(77) /*anchoredInstructor*/, new TermList(owner.getTermConstant(73) /*explanatory*/, new TermList(owner.getTermConstant(78) /*restructuring*/, new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getPath [line:533,6 to 539,88]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:525, col:4) to (line:539, col:525)
	 */
	public static class Axiom46 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom46(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:525,4 to 539,525]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition34(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition35(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom46Branch0(line:525,col:5)";
				case 1: return "Axiom46Branch1(line:525,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:542, col:6) to (line:547, col:96)
	 */
	public static class Precondition36 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition36(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:542, col:7) to (line:542, col:34)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:543, col:7) to (line:544, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:545, col:7) to (line:547, col:95)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(79) /*learningByApprenticeship*/, new TermList(owner.getTermConstant(80) /*apprenticeship*/, new TermList(owner.getTermConstant(69) /*nothing*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:542,6 to 547,96]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:541, col:4) to (line:547, col:541)
	 */
	public static class Axiom47 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom47(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:541,4 to 547,541]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition36(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom47Branch0(line:541,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:550, col:6) to (line:555, col:88)
	 */
	public static class Precondition37 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition37(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:550, col:7) to (line:550, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:551, col:7) to (line:552, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(81) /*autonomous*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:553, col:7) to (line:555, col:87)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(82) /*learningByGuiding*/, new TermList(owner.getTermConstant(83) /*master*/, new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(81) /*autonomous*/, new TermList(owner.getTermVariable(2), TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:550,6 to 555,88]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:549, col:4) to (line:555, col:549)
	 */
	public static class Axiom48 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom48(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:549,4 to 555,549]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition37(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom48Branch0(line:549,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:558, col:6) to (line:562, col:111)
	 */
	public static class Precondition38 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition38(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:558, col:7) to (line:558, col:37)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			// Source: (line:559, col:7) to (line:560, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(78) /*restructuring*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:561, col:7) to (line:562, col:110)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(84) /*learningByReflection*/, new TermList(owner.getTermConstant(85) /*audience*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(70) /*tuning*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:558,6 to 562,111]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:557, col:4) to (line:562, col:557)
	 */
	public static class Axiom49 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom49(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:557,4 to 562,557]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition38(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom49Branch0(line:557,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:565, col:6) to (line:570, col:96)
	 */
	public static class Precondition39 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition39(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:565, col:7) to (line:565, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(73) /*explanatory*/, TermList.NIL))), unifier);
			// Source: (line:566, col:7) to (line:567, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:568, col:7) to (line:570, col:95)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(86) /*learningBySelfexpression*/, new TermList(owner.getTermConstant(87) /*panelist*/, new TermList(owner.getTermConstant(73) /*explanatory*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:565,6 to 570,96]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:564, col:4) to (line:570, col:564)
	 */
	public static class Axiom50 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom50(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:564,4 to 570,564]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition39(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom50Branch0(line:564,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Conjunct #1 of Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:574, col:7) to (line:575, col:49)
	 */
	public static class Precondition40 extends Precondition
	{
		Precondition[] p;
		Term[] b;
		int whichClause;

		public Precondition40(Domain owner, Term[] unifier)
		{
			p = new Precondition[2];
			p[0] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);

			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			p[0].bind(binding);
			p[1].bind(binding);
		}

		protected Term[] nextBindingHelper(State state)
		{
			while (whichClause < 2)
			{
				b = p[whichClause].nextBinding(state);
				if (b != null)
					 return b;
				whichClause++;
			}

			return null;
		}

		@Override
		public String toString()
		{
			return "Conjunct #1 of Precondition of branch #0 of Branch -1 for axiom getPath [line:574,7 to 575,49]";
		}
		protected void resetHelper(State state)
		{
			p[0].reset(state);
			p[1].reset(state);
			whichClause = 0;
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:573, col:6) to (line:580, col:91)
	 */
	public static class Precondition41 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition41(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:573, col:7) to (line:573, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:574, col:7) to (line:575, col:49)
			p[2] = new Precondition40(owner, unifier) /*Conjunct 2 of Precondition of branch #0 of Branch -1 for axiom getPath*/;
			// Source: (line:576, col:7) to (line:577, col:53)
			p[3] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(81) /*autonomous*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:578, col:7) to (line:580, col:90)
			p[4] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, new TermList(owner.getTermConstant(89) /*fullParticipant*/, new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(81) /*autonomous*/, new TermList(owner.getTermVariable(2), TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:573,6 to 580,91]";
		}
	}

	/**
	 * Conjunct #1 of Precondition of branch #1 of Branch -1 for axiom getPath
	 * Source: (line:582, col:7) to (line:583, col:42)
	 */
	public static class Precondition42 extends Precondition
	{
		Precondition[] p;
		Term[] b;
		int whichClause;

		public Precondition42(Domain owner, Term[] unifier)
		{
			p = new Precondition[2];
			p[0] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);

			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(81) /*autonomous*/, TermList.NIL))), unifier);

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			p[0].bind(binding);
			p[1].bind(binding);
		}

		protected Term[] nextBindingHelper(State state)
		{
			while (whichClause < 2)
			{
				b = p[whichClause].nextBinding(state);
				if (b != null)
					 return b;
				whichClause++;
			}

			return null;
		}

		@Override
		public String toString()
		{
			return "Conjunct #1 of Precondition of branch #1 of Branch -1 for axiom getPath [line:582,7 to 583,42]";
		}
		protected void resetHelper(State state)
		{
			p[0].reset(state);
			p[1].reset(state);
			whichClause = 0;
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getPath
	 * Source: (line:581, col:6) to (line:588, col:90)
	 */
	public static class Precondition43 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition43(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:581, col:7) to (line:581, col:37)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			// Source: (line:582, col:7) to (line:583, col:42)
			p[2] = new Precondition42(owner, unifier) /*Conjunct 2 of Precondition of branch #1 of Branch -1 for axiom getPath*/;
			// Source: (line:584, col:7) to (line:585, col:53)
			p[3] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(78) /*restructuring*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:586, col:7) to (line:588, col:89)
			p[4] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, new TermList(owner.getTermConstant(89) /*fullParticipant*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(70) /*tuning*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getPath [line:581,6 to 588,90]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:572, col:4) to (line:588, col:572)
	 */
	public static class Axiom51 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom51(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:572,4 to 588,572]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition41(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition43(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom51Branch0(line:572,col:5)";
				case 1: return "Axiom51Branch1(line:572,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:591, col:6) to (line:596, col:90)
	 */
	public static class Precondition44 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition44(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:591, col:7) to (line:591, col:34)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:592, col:7) to (line:593, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:594, col:7) to (line:596, col:89)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(90) /*learningByPractice*/, new TermList(owner.getTermConstant(87) /*panelist*/, new TermList(owner.getTermConstant(69) /*nothing*/, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(75) /*associative*/, new TermList(owner.getTermVariable(2), TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:591,6 to 596,90]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:590, col:4) to (line:596, col:590)
	 */
	public static class Axiom52 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom52(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:590,4 to 596,590]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition44(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom52Branch0(line:590,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:599, col:6) to (line:604, col:87)
	 */
	public static class Precondition45 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition45(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:599, col:7) to (line:599, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:600, col:7) to (line:601, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(74) /*accretion*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:602, col:7) to (line:604, col:86)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(71) /*learningByBeingTaught*/, new TermList(owner.getTermConstant(91) /*peerTutee*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(69) /*nothing*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(74) /*accretion*/, owner.getTermVariable(5))))))), TermList.NIL), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:599,6 to 604,87]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:598, col:4) to (line:604, col:598)
	 */
	public static class Axiom53 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom53(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:598,4 to 604,598]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition45(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom53Branch0(line:598,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getPath
	 * Source: (line:607, col:6) to (line:612, col:81)
	 */
	public static class Precondition46 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition46(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:607, col:7) to (line:607, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(74) /*accretion*/, TermList.NIL))), unifier);
			// Source: (line:608, col:7) to (line:609, col:53)
			p[2] = new PreconditionAtomic(new Predicate(68, 6, new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(70) /*tuning*/, new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), unifier);
			// Source: (line:610, col:7) to (line:612, col:80)
			p[3] = new PreconditionAssign(new TermList(new TermList(owner.getTermConstant(92) /*learningByTeaching*/, new TermList(owner.getTermConstant(93) /*peerTutor*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(74) /*accretion*/, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL)))))), owner.getTermVariable(5)), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getPath [line:607,6 to 612,81]";
		}
	}

	/**
	 * Branch -1 for axiom getPath
	 * Source: (line:606, col:4) to (line:612, col:606)
	 */
	public static class Axiom54 extends Axiom
{
	/**
	 * Branch -1 for axiom getPath
	 */
		public Axiom54(Domain owner)
		{
			super(owner, new Predicate(68, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getPath [line:606,4 to 612,606]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition46(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom54Branch0(line:606,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:614, col:4) to (line:614, col:614)
	 */
	public static class Axiom55 extends Axiom
{
	/**
	 * Branch -1 for axiom getLearnersWithStrategy
	 */
		public Axiom55(Domain owner)
		{
			super(owner, new Predicate(94, 4, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(TermList.NIL, TermList.NIL)))))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getLearnersWithStrategy [line:614,4 to 614,614]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(TermList.NIL, unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom55Branch0(line:614,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:617, col:6) to (line:625, col:47)
	 */
	public static class Precondition47 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition47(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:617, col:7) to (line:617, col:44)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(71) /*learningByBeingTaught*/, TermList.NIL))), unifier);
			// Source: (line:618, col:7) to (line:618, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:619, col:7) to (line:619, col:39)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:620, col:7) to (line:620, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:621, col:7) to (line:621, col:47)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:622, col:7) to (line:622, col:37)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), TermList.NIL))), unifier);
			// Source: (line:623, col:7) to (line:623, col:38)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:623, col:39) to (line:623, col:66)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			// Source: (line:624, col:7) to (line:624, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:625, col:7) to (line:625, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getLearnersWithStrategy [line:617,6 to 625,47]";
		}
	}

	/**
	 * Disjunct #0 of Conjunct #7 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:631, col:11) to (line:631, col:74)
	 */
	public static class Precondition48 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition48(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:631, col:12) to (line:631, col:45)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(74) /*accretion*/, TermList.NIL))), unifier);
			// Source: (line:631, col:46) to (line:631, col:73)
			p[2] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Disjunct #0 of Conjunct #7 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy [line:631,11 to 631,74]";
		}
	}

	/**
	 * Disjunct #1 of Conjunct #7 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:632, col:11) to (line:632, col:85)
	 */
	public static class Precondition49 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition49(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:632, col:12) to (line:632, col:49)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);
			// Source: (line:632, col:50) to (line:632, col:84)
			p[2] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Disjunct #1 of Conjunct #7 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy [line:632,11 to 632,85]";
		}
	}

	/**
	 * Conjunct #7 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:631, col:7) to (line:632, col:86)
	 */
	public static class Precondition50 extends Precondition
	{
		Precondition[] p;
		Term[] b;
		int whichClause;

		public Precondition50(Domain owner, Term[] unifier)
		{
			p = new Precondition[2];
			p[0] = new Precondition48(owner, unifier);

			p[1] = new Precondition49(owner, unifier);

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			p[0].bind(binding);
			p[1].bind(binding);
		}

		protected Term[] nextBindingHelper(State state)
		{
			while (whichClause < 2)
			{
				b = p[whichClause].nextBinding(state);
				if (b != null)
					 return b;
				whichClause++;
			}

			return null;
		}

		@Override
		public String toString()
		{
			return "Conjunct #7 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy [line:631,7 to 632,86]";
		}
		protected void resetHelper(State state)
		{
			p[0].reset(state);
			p[1].reset(state);
			whichClause = 0;
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:627, col:6) to (line:634, col:47)
	 */
	public static class Precondition51 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition51(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:627, col:7) to (line:627, col:43)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(76) /*learningByDiagnosing*/, TermList.NIL))), unifier);
			// Source: (line:628, col:7) to (line:628, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:628, col:44) to (line:628, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:629, col:7) to (line:629, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:629, col:56) to (line:629, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:630, col:7) to (line:630, col:38)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(73) /*explanatory*/, TermList.NIL))), unifier);
			// Source: (line:630, col:39) to (line:630, col:67)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:631, col:7) to (line:632, col:86)
			p[8] = new Precondition50(owner, unifier) /*Conjunct 8 of Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy*/;
			// Source: (line:633, col:7) to (line:633, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:634, col:7) to (line:634, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getLearnersWithStrategy [line:627,6 to 634,47]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:636, col:6) to (line:642, col:47)
	 */
	public static class Precondition52 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition52(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:636, col:7) to (line:636, col:47)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(79) /*learningByApprenticeship*/, TermList.NIL))), unifier);
			// Source: (line:637, col:7) to (line:637, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:637, col:44) to (line:637, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:638, col:7) to (line:638, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:638, col:56) to (line:638, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:639, col:7) to (line:639, col:34)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:639, col:35) to (line:639, col:63)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:640, col:7) to (line:640, col:45)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))), unifier);
			// Source: (line:641, col:7) to (line:641, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:642, col:7) to (line:642, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom getLearnersWithStrategy [line:636,6 to 642,47]";
		}
	}

	/**
	 * Precondition of branch #3 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:644, col:6) to (line:650, col:47)
	 */
	public static class Precondition53 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition53(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:644, col:7) to (line:644, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(82) /*learningByGuiding*/, TermList.NIL))), unifier);
			// Source: (line:645, col:7) to (line:645, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:645, col:44) to (line:645, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:646, col:7) to (line:646, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:646, col:56) to (line:646, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:647, col:7) to (line:647, col:38)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:647, col:39) to (line:647, col:69)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(81) /*autonomous*/, TermList.NIL))), unifier);
			// Source: (line:648, col:7) to (line:648, col:45)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))), unifier);
			// Source: (line:649, col:7) to (line:649, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:650, col:7) to (line:650, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #3 of Branch -1 for axiom getLearnersWithStrategy [line:644,6 to 650,47]";
		}
	}

	/**
	 * Precondition of branch #4 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:652, col:6) to (line:658, col:47)
	 */
	public static class Precondition54 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition54(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:652, col:7) to (line:652, col:43)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(84) /*learningByReflection*/, TermList.NIL))), unifier);
			// Source: (line:653, col:7) to (line:653, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:653, col:44) to (line:653, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:654, col:7) to (line:654, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:654, col:56) to (line:654, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:655, col:7) to (line:655, col:37)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), TermList.NIL))), unifier);
			// Source: (line:656, col:7) to (line:656, col:37)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			// Source: (line:656, col:38) to (line:656, col:72)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);
			// Source: (line:657, col:7) to (line:657, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:658, col:7) to (line:658, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #4 of Branch -1 for axiom getLearnersWithStrategy [line:652,6 to 658,47]";
		}
	}

	/**
	 * Precondition of branch #5 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:660, col:6) to (line:666, col:47)
	 */
	public static class Precondition55 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition55(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:660, col:7) to (line:660, col:47)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(86) /*learningBySelfexpression*/, TermList.NIL))), unifier);
			// Source: (line:661, col:7) to (line:661, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:661, col:44) to (line:661, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:662, col:7) to (line:662, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:662, col:56) to (line:662, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:663, col:7) to (line:663, col:38)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(73) /*explanatory*/, TermList.NIL))), unifier);
			// Source: (line:663, col:39) to (line:663, col:67)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:664, col:7) to (line:664, col:45)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))), unifier);
			// Source: (line:665, col:7) to (line:665, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:666, col:7) to (line:666, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #5 of Branch -1 for axiom getLearnersWithStrategy [line:660,6 to 666,47]";
		}
	}

	/**
	 * Conjunct #3 of Disjunct #0 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:673, col:12) to (line:673, col:85)
	 */
	public static class Precondition56 extends Precondition
	{
		Precondition[] p;
		Term[] b;
		int whichClause;

		public Precondition56(Domain owner, Term[] unifier)
		{
			p = new Precondition[2];
			p[0] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);

			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			p[0].bind(binding);
			p[1].bind(binding);
		}

		protected Term[] nextBindingHelper(State state)
		{
			while (whichClause < 2)
			{
				b = p[whichClause].nextBinding(state);
				if (b != null)
					 return b;
				whichClause++;
			}

			return null;
		}

		@Override
		public String toString()
		{
			return "Conjunct #3 of Disjunct #0 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy [line:673,12 to 673,85]";
		}
		protected void resetHelper(State state)
		{
			p[0].reset(state);
			p[1].reset(state);
			whichClause = 0;
		}
	}

	/**
	 * Disjunct #0 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:671, col:11) to (line:673, col:86)
	 */
	public static class Precondition57 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition57(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:671, col:12) to (line:671, col:43)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:671, col:44) to (line:671, col:71)
			p[2] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(81) /*autonomous*/, TermList.NIL))), unifier);
			// Source: (line:672, col:12) to (line:672, col:50)
			p[3] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))), unifier);
			// Source: (line:673, col:12) to (line:673, col:85)
			p[4] = new Precondition56(owner, unifier) /*Conjunct 4 of Disjunct #0 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy*/;
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Disjunct #0 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy [line:671,11 to 673,86]";
		}
	}

	/**
	 * Conjunct #3 of Disjunct #1 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:676, col:12) to (line:676, col:79)
	 */
	public static class Precondition58 extends Precondition
	{
		Precondition[] p;
		Term[] b;
		int whichClause;

		public Precondition58(Domain owner, Term[] unifier)
		{
			p = new Precondition[2];
			p[0] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);

			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(81) /*autonomous*/, TermList.NIL))), unifier);

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			p[0].bind(binding);
			p[1].bind(binding);
		}

		protected Term[] nextBindingHelper(State state)
		{
			while (whichClause < 2)
			{
				b = p[whichClause].nextBinding(state);
				if (b != null)
					 return b;
				whichClause++;
			}

			return null;
		}

		@Override
		public String toString()
		{
			return "Conjunct #3 of Disjunct #1 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy [line:676,12 to 676,79]";
		}
		protected void resetHelper(State state)
		{
			p[0].reset(state);
			p[1].reset(state);
			whichClause = 0;
		}
	}

	/**
	 * Disjunct #1 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:674, col:11) to (line:676, col:80)
	 */
	public static class Precondition59 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition59(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:674, col:12) to (line:674, col:42)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			// Source: (line:674, col:43) to (line:674, col:77)
			p[2] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(78) /*restructuring*/, TermList.NIL))), unifier);
			// Source: (line:675, col:12) to (line:675, col:42)
			p[3] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), TermList.NIL))), unifier);
			// Source: (line:676, col:12) to (line:676, col:79)
			p[4] = new Precondition58(owner, unifier) /*Conjunct 4 of Disjunct #1 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy*/;
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Disjunct #1 of Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy [line:674,11 to 676,80]";
		}
	}

	/**
	 * Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:671, col:7) to (line:676, col:81)
	 */
	public static class Precondition60 extends Precondition
	{
		Precondition[] p;
		Term[] b;
		int whichClause;

		public Precondition60(Domain owner, Term[] unifier)
		{
			p = new Precondition[2];
			p[0] = new Precondition57(owner, unifier);

			p[1] = new Precondition59(owner, unifier);

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			p[0].bind(binding);
			p[1].bind(binding);
		}

		protected Term[] nextBindingHelper(State state)
		{
			while (whichClause < 2)
			{
				b = p[whichClause].nextBinding(state);
				if (b != null)
					 return b;
				whichClause++;
			}

			return null;
		}

		@Override
		public String toString()
		{
			return "Conjunct #5 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy [line:671,7 to 676,81]";
		}
		protected void resetHelper(State state)
		{
			p[0].reset(state);
			p[1].reset(state);
			whichClause = 0;
		}
	}

	/**
	 * Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:668, col:6) to (line:679, col:47)
	 */
	public static class Precondition61 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition61(Domain owner, Term[] unifier)
		{
			p = new Precondition[10];
			// Source: (line:668, col:7) to (line:668, col:47)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(86) /*learningBySelfexpression*/, TermList.NIL))), unifier);
			// Source: (line:669, col:7) to (line:669, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:669, col:44) to (line:669, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:670, col:7) to (line:670, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:670, col:56) to (line:670, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:671, col:7) to (line:676, col:81)
			p[6] = new Precondition60(owner, unifier) /*Conjunct 6 of Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy*/;
			// Source: (line:677, col:7) to (line:677, col:45)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))), unifier);
			// Source: (line:678, col:7) to (line:678, col:80)
			p[8] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:679, col:7) to (line:679, col:46)
			p[9] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[10][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[9] == null)
			{
				boolean b8changed = false;
				while (b[8] == null)
				{
					boolean b7changed = false;
					while (b[7] == null)
					{
						boolean b6changed = false;
						while (b[6] == null)
						{
							boolean b5changed = false;
							while (b[5] == null)
							{
								boolean b4changed = false;
								while (b[4] == null)
								{
									boolean b3changed = false;
									while (b[3] == null)
									{
										boolean b2changed = false;
										while (b[2] == null)
										{
											boolean b1changed = false;
											while (b[1] == null)
											{
												b[1] = p[1].nextBinding(state);
												if (b[1] == null)
													return null;
												else
													bestMatch = Math.max(bestMatch, 1);
												b1changed = true;
											}
											if ( b1changed ) {
												p[2].reset(state);
												p[2].bind(Term.merge(b, 2));
											}
											b[2] = p[2].nextBinding(state);
											if (b[2] == null)
												b[1] = null;
											else
												bestMatch = Math.max(bestMatch, 2);
											b2changed = true;
										}
										if ( b2changed ) {
											p[3].reset(state);
											p[3].bind(Term.merge(b, 3));
										}
										b[3] = p[3].nextBinding(state);
										if (b[3] == null)
											b[2] = null;
										else
											bestMatch = Math.max(bestMatch, 3);
										b3changed = true;
									}
									if ( b3changed ) {
										p[4].reset(state);
										p[4].bind(Term.merge(b, 4));
									}
									b[4] = p[4].nextBinding(state);
									if (b[4] == null)
										b[3] = null;
									else
										bestMatch = Math.max(bestMatch, 4);
									b4changed = true;
								}
								if ( b4changed ) {
									p[5].reset(state);
									p[5].bind(Term.merge(b, 5));
								}
								b[5] = p[5].nextBinding(state);
								if (b[5] == null)
									b[4] = null;
								else
									bestMatch = Math.max(bestMatch, 5);
								b5changed = true;
							}
							if ( b5changed ) {
								p[6].reset(state);
								p[6].bind(Term.merge(b, 6));
							}
							b[6] = p[6].nextBinding(state);
							if (b[6] == null)
								b[5] = null;
							else
								bestMatch = Math.max(bestMatch, 6);
							b6changed = true;
						}
						if ( b6changed ) {
							p[7].reset(state);
							p[7].bind(Term.merge(b, 7));
						}
						b[7] = p[7].nextBinding(state);
						if (b[7] == null)
							b[6] = null;
						else
							bestMatch = Math.max(bestMatch, 7);
						b7changed = true;
					}
					if ( b7changed ) {
						p[8].reset(state);
						p[8].bind(Term.merge(b, 8));
					}
					b[8] = p[8].nextBinding(state);
					if (b[8] == null)
						b[7] = null;
					else
						bestMatch = Math.max(bestMatch, 8);
					b8changed = true;
				}
				if ( b8changed ) {
					p[9].reset(state);
					p[9].bind(Term.merge(b, 9));
				}
				b[9] = p[9].nextBinding(state);
				if (b[9] == null)
					b[8] = null;
				else
					bestMatch = Math.max(bestMatch, 9);
			}

			Term[] retVal = Term.merge(b, 10);
			b[9] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #6 of Branch -1 for axiom getLearnersWithStrategy [line:668,6 to 679,47]";
		}
	}

	/**
	 * Precondition of branch #7 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:681, col:6) to (line:687, col:47)
	 */
	public static class Precondition62 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition62(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:681, col:7) to (line:681, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(90) /*learningByPractice*/, TermList.NIL))), unifier);
			// Source: (line:682, col:7) to (line:682, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:682, col:44) to (line:682, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:683, col:7) to (line:683, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:683, col:56) to (line:683, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:684, col:7) to (line:684, col:34)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:684, col:35) to (line:684, col:63)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(7), new TermList(owner.getTermConstant(75) /*associative*/, TermList.NIL))), unifier);
			// Source: (line:685, col:7) to (line:685, col:45)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermVariable(9), TermList.NIL))), unifier);
			// Source: (line:686, col:7) to (line:686, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:687, col:7) to (line:687, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #7 of Branch -1 for axiom getLearnersWithStrategy [line:681,6 to 687,47]";
		}
	}

	/**
	 * Precondition of branch #8 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:689, col:6) to (line:695, col:47)
	 */
	public static class Precondition63 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition63(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:689, col:7) to (line:689, col:49)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(96) /*learningByBeingTaughtTutee*/, TermList.NIL))), unifier);
			// Source: (line:690, col:7) to (line:690, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:690, col:44) to (line:690, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:691, col:7) to (line:691, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:691, col:56) to (line:691, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:692, col:7) to (line:692, col:37)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), TermList.NIL))), unifier);
			// Source: (line:693, col:7) to (line:693, col:38)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(69) /*nothing*/, TermList.NIL))), unifier);
			// Source: (line:693, col:39) to (line:693, col:69)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(74) /*accretion*/, TermList.NIL))), unifier);
			// Source: (line:694, col:7) to (line:694, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:695, col:7) to (line:695, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #8 of Branch -1 for axiom getLearnersWithStrategy [line:689,6 to 695,47]";
		}
	}

	/**
	 * Precondition of branch #9 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:697, col:6) to (line:703, col:47)
	 */
	public static class Precondition64 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition64(Domain owner, Term[] unifier)
		{
			p = new Precondition[11];
			// Source: (line:697, col:7) to (line:697, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(92) /*learningByTeaching*/, TermList.NIL))), unifier);
			// Source: (line:698, col:7) to (line:698, col:43)
			p[2] = new PreconditionAtomic(new Predicate(57, 11, new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(6), TermList.NIL)))), unifier);
			// Source: (line:698, col:44) to (line:698, col:76)
			p[3] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(7), TermList.NIL)))), unifier);
			// Source: (line:699, col:7) to (line:699, col:55)
			p[4] = new PreconditionAtomic(new Predicate(58, 11, new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(8), TermList.NIL)))), unifier);
			// Source: (line:699, col:56) to (line:699, col:96)
			p[5] = new PreconditionAtomic(new Predicate(95, 11, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(9), TermList.NIL)))), unifier);
			// Source: (line:700, col:7) to (line:700, col:37)
			p[6] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(6), new TermList(owner.getTermVariable(7), TermList.NIL))), unifier);
			// Source: (line:701, col:7) to (line:701, col:40)
			p[7] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(8), new TermList(owner.getTermConstant(74) /*accretion*/, TermList.NIL))), unifier);
			// Source: (line:701, col:41) to (line:701, col:68)
			p[8] = new PreconditionAtomic(new Predicate(0, 11, new TermList(owner.getTermVariable(9), new TermList(owner.getTermConstant(70) /*tuning*/, TermList.NIL))), unifier);
			// Source: (line:702, col:7) to (line:702, col:80)
			p[9] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:703, col:7) to (line:703, col:46)
			p[10] = new PreconditionAssign(new TermList(owner.getTermVariable(4), owner.getTermVariable(10)), unifier, 0);
			b = new Term[11][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding(state);
													if (b[1] == null)
														return null;
													else
														bestMatch = Math.max(bestMatch, 1);
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset(state);
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding(state);
												if (b[2] == null)
													b[1] = null;
												else
													bestMatch = Math.max(bestMatch, 2);
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset(state);
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding(state);
											if (b[3] == null)
												b[2] = null;
											else
												bestMatch = Math.max(bestMatch, 3);
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset(state);
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding(state);
										if (b[4] == null)
											b[3] = null;
										else
											bestMatch = Math.max(bestMatch, 4);
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset(state);
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding(state);
									if (b[5] == null)
										b[4] = null;
									else
										bestMatch = Math.max(bestMatch, 5);
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset(state);
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding(state);
								if (b[6] == null)
									b[5] = null;
								else
									bestMatch = Math.max(bestMatch, 6);
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset(state);
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding(state);
							if (b[7] == null)
								b[6] = null;
							else
								bestMatch = Math.max(bestMatch, 7);
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset(state);
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding(state);
						if (b[8] == null)
							b[7] = null;
						else
							bestMatch = Math.max(bestMatch, 8);
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset(state);
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding(state);
					if (b[9] == null)
						b[8] = null;
					else
						bestMatch = Math.max(bestMatch, 9);
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset(state);
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding(state);
				if (b[10] == null)
					b[9] = null;
				else
					bestMatch = Math.max(bestMatch, 10);
			}

			Term[] retVal = Term.merge(b, 11);
			b[10] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			p[5].reset(state);
			p[6].reset(state);
			p[7].reset(state);
			p[8].reset(state);
			p[9].reset(state);
			p[10].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
			b[5] = null;
			b[6] = null;
			b[7] = null;
			b[8] = null;
			b[9] = null;
			b[10] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #9 of Branch -1 for axiom getLearnersWithStrategy [line:697,6 to 703,47]";
		}
	}

	/**
	 * Precondition of branch #10 of Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:705, col:6) to (line:706, col:34)
	 */
	public static class Precondition65 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition65(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:705, col:7) to (line:705, col:80)
			p[1] = new PreconditionAtomic(new Predicate(94, 11, new TermList(owner.getTermVariable(10), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(5), TermList.NIL)))))), unifier);
			// Source: (line:706, col:7) to (line:706, col:33)
			p[2] = new PreconditionAssign(owner.getTermVariable(10), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #10 of Branch -1 for axiom getLearnersWithStrategy [line:705,6 to 706,34]";
		}
	}

	/**
	 * Branch -1 for axiom getLearnersWithStrategy
	 * Source: (line:615, col:4) to (line:706, col:615)
	 */
	public static class Axiom56 extends Axiom
{
	/**
	 * Branch -1 for axiom getLearnersWithStrategy
	 */
		public Axiom56(Domain owner)
		{
			super(owner, new Predicate(94, 11, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(new TermList(owner.getTermVariable(4), owner.getTermVariable(5)), TermList.NIL)))))), 11);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getLearnersWithStrategy [line:615,4 to 706,615]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition47(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition51(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition52(owner, unifier)).setComparator(null);
				break;
				case 3:
					p = (new Precondition53(owner, unifier)).setComparator(null);
				break;
				case 4:
					p = (new Precondition54(owner, unifier)).setComparator(null);
				break;
				case 5:
					p = (new Precondition55(owner, unifier)).setComparator(null);
				break;
				case 6:
					p = (new Precondition61(owner, unifier)).setComparator(null);
				break;
				case 7:
					p = (new Precondition62(owner, unifier)).setComparator(null);
				break;
				case 8:
					p = (new Precondition63(owner, unifier)).setComparator(null);
				break;
				case 9:
					p = (new Precondition64(owner, unifier)).setComparator(null);
				break;
				case 10:
					p = (new Precondition65(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom56Branch0(line:615,col:5)";
				case 1: return "Axiom56Branch1(line:615,col:5)";
				case 2: return "Axiom56Branch2(line:615,col:5)";
				case 3: return "Axiom56Branch3(line:615,col:5)";
				case 4: return "Axiom56Branch4(line:615,col:5)";
				case 5: return "Axiom56Branch5(line:615,col:5)";
				case 6: return "Axiom56Branch6(line:615,col:5)";
				case 7: return "Axiom56Branch7(line:615,col:5)";
				case 8: return "Axiom56Branch8(line:615,col:5)";
				case 9: return "Axiom56Branch9(line:615,col:5)";
				case 10: return "Axiom56Branch10(line:615,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom getGroupGoals
	 * Source: (line:708, col:4) to (line:714, col:708)
	 */
	public static class Axiom57 extends Axiom
{
	/**
	 * Branch -1 for axiom getGroupGoals
	 */
		public Axiom57(Domain owner)
		{
			super(owner, new Predicate(97, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))), owner.getTermVariable(5)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getGroupGoals [line:708,4 to 714,708]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(71) /*learningByBeingTaught*/, new TermList(owner.getTermConstant(76) /*learningByDiagnosing*/, TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(79) /*learningByApprenticeship*/, new TermList(owner.getTermConstant(82) /*learningByGuiding*/, TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(84) /*learningByReflection*/, new TermList(owner.getTermConstant(86) /*learningBySelfexpression*/, TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(90) /*learningByPractice*/, new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, TermList.NIL)))), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(96) /*learningByBeingTaughtTutee*/, new TermList(owner.getTermConstant(92) /*learningByTeaching*/, TermList.NIL)))), TermList.NIL)))))), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom57Branch0(line:708,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom length
	 * Source: (line:717, col:4) to (line:717, col:717)
	 */
	public static class Axiom58 extends Axiom
{
	/**
	 * Branch -1 for axiom length
	 */
		public Axiom58(Domain owner)
		{
			super(owner, new Predicate(98, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom length [line:717,4 to 717,717]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), TermList.NIL), ((coursegeneration)owner).calculateGetLength, "((coursegeneration)owner).calculateGetLength"), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom58Branch0(line:717,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getNameOf
	 * Source: (line:721, col:6) to (line:723, col:39)
	 */
	public static class Precondition66 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition66(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:721, col:7) to (line:721, col:36)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(99) /*nothing-nothing*/, TermList.NIL))), unifier);
			// Source: (line:722, col:7) to (line:722, col:34)
			p[2] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 0);
			// Source: (line:723, col:7) to (line:723, col:38)
			p[3] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getNameOf [line:721,6 to 723,39]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getNameOf
	 * Source: (line:724, col:6) to (line:726, col:41)
	 */
	public static class Precondition67 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition67(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:724, col:7) to (line:724, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(100) /*nothing-accretion*/, TermList.NIL))), unifier);
			// Source: (line:725, col:7) to (line:725, col:34)
			p[2] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 0);
			// Source: (line:726, col:7) to (line:726, col:40)
			p[3] = new PreconditionAssign(owner.getTermConstant(74) /*accretion*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getNameOf [line:724,6 to 726,41]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom getNameOf
	 * Source: (line:727, col:6) to (line:729, col:38)
	 */
	public static class Precondition68 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition68(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:727, col:7) to (line:727, col:35)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(101) /*nothing-tuning*/, TermList.NIL))), unifier);
			// Source: (line:728, col:7) to (line:728, col:34)
			p[2] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 0);
			// Source: (line:729, col:7) to (line:729, col:37)
			p[3] = new PreconditionAssign(owner.getTermConstant(70) /*tuning*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom getNameOf [line:727,6 to 729,38]";
		}
	}

	/**
	 * Precondition of branch #3 of Branch -1 for axiom getNameOf
	 * Source: (line:730, col:6) to (line:732, col:45)
	 */
	public static class Precondition69 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition69(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:730, col:7) to (line:730, col:42)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(102) /*nothing-restructuring*/, TermList.NIL))), unifier);
			// Source: (line:731, col:7) to (line:731, col:34)
			p[2] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 0);
			// Source: (line:732, col:7) to (line:732, col:44)
			p[3] = new PreconditionAssign(owner.getTermConstant(78) /*restructuring*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #3 of Branch -1 for axiom getNameOf [line:730,6 to 732,45]";
		}
	}

	/**
	 * Precondition of branch #4 of Branch -1 for axiom getNameOf
	 * Source: (line:734, col:6) to (line:736, col:39)
	 */
	public static class Precondition70 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition70(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:734, col:7) to (line:734, col:34)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(103) /*rough-nothing*/, TermList.NIL))), unifier);
			// Source: (line:735, col:7) to (line:735, col:32)
			p[2] = new PreconditionAssign(owner.getTermConstant(104) /*rough*/, unifier, 0);
			// Source: (line:736, col:7) to (line:736, col:38)
			p[3] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #4 of Branch -1 for axiom getNameOf [line:734,6 to 736,39]";
		}
	}

	/**
	 * Precondition of branch #5 of Branch -1 for axiom getNameOf
	 * Source: (line:737, col:6) to (line:739, col:41)
	 */
	public static class Precondition71 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition71(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:737, col:7) to (line:737, col:36)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(105) /*rough-accretion*/, TermList.NIL))), unifier);
			// Source: (line:738, col:7) to (line:738, col:32)
			p[2] = new PreconditionAssign(owner.getTermConstant(104) /*rough*/, unifier, 0);
			// Source: (line:739, col:7) to (line:739, col:40)
			p[3] = new PreconditionAssign(owner.getTermConstant(74) /*accretion*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #5 of Branch -1 for axiom getNameOf [line:737,6 to 739,41]";
		}
	}

	/**
	 * Precondition of branch #6 of Branch -1 for axiom getNameOf
	 * Source: (line:740, col:6) to (line:742, col:38)
	 */
	public static class Precondition72 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition72(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:740, col:7) to (line:740, col:33)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(106) /*rough-tuning*/, TermList.NIL))), unifier);
			// Source: (line:741, col:7) to (line:741, col:32)
			p[2] = new PreconditionAssign(owner.getTermConstant(104) /*rough*/, unifier, 0);
			// Source: (line:742, col:7) to (line:742, col:37)
			p[3] = new PreconditionAssign(owner.getTermConstant(70) /*tuning*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #6 of Branch -1 for axiom getNameOf [line:740,6 to 742,38]";
		}
	}

	/**
	 * Precondition of branch #7 of Branch -1 for axiom getNameOf
	 * Source: (line:743, col:6) to (line:745, col:45)
	 */
	public static class Precondition73 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition73(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:743, col:7) to (line:743, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(107) /*rough-restructuring*/, TermList.NIL))), unifier);
			// Source: (line:744, col:7) to (line:744, col:32)
			p[2] = new PreconditionAssign(owner.getTermConstant(104) /*rough*/, unifier, 0);
			// Source: (line:745, col:7) to (line:745, col:44)
			p[3] = new PreconditionAssign(owner.getTermConstant(78) /*restructuring*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #7 of Branch -1 for axiom getNameOf [line:743,6 to 745,45]";
		}
	}

	/**
	 * Precondition of branch #8 of Branch -1 for axiom getNameOf
	 * Source: (line:747, col:6) to (line:749, col:39)
	 */
	public static class Precondition74 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition74(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:747, col:7) to (line:747, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(108) /*explanatory-nothing*/, TermList.NIL))), unifier);
			// Source: (line:748, col:7) to (line:748, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(73) /*explanatory*/, unifier, 0);
			// Source: (line:749, col:7) to (line:749, col:38)
			p[3] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #8 of Branch -1 for axiom getNameOf [line:747,6 to 749,39]";
		}
	}

	/**
	 * Precondition of branch #9 of Branch -1 for axiom getNameOf
	 * Source: (line:750, col:6) to (line:752, col:41)
	 */
	public static class Precondition75 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition75(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:750, col:7) to (line:750, col:42)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(109) /*explanatory-accretion*/, TermList.NIL))), unifier);
			// Source: (line:751, col:7) to (line:751, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(73) /*explanatory*/, unifier, 0);
			// Source: (line:752, col:7) to (line:752, col:40)
			p[3] = new PreconditionAssign(owner.getTermConstant(74) /*accretion*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #9 of Branch -1 for axiom getNameOf [line:750,6 to 752,41]";
		}
	}

	/**
	 * Precondition of branch #10 of Branch -1 for axiom getNameOf
	 * Source: (line:753, col:6) to (line:755, col:38)
	 */
	public static class Precondition76 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition76(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:753, col:7) to (line:753, col:39)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(110) /*explanatory-tuning*/, TermList.NIL))), unifier);
			// Source: (line:754, col:7) to (line:754, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(73) /*explanatory*/, unifier, 0);
			// Source: (line:755, col:7) to (line:755, col:37)
			p[3] = new PreconditionAssign(owner.getTermConstant(70) /*tuning*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #10 of Branch -1 for axiom getNameOf [line:753,6 to 755,38]";
		}
	}

	/**
	 * Precondition of branch #11 of Branch -1 for axiom getNameOf
	 * Source: (line:756, col:6) to (line:758, col:45)
	 */
	public static class Precondition77 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition77(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:756, col:7) to (line:756, col:46)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(111) /*explanatory-restructuring*/, TermList.NIL))), unifier);
			// Source: (line:757, col:7) to (line:757, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(73) /*explanatory*/, unifier, 0);
			// Source: (line:758, col:7) to (line:758, col:44)
			p[3] = new PreconditionAssign(owner.getTermConstant(78) /*restructuring*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #11 of Branch -1 for axiom getNameOf [line:756,6 to 758,45]";
		}
	}

	/**
	 * Precondition of branch #12 of Branch -1 for axiom getNameOf
	 * Source: (line:760, col:6) to (line:762, col:39)
	 */
	public static class Precondition78 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition78(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:760, col:7) to (line:760, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(112) /*associative-nothing*/, TermList.NIL))), unifier);
			// Source: (line:761, col:7) to (line:761, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(75) /*associative*/, unifier, 0);
			// Source: (line:762, col:7) to (line:762, col:38)
			p[3] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #12 of Branch -1 for axiom getNameOf [line:760,6 to 762,39]";
		}
	}

	/**
	 * Precondition of branch #13 of Branch -1 for axiom getNameOf
	 * Source: (line:763, col:6) to (line:765, col:41)
	 */
	public static class Precondition79 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition79(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:763, col:7) to (line:763, col:42)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(113) /*associative-accretion*/, TermList.NIL))), unifier);
			// Source: (line:764, col:7) to (line:764, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(75) /*associative*/, unifier, 0);
			// Source: (line:765, col:7) to (line:765, col:40)
			p[3] = new PreconditionAssign(owner.getTermConstant(74) /*accretion*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #13 of Branch -1 for axiom getNameOf [line:763,6 to 765,41]";
		}
	}

	/**
	 * Precondition of branch #14 of Branch -1 for axiom getNameOf
	 * Source: (line:766, col:6) to (line:768, col:38)
	 */
	public static class Precondition80 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition80(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:766, col:7) to (line:766, col:39)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(114) /*associative-tuning*/, TermList.NIL))), unifier);
			// Source: (line:767, col:7) to (line:767, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(75) /*associative*/, unifier, 0);
			// Source: (line:768, col:7) to (line:768, col:37)
			p[3] = new PreconditionAssign(owner.getTermConstant(70) /*tuning*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #14 of Branch -1 for axiom getNameOf [line:766,6 to 768,38]";
		}
	}

	/**
	 * Precondition of branch #15 of Branch -1 for axiom getNameOf
	 * Source: (line:769, col:6) to (line:771, col:45)
	 */
	public static class Precondition81 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition81(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:769, col:7) to (line:769, col:46)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(115) /*associative-restructuring*/, TermList.NIL))), unifier);
			// Source: (line:770, col:7) to (line:770, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(75) /*associative*/, unifier, 0);
			// Source: (line:771, col:7) to (line:771, col:44)
			p[3] = new PreconditionAssign(owner.getTermConstant(78) /*restructuring*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #15 of Branch -1 for axiom getNameOf [line:769,6 to 771,45]";
		}
	}

	/**
	 * Precondition of branch #16 of Branch -1 for axiom getNameOf
	 * Source: (line:773, col:6) to (line:775, col:39)
	 */
	public static class Precondition82 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition82(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:773, col:7) to (line:773, col:39)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(116) /*autonomous-nothing*/, TermList.NIL))), unifier);
			// Source: (line:774, col:7) to (line:774, col:37)
			p[2] = new PreconditionAssign(owner.getTermConstant(81) /*autonomous*/, unifier, 0);
			// Source: (line:775, col:7) to (line:775, col:38)
			p[3] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #16 of Branch -1 for axiom getNameOf [line:773,6 to 775,39]";
		}
	}

	/**
	 * Precondition of branch #17 of Branch -1 for axiom getNameOf
	 * Source: (line:776, col:6) to (line:778, col:41)
	 */
	public static class Precondition83 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition83(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:776, col:7) to (line:776, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(117) /*autonomous-accretion*/, TermList.NIL))), unifier);
			// Source: (line:777, col:7) to (line:777, col:37)
			p[2] = new PreconditionAssign(owner.getTermConstant(81) /*autonomous*/, unifier, 0);
			// Source: (line:778, col:7) to (line:778, col:40)
			p[3] = new PreconditionAssign(owner.getTermConstant(74) /*accretion*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #17 of Branch -1 for axiom getNameOf [line:776,6 to 778,41]";
		}
	}

	/**
	 * Precondition of branch #18 of Branch -1 for axiom getNameOf
	 * Source: (line:779, col:6) to (line:781, col:38)
	 */
	public static class Precondition84 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition84(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:779, col:7) to (line:779, col:38)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(118) /*autonomous-tuning*/, TermList.NIL))), unifier);
			// Source: (line:780, col:7) to (line:780, col:37)
			p[2] = new PreconditionAssign(owner.getTermConstant(81) /*autonomous*/, unifier, 0);
			// Source: (line:781, col:7) to (line:781, col:37)
			p[3] = new PreconditionAssign(owner.getTermConstant(70) /*tuning*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #18 of Branch -1 for axiom getNameOf [line:779,6 to 781,38]";
		}
	}

	/**
	 * Precondition of branch #19 of Branch -1 for axiom getNameOf
	 * Source: (line:782, col:6) to (line:784, col:45)
	 */
	public static class Precondition85 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition85(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:782, col:7) to (line:782, col:45)
			p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(owner.getTermVariable(2), new TermList(owner.getTermConstant(119) /*autonomous-restructuring*/, TermList.NIL))), unifier);
			// Source: (line:783, col:7) to (line:783, col:37)
			p[2] = new PreconditionAssign(owner.getTermConstant(81) /*autonomous*/, unifier, 0);
			// Source: (line:784, col:7) to (line:784, col:44)
			p[3] = new PreconditionAssign(owner.getTermConstant(78) /*restructuring*/, unifier, 1);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #19 of Branch -1 for axiom getNameOf [line:782,6 to 784,45]";
		}
	}

	/**
	 * Precondition of branch #20 of Branch -1 for axiom getNameOf
	 * Source: (line:786, col:6) to (line:787, col:39)
	 */
	public static class Precondition86 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition86(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:786, col:7) to (line:786, col:34)
			p[1] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 0);
			// Source: (line:787, col:7) to (line:787, col:38)
			p[2] = new PreconditionAssign(owner.getTermConstant(69) /*nothing*/, unifier, 1);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #20 of Branch -1 for axiom getNameOf [line:786,6 to 787,39]";
		}
	}

	/**
	 * Branch -1 for axiom getNameOf
	 * Source: (line:720, col:4) to (line:787, col:720)
	 */
	public static class Axiom59 extends Axiom
{
	/**
	 * Branch -1 for axiom getNameOf
	 */
		public Axiom59(Domain owner)
		{
			super(owner, new Predicate(62, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), 21);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getNameOf [line:720,4 to 787,720]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition66(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition67(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition68(owner, unifier)).setComparator(null);
				break;
				case 3:
					p = (new Precondition69(owner, unifier)).setComparator(null);
				break;
				case 4:
					p = (new Precondition70(owner, unifier)).setComparator(null);
				break;
				case 5:
					p = (new Precondition71(owner, unifier)).setComparator(null);
				break;
				case 6:
					p = (new Precondition72(owner, unifier)).setComparator(null);
				break;
				case 7:
					p = (new Precondition73(owner, unifier)).setComparator(null);
				break;
				case 8:
					p = (new Precondition74(owner, unifier)).setComparator(null);
				break;
				case 9:
					p = (new Precondition75(owner, unifier)).setComparator(null);
				break;
				case 10:
					p = (new Precondition76(owner, unifier)).setComparator(null);
				break;
				case 11:
					p = (new Precondition77(owner, unifier)).setComparator(null);
				break;
				case 12:
					p = (new Precondition78(owner, unifier)).setComparator(null);
				break;
				case 13:
					p = (new Precondition79(owner, unifier)).setComparator(null);
				break;
				case 14:
					p = (new Precondition80(owner, unifier)).setComparator(null);
				break;
				case 15:
					p = (new Precondition81(owner, unifier)).setComparator(null);
				break;
				case 16:
					p = (new Precondition82(owner, unifier)).setComparator(null);
				break;
				case 17:
					p = (new Precondition83(owner, unifier)).setComparator(null);
				break;
				case 18:
					p = (new Precondition84(owner, unifier)).setComparator(null);
				break;
				case 19:
					p = (new Precondition85(owner, unifier)).setComparator(null);
				break;
				case 20:
					p = (new Precondition86(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom59Branch0(line:720,col:5)";
				case 1: return "Axiom59Branch1(line:720,col:5)";
				case 2: return "Axiom59Branch2(line:720,col:5)";
				case 3: return "Axiom59Branch3(line:720,col:5)";
				case 4: return "Axiom59Branch4(line:720,col:5)";
				case 5: return "Axiom59Branch5(line:720,col:5)";
				case 6: return "Axiom59Branch6(line:720,col:5)";
				case 7: return "Axiom59Branch7(line:720,col:5)";
				case 8: return "Axiom59Branch8(line:720,col:5)";
				case 9: return "Axiom59Branch9(line:720,col:5)";
				case 10: return "Axiom59Branch10(line:720,col:5)";
				case 11: return "Axiom59Branch11(line:720,col:5)";
				case 12: return "Axiom59Branch12(line:720,col:5)";
				case 13: return "Axiom59Branch13(line:720,col:5)";
				case 14: return "Axiom59Branch14(line:720,col:5)";
				case 15: return "Axiom59Branch15(line:720,col:5)";
				case 16: return "Axiom59Branch16(line:720,col:5)";
				case 17: return "Axiom59Branch17(line:720,col:5)";
				case 18: return "Axiom59Branch18(line:720,col:5)";
				case 19: return "Axiom59Branch19(line:720,col:5)";
				case 20: return "Axiom59Branch20(line:720,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getRole
	 * Source: (line:791, col:6) to (line:792, col:34)
	 */
	public static class Precondition87 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition87(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:791, col:7) to (line:791, col:44)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(71) /*learningByBeingTaught*/, TermList.NIL))), unifier);
			// Source: (line:792, col:7) to (line:792, col:33)
			p[2] = new PreconditionAssign(owner.getTermConstant(72) /*anchorHolder*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getRole [line:791,6 to 792,34]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getRole
	 * Source: (line:793, col:6) to (line:794, col:40)
	 */
	public static class Precondition88 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition88(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:793, col:7) to (line:793, col:43)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(76) /*learningByDiagnosing*/, TermList.NIL))), unifier);
			// Source: (line:794, col:7) to (line:794, col:39)
			p[2] = new PreconditionAssign(owner.getTermConstant(77) /*anchoredInstructor*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getRole [line:793,6 to 794,40]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom getRole
	 * Source: (line:795, col:6) to (line:796, col:36)
	 */
	public static class Precondition89 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition89(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:795, col:7) to (line:795, col:47)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(79) /*learningByApprenticeship*/, TermList.NIL))), unifier);
			// Source: (line:796, col:7) to (line:796, col:35)
			p[2] = new PreconditionAssign(owner.getTermConstant(80) /*apprenticeship*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom getRole [line:795,6 to 796,36]";
		}
	}

	/**
	 * Precondition of branch #3 of Branch -1 for axiom getRole
	 * Source: (line:797, col:6) to (line:798, col:28)
	 */
	public static class Precondition90 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition90(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:797, col:7) to (line:797, col:40)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(82) /*learningByGuiding*/, TermList.NIL))), unifier);
			// Source: (line:798, col:7) to (line:798, col:27)
			p[2] = new PreconditionAssign(owner.getTermConstant(83) /*master*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #3 of Branch -1 for axiom getRole [line:797,6 to 798,28]";
		}
	}

	/**
	 * Precondition of branch #4 of Branch -1 for axiom getRole
	 * Source: (line:799, col:6) to (line:800, col:30)
	 */
	public static class Precondition91 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition91(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:799, col:7) to (line:799, col:43)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(84) /*learningByReflection*/, TermList.NIL))), unifier);
			// Source: (line:800, col:7) to (line:800, col:29)
			p[2] = new PreconditionAssign(owner.getTermConstant(85) /*audience*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #4 of Branch -1 for axiom getRole [line:799,6 to 800,30]";
		}
	}

	/**
	 * Precondition of branch #5 of Branch -1 for axiom getRole
	 * Source: (line:801, col:6) to (line:802, col:30)
	 */
	public static class Precondition92 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition92(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:801, col:7) to (line:801, col:47)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(86) /*learningBySelfexpression*/, TermList.NIL))), unifier);
			// Source: (line:802, col:7) to (line:802, col:29)
			p[2] = new PreconditionAssign(owner.getTermConstant(87) /*panelist*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #5 of Branch -1 for axiom getRole [line:801,6 to 802,30]";
		}
	}

	/**
	 * Precondition of branch #6 of Branch -1 for axiom getRole
	 * Source: (line:803, col:6) to (line:804, col:37)
	 */
	public static class Precondition93 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition93(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:803, col:7) to (line:803, col:43)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, TermList.NIL))), unifier);
			// Source: (line:804, col:7) to (line:804, col:36)
			p[2] = new PreconditionAssign(owner.getTermConstant(89) /*fullParticipant*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #6 of Branch -1 for axiom getRole [line:803,6 to 804,37]";
		}
	}

	/**
	 * Precondition of branch #7 of Branch -1 for axiom getRole
	 * Source: (line:805, col:6) to (line:806, col:43)
	 */
	public static class Precondition94 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition94(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:805, col:7) to (line:805, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(90) /*learningByPractice*/, TermList.NIL))), unifier);
			// Source: (line:806, col:7) to (line:806, col:42)
			p[2] = new PreconditionAssign(owner.getTermConstant(121) /*peripheralParticipant*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #7 of Branch -1 for axiom getRole [line:805,6 to 806,43]";
		}
	}

	/**
	 * Precondition of branch #8 of Branch -1 for axiom getRole
	 * Source: (line:807, col:6) to (line:808, col:31)
	 */
	public static class Precondition95 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition95(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:807, col:7) to (line:807, col:49)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(96) /*learningByBeingTaughtTutee*/, TermList.NIL))), unifier);
			// Source: (line:808, col:7) to (line:808, col:30)
			p[2] = new PreconditionAssign(owner.getTermConstant(91) /*peerTutee*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #8 of Branch -1 for axiom getRole [line:807,6 to 808,31]";
		}
	}

	/**
	 * Precondition of branch #9 of Branch -1 for axiom getRole
	 * Source: (line:809, col:6) to (line:810, col:31)
	 */
	public static class Precondition96 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition96(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:809, col:7) to (line:809, col:41)
			p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(92) /*learningByTeaching*/, TermList.NIL))), unifier);
			// Source: (line:810, col:7) to (line:810, col:30)
			p[2] = new PreconditionAssign(owner.getTermConstant(93) /*peerTutor*/, unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #9 of Branch -1 for axiom getRole [line:809,6 to 810,31]";
		}
	}

	/**
	 * Branch -1 for axiom getRole
	 * Source: (line:790, col:4) to (line:810, col:790)
	 */
	public static class Axiom60 extends Axiom
{
	/**
	 * Branch -1 for axiom getRole
	 */
		public Axiom60(Domain owner)
		{
			super(owner, new Predicate(120, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 10);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getRole [line:790,4 to 810,790]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition87(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition88(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition89(owner, unifier)).setComparator(null);
				break;
				case 3:
					p = (new Precondition90(owner, unifier)).setComparator(null);
				break;
				case 4:
					p = (new Precondition91(owner, unifier)).setComparator(null);
				break;
				case 5:
					p = (new Precondition92(owner, unifier)).setComparator(null);
				break;
				case 6:
					p = (new Precondition93(owner, unifier)).setComparator(null);
				break;
				case 7:
					p = (new Precondition94(owner, unifier)).setComparator(null);
				break;
				case 8:
					p = (new Precondition95(owner, unifier)).setComparator(null);
				break;
				case 9:
					p = (new Precondition96(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom60Branch0(line:790,col:5)";
				case 1: return "Axiom60Branch1(line:790,col:5)";
				case 2: return "Axiom60Branch2(line:790,col:5)";
				case 3: return "Axiom60Branch3(line:790,col:5)";
				case 4: return "Axiom60Branch4(line:790,col:5)";
				case 5: return "Axiom60Branch5(line:790,col:5)";
				case 6: return "Axiom60Branch6(line:790,col:5)";
				case 7: return "Axiom60Branch7(line:790,col:5)";
				case 8: return "Axiom60Branch8(line:790,col:5)";
				case 9: return "Axiom60Branch9(line:790,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom divideGroupInSubGroups
	 * Source: (line:814, col:6) to (line:816, col:49)
	 */
	public static class Precondition97 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition97(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:814, col:7) to (line:814, col:44)
			p[1] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(2), new TermList(owner.getTermVariable(4), TermList.NIL)), ((coursegeneration)owner).calculateDiv, "((coursegeneration)owner).calculateDiv"), unifier, 5);
			// Source: (line:815, col:7) to (line:815, col:29)
			p[2] = new PreconditionCall(new TermCall(new List(owner.getTermVariable(5), new TermList(owner.getTermVariable(3), TermList.NIL)), StdLib.lessEq, "StdLib.lessEq"), unifier);
			// Source: (line:816, col:7) to (line:816, col:48)
			p[3] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL))), ((coursegeneration)owner).calculateSplit, "((coursegeneration)owner).calculateSplit"), unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom divideGroupInSubGroups [line:814,6 to 816,49]";
		}
	}

	/**
	 * Branch -1 for axiom divideGroupInSubGroups
	 * Source: (line:813, col:4) to (line:818, col:813)
	 */
	public static class Axiom61 extends Axiom
{
	/**
	 * Branch -1 for axiom divideGroupInSubGroups
	 */
		public Axiom61(Domain owner)
		{
			super(owner, new Predicate(122, 6, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom divideGroupInSubGroups [line:813,4 to 818,813]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition97(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL))), ((coursegeneration)owner).calculateSplit, "((coursegeneration)owner).calculateSplit"), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom61Branch0(line:813,col:5)";
				case 1: return "Axiom61Branch1(line:813,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom calculeMinNumGroups
	 * Source: (line:821, col:4) to (line:821, col:821)
	 */
	public static class Axiom62 extends Axiom
{
	/**
	 * Branch -1 for axiom calculeMinNumGroups
	 */
		public Axiom62(Domain owner)
		{
			super(owner, new Predicate(123, 1, new TermList(owner.getTermVariable(0), new TermList(TermList.NIL, TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom calculeMinNumGroups [line:821,4 to 821,821]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAssign(new TermNumber(10.0), unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom62Branch0(line:821,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom calculeMinNumGroups
	 * Source: (line:823, col:6) to (line:826, col:27)
	 */
	public static class Precondition98 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition98(Domain owner, Term[] unifier)
		{
			p = new Precondition[5];
			// Source: (line:823, col:7) to (line:823, col:47)
			p[1] = new PreconditionAtomic(new Predicate(123, 6, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(3), TermList.NIL))), unifier);
			// Source: (line:824, col:7) to (line:824, col:51)
			p[2] = new PreconditionAssign(new TermCall(new List(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)), ((coursegeneration)owner).calculateDiv, "((coursegeneration)owner).calculateDiv"), unifier, 5);
			// Source: (line:825, col:7) to (line:825, col:29)
			p[3] = new PreconditionCall(new TermCall(new List(owner.getTermVariable(5), new TermList(owner.getTermVariable(4), TermList.NIL)), StdLib.less, "StdLib.less"), unifier);
			// Source: (line:826, col:7) to (line:826, col:26)
			p[4] = new PreconditionAssign(owner.getTermVariable(5), unifier, 0);
			b = new Term[5][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding(state);
							if (b[1] == null)
								return null;
							else
								bestMatch = Math.max(bestMatch, 1);
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset(state);
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding(state);
						if (b[2] == null)
							b[1] = null;
						else
							bestMatch = Math.max(bestMatch, 2);
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset(state);
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding(state);
					if (b[3] == null)
						b[2] = null;
					else
						bestMatch = Math.max(bestMatch, 3);
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset(state);
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding(state);
				if (b[4] == null)
					b[3] = null;
				else
					bestMatch = Math.max(bestMatch, 4);
			}

			Term[] retVal = Term.merge(b, 5);
			b[4] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			p[4].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
			b[4] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom calculeMinNumGroups [line:823,6 to 826,27]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom calculeMinNumGroups
	 * Source: (line:828, col:6) to (line:829, col:28)
	 */
	public static class Precondition99 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition99(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:828, col:7) to (line:828, col:47)
			p[1] = new PreconditionAtomic(new Predicate(123, 6, new TermList(owner.getTermVariable(4), new TermList(owner.getTermVariable(3), TermList.NIL))), unifier);
			// Source: (line:829, col:7) to (line:829, col:27)
			p[2] = new PreconditionAssign(owner.getTermVariable(4), unifier, 0);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom calculeMinNumGroups [line:828,6 to 829,28]";
		}
	}

	/**
	 * Branch -1 for axiom calculeMinNumGroups
	 * Source: (line:822, col:4) to (line:829, col:822)
	 */
	public static class Axiom63 extends Axiom
{
	/**
	 * Branch -1 for axiom calculeMinNumGroups
	 */
		public Axiom63(Domain owner)
		{
			super(owner, new Predicate(123, 6, new TermList(owner.getTermVariable(0), new TermList(new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)), owner.getTermVariable(3)), TermList.NIL))), 2);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom calculeMinNumGroups [line:822,4 to 829,822]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition98(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition99(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom63Branch0(line:822,col:5)";
				case 1: return "Axiom63Branch1(line:822,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getTheory
	 * Source: (line:832, col:6) to (line:834, col:43)
	 */
	public static class Precondition100 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition100(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:832, col:7) to (line:832, col:45)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(71) /*learningByBeingTaught*/, TermList.NIL))), unifier);
			// Source: (line:833, col:7) to (line:833, col:44)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(76) /*learningByDiagnosing*/, TermList.NIL))), unifier);
			// Source: (line:834, col:7) to (line:834, col:42)
			p[3] = new PreconditionAssign(owner.getTermConstant(125) /*anchoredInstruction*/, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getTheory [line:832,6 to 834,43]";
		}
	}

	/**
	 * Precondition of branch #1 of Branch -1 for axiom getTheory
	 * Source: (line:836, col:6) to (line:838, col:47)
	 */
	public static class Precondition101 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition101(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:836, col:7) to (line:836, col:48)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(79) /*learningByApprenticeship*/, TermList.NIL))), unifier);
			// Source: (line:837, col:7) to (line:837, col:41)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(82) /*learningByGuiding*/, TermList.NIL))), unifier);
			// Source: (line:838, col:7) to (line:838, col:46)
			p[3] = new PreconditionAssign(owner.getTermConstant(126) /*cognitiveApprenticeship*/, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #1 of Branch -1 for axiom getTheory [line:836,6 to 838,47]";
		}
	}

	/**
	 * Precondition of branch #2 of Branch -1 for axiom getTheory
	 * Source: (line:840, col:6) to (line:842, col:44)
	 */
	public static class Precondition102 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition102(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:840, col:7) to (line:840, col:44)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(84) /*learningByReflection*/, TermList.NIL))), unifier);
			// Source: (line:841, col:7) to (line:841, col:48)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(86) /*learningBySelfexpression*/, TermList.NIL))), unifier);
			// Source: (line:842, col:7) to (line:842, col:43)
			p[3] = new PreconditionAssign(owner.getTermConstant(127) /*cognitiveFlexibility*/, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #2 of Branch -1 for axiom getTheory [line:840,6 to 842,44]";
		}
	}

	/**
	 * Precondition of branch #3 of Branch -1 for axiom getTheory
	 * Source: (line:844, col:6) to (line:846, col:44)
	 */
	public static class Precondition103 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition103(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:844, col:7) to (line:844, col:44)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, TermList.NIL))), unifier);
			// Source: (line:845, col:7) to (line:845, col:44)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, TermList.NIL))), unifier);
			// Source: (line:846, col:7) to (line:846, col:43)
			p[3] = new PreconditionAssign(owner.getTermConstant(128) /*distributedCognition*/, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #3 of Branch -1 for axiom getTheory [line:844,6 to 846,44]";
		}
	}

	/**
	 * Precondition of branch #4 of Branch -1 for axiom getTheory
	 * Source: (line:848, col:6) to (line:850, col:27)
	 */
	public static class Precondition104 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition104(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:848, col:7) to (line:848, col:42)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(90) /*learningByPractice*/, TermList.NIL))), unifier);
			// Source: (line:849, col:7) to (line:849, col:44)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(4), new TermList(owner.getTermConstant(88) /*learningByDiscussion*/, TermList.NIL))), unifier);
			// Source: (line:850, col:7) to (line:850, col:26)
			p[3] = new PreconditionAssign(owner.getTermConstant(129) /*lpp*/, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #4 of Branch -1 for axiom getTheory [line:848,6 to 850,27]";
		}
	}

	/**
	 * Precondition of branch #5 of Branch -1 for axiom getTheory
	 * Source: (line:852, col:6) to (line:854, col:36)
	 */
	public static class Precondition105 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition105(Domain owner, Term[] unifier)
		{
			p = new Precondition[4];
			// Source: (line:852, col:7) to (line:852, col:50)
			p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(96) /*learningByBeingTaughtTutee*/, TermList.NIL))), unifier);
			// Source: (line:853, col:7) to (line:853, col:42)
			p[2] = new PreconditionAtomic(new Predicate(0, 5, new TermList(owner.getTermVariable(3), new TermList(owner.getTermConstant(92) /*learningByTeaching*/, TermList.NIL))), unifier);
			// Source: (line:854, col:7) to (line:854, col:35)
			p[3] = new PreconditionAssign(owner.getTermConstant(130) /*peerTutoring*/, unifier, 0);
			b = new Term[4][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding(state);
						if (b[1] == null)
							return null;
						else
							bestMatch = Math.max(bestMatch, 1);
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset(state);
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding(state);
					if (b[2] == null)
						b[1] = null;
					else
						bestMatch = Math.max(bestMatch, 2);
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset(state);
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding(state);
				if (b[3] == null)
					b[2] = null;
				else
					bestMatch = Math.max(bestMatch, 3);
			}

			Term[] retVal = Term.merge(b, 4);
			b[3] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			p[3].reset(state);
			b[1] = null;
			b[2] = null;
			b[3] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #5 of Branch -1 for axiom getTheory [line:852,6 to 854,36]";
		}
	}

	/**
	 * Branch -1 for axiom getTheory
	 * Source: (line:831, col:4) to (line:856, col:831)
	 */
	public static class Axiom64 extends Axiom
{
	/**
	 * Branch -1 for axiom getTheory
	 */
		public Axiom64(Domain owner)
		{
			super(owner, new Predicate(124, 5, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), new TermList(owner.getTermVariable(3), new TermList(owner.getTermVariable(4), TermList.NIL)))), TermList.NIL))), 7);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getTheory [line:831,4 to 856,831]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition100(owner, unifier)).setComparator(null);
				break;
				case 1:
					p = (new Precondition101(owner, unifier)).setComparator(null);
				break;
				case 2:
					p = (new Precondition102(owner, unifier)).setComparator(null);
				break;
				case 3:
					p = (new Precondition103(owner, unifier)).setComparator(null);
				break;
				case 4:
					p = (new Precondition104(owner, unifier)).setComparator(null);
				break;
				case 5:
					p = (new Precondition105(owner, unifier)).setComparator(null);
				break;
				case 6:
					p = (new PreconditionAssign(owner.getTermConstant(131) /*extremeTheory*/, unifier, 0)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom64Branch0(line:831,col:5)";
				case 1: return "Axiom64Branch1(line:831,col:5)";
				case 2: return "Axiom64Branch2(line:831,col:5)";
				case 3: return "Axiom64Branch3(line:831,col:5)";
				case 4: return "Axiom64Branch4(line:831,col:5)";
				case 5: return "Axiom64Branch5(line:831,col:5)";
				case 6: return "Axiom64Branch6(line:831,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Precondition of branch #0 of Branch -1 for axiom getResources
	 * Source: (line:1065, col:6) to (line:1066, col:49)
	 */
	public static class Precondition115 extends Precondition
	{
		Precondition[] p;
		Term[][] b;

		public Precondition115(Domain owner, Term[] unifier)
		{
			p = new Precondition[3];
			// Source: (line:1065, col:7) to (line:1065, col:28)
			p[1] = new PreconditionAtomic(new Predicate(150, 3, new TermList(owner.getTermVariable(2), TermList.NIL)), unifier);
			// Source: (line:1066, col:7) to (line:1066, col:48)
			p[2] = new PreconditionAtomic(new Predicate(40, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), unifier);
			b = new Term[3][];
			b[0] = unifier;
			b[0] = Term.merge( b, 1 );

			setFirst(false);
		}

		public void bind(Term[] binding)
		{
			b[0] = binding;
			b[0] = Term.merge( b, 1 );
			p[1].bind(binding);
			b[1] = null;
			b[2] = null;
		}

		protected Term[] nextBindingHelper(State state)
		{
			bestMatch = 0;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding(state);
					if (b[1] == null)
						return null;
					else
						bestMatch = Math.max(bestMatch, 1);
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset(state);
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding(state);
				if (b[2] == null)
					b[1] = null;
				else
					bestMatch = Math.max(bestMatch, 2);
			}

			Term[] retVal = Term.merge(b, 3);
			b[2] = null;
			return retVal;
		}

		protected void resetHelper(State state)
		{
			p[1].reset(state);
			p[2].reset(state);
			b[1] = null;
			b[2] = null;
		}
		@Override
		public String toString()
		{
			return "Precondition of branch #0 of Branch -1 for axiom getResources [line:1065,6 to 1066,49]";
		}
	}

	/**
	 * Branch -1 for axiom getResources
	 * Source: (line:1064, col:4) to (line:1066, col:1064)
	 */
	public static class Axiom65 extends Axiom
{
	/**
	 * Branch -1 for axiom getResources
	 */
		public Axiom65(Domain owner)
		{
			super(owner, new Predicate(32, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom getResources [line:1064,4 to 1066,1064]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new Precondition115(owner, unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom65Branch0(line:1064,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom exist
	 * Source: (line:1180, col:4) to (line:1180, col:1180)
	 */
	public static class Axiom66 extends Axiom
{
	/**
	 * Branch -1 for axiom exist
	 */
		public Axiom66(Domain owner)
		{
			super(owner, new Predicate(162, 2, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(0), owner.getTermVariable(1)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom exist [line:1180,4 to 1180,1180]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionNil(2)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom66Branch0(line:1180,col:5)";
				default: return null;
			}
		}
	}

	/**
	 * Branch -1 for axiom exist
	 * Source: (line:1181, col:4) to (line:1181, col:1181)
	 */
	public static class Axiom67 extends Axiom
{
	/**
	 * Branch -1 for axiom exist
	 */
		public Axiom67(Domain owner)
		{
			super(owner, new Predicate(162, 3, new TermList(owner.getTermVariable(0), new TermList(new TermList(owner.getTermVariable(1), owner.getTermVariable(2)), TermList.NIL))), 1);
		}

		@Override
		public String toString()
		{
			return "Branch -1 for axiom exist [line:1181,4 to 1181,1181]";
		}
		public Precondition getIterator(State state, Term[] unifier, int which)
		{
			Precondition p;

			switch (which)
			{
				case 0:
					p = (new PreconditionAtomic(new Predicate(162, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(2), TermList.NIL))), unifier)).setComparator(null);
				break;
				default:
					return null;
			}

			p.reset(state);

			return p;
		}

		public String getLabel(int which)
		{
			switch (which)
			{
				case 0: return "Axiom67Branch0(line:1181,col:5)";
				default: return null;
			}
		}
	}

	public static final String sourcePath = "/home/oldunknown/geiser/workspace/automated-learning-design/resource/br/usp/ime/cg/automatedld/server/planner/coursegeneration";
	public static final long sourceLastModified = 1289320162000L;

	public RemoveList calculateRemoveList = new RemoveList();

	public Reverse calculateReverse = new Reverse();

	public Restrict calculateRestrict = new Restrict();

	public LearnerProperty calculateLearnerProperty = new LearnerProperty();

	public LearningServiceAvailable calculateLearningServiceAvailable = new LearningServiceAvailable();

	public GetRelated calculateGetRelated = new GetRelated();

	public GetMetadata calculateGetMetadata = new GetMetadata();

	public Concat calculateConcat = new Concat();

	public Sort calculateSort = new Sort();

	public ConcatText calculateConcatText = new ConcatText();

	public GetLength calculateGetLength = new GetLength();

	public Div calculateDiv = new Div();

	public Split calculateSplit = new Split();

	public GetNewRole calculateGetNewRole = new GetNewRole();

	public coursegeneration()
	{
		constants = new String[163];
		constants[0] = "same";
		constants[1] = "different";
		constants[2] = "first";
		constants[3] = "rest";
		constants[4] = "assignIterator";
		constants[5] = "removeElements";
		constants[6] = "removeElement";
		constants[7] = "removeH";
		constants[8] = "restrict";
		constants[9] = "learnerProperty";
		constants[10] = "learner";
		constants[11] = "property";
		constants[12] = "learningServiceAvailable";
		constants[13] = "getRelatedSet";
		constants[14] = "typicalLearningTime";
		constants[15] = "hasTypicalLearningTime";
		constants[16] = "role";
		constants[17] = "inserted";
		constants[18] = "allInserted";
		constants[19] = "getNonInserted";
		constants[20] = "getNIH";
		constants[21] = "readyAux";
		constants[22] = "hasEducationalLevel";
		constants[23] = "class";
		constants[24] = "Competence";
		constants[25] = "hasLearningContext";
		constants[26] = "relation";
		constants[27] = "inverseHasPrerequisite";
		constants[28] = "getCompetences";
		constants[29] = "allHaveCompetences";
		constants[30] = "Auxiliary";
		constants[31] = "isRequiredBy";
		constants[32] = "getResources";
		constants[33] = "hasCompetence";
		constants[34] = "sortByAlreadySeen";
		constants[35] = "sortByAlreadySeenH";
		constants[36] = "hasAlreadySeen";
		constants[37] = "false";
		constants[38] = "true";
		constants[39] = "isVariantOf";
		constants[40] = "applyFilters";
		constants[41] = "filter";
		constants[42] = "filterH";
		constants[43] = "getConcepts";
		constants[44] = "concepts";
		constants[45] = "isRequieredBy";
		constants[46] = "concept";
		constants[47] = "generateTopic";
		constants[48] = "competences";
		constants[49] = "inverseHasObjective";
		constants[50] = "ld";
		constants[51] = "title";
		constants[52] = "uri";
		constants[53] = "level";
		constants[54] = "C";
		constants[55] = "insertAndPlanTopic!";
		constants[56] = "discover";
		constants[57] = "skill";
		constants[58] = "knowledge";
		constants[59] = "play";
		constants[60] = "learnFundamentalDiscover";
		constants[61] = "hasObjective";
		constants[62] = "getNameOf";
		constants[63] = "learners";
		constants[64] = "getMaxAttempts";
		constants[65] = "maxAttempts";
		constants[66] = "getMaxPerStrategy";
		constants[67] = "maxPerStrategy";
		constants[68] = "getPath";
		constants[69] = "nothing";
		constants[70] = "tuning";
		constants[71] = "learningByBeingTaught";
		constants[72] = "anchorHolder";
		constants[73] = "explanatory";
		constants[74] = "accretion";
		constants[75] = "associative";
		constants[76] = "learningByDiagnosing";
		constants[77] = "anchoredInstructor";
		constants[78] = "restructuring";
		constants[79] = "learningByApprenticeship";
		constants[80] = "apprenticeship";
		constants[81] = "autonomous";
		constants[82] = "learningByGuiding";
		constants[83] = "master";
		constants[84] = "learningByReflection";
		constants[85] = "audience";
		constants[86] = "learningBySelfexpression";
		constants[87] = "panelist";
		constants[88] = "learningByDiscussion";
		constants[89] = "fullParticipant";
		constants[90] = "learningByPractice";
		constants[91] = "peerTutee";
		constants[92] = "learningByTeaching";
		constants[93] = "peerTutor";
		constants[94] = "getLearnersWithStrategy";
		constants[95] = "goal";
		constants[96] = "learningByBeingTaughtTutee";
		constants[97] = "getGroupGoals";
		constants[98] = "length";
		constants[99] = "nothing-nothing";
		constants[100] = "nothing-accretion";
		constants[101] = "nothing-tuning";
		constants[102] = "nothing-restructuring";
		constants[103] = "rough-nothing";
		constants[104] = "rough";
		constants[105] = "rough-accretion";
		constants[106] = "rough-tuning";
		constants[107] = "rough-restructuring";
		constants[108] = "explanatory-nothing";
		constants[109] = "explanatory-accretion";
		constants[110] = "explanatory-tuning";
		constants[111] = "explanatory-restructuring";
		constants[112] = "associative-nothing";
		constants[113] = "associative-accretion";
		constants[114] = "associative-tuning";
		constants[115] = "associative-restructuring";
		constants[116] = "autonomous-nothing";
		constants[117] = "autonomous-accretion";
		constants[118] = "autonomous-tuning";
		constants[119] = "autonomous-restructuring";
		constants[120] = "getRole";
		constants[121] = "peripheralParticipant";
		constants[122] = "divideGroupInSubGroups";
		constants[123] = "calculeMinNumGroups";
		constants[124] = "getTheory";
		constants[125] = "anchoredInstruction";
		constants[126] = "cognitiveApprenticeship";
		constants[127] = "cognitiveFlexibility";
		constants[128] = "distributedCognition";
		constants[129] = "lpp";
		constants[130] = "peerTutoring";
		constants[131] = "extremeTheory";
		constants[132] = "hasCompetenceLevel";
		constants[133] = "act";
		constants[134] = "CLPhase";
		constants[135] = "for";
		constants[136] = "pGroup";
		constants[137] = "sGroup";
		constants[138] = "role-part";
		constants[139] = "group-activity-for-learners";
		constants[140] = "role-ref";
		constants[141] = "learning-activity";
		constants[142] = "description";
		constants[143] = "createCLSession";
		constants[144] = "activity-description";
		constants[145] = "__basePath__resources__info__activity__";
		constants[146] = "___instructors_____";
		constants[147] = "____learners_____";
		constants[148] = "____skillId_____";
		constants[149] = "____knowledgeId_____";
		constants[150] = "resources";
		constants[151] = "environment";
		constants[152] = "environment-for";
		constants[153] = "createCLEnvironment";
		constants[154] = "hasLearningResourceType";
		constants[155] = "exercise";
		constants[156] = "hasEducationalObjective";
		constants[157] = "learning-object";
		constants[158] = "lo-exercise-";
		constants[159] = "type";
		constants[160] = "knowledge-object";
		constants[161] = "algoErrado";
		constants[162] = "exist";

		compoundTasks = new String[40];
		compoundTasks[0] = "addUsersToRole";
		compoundTasks[1] = "addUserToRole";
		compoundTasks[2] = "removeUsersFromRole";
		compoundTasks[3] = "removeUserFromRole";
		compoundTasks[4] = "insertResourceForAllLearners!";
		compoundTasks[5] = "insertResource";
		compoundTasks[6] = "insertResourceOnce!";
		compoundTasks[7] = "insertAllResources";
		compoundTasks[8] = "addInWorldStateAsInserted";
		compoundTasks[9] = "insertWithVariantsIfReady!";
		compoundTasks[10] = "insertAllAuxOnceIfReady";
		compoundTasks[11] = "inserAuxOnceIfReady";
		compoundTasks[12] = "insertAuxOnceIfReady!";
		compoundTasks[13] = "insertAuxOnceIfReady";
		compoundTasks[14] = "generateTopics";
		compoundTasks[15] = "generatecourse";
		compoundTasks[16] = "generateTopic";
		compoundTasks[17] = "insertAndPlanTopic";
		compoundTasks[18] = "insertAndPlanTopic!";
		compoundTasks[19] = "insertAndPlanGoal";
		compoundTasks[20] = "discover";
		compoundTasks[21] = "learnFundamentalsDiscover";
		compoundTasks[22] = "learnFundamentalDiscover";
		compoundTasks[23] = "practiceInCollaborativeWay";
		compoundTasks[24] = "planningCLUoL";
		compoundTasks[25] = "setSkillKnowledge";
		compoundTasks[26] = "planningWithCLSteps";
		compoundTasks[27] = "setGoalsForStep";
		compoundTasks[28] = "createCLPhase";
		compoundTasks[29] = "removeGroupsForLearners";
		compoundTasks[30] = "planningCLPhase";
		compoundTasks[31] = "planningByTheory";
		compoundTasks[32] = "createByInstruction";
		compoundTasks[33] = "createCLGroupActivity";
		compoundTasks[34] = "planningCLGroupActivity";
		compoundTasks[35] = "createCLSession";
		compoundTasks[36] = "planningCLSession";
		compoundTasks[37] = "onCLSessionCompletedForLearners";
		compoundTasks[38] = "createCLEnvironment";
		compoundTasks[39] = "createCLObject";

		primitiveTasks = new String[10];
		primitiveTasks[0] = "!!addInWorldState";
		primitiveTasks[1] = "!!removeFromWorldState";
		primitiveTasks[2] = "!startLDElement";
		primitiveTasks[3] = "!endLDElement";
		primitiveTasks[4] = "!insertLearningService";
		primitiveTasks[5] = "!text";
		primitiveTasks[6] = "!dynamicTask";
		primitiveTasks[7] = "!addUserToRole";
		primitiveTasks[8] = "!removeUserFromRole";
		primitiveTasks[9] = "!insertResource";

		initializeTermVariables(13);

		initializeTermConstants();

		methods = new Method[40][];

		methods[0] = new Method[2];
		methods[0][0] = new Method0(this);
		methods[0][1] = new Method1(this);

		methods[1] = new Method[1];
		methods[1][0] = new Method2(this);

		methods[2] = new Method[2];
		methods[2][0] = new Method3(this);
		methods[2][1] = new Method4(this);

		methods[3] = new Method[1];
		methods[3][0] = new Method5(this);

		methods[4] = new Method[2];
		methods[4][0] = new Method6(this);
		methods[4][1] = new Method7(this);

		methods[5] = new Method[2];
		methods[5][0] = new Method8(this);
		methods[5][1] = new Method9(this);

		methods[6] = new Method[2];
		methods[6][0] = new Method10(this);
		methods[6][1] = new Method11(this);

		methods[7] = new Method[4];
		methods[7][0] = new Method12(this);
		methods[7][1] = new Method13(this);
		methods[7][2] = new Method14(this);
		methods[7][3] = new Method15(this);

		methods[8] = new Method[4];
		methods[8][0] = new Method16(this);
		methods[8][1] = new Method17(this);
		methods[8][2] = new Method18(this);
		methods[8][3] = new Method19(this);

		methods[9] = new Method[1];
		methods[9][0] = new Method20(this);

		methods[10] = new Method[2];
		methods[10][0] = new Method21(this);
		methods[10][1] = new Method22(this);

		methods[11] = new Method[0];

		methods[12] = new Method[1];
		methods[12][0] = new Method24(this);

		methods[13] = new Method[1];
		methods[13][0] = new Method23(this);

		methods[14] = new Method[2];
		methods[14][0] = new Method26(this);
		methods[14][1] = new Method27(this);

		methods[15] = new Method[1];
		methods[15][0] = new Method25(this);

		methods[16] = new Method[1];
		methods[16][0] = new Method28(this);

		methods[17] = new Method[1];
		methods[17][0] = new Method29(this);

		methods[18] = new Method[1];
		methods[18][0] = new Method30(this);

		methods[19] = new Method[1];
		methods[19][0] = new Method31(this);

		methods[20] = new Method[1];
		methods[20][0] = new Method32(this);

		methods[21] = new Method[2];
		methods[21][0] = new Method33(this);
		methods[21][1] = new Method34(this);

		methods[22] = new Method[1];
		methods[22][0] = new Method35(this);

		methods[23] = new Method[1];
		methods[23][0] = new Method36(this);

		methods[24] = new Method[2];
		methods[24][0] = new Method37(this);
		methods[24][1] = new Method38(this);

		methods[25] = new Method[2];
		methods[25][0] = new Method39(this);
		methods[25][1] = new Method40(this);

		methods[26] = new Method[2];
		methods[26][0] = new Method41(this);
		methods[26][1] = new Method42(this);

		methods[27] = new Method[2];
		methods[27][0] = new Method43(this);
		methods[27][1] = new Method44(this);

		methods[28] = new Method[1];
		methods[28][0] = new Method45(this);

		methods[29] = new Method[2];
		methods[29][0] = new Method46(this);
		methods[29][1] = new Method47(this);

		methods[30] = new Method[2];
		methods[30][0] = new Method48(this);
		methods[30][1] = new Method49(this);

		methods[31] = new Method[1];
		methods[31][0] = new Method50(this);

		methods[32] = new Method[2];
		methods[32][0] = new Method51(this);
		methods[32][1] = new Method52(this);

		methods[33] = new Method[1];
		methods[33][0] = new Method53(this);

		methods[34] = new Method[2];
		methods[34][0] = new Method54(this);
		methods[34][1] = new Method55(this);

		methods[35] = new Method[1];
		methods[35][0] = new Method56(this);

		methods[36] = new Method[1];
		methods[36][0] = new Method57(this);

		methods[37] = new Method[2];
		methods[37][0] = new Method60(this);
		methods[37][1] = new Method61(this);

		methods[38] = new Method[1];
		methods[38][0] = new Method58(this);

		methods[39] = new Method[1];
		methods[39][0] = new Method59(this);


		ops = new Operator[10][];

		ops[0] = new Operator[1];
		ops[0][0] = new Operator0(this);

		ops[1] = new Operator[1];
		ops[1][0] = new Operator1(this);

		ops[2] = new Operator[3];
		ops[2][0] = new Operator2(this);
		ops[2][1] = new Operator3(this);
		ops[2][2] = new Operator4(this);

		ops[3] = new Operator[1];
		ops[3][0] = new Operator5(this);

		ops[4] = new Operator[2];
		ops[4][0] = new Operator6(this);
		ops[4][1] = new Operator7(this);

		ops[5] = new Operator[1];
		ops[5][0] = new Operator8(this);

		ops[6] = new Operator[1];
		ops[6][0] = new Operator9(this);

		ops[7] = new Operator[1];
		ops[7][0] = new Operator10(this);

		ops[8] = new Operator[1];
		ops[8][0] = new Operator11(this);

		ops[9] = new Operator[2];
		ops[9][0] = new Operator12(this);
		ops[9][1] = new Operator13(this);

		axioms = new Axiom[163][];

		axioms[0] = new Axiom[1];
		axioms[0][0] = new Axiom0(this);

		axioms[1] = new Axiom[1];
		axioms[1][0] = new Axiom1(this);

		axioms[2] = new Axiom[2];
		axioms[2][0] = new Axiom2(this);
		axioms[2][1] = new Axiom3(this);

		axioms[3] = new Axiom[2];
		axioms[3][0] = new Axiom4(this);
		axioms[3][1] = new Axiom5(this);

		axioms[4] = new Axiom[2];
		axioms[4][0] = new Axiom6(this);
		axioms[4][1] = new Axiom7(this);

		axioms[5] = new Axiom[1];
		axioms[5][0] = new Axiom8(this);

		axioms[6] = new Axiom[1];
		axioms[6][0] = new Axiom9(this);

		axioms[7] = new Axiom[3];
		axioms[7][0] = new Axiom10(this);
		axioms[7][1] = new Axiom11(this);
		axioms[7][2] = new Axiom12(this);

		axioms[8] = new Axiom[1];
		axioms[8][0] = new Axiom13(this);

		axioms[9] = new Axiom[2];
		axioms[9][0] = new Axiom14(this);
		axioms[9][1] = new Axiom15(this);

		axioms[10] = new Axiom[0];

		axioms[11] = new Axiom[0];

		axioms[12] = new Axiom[1];
		axioms[12][0] = new Axiom16(this);

		axioms[13] = new Axiom[1];
		axioms[13][0] = new Axiom17(this);

		axioms[14] = new Axiom[1];
		axioms[14][0] = new Axiom18(this);

		axioms[15] = new Axiom[0];

		axioms[16] = new Axiom[0];

		axioms[17] = new Axiom[0];

		axioms[18] = new Axiom[4];
		axioms[18][0] = new Axiom19(this);
		axioms[18][1] = new Axiom20(this);
		axioms[18][2] = new Axiom21(this);
		axioms[18][3] = new Axiom22(this);

		axioms[19] = new Axiom[2];
		axioms[19][0] = new Axiom23(this);
		axioms[19][1] = new Axiom25(this);

		axioms[20] = new Axiom[2];
		axioms[20][0] = new Axiom24(this);
		axioms[20][1] = new Axiom26(this);

		axioms[21] = new Axiom[1];
		axioms[21][0] = new Axiom27(this);

		axioms[22] = new Axiom[0];

		axioms[23] = new Axiom[0];

		axioms[24] = new Axiom[0];

		axioms[25] = new Axiom[0];

		axioms[26] = new Axiom[0];

		axioms[27] = new Axiom[0];

		axioms[28] = new Axiom[1];
		axioms[28][0] = new Axiom41(this);

		axioms[29] = new Axiom[2];
		axioms[29][0] = new Axiom28(this);
		axioms[29][1] = new Axiom29(this);

		axioms[30] = new Axiom[0];

		axioms[31] = new Axiom[0];

		axioms[32] = new Axiom[1];
		axioms[32][0] = new Axiom65(this);

		axioms[33] = new Axiom[1];
		axioms[33][0] = new Axiom30(this);

		axioms[34] = new Axiom[1];
		axioms[34][0] = new Axiom31(this);

		axioms[35] = new Axiom[1];
		axioms[35][0] = new Axiom32(this);

		axioms[36] = new Axiom[0];

		axioms[37] = new Axiom[0];

		axioms[38] = new Axiom[0];

		axioms[39] = new Axiom[0];

		axioms[40] = new Axiom[2];
		axioms[40][0] = new Axiom33(this);
		axioms[40][1] = new Axiom34(this);

		axioms[41] = new Axiom[1];
		axioms[41][0] = new Axiom35(this);

		axioms[42] = new Axiom[4];
		axioms[42][0] = new Axiom36(this);
		axioms[42][1] = new Axiom37(this);
		axioms[42][2] = new Axiom38(this);
		axioms[42][3] = new Axiom39(this);

		axioms[43] = new Axiom[1];
		axioms[43][0] = new Axiom40(this);

		axioms[44] = new Axiom[0];

		axioms[45] = new Axiom[0];

		axioms[46] = new Axiom[0];

		axioms[47] = new Axiom[0];

		axioms[48] = new Axiom[0];

		axioms[49] = new Axiom[0];

		axioms[50] = new Axiom[0];

		axioms[51] = new Axiom[0];

		axioms[52] = new Axiom[0];

		axioms[53] = new Axiom[0];

		axioms[54] = new Axiom[0];

		axioms[55] = new Axiom[0];

		axioms[56] = new Axiom[0];

		axioms[57] = new Axiom[0];

		axioms[58] = new Axiom[0];

		axioms[59] = new Axiom[0];

		axioms[60] = new Axiom[0];

		axioms[61] = new Axiom[0];

		axioms[62] = new Axiom[1];
		axioms[62][0] = new Axiom59(this);

		axioms[63] = new Axiom[0];

		axioms[64] = new Axiom[1];
		axioms[64][0] = new Axiom42(this);

		axioms[65] = new Axiom[0];

		axioms[66] = new Axiom[1];
		axioms[66][0] = new Axiom43(this);

		axioms[67] = new Axiom[0];

		axioms[68] = new Axiom[11];
		axioms[68][0] = new Axiom44(this);
		axioms[68][1] = new Axiom45(this);
		axioms[68][2] = new Axiom46(this);
		axioms[68][3] = new Axiom47(this);
		axioms[68][4] = new Axiom48(this);
		axioms[68][5] = new Axiom49(this);
		axioms[68][6] = new Axiom50(this);
		axioms[68][7] = new Axiom51(this);
		axioms[68][8] = new Axiom52(this);
		axioms[68][9] = new Axiom53(this);
		axioms[68][10] = new Axiom54(this);

		axioms[69] = new Axiom[0];

		axioms[70] = new Axiom[0];

		axioms[71] = new Axiom[0];

		axioms[72] = new Axiom[0];

		axioms[73] = new Axiom[0];

		axioms[74] = new Axiom[0];

		axioms[75] = new Axiom[0];

		axioms[76] = new Axiom[0];

		axioms[77] = new Axiom[0];

		axioms[78] = new Axiom[0];

		axioms[79] = new Axiom[0];

		axioms[80] = new Axiom[0];

		axioms[81] = new Axiom[0];

		axioms[82] = new Axiom[0];

		axioms[83] = new Axiom[0];

		axioms[84] = new Axiom[0];

		axioms[85] = new Axiom[0];

		axioms[86] = new Axiom[0];

		axioms[87] = new Axiom[0];

		axioms[88] = new Axiom[0];

		axioms[89] = new Axiom[0];

		axioms[90] = new Axiom[0];

		axioms[91] = new Axiom[0];

		axioms[92] = new Axiom[0];

		axioms[93] = new Axiom[0];

		axioms[94] = new Axiom[2];
		axioms[94][0] = new Axiom55(this);
		axioms[94][1] = new Axiom56(this);

		axioms[95] = new Axiom[0];

		axioms[96] = new Axiom[0];

		axioms[97] = new Axiom[1];
		axioms[97][0] = new Axiom57(this);

		axioms[98] = new Axiom[1];
		axioms[98][0] = new Axiom58(this);

		axioms[99] = new Axiom[0];

		axioms[100] = new Axiom[0];

		axioms[101] = new Axiom[0];

		axioms[102] = new Axiom[0];

		axioms[103] = new Axiom[0];

		axioms[104] = new Axiom[0];

		axioms[105] = new Axiom[0];

		axioms[106] = new Axiom[0];

		axioms[107] = new Axiom[0];

		axioms[108] = new Axiom[0];

		axioms[109] = new Axiom[0];

		axioms[110] = new Axiom[0];

		axioms[111] = new Axiom[0];

		axioms[112] = new Axiom[0];

		axioms[113] = new Axiom[0];

		axioms[114] = new Axiom[0];

		axioms[115] = new Axiom[0];

		axioms[116] = new Axiom[0];

		axioms[117] = new Axiom[0];

		axioms[118] = new Axiom[0];

		axioms[119] = new Axiom[0];

		axioms[120] = new Axiom[1];
		axioms[120][0] = new Axiom60(this);

		axioms[121] = new Axiom[0];

		axioms[122] = new Axiom[1];
		axioms[122][0] = new Axiom61(this);

		axioms[123] = new Axiom[2];
		axioms[123][0] = new Axiom62(this);
		axioms[123][1] = new Axiom63(this);

		axioms[124] = new Axiom[1];
		axioms[124][0] = new Axiom64(this);

		axioms[125] = new Axiom[0];

		axioms[126] = new Axiom[0];

		axioms[127] = new Axiom[0];

		axioms[128] = new Axiom[0];

		axioms[129] = new Axiom[0];

		axioms[130] = new Axiom[0];

		axioms[131] = new Axiom[0];

		axioms[132] = new Axiom[0];

		axioms[133] = new Axiom[0];

		axioms[134] = new Axiom[0];

		axioms[135] = new Axiom[0];

		axioms[136] = new Axiom[0];

		axioms[137] = new Axiom[0];

		axioms[138] = new Axiom[0];

		axioms[139] = new Axiom[0];

		axioms[140] = new Axiom[0];

		axioms[141] = new Axiom[0];

		axioms[142] = new Axiom[0];

		axioms[143] = new Axiom[0];

		axioms[144] = new Axiom[0];

		axioms[145] = new Axiom[0];

		axioms[146] = new Axiom[0];

		axioms[147] = new Axiom[0];

		axioms[148] = new Axiom[0];

		axioms[149] = new Axiom[0];

		axioms[150] = new Axiom[0];

		axioms[151] = new Axiom[0];

		axioms[152] = new Axiom[0];

		axioms[153] = new Axiom[0];

		axioms[154] = new Axiom[0];

		axioms[155] = new Axiom[0];

		axioms[156] = new Axiom[0];

		axioms[157] = new Axiom[0];

		axioms[158] = new Axiom[0];

		axioms[159] = new Axiom[0];

		axioms[160] = new Axiom[0];

		axioms[161] = new Axiom[0];

		axioms[162] = new Axiom[2];
		axioms[162][0] = new Axiom66(this);
		axioms[162][1] = new Axiom67(this);

	}
}