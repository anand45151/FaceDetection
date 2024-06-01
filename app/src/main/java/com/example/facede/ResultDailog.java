package com.example.facede;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDailog extends DialogFragment {
    Button btn;
    TextView textView;
    private String detectionResult;
    public ResultDailog(String string) {
        this.detectionResult = detectionResult;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_resource, container, false);
        String text = " ";
        btn = view.findViewById(R.id.button);
        textView = view.findViewById(R.id.textView);
        Bundle bundle = getArguments();
        text = bundle.getString(String.valueOf(bundle));
        textView.setText(text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return  view;
    }
}
