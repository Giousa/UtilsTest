package com.giou.utilstest;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.giou.utilstest.activity.AppActivity;
import com.giou.utilstest.activity.BaseActivity;
import com.giou.utilstest.activity.DeviceActivity;
import com.giou.utilstest.activity.LauncherActivity;

import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @InjectView(R.id.btn_activity)
    Button mBtnActivity;
    @InjectView(R.id.btn_bar)
    Button mBtnBar;
    @InjectView(R.id.btn_clean)
    Button mBtnClean;
    @InjectView(R.id.btn_clipboard)
    Button mBtnClipboard;
    @InjectView(R.id.btn_close)
    Button mBtnClose;
    @InjectView(R.id.btn_const)
    Button mBtnConst;
    @InjectView(R.id.btn_convert)
    Button mBtnConvert;
    @InjectView(R.id.btn_crash)
    Button mBtnCrash;
    @InjectView(R.id.btn_device)
    Button mBtnDevice;
    @InjectView(R.id.btn_empty)
    Button mBtnEmpty;
    @InjectView(R.id.btn_encode)
    Button mBtnEncode;
    @InjectView(R.id.btn_encrypt)
    Button mBtnEncrypt;
    @InjectView(R.id.btn_file)
    Button mBtnFile;
    @InjectView(R.id.btn_handler)
    Button mBtnHandler;
    @InjectView(R.id.btn_image)
    Button mBtnImage;
    @InjectView(R.id.btn_intent)
    Button mBtnIntent;
    @InjectView(R.id.btn_keyboard)
    Button mBtnKeyboard;
    @InjectView(R.id.btn_location)
    Button mBtnLocation;
    @InjectView(R.id.btn_log)
    Button mBtnLog;
    @InjectView(R.id.btn_network)
    Button mBtnNetwork;
    @InjectView(R.id.btn_phone)
    Button mBtnPhone;
    @InjectView(R.id.btn_pinyin)
    Button mBtnPinyin;
    @InjectView(R.id.btn_process)
    Button mBtnProcess;
    @InjectView(R.id.btn_regex)
    Button mBtnRegex;
    @InjectView(R.id.btn_screen)
    Button mBtnScreen;
    @InjectView(R.id.btn_sd)
    Button mBtnSd;
    @InjectView(R.id.btn_service)
    Button mBtnService;
    @InjectView(R.id.btn_shell)
    Button mBtnShell;
    @InjectView(R.id.btn_size)
    Button mBtnSize;
    @InjectView(R.id.btn_snackbar)
    Button mBtnSnackbar;
    @InjectView(R.id.btn_sp)
    Button mBtnSp;
    @InjectView(R.id.btn_string)
    Button mBtnString;
    @InjectView(R.id.btn_thread)
    Button mBtnThread;
    @InjectView(R.id.btn_time)
    Button mBtnTime;
    @InjectView(R.id.btn_toast)
    Button mBtnToast;
    @InjectView(R.id.btn_zip)
    Button mBtnZip;


    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @OnClick({R.id.btn_activity, R.id.btn_bar, R.id.btn_clean, R.id.btn_clipboard, R.id.btn_close
            , R.id.btn_const, R.id.btn_convert, R.id.btn_crash, R.id.btn_device, R.id.btn_empty
            , R.id.btn_encode, R.id.btn_encrypt, R.id.btn_file, R.id.btn_handler, R.id.btn_image
            , R.id.btn_intent, R.id.btn_keyboard, R.id.btn_location, R.id.btn_log, R.id.btn_network
            , R.id.btn_phone, R.id.btn_pinyin, R.id.btn_process, R.id.btn_regex, R.id.btn_screen
            , R.id.btn_sd, R.id.btn_service, R.id.btn_shell, R.id.btn_size, R.id.btn_snackbar
            , R.id.btn_sp, R.id.btn_string, R.id.btn_thread, R.id.btn_time, R.id.btn_toast
            , R.id.btn_zip})

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_activity:
                Log.d(TAG,"LauncherActivity");
                startActivity(LauncherActivity.class);
                break;
            case R.id.btn_bar:
                Log.d(TAG,"AppActivity");
                startActivity(AppActivity.class);
                break;
            case R.id.btn_clean:
                break;
            case R.id.btn_clipboard:
                break;
            case R.id.btn_close:
                break;
            case R.id.btn_const:
                break;
            case R.id.btn_convert:
                break;
            case R.id.btn_crash:
                break;
            case R.id.btn_device:
                Log.d(TAG,"DeviceActivity");
                startActivity(DeviceActivity.class);
                break;
            case R.id.btn_empty:
                break;
            case R.id.btn_encode:
                break;
            case R.id.btn_encrypt:
                break;
            case R.id.btn_file:
                break;
            case R.id.btn_handler:
                break;
            case R.id.btn_image:
                break;
            case R.id.btn_intent:
                break;
            case R.id.btn_keyboard:
                break;
            case R.id.btn_location:
                break;
            case R.id.btn_log:
                break;
            case R.id.btn_network:
                break;
            case R.id.btn_phone:
                break;
            case R.id.btn_pinyin:
                break;
            case R.id.btn_process:
                break;
            case R.id.btn_regex:
                break;
            case R.id.btn_screen:
                break;
            case R.id.btn_sd:
                break;
            case R.id.btn_service:
                break;
            case R.id.btn_shell:
                break;
            case R.id.btn_size:
                break;
            case R.id.btn_snackbar:
                break;
            case R.id.btn_sp:
                break;
            case R.id.btn_string:
                break;
            case R.id.btn_thread:
                break;
            case R.id.btn_time:
                break;
            case R.id.btn_toast:
                break;
            case R.id.btn_zip:
                break;
        }
    }
}
