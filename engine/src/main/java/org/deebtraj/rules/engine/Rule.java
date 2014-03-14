package org.deebtraj.rules.engine;

import org.deebtraj.rules.engine.action.Action;
import org.deebtraj.rules.engine.condition.Condition;
import org.deebtraj.rules.engine.evaluator.Evaluator;

import java.util.HashSet;

/**
 * A Rule is a Set of Conditions and Actions
 *
 * Created by David Brodsky on 3/14/14.
 */
public class Rule {

    private HashSet<Condition> mConditions;
    private HashSet<Action> mActions;
    private Evaluator mEvaluator;

    public Rule(HashSet<Condition> conditions, HashSet<Action> actions, Evaluator evaluator) {
        mConditions = conditions;
        mActions = actions;
        mEvaluator = evaluator;
    }

    public void evaluate() {
        boolean result = mEvaluator.evaluate(mConditions);
        for (Action action : mActions) {
            action.act(result);
        }
    }
}
