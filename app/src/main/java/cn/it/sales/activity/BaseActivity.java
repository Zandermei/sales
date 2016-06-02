package cn.it.sales.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.it.sales.application.MyApplication;

/**
 * Created by Administrator on 2016/6/1.
 */
public class BaseActivity extends AppCompatActivity{
    //我添加了一行注释
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getMyApplication().addActivity(this);
    }

    @Override
    public void finish() {
        MyApplication.getMyApplication().removeActivity(this);
        super.finish();
    }
}
