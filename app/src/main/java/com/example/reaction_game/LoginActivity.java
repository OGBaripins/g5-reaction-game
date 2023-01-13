package com.example.reaction_game;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    protected void onCreate(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        final View rootView = inflater.inflate(R.layout.activity_login, container, false);

        ImageView back = ((ImageView) rootView.findViewById(R.id.back_btn));
        back.setOnClickListener(v -> {
            Intent myIntent = new Intent(this, EntryActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(myIntent);
        });
    }
}