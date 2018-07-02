package com.example.android.displayjokelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA = "Joke_Extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView jokeTextView = findViewById(R.id.joke_text_view);
        String joke = getIntent().getStringExtra(JOKE_EXTRA);
        jokeTextView.setText(joke);
    }
}
