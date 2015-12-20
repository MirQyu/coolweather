package com.qyu.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.qyu.coolweather.service.AutoUpdateService;

public class AutoUpdateReceiver extends BroadcastReceiver {
    public AutoUpdateReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
