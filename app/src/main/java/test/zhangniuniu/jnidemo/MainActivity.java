package test.zhangniuniu.jnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import static test.zhangniuniu.jnidemo.JniUtil.getStringFromNative;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getStringFromNative());

        int lenth = JniUtil.getLenthStrFromNative("我是张勇");
        Toast.makeText(this, "lenth:" + lenth, Toast.LENGTH_SHORT).show();
    }


}
