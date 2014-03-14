package org.deebtraj.rules.engine.condition;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by David Brodsky on 3/14/14.
 */
public class TemperatureCondition extends Condition {

    private int mTargetDegreesCelsius;
    private int mComparator;

    public TemperatureCondition(int targetDegreesCelsius, int comparator) {
        mTargetDegreesCelsius = targetDegreesCelsius;
        mComparator = comparator;
    }

    @Override
    public void getView(int position, View convertView, ViewGroup parent) {
        // Prepare a pretty presentation
    }

    @Override
    public boolean evaluate() {
        // Get current temp at our location
        int currentDegreesCelsius = 42;
        if (mComparator < 0) {
            return (currentDegreesCelsius < mTargetDegreesCelsius);
        } else if (mComparator == 0) {
            return (currentDegreesCelsius == mTargetDegreesCelsius);
        } else {
            return (currentDegreesCelsius > mTargetDegreesCelsius);
        }
    }
}
