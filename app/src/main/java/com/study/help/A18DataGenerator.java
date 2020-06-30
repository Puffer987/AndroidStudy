package com.study.help;

import androidx.fragment.app.Fragment;

import com.study.fragment.F18Item;

public class A18DataGenerator {
    // public static final int []mTabRes = new int[]{R.drawable.sym_btn_selector,R.drawable.sym_btn_selector,R.drawable.sym_btn_selector,R.drawable.sym_btn_selector};
    // public static final int []mTabResPressed = new int[]{R.drawable.sym_btn_selector,R.drawable.sym_btn_selector,R.drawable.sym_btn_selector, R.drawable.sym_btn_selector};
    public static final String []mTabTitle = new String[]{"首页","发现","关注","我的"};

    public static Fragment[] getFragments(String[] from){
        Fragment fragments[] = new Fragment[4];
        for (int i = 0; i < fragments.length; i++) {
            fragments[i] = F18Item.newInstance(from[i],null);
        }
        return fragments;
    }

    /**
     * 获取Tab 显示的内容
     * @param context
     * @param position
     * @return
     */
    // public static View getTabView(Context context, int position){
    //     View view = LayoutInflater.from(context).inflate(R.layout.home_tab_content,null);
    //     ImageView tabIcon = (ImageView) view.findViewById(R.id.tab_content_image);
    //     tabIcon.setImageResource(A18DataGenerator.mTabRes[position]);
    //     TextView tabText = (TextView) view.findViewById(R.id.tab_content_text);
    //     tabText.setText(mTabTitle[position]);
    //     return view;
    // }
}
