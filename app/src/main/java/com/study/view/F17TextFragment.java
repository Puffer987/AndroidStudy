package com.study.view;

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
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a17_text, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String title = bundle.getString("title");
            System.out.println(title);

            TextView text = view.findViewById(R.id.i17_fragment_text);
            text.setText(title);
        }
        return view;
    }
}
