package org.deebtraj.rules.engine.evaluator;

import org.deebtraj.rules.engine.condition.Condition;

import java.util.HashSet;

/**
 * AndEvaluator returns true if every Condition
 * evaluates to true
 * Created by David Brodsky on 3/14/14.
 */
public class AndEvaluator implements Evaluator {

    @Override
    public boolean evaluate(HashSet<Condition> conditions) {
        boolean result = true;
        for(Condition condition : conditions) {
            if (!condition.evaluate()) {
                result = false;
                break;
            }
        }
        return result;
    }
}
