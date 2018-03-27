package com.example.wen_cheng.cubicbubble;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by WEN-CHENG on 2018/3/27.
 */

public class DrawChoose extends View {
    public DrawChoose(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int viewHeight = this.getHeight();
        int viewWidth = this.getWidth();

        Paint p = new Paint();

        p.setStrokeWidth(4.0f);
        p.setTextSize(30f);

        p.setColor(0xFF3286C9);
        canvas.drawRect(0, viewHeight*21/36, viewWidth, viewHeight, p);
        //PorterDuff.Mode.SRC_IN
        p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        RectF oval2 = new RectF(viewWidth/2-15,viewHeight*9/18-5,viewWidth*7/6,viewHeight*12/18-5);
        canvas.drawOval(oval2, p);
        p.setColor(0xFF33B5E5);
        RectF oval1 = new RectF(-viewWidth/6,viewHeight*9/18+5,viewWidth/2+15,viewHeight*12/18+5);
        canvas.drawOval(oval1, p);
        p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));

        Paint p2 = new Paint();
        p.setStrokeWidth(8.0f);
        p2.setColor(0xFFFFFFFF);
        canvas.drawCircle(viewWidth/2, viewHeight*5/12, viewWidth*0.4f, p2);
        p2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(viewWidth/2, viewHeight*5/12, viewWidth*0.4f+10, p2);
    }
}
