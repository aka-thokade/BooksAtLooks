package com.example.akankshathokade.booksatlooks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;


public class NewChatDialog extends DialogFragment{

    private static final String TAG = "NewNoteDialog";

    //widgets
    private EditText mEmail;
    private RelativeLayout mSend;

    //vars


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int style = DialogFragment.STYLE_NORMAL;
        int theme = android.R.style.Theme_Holo_Light_Dialog;
        setStyle(style, theme);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_new_chat_dialog, container, false);

        mEmail = view.findViewById(R.id.email);
        mSend = view.findViewById(R.id.send);
        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // insert the new note

                String email = mEmail.getText().toString();


                if(!email.equals("")){
                    ((MainActivity)getActivity()).createNewChatRoom(email);
                    Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();
                    getDialog().dismiss();
                }
                else{
                    Toast.makeText(getActivity(), "Enter a title", Toast.LENGTH_SHORT).show();
                }

            }
        });
        getDialog().setTitle("New Chat");

        return view;
    }



}
