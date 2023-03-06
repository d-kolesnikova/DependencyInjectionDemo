package com.example.dependencyinjectiondemo;

import android.util.Log;

import com.google.android.material.button.MaterialButton;

import javax.inject.Inject;

public class LithiumIonBattery implements CarBattery{
    private static final String TAG = "CarTag";

    @Override
    public void logBatteryType() {
        Log.d(TAG, "This is battery");
    }

    @Inject
    public LithiumIonBattery() {
    }
}
