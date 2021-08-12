package com.ducanh.sharpfixnetwork;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView Alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        InitView ();
        if (getSharedPreferences ("Status", MODE_PRIVATE)
                .getBoolean ("status", false)) {
            Alert.setText ("Đã thêm tiện ích !");
            Alert.setTextColor (Color.GREEN);
        } else {
            Alert.setText ("Vui lòng thêm tiện ích vào quick settings !");
            Alert.setTextColor (Color.RED);
        }
    }

    private void InitView() {
        Alert = findViewById (R.id.alert);
    }

}
