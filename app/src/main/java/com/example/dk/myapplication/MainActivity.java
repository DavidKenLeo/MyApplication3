package com.example.dk.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button bn;
    private Button bp;
    private  int ary[] = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4};
    int i=0;
    private ImageView jpg;
    private String drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn = (Button)findViewById(R.id.bn);
        bn.setOnClickListener(new BtnOnClickListener());
        bp = (Button)findViewById(R.id.bp);
        bp.setOnClickListener(new BtnOnClickListener());
        jpg = (ImageView)findViewById(R.id.jpg);


    }

    private class BtnOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch(v.getId()) {

                case R.id.bp:
                    jpg.(String drawable);
                    drawable(ary[i]);
                    i++;


                    break;
                case R.id.bn:
            ary[i];
            i--;
                    break;
            }
    }
}
