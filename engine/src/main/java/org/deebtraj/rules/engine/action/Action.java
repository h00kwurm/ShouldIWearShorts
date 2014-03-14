package org.deebtraj.rules.engine.action;

import org.deebtraj.rules.engine.AdapterViewObject;

/**
 * An Action produces a response based
 * on the value of a Set of Conditions
 *
 * Created by David Brodsky on 3/14/14.
 */
public abstract class Action implements AdapterViewObject {

    /**
     * Execute given the given response
     *
     * @param response whether this should be considered a positive or negative response
     */
    public abstract void act(boolean response);

}