package com.example.administrator.setting_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreferenceActivity extends android.preference.PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().
                replace(android.R.id.content, new PreFragment()).commit();
    }
}
