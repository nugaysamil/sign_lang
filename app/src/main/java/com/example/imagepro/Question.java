package com.example.imagepro;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Question extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        // Find the EditText by its ID
        EditText et_name = view.findViewById(R.id.et_name);

        // Find the Button by its ID and set an OnClickListener
        Button btn_start = view.findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the EditText is not null and if it is empty
                if (et_name != null && et_name.getText().toString().isEmpty()) {
                    // Display a Toast message if the EditText is empty
                    Toast.makeText(getActivity(), "Please enter your name", Toast.LENGTH_SHORT).show();
                } else {
                    // Create an Intent to start QuizQuestionActivity if the EditText is not empty
                    Intent intent = new Intent(getActivity(), QuizQuestionActivity.class);
                    startActivity(intent);
                }
            }
        });

        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        }
    }
}
