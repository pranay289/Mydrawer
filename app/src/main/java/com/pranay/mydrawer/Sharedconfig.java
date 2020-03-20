package com.pranay.mydrawer;

import android.content.Context;
import android.content.SharedPreferences;

public class Sharedconfig {

    SharedPreferences sharedPreferences;
    Context context;

    public Sharedconfig( Context context) {
        sharedPreferences =context.getSharedPreferences(context.getResources().getString(R.string.login_pref),Context.MODE_PRIVATE);

        this.context = context;
    }

    public void writelogin(boolean status)
    {

        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status),status);
        editor.apply();
    }

    public boolean readloginstatus(){
        boolean status=false;
        status=sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status),false);


        return status;

    }
}
