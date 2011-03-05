package br.usp.ime.cg.automatedld.server.planner;
import com.gamalocus.jshop2rt.*;

public class testimsldelements extends Domain
{
	private static final long serialVersionUID = -4544869497959205983L;


	/**
	 * Operator #-1 for primitive task !startLDElement
	 * Source: (line:6, col:4) to (line:6, col:47)
	 */
	public static class Operator0 extends Operator
{
	/**
	 * Operator #-1 for primitive task !startLDElement
	 */
		public Operator0(Domain owner)
		{
			super(owner, new Predicate(0, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !startLDElement [line:6,4 to 6,47]";
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
	 * Source: (line:7, col:4) to (line:7, col:59)
	 */
	public static class Operator1 extends Operator
{
	/**
	 * Operator #-1 for primitive task !startLDElement
	 */
		public Operator1(Domain owner)
		{
			super(owner, new Predicate(0, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !startLDElement [line:7,4 to 7,59]";
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
	 * Source: (line:8, col:4) to (line:8, col:65)
	 */
	public static class Operator2 extends Operator
{
	/**
	 * Operator #-1 for primitive task !startLDElement
	 */
		public Operator2(Domain owner)
		{
			super(owner, new Predicate(0, 3, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), new TermList(owner.getTermVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !startLDElement [line:8,4 to 8,65]";
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
	 * Source: (line:9, col:4) to (line:9, col:45)
	 */
	public static class Operator3 extends Operator
{
	/**
	 * Operator #-1 for primitive task !endLDElement
	 */
		public Operator3(Domain owner)
		{
			super(owner, new Predicate(1, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[0];

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !endLDElement [line:9,4 to 9,45]";
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
	 * Source: (line:11, col:4) to (line:14, col:21)
	 */
	public static class Operator4 extends Operator
{
	/**
	 * Operator #-1 for primitive task !insertResource
	 */
		public Operator4(Domain owner)
		{
			super(owner, new Predicate(2, 1, new TermList(owner.getTermVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[1];
			addIn[0] = new DelAddAtomic(new Predicate(0, 1, new TermList(owner.getTermVariable(0), TermList.NIL)));

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !insertResource [line:11,4 to 14,21]";
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
	 * Source: (line:16, col:4) to (line:19, col:24)
	 */
	public static class Operator5 extends Operator
{
	/**
	 * Operator #-1 for primitive task !insertResource
	 */
		public Operator5(Domain owner)
		{
			super(owner, new Predicate(2, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


			DelAddElement[] delIn = new DelAddElement[0];

			setDel(delIn);

			DelAddElement[] addIn = new DelAddElement[1];
			addIn[0] = new DelAddAtomic(new Predicate(0, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));

			setAdd(addIn);
		}

		@Override
		public String toString()
		{
			return "Operator #-1 for primitive task !insertResource [line:16,4 to 19,24]";
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
	 * Method -1 for compound task test
	 * Source: (line:21, col:4) to (line:23, col:72)
	 */
	public static class Method0 extends Method
	{
	/**
	 * Method -1 for compound task test
	 */
		public Method0(Domain owner)
		{
			super(owner, new Predicate(1, 0, TermList.NIL));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(1, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 0, new TermList(owner.getTermConstant(1) /*training*/, new TermList(new TermList(owner.getTermConstant(2) /*student01*/, new TermList(owner.getTermConstant(3) /*student02*/, new TermList(owner.getTermConstant(4) /*student03*/, TermList.NIL))), TermList.NIL))), false, false));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task test [line:21,4 to 23,72]";
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
				case 0: return "Method0Branch0(text:test,line:21,col:14)";
				default: return null;
			}
		}
	}

	/**
	 * Method -1 for compound task testCreateLDElements!
	 * Source: (line:26, col:4) to (line:113, col:26)
	 */
	public static class Method1 extends Method
	{
	/**
	 * Method -1 for compound task testCreateLDElements!
	 */
		public Method1(Domain owner)
		{
			super(owner, new Predicate(0, 2, new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL))));
			TaskList[] subsIn = new TaskList[1];

			subsIn[0] = createTaskList0();

			setSubs(subsIn);
		}

		TaskList createTaskList0()
		{
			TaskList retVal;

			retVal = new TaskList(54, true);
			retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(5) /*ld*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(7) /*ld-teste-simplified*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(8) /*version*/, new TermList(owner.getTermConstant(9) /*a0_09a*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(10) /*uri*/, new TermList(owner.getTermConstant(11) /*http_www_ime_usp_brcgcourseware_354*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(12) /*level*/, new TermList(owner.getTermConstant(13) /*B*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(14) /*sequence-used*/, new TermList(owner.getTermConstant(15) /*false*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(17) /*teste-simplified*/, TermList.NIL)), TermList.NIL)))))), new TermList(new TermList(owner.getTermConstant(18) /*testCreateLDElements!*/, new TermList(new TermList(owner.getTermVariable(0), new TermList(owner.getTermVariable(1), TermList.NIL)), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(19) /*play*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(20) /*act-individualized-learning*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(21) /*isvisible*/, new TermList(owner.getTermConstant(22) /*true*/, TermList.NIL)), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(23) /*createLDPlay!*/, new TermList(new TermList(owner.getTermVariable(0), TermList.NIL), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(24) /*act*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(25) /*act-motivation-in-context*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(26) /*motivation-in-context*/, TermList.NIL)), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(27) /*createLDAct!*/, new TermList(new TermList(owner.getTermVariable(1), new TermList(owner.getTermConstant(28) /*constante*/, TermList.NIL)), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(29) /*role-part*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(30) /*rpart-motivation-topic-01*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(31) /*motivation-topic-01*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(32) /*role-ref*/, new TermList(owner.getTermConstant(33) /*role-ind-01*/, TermList.NIL)), TermList.NIL))), TermList.NIL))), false, true));
			retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(34) /*activity-structure*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(35) /*as-preparation*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(36) /*number-to-select*/, new TermList(new TermNumber(3.0), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(37) /*structure-type*/, new TermList(owner.getTermConstant(38) /*selection*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(39) /*preparation*/, TermList.NIL)), TermList.NIL)))), TermList.NIL))), false, true));
			retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(41) /*la-versailles-overview*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(21) /*isvisible*/, new TermList(owner.getTermConstant(22) /*true*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(42) /*versailles-overview*/, TermList.NIL)), TermList.NIL))), TermList.NIL))), false, true));
			retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, new TermList(new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(44) /*versalles-overview-description*/, TermList.NIL)), TermList.NIL), new TermList(new TermList(owner.getTermConstant(45) /*insertDescription!*/, new TermList(new TermList(owner.getTermConstant(46) /*task*/, new TermList(owner.getTermConstant(42) /*versailles-overview*/, TermList.NIL)), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[7] = new TaskList(new TaskAtom(new Predicate(2, 2, new TermList(owner.getTermConstant(47) /*http_www_ime_usp_brcgresource01*/, TermList.NIL)), false, true));
			retVal.subtasks[8] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, TermList.NIL)), false, true));
			retVal.subtasks[9] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, TermList.NIL)), false, true));
			retVal.subtasks[10] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, new TermList(new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(48) /*versailles-training*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[11] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, new TermList(new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(44) /*versalles-overview-description*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[12] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, TermList.NIL)), false, true));
			retVal.subtasks[13] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(49) /*environment*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(50) /*env-environment-group01*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(51) /*environment-group01*/, TermList.NIL)), TermList.NIL)), TermList.NIL))), false, true));
			retVal.subtasks[14] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(52) /*learning-object*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(53) /*lo-complex-01*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(21) /*isvisible*/, new TermList(owner.getTermConstant(22) /*true*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(54) /*class*/, new TermList(owner.getTermConstant(55) /*class-exercise*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(56) /*type*/, new TermList(owner.getTermConstant(57) /*knowledge-object*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(58) /*complex-01*/, TermList.NIL)), TermList.NIL))))), TermList.NIL))), false, true));
			retVal.subtasks[15] = new TaskList(new TaskAtom(new Predicate(2, 2, new TermList(owner.getTermConstant(47) /*http_www_ime_usp_brcgresource01*/, new TermList(owner.getTermConstant(59) /*learner01*/, TermList.NIL))), false, true));
			retVal.subtasks[16] = new TaskList(new TaskAtom(new Predicate(2, 2, new TermList(owner.getTermConstant(47) /*http_www_ime_usp_brcgresource01*/, new TermList(owner.getTermConstant(60) /*learner02*/, TermList.NIL))), false, true));
			retVal.subtasks[17] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(52) /*learning-object*/, TermList.NIL)), false, true));
			retVal.subtasks[18] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(49) /*environment*/, TermList.NIL)), false, true));
			retVal.subtasks[19] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, TermList.NIL)), false, true));
			retVal.subtasks[20] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(34) /*activity-structure*/, TermList.NIL)), false, true));
			retVal.subtasks[21] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(29) /*role-part*/, TermList.NIL)), false, true));
			retVal.subtasks[22] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(29) /*role-part*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(61) /*rpart-motivation-topic-02*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(62) /*motivation-topic-02*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(32) /*role-ref*/, new TermList(owner.getTermConstant(63) /*role-ind-02*/, TermList.NIL)), TermList.NIL))), TermList.NIL))), false, true));
			retVal.subtasks[23] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(64) /*la-resource-01*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[24] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, new TermList(new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(65) /*rough-overview-description*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[25] = new TaskList(new TaskAtom(new Predicate(2, 2, new TermList(owner.getTermConstant(66) /*http_www_ime_usp_brcgresource04*/, TermList.NIL)), false, true));
			retVal.subtasks[26] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, TermList.NIL)), false, true));
			retVal.subtasks[27] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, TermList.NIL)), false, true));
			retVal.subtasks[28] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(29) /*role-part*/, TermList.NIL)), false, true));
			retVal.subtasks[29] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(24) /*act*/, TermList.NIL)), false, true));
			retVal.subtasks[30] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(24) /*act*/, TermList.NIL)), false, true));
			retVal.subtasks[31] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(29) /*role-part*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(67) /*rpart-evaluation-topic-02*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(68) /*evaluation-topic-02*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(32) /*role-ref*/, new TermList(owner.getTermConstant(69) /*role-participant-01*/, TermList.NIL)), TermList.NIL))), TermList.NIL))), false, true));
			retVal.subtasks[32] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(34) /*activity-structure*/, TermList.NIL)), false, true));
			retVal.subtasks[33] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(70) /*la-peer-tutoring-topic01*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[34] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, new TermList(new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(71) /*peer-tutoring-topic01*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[35] = new TaskList(new TaskAtom(new Predicate(2, 2, new TermList(owner.getTermConstant(72) /*http_www_ime_usp_brcgpeer-tutoring-topic01*/, TermList.NIL)), false, true));
			retVal.subtasks[36] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, TermList.NIL)), false, true));
			retVal.subtasks[37] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, TermList.NIL)), false, true));
			retVal.subtasks[38] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(34) /*activity-structure*/, TermList.NIL)), false, true));
			retVal.subtasks[39] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(29) /*role-part*/, TermList.NIL)), false, true));
			retVal.subtasks[40] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(24) /*act*/, TermList.NIL)), false, true));
			retVal.subtasks[41] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(19) /*play*/, TermList.NIL)), false, true));
			retVal.subtasks[42] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(19) /*play*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(73) /*act-collaborative-learning*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(21) /*isvisible*/, new TermList(owner.getTermConstant(15) /*false*/, TermList.NIL)), TermList.NIL)), new TermList(new TermList(owner.getTermConstant(74) /*createCollaborativeLplay*/, new TermList(new TermList(owner.getTermVariable(1), TermList.NIL), TermList.NIL)), TermList.NIL)))), false, true));
			retVal.subtasks[43] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(24) /*act*/, TermList.NIL)), false, true));
			retVal.subtasks[44] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(29) /*role-part*/, new TermList(new TermList(new TermList(owner.getTermConstant(6) /*identifier*/, new TermList(owner.getTermConstant(75) /*rpart-group-topic-02*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(76) /*group-topic-02*/, TermList.NIL)), new TermList(new TermList(owner.getTermConstant(32) /*role-ref*/, new TermList(owner.getTermConstant(77) /*role-group-01*/, TermList.NIL)), TermList.NIL))), TermList.NIL))), false, true));
			retVal.subtasks[45] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, new TermList(TermList.NIL, TermList.NIL))), false, true));
			retVal.subtasks[46] = new TaskList(new TaskAtom(new Predicate(0, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, new TermList(new TermList(new TermList(owner.getTermConstant(16) /*title*/, new TermList(owner.getTermConstant(78) /*anchored-instruction-topic05*/, TermList.NIL)), TermList.NIL), TermList.NIL))), false, true));
			retVal.subtasks[47] = new TaskList(new TaskAtom(new Predicate(2, 2, new TermList(owner.getTermConstant(79) /*http_www_ime_usp_cganchored-instruction-topic05*/, new TermList(owner.getTermConstant(80) /*learner4*/, TermList.NIL))), false, true));
			retVal.subtasks[48] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(43) /*activity-description*/, TermList.NIL)), false, true));
			retVal.subtasks[49] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(40) /*learning-activity*/, TermList.NIL)), false, true));
			retVal.subtasks[50] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(29) /*role-part*/, TermList.NIL)), false, true));
			retVal.subtasks[51] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(24) /*act*/, TermList.NIL)), false, true));
			retVal.subtasks[52] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(19) /*play*/, TermList.NIL)), false, true));
			retVal.subtasks[53] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(owner.getTermConstant(5) /*ld*/, TermList.NIL)), false, true));

			return retVal;
		}

		@Override
		public String toString()
		{
			return "Method -1 for compound task testCreateLDElements! [line:26,4 to 113,26]";
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
				case 0: return "Method1Branch0(text:testCreateLDElements!,line:26,col:14)";
				default: return null;
			}
		}
	}

	public static final String sourcePath = "/home/geiser/workspace/automated-learning-design/resource/br/usp/ime/cg/automatedld/server/planner/testimsldelements";
	public static final long sourceLastModified = 1287709334000L;

	public testimsldelements()
	{
		constants = new String[81];
		constants[0] = "inserted";
		constants[1] = "training";
		constants[2] = "student01";
		constants[3] = "student02";
		constants[4] = "student03";
		constants[5] = "ld";
		constants[6] = "identifier";
		constants[7] = "ld-teste-simplified";
		constants[8] = "version";
		constants[9] = "a0_09a";
		constants[10] = "uri";
		constants[11] = "http_www_ime_usp_brcgcourseware_354";
		constants[12] = "level";
		constants[13] = "B";
		constants[14] = "sequence-used";
		constants[15] = "false";
		constants[16] = "title";
		constants[17] = "teste-simplified";
		constants[18] = "testCreateLDElements!";
		constants[19] = "play";
		constants[20] = "act-individualized-learning";
		constants[21] = "isvisible";
		constants[22] = "true";
		constants[23] = "createLDPlay!";
		constants[24] = "act";
		constants[25] = "act-motivation-in-context";
		constants[26] = "motivation-in-context";
		constants[27] = "createLDAct!";
		constants[28] = "constante";
		constants[29] = "role-part";
		constants[30] = "rpart-motivation-topic-01";
		constants[31] = "motivation-topic-01";
		constants[32] = "role-ref";
		constants[33] = "role-ind-01";
		constants[34] = "activity-structure";
		constants[35] = "as-preparation";
		constants[36] = "number-to-select";
		constants[37] = "structure-type";
		constants[38] = "selection";
		constants[39] = "preparation";
		constants[40] = "learning-activity";
		constants[41] = "la-versailles-overview";
		constants[42] = "versailles-overview";
		constants[43] = "activity-description";
		constants[44] = "versalles-overview-description";
		constants[45] = "insertDescription!";
		constants[46] = "task";
		constants[47] = "http_www_ime_usp_brcgresource01";
		constants[48] = "versailles-training";
		constants[49] = "environment";
		constants[50] = "env-environment-group01";
		constants[51] = "environment-group01";
		constants[52] = "learning-object";
		constants[53] = "lo-complex-01";
		constants[54] = "class";
		constants[55] = "class-exercise";
		constants[56] = "type";
		constants[57] = "knowledge-object";
		constants[58] = "complex-01";
		constants[59] = "learner01";
		constants[60] = "learner02";
		constants[61] = "rpart-motivation-topic-02";
		constants[62] = "motivation-topic-02";
		constants[63] = "role-ind-02";
		constants[64] = "la-resource-01";
		constants[65] = "rough-overview-description";
		constants[66] = "http_www_ime_usp_brcgresource04";
		constants[67] = "rpart-evaluation-topic-02";
		constants[68] = "evaluation-topic-02";
		constants[69] = "role-participant-01";
		constants[70] = "la-peer-tutoring-topic01";
		constants[71] = "peer-tutoring-topic01";
		constants[72] = "http_www_ime_usp_brcgpeer-tutoring-topic01";
		constants[73] = "act-collaborative-learning";
		constants[74] = "createCollaborativeLplay";
		constants[75] = "rpart-group-topic-02";
		constants[76] = "group-topic-02";
		constants[77] = "role-group-01";
		constants[78] = "anchored-instruction-topic05";
		constants[79] = "http_www_ime_usp_cganchored-instruction-topic05";
		constants[80] = "learner4";

		compoundTasks = new String[2];
		compoundTasks[0] = "testCreateLDElements!";
		compoundTasks[1] = "test";

		primitiveTasks = new String[3];
		primitiveTasks[0] = "!startLDElement";
		primitiveTasks[1] = "!endLDElement";
		primitiveTasks[2] = "!insertResource";

		initializeTermVariables(3);

		initializeTermConstants();

		methods = new Method[2][];

		methods[0] = new Method[1];
		methods[0][0] = new Method1(this);

		methods[1] = new Method[1];
		methods[1][0] = new Method0(this);


		ops = new Operator[3][];

		ops[0] = new Operator[3];
		ops[0][0] = new Operator0(this);
		ops[0][1] = new Operator1(this);
		ops[0][2] = new Operator2(this);

		ops[1] = new Operator[1];
		ops[1][0] = new Operator3(this);

		ops[2] = new Operator[2];
		ops[2][0] = new Operator4(this);
		ops[2][1] = new Operator5(this);

		axioms = new Axiom[81][];

		axioms[0] = new Axiom[0];

		axioms[1] = new Axiom[0];

		axioms[2] = new Axiom[0];

		axioms[3] = new Axiom[0];

		axioms[4] = new Axiom[0];

		axioms[5] = new Axiom[0];

		axioms[6] = new Axiom[0];

		axioms[7] = new Axiom[0];

		axioms[8] = new Axiom[0];

		axioms[9] = new Axiom[0];

		axioms[10] = new Axiom[0];

		axioms[11] = new Axiom[0];

		axioms[12] = new Axiom[0];

		axioms[13] = new Axiom[0];

		axioms[14] = new Axiom[0];

		axioms[15] = new Axiom[0];

		axioms[16] = new Axiom[0];

		axioms[17] = new Axiom[0];

		axioms[18] = new Axiom[0];

		axioms[19] = new Axiom[0];

		axioms[20] = new Axiom[0];

		axioms[21] = new Axiom[0];

		axioms[22] = new Axiom[0];

		axioms[23] = new Axiom[0];

		axioms[24] = new Axiom[0];

		axioms[25] = new Axiom[0];

		axioms[26] = new Axiom[0];

		axioms[27] = new Axiom[0];

		axioms[28] = new Axiom[0];

		axioms[29] = new Axiom[0];

		axioms[30] = new Axiom[0];

		axioms[31] = new Axiom[0];

		axioms[32] = new Axiom[0];

		axioms[33] = new Axiom[0];

		axioms[34] = new Axiom[0];

		axioms[35] = new Axiom[0];

		axioms[36] = new Axiom[0];

		axioms[37] = new Axiom[0];

		axioms[38] = new Axiom[0];

		axioms[39] = new Axiom[0];

		axioms[40] = new Axiom[0];

		axioms[41] = new Axiom[0];

		axioms[42] = new Axiom[0];

		axioms[43] = new Axiom[0];

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

		axioms[62] = new Axiom[0];

		axioms[63] = new Axiom[0];

		axioms[64] = new Axiom[0];

		axioms[65] = new Axiom[0];

		axioms[66] = new Axiom[0];

		axioms[67] = new Axiom[0];

		axioms[68] = new Axiom[0];

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

	}
}