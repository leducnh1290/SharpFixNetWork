package com.ducanh.sharpfixnetwork;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.service.quicksettings.TileService;
import android.util.Log;;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.N)
public class ServiceStatusBar extends TileService {
    @Override
    public void onTileAdded() {
        Log.d ("Status", "Add");
        getSharedPreferences ("Status", MODE_PRIVATE).edit ().putBoolean ("status", true).commit ();
    }

    @Override
    public void onTileRemoved() {
        Log.d ("Status", "Removed");
        getSharedPreferences ("Status", MODE_PRIVATE).edit ().putBoolean ("status", false).commit ();
    }

    @Override
    public void onClick() {
        Intent intent = new Intent (Settings.Panel.ACTION_INTERNET_CONNECTIVITY);
        intent.setFlags (Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity (intent);
    }
}
