package com.example.gizelem.preferences;

/**
 * Created by GizeleM on 8/31/2015.
 */


        import android.os.Bundle;
        import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Define the xml file used for preferences
        addPreferencesFromResource(R.xml.preferences);
    }

}