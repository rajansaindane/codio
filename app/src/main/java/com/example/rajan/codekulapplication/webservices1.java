package com.example.rajan.codekulapplication;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by rajan on 28/1/17.
 */

public class webservices1 {

    private static RequestQueue queue;

    public static RequestQueue q(Context context){

        if (queue == null) queue= Volley.newRequestQueue(context);
        return queue;
    }
}
