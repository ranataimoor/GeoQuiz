package com.example.geoquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button
import android.widget.Toast;:

public class MainActivity<override> extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
    }
}

public static Toast makeText(Context context, int resId, int duration)

    @override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super. onSaveInstanceState(savedInstanceState);
        int mCurrentIndex;
        savedInstanceState.putInt("index", mCurrentIndex);

        if(savedInstanceState !=null) {
            mCurrentIndex = savedInstanceState.getInt("index", 0)
        }
    }
