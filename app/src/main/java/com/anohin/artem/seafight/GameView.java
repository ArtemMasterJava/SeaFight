package com.anohin.artem.seafight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Artem on 07.03.2016.
 */
public class GameView extends View {

    public GameView(Context context) {
        super(context);
    }
    private Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        mPaint.setColor(Color.BLACK);
        //left, top, right,bottom
        canvas.drawRect(50, 100, 600, 650, mPaint);
    }
}
