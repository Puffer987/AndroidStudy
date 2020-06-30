package com.study.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.study.R;

public class F17TextFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a17_text, container, false);

        Bundle bundle = getArguments();
        TextView text = view.findViewById(R.id.i17_fragment_text);
        if (bundle != null) {
            text.setText(bundle.getString("title"));
        }
        if (mParam1 != null){
            text.setText(mParam1);
        }
        return view;
    }

    public static F17TextFragment newInstance(String param1) {
        F17TextFragment fragment = new F17TextFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }
}
