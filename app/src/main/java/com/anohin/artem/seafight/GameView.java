package com.anohin.artem.seafight;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by Artem on 07.03.2016.
 */
public class GameView extends View {

    private Canvas mCanvas;
    private final int horizontal,vertical;
    private float canvasSize;
    private Bitmap mBitmap;
    private Paint paint, mBitmapPaint;


    public GameView(Context context, AttributeSet attrs) {
        super(context);
        horizontal =10;
        vertical =10;
        canvasSize = (int) convertDpToPixel(300,context);
        mBitmap = Bitmap.createBitmap((int) canvasSize, (int) canvasSize, Bitmap.Config.ARGB_4444);
        mCanvas = new Canvas(mBitmap);
        mBitmapPaint = new Paint(Paint.DITHER_FLAG);

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0xFF6786F5);
        paint.setStrokeWidth(3f);

        for(int x=0;x< horizontal +1;x++)
            mCanvas.drawLine((float)x* canvasSize / horizontal, 0, (float)x* canvasSize / horizontal, canvasSize, paint);
        for (int y = 0; y < vertical+1; y++) {
            mCanvas.drawLine(0, (float) y * canvasSize / vertical, canvasSize, (float) y * canvasSize / vertical, paint);
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mBitmap, 0, 0, paint);
        canvas.drawARGB(80, 102, 204, 255);
        paint.setColor(0xFF6786F5);
        paint.setStyle(Paint.Style.FILL);

    }
    public float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * (metrics.densityDpi / 160f);
    }
}

