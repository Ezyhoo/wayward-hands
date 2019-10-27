package action;

public abstract class Action {
	
	/** List To Add
	 * Raise
	 * Fold
	 * Call
	 * All In
	 * Check
	 */
    /** Posting the small blind. */
    public static final Action SMALL_BLIND = new SmallBlindAction();
    
    /** Posting the big blind. */
    public static final Action BIG_BLIND = new BigBlindAction();
    
    /** Posting the Raise. */
    public static final Action RAISE = new RaiseAction();
    
    /** Posting the Fold. */
    public static final Action FOLD = new FoldAction();
    
    /** Posting the Call. */
    public static final Action CALL = new CallAction();
    
    /** Posting the All In. */
    public static final Action ALL_IN = new AllInAction();
    
    /** Posting the Check. */
    public static final Action CHECK = new CheckAction();
    
    /** Posting the Continue. */
    public static final Action Continue = new ContinueAction();
    
    /** Name of Object */
    private String name;
    /** Verb of Object */
    private String verb;
    /**  Ammount of object   */
    private int amount;

    /** Creates Action Object	
     * @param name Name of Object
     * @param verb Verb Of Object
     * @param amount Ammount of Object
     */
    public Action(String name, String verb, int amount)
    {
    	this.setName(name);
    	this.setVerb(verb);
    	this.setAmount(amount);
    }

	/** Creates Action Object
	 * @param name Name of Object
	 * @param verb Verb Of Object
	 */

	/** Gets Name of Action
	 * @return action
	 */
	public String getName() {
		return name;
	}

	/** Sets Name of Action
	 * @param name Name of Action
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**Gets Action Verb
	 * @return
	 */
	public String getVerb() {
		return verb;
	}

	/**Sets Action Verb
	 * @param verb
	 */
	public void setVerb(String verb) {
		this.verb = verb;
	}

	/**Gets Amount Set
	 * @return Amount Set
	 */
	public int getAmount() {
		return amount;
	}

	/** Resets Amount
	 * @param amount to be set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
}