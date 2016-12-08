package com.giou.utilstest.activity;

import android.util.Log;

import com.giou.utilstest.R;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/8
 * Email:65489469@qq.com
 */
public class LauncherActivity extends BaseActivity {
    @Override
    public int getLayoutRes() {
        return R.layout.activity_launcher;
    }

    @Override
    protected void initView() {
        Log.d("LauncherActivity","我进来了哦");
    }
}
