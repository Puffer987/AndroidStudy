package com.study.help;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.study.R;

/**
 * @program: AndroidStudy
 * @description:
 * @author: Adolf
 * @create: 2020-07-18 15:18
 **/
public class A24ItemDecorationGroup extends RecyclerView.ItemDecoration {

    private static final String TAG = "SectionDecoration";

    private DecorationCallback callback;
    private TextPaint textPaint;
    private Paint paint;
    private int topGap;
    private Paint.FontMetrics fontMetrics;


    public A24ItemDecorationGroup(Context context, DecorationCallback decorationCallback) {
        Resources res = context.getResources();
        this.callback = decorationCallback;

        paint = new Paint();
        paint.setColor(res.getColor(R.color.colorAccent));

        textPaint = new TextPaint();
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(80);
        textPaint.setColor(Color.BLACK);
        textPaint.getFontMetrics(fontMetrics);
        textPaint.setTextAlign(Paint.Align.LEFT);
        fontMetrics = new Paint.FontMetrics();
        topGap = 80;
    }


    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int pos = parent.getChildAdapterPosition(view);
        Log.i(TAG, "getItemOffsets：" + pos);
        long groupId = callback.getGroupId(pos);
        if (groupId < 0) return;
        if (pos == 0 || isFirstInGroup(pos)) {
            outRect.top = topGap;
        } else {
            outRect.top = 0;
        }
    }
    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        int itemCount = state.getItemCount();
        int childCount = parent.getChildCount();
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();
        long preGroupId, groupId = -1;
        for (int i = 0; i < childCount; i++) {
            View view = parent.getChildAt(i);
            int position = parent.getChildAdapterPosition(view);

            preGroupId = groupId;
            groupId = callback.getGroupId(position);
            if (groupId < 0 || groupId == preGroupId) continue;

            String textLine = callback.getGroupFirstLine(position).toUpperCase();
            if (TextUtils.isEmpty(textLine)) continue;

            int viewBottom = view.getBottom();
            float textY = Math.max(topGap, view.getTop());
            if (position + 1 < itemCount) {
                long nextGroupId = callback.getGroupId(position + 1);
                if (nextGroupId != groupId && viewBottom < textY ) {
                    textY = viewBottom;
                }
            }
            c.drawRect(left, textY - topGap, right, textY, paint);
            c.drawText(textLine, left, textY, textPaint);
        }

    }

    //粘性头部不需要这个
    // @Override
    // public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
    //     super.onDraw(c, parent, state);
    //     int left = parent.getPaddingLeft();
    //     int right = parent.getWidth() - parent.getPaddingRight();
    //     int childCount = parent.getChildCount();
    //     paint.setColor(Color.BLUE);
    //     for (int i = 0; i < childCount; i++) {
    //         View view = parent.getChildAt(i);
    //         int position = parent.getChildAdapterPosition(view);
    //         long groupId = callback.getGroupId(position);
    //         if (groupId < 0) return;
    //         String textLine = callback.getGroupFirstLine(position).toUpperCase();
    //         if (position == 0 || isFirstInGroup(position)) {
    //             float top = view.getTop() - topGap;
    //             float bottom = view.getTop();
    //             c.drawRect(left, top, right, bottom, paint);
    //             c.drawText(textLine, left, bottom, textPaint);
    //         }
    //     }
    // }


    private boolean isFirstInGroup(int pos) {
        if (pos == 0) {
            return true;
        } else {
            long prevGroupId = callback.getGroupId(pos - 1);
            long groupId = callback.getGroupId(pos);
            return prevGroupId != groupId;
        }
    }

    public interface DecorationCallback {

        long getGroupId(int position);

        String getGroupFirstLine(int position);
    }
}
