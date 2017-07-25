package com.baichang.worddemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        String str = "满城尽带黄金甲18510560088";

        tv.setText(SelectPhoneUtil.StringFilter(str));
        String ssss = SelectPhoneUtil.StringFilter(str);


        tv3.setText(KeywordUtil.matcherSearchTitle(Color.RED, str, ssss));


    }
}
