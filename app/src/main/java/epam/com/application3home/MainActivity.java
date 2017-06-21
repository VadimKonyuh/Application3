package epam.com.application3home;

import android.content.res.ColorStateList;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.Objects;

import static android.R.attr.button;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity implements  OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String LOG_TAG = "MyActivity";
    int x;

    Button button1 = (Button)findViewById(R.id.button1);
    Button button2 = (Button)findViewById(R.id.button2);
    Button button3 = (Button)findViewById(R.id.button3);




    @Override
        public void onClick(View view)
    {

        x = (int) (4*Math.random());
        if (x == 0) {
            view.setBackgroundColor(Color.GREEN);
        }
        if (x == 1) {
            view.setBackgroundColor( Color.YELLOW);
        }
        if (x == 2) {
            view.setBackgroundColor(Color.RED);
        }
        if (x == 3) {
            view.setBackgroundColor(Color.BLUE);}

    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }

    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume ");
    }

        protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);



        Log.d(LOG_TAG, "onSaveInstanceState");
    }

    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

}
