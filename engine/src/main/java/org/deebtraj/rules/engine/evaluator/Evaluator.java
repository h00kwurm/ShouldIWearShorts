package org.deebtraj.rules.engine.evaluator;

import org.deebtraj.rules.engine.condition.Condition;

import java.util.HashSet;

/**
 * This class determines a result
 * from a Set of Conditions
 *
 * Created by David Brodsky on 3/14/14.
 */
public interface Evaluator {

    /**
     * Evaluate a set of Conditions
     * @param conditions
     * @return whether the set of conditions taken together is a positive or negative result
     */
    public abstract boolean evaluate(HashSet<Condition> conditions);

}
