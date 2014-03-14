package org.deebtraj.rules.engine.condition;

import org.deebtraj.rules.engine.AdapterViewObject;

/**
 * A Condition contains the fundamental logic
 * of the rules engine.
 *
 * Created by David Brodsky on 3/14/14.
 */
public abstract class Condition implements AdapterViewObject {

    /**
     * Returns whether this condition is satisfied
     *
     * @return is the condition satisfied
     */
    public abstract boolean evaluate();

}
