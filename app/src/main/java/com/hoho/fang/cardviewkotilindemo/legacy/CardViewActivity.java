package com.hoho.fang.cardviewkotilindemo.legacy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.hoho.fang.cardviewkotilindemo.R;

public class CardViewActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        init();



        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new CardViewFragment()).addToBackStack(null).commit();
    }

    private void init() {
        //Bind ID inside init method
        textView1 = findViewById(R.id.tv_1);
        textView2 = findViewById(R.id.tv_2);
        textView3 = findViewById(R.id.tv_3);
    }
}
