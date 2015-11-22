package com.example.xiaoqian_niu.receiver38;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BrcastReceiver extends BroadcastReceiver {
    public BrcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast has been received", Toast.LENGTH_LONG).show();
    }
}
