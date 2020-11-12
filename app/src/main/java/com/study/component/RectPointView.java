package com.study.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @program: AndroidStudy
 * @description: 手指在矩形内矩形变色
 * @author: Adolf
 * @create: 2020-07-07 19:43
 **/
public class RectPointView extends View {

    private Paint mPaint;
    private Rect mRect;
    private int mX;
    private int mY;

    public RectPointView(Context context) {
        this(context, null);
    }

    public RectPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RectPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mRect = new Rect(100, 10, 500, 300);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mX = (int) event.getX();
        mY = (int) event.getY();
        Log.i("TAG", mX+","+mY);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            invalidate(); // 确定是在主线程时才可以使用
            // 触摸事件后，有移动和抬起事件，返回true时表示之后的事件继续传过来。
            return true; // 为false后只有在下次点击别的位置才会恢复颜色
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            mX = -1;
            mY = -1;
        }
        postInvalidate(); // 在任意线程都行
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mRect.contains(mX,mY)){
            mPaint.setColor(Color.RED);
        }else{
            mPaint.setColor(Color.GREEN);
        }
        canvas.drawRect(mRect, mPaint);
    }
}
