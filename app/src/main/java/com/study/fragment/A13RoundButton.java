package com.study.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.study.R;

public class A13RoundButton extends View implements View.OnClickListener {

    private Paint mPaint;
    private Rect mRect;
    private int mCount = 0;
    private int mColor;
    private int mStep;
    private String mText="0";

    public A13RoundButton(Context context) {
        this(context, null);
    }

    public A13RoundButton(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public A13RoundButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // 加载属性列表
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.RoundButton);
        // 接收布局中设置的属性值，提供了默认值
        mColor = a.getColor(R.styleable.RoundButton_btn_color, Color.RED);
        mStep = a.getInt(R.styleable.RoundButton_add_step,1);
        // 回收
        a.recycle();
        init();
    }

//    public A13DiyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    public void init() {
        // 不要在onDraw中new对象，onDraw会不停运行，重复new对象影响性能
        mPaint = new Paint();
        mRect = new Rect();
        setOnClickListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(mColor);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() < getHeight() ? getWidth() / 2 : getHeight() / 2, mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(getWidth() < getHeight() ? getWidth() / 4 : getHeight() / 4);


        mPaint.getTextBounds(mText, 0, mText.length(), mRect);
//        mPaint.setTextAlign(Paint.Align.CENTER);
        int textWidth = mRect.width();
        int textHeight = mRect.height();
        canvas.drawText(mText, getWidth() / 2 - textWidth / 2, getHeight() / 2 + textHeight / 2, mPaint);

    }

    @Override
    public void onClick(View v) {
        if (mCount>=10){
            mColor = Color.parseColor("#8BC34A");
            mText = "完成任务";

        }else {
            mText = mCount + "";
            mCount += mStep;
        }
        invalidate();
    }
}
