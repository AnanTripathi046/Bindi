package com.project.bindi;

import com.google.firebase.database.FirebaseDatabase;

public class BindiFirebase extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /* Enable disk persistence  */
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}