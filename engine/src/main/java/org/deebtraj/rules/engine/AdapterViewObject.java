package org.deebtraj.rules.engine;

import android.view.View;
import android.view.ViewGroup;

/**
 * A class representing an entity that
 * represents itself in a Adapter-backed view.
 *
 * Created by David Brodsky on 3/14/14.
 */
public interface AdapterViewObject {

    /**
     * Inflate and populate a View representing this condition
     *
     * @param position the position of this View in its Cause
     * @param convertView an existing View to recycle, may be null
     * @param parent the View's parent
     */
    public void getView(int position, View convertView, ViewGroup parent);
}
