package org.deebtraj.shorts.utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by anatraj on 3/10/14.
 * Copyright © 2014 Zonoff, Inc.  All Rights Reserved.
 */
public class NetworkGuru {

    public static boolean isConnectedToInternet(Context ctx)
    {
        ConnectivityManager manager = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        return networkInfo != null;
    }


}
