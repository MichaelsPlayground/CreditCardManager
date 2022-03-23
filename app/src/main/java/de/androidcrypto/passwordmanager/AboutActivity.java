package de.androidcrypto.passwordmanager;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutActivity extends AppCompatActivity {

    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        TextView tv = (TextView) findViewById(R.id.appVersion);
        // check if app is in debug or release mode
        boolean isDebuggable =  ( 0 != ( getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE ) );
        if (isDebuggable) {
            tv.setText(getResources().getString(R.string.appVersionData) + " (debug)");
        } else {
            tv.setText(getResources().getString(R.string.appVersionData) + " (release)");
        }

        TextView tv3 = (TextView) findViewById(R.id.projectpage);
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView tv4 = (TextView) findViewById(R.id.sourcecodepage);
        tv4.setMovementMethod(LinkMovementMethod.getInstance());

        // nr database entries and size
        // on below line we are initialing our dbhandler class.
        dbHandler = new DBHandler(AboutActivity.this);
        TextView tv5 = (TextView) findViewById(R.id.nrDatabaseEntries);
        tv5.setText(dbHandler.getNrDatabaseRecords());
        TextView tv6 = (TextView) findViewById(R.id.databaseSize);
        tv6.setText(dbHandler.getDatabaseSize(getApplicationContext()) + " Bytes");
    }
}