package com.study.help;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @program: AndroidStudy
 * @description:
 * @author: Adolf
 * @create: 2020-07-18 14:13
 **/
public class A24ItemDecoration extends RecyclerView.ItemDecoration {
    // 作为背景，在内容的下方
    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
        int childCount = parent.getChildCount();
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        for (int i = 0; i < childCount - 1; i++) {
            View view = parent.getChildAt(i);
            float top = view.getBottom();// 从item的底部开始画
            float bottom = view.getBottom() + 10;
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            Log.d("TAG", "left" + left + " right" + right + " top" + top + " bottom" + bottom);
            c.drawRect(left, top, right, bottom, paint);
        }
    }

    // 覆盖在内容上
    @Override
    public void onDrawOver(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDrawOver(c, parent, state);

        for (int i = 0; i < parent.getChildCount(); i++) {
            View child = parent.getChildAt(i);
            int pos = parent.getChildAdapterPosition(child);
            float top = child.getTop() + 10;
            float bottom = child.getBottom() - 10;
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            c.drawRect(300+50*i, top, 500+50*i, bottom, paint);
        }
    }

    // 在内容的四周，padding
    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(20, 5, 20, 20);
    }
}
