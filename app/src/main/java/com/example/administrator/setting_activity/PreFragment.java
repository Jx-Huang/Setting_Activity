package com.example.administrator.setting_activity;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class PreFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        }
}
