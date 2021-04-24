package com.google.codelabs.mdc.java.shrine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Fragment representing the login screen for Shrine.
 */
public class LoginFragment extends Fragment  {
    public static String str="SKm";
    public static String str1="SKm";
    public static String text="SKm";
    public static String text1="SKm";
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.shr_login_fragment, container, false);
        final EditText down_text = (EditText) view.findViewById(R.id.word_text_input);
        final EditText user_text = (EditText) view.findViewById(R.id.name_text_input);
        final Spinner mySpinner = (Spinner) view.findViewById(R.id.spinner1);
        final Spinner mySpinner1 = (Spinner) view.findViewById(R.id.spinner);
        MaterialButton nextButton = view.findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(LoginFragment.this.getActivity(), Activity2.class);
                LoginFragment.str = user_text.getText().toString();
                LoginFragment.str1 = down_text.getText().toString();
                LoginFragment.text1 = mySpinner1.getSelectedItem().toString();
                LoginFragment.text = mySpinner.getSelectedItem().toString();
                startActivity(i);

            }
        });

        // Clear the error once more than 8 characters are typed.

        return view;
    }



    /*
        In reality, this will have more complex logic including, but not limited to, actual
        authentication of the username and password.
     */
    private boolean isPasswordValid(@Nullable Editable text) {
        return text != null;
    }
}
