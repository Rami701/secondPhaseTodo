package com.example.second_phase_todo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class FormDialogFragment extends DialogFragment {
    private Button btnSubmit, btnCancel;
    private EditText etTitle, etDetails;
    private DatePicker datePicker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.todo_form, container, false);
        btnSubmit = view.findViewById(R.id.btnSubmit);
        btnCancel = view.findViewById(R.id.btnCancel);
        etTitle = view.findViewById(R.id.etTitle);
        etDetails = view.findViewById(R.id.etDetails);
        datePicker = view.findViewById(R.id.datePicker);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                String title = etTitle.getText().toString();
                String details = etDetails.getText().toString();

                if (validate(title, details)){
                    activity.addTodo(title, details, getDate());
                    dismiss();
                }else{
                    Toast.makeText(activity, "Title and Details can not be empty", Toast.LENGTH_SHORT).show();
                }

                
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }

    private String getDate(){

        String year = String.valueOf(datePicker.getYear());
        String month = String.valueOf(datePicker.getMonth() + 1);
        String day = String.valueOf(datePicker.getDayOfMonth());

        return "Due Date: " + year + " / " + month + " / " + day;
    }

    private boolean validate(String title, String details){
        if(title.equals("") || details.equals("")){
            return false;
        }
        return true;
    }

}
