package com.gamezone.wanttofly;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {
    int x =0,y=0;
    Bitmap backgorund;

     Background(int screnX, int screenY, Resources resources) {
       backgorund = BitmapFactory.decodeResource(resources,R.drawable.background);
       backgorund = Bitmap.createScaledBitmap(backgorund,screnX,screenY,false);
    }
}
