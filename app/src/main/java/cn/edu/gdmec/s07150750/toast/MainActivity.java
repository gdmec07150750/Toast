package cn.edu.gdmec.s07150750.toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void b1(View v) {
            Toast.makeText(this, "哈哈，我会了", Toast.LENGTH_LONG).show();
        }

        public void b2(View v) {
            LayoutInflater lf=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View vroot=lf.inflate(R.layout.toastroot,null);
            LinearLayout ll = (LinearLayout) vroot.findViewById(R.id.clayout);
            Toast toast=new Toast(this);
            toast.setView(vroot);
            toast.show();
        }
        public void b3(View v) {
            Toast toast = Toast.makeText(this, "我是小黄人-图文显示", Toast.LENGTH_LONG);
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);
            ImageView mImage = new ImageView(this);
            mImage.setImageResource(R.drawable.yellowman);
            View toastView = toast.getView();
            ll.addView(mImage);
            ll.addView(toastView);
            toast.setView(ll);
            toast.show();
        }
}
