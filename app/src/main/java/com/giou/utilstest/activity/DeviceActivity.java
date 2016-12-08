package com.giou.utilstest.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.giou.utilstest.R;
import com.giou.utilstest.utils.DeviceUtils;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/8
 * Email:65489469@qq.com
 */
public class DeviceActivity extends BaseActivity {

    private final String TAG = DeviceActivity.class.getSimpleName();

    @InjectView(R.id.btn_root)
    Button mBtnRoot;
    @InjectView(R.id.btn_version)
    Button mBtnVersion;
    @InjectView(R.id.btn_id)
    Button mBtnId;
    @InjectView(R.id.btn_address)
    Button mBtnAddress;
    @InjectView(R.id.btn_facturer)
    Button mBtnFacturer;
    @InjectView(R.id.btn_model)
    Button mBtnModel;
    @InjectView(R.id.btn_shutdown)
    Button mBtnShutdown;
    @InjectView(R.id.btn_reboot)
    Button mBtnReboot;
    @InjectView(R.id.btn_recovery)
    Button mBtnRecovery;
    @InjectView(R.id.btn_bootloader)
    Button mBtnBootloader;

    @Override
    public int getLayoutRes() {
        return R.layout.activity_device;
    }

    @Override
    protected void initView() {

    }

    @OnClick({R.id.btn_root, R.id.btn_version, R.id.btn_id, R.id.btn_address, R.id.btn_facturer
            , R.id.btn_model, R.id.btn_shutdown, R.id.btn_reboot, R.id.btn_recovery, R.id.btn_bootloader})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_root:
                boolean deviceRoot = DeviceUtils.isDeviceRoot();
                if(deviceRoot){
                    Log.d(TAG,"设备已经root");
                }else{
                    Log.d(TAG,"设备没有root");
                }
                break;
            case R.id.btn_version:
                int sdkVersion = DeviceUtils.getSDKVersion();
                Log.d(TAG,"设备系统版本号="+sdkVersion);
                break;
            case R.id.btn_id:
                String androidID = DeviceUtils.getAndroidID(this);
                Log.d(TAG,"设备AndroidID="+androidID);
                break;
            case R.id.btn_address:
                String macAddress = DeviceUtils.getMacAddress(this);
                Log.d(TAG,"设备MAC地址="+macAddress);
                break;
            case R.id.btn_facturer:
                String manufacturer = DeviceUtils.getManufacturer();
                Log.d(TAG,"设备厂商="+manufacturer);
                break;
            case R.id.btn_model:
                String model = DeviceUtils.getModel();
                Log.d(TAG,"设备型号="+model);
                break;
            case R.id.btn_shutdown:
//                DeviceUtils.shutdown();
                break;
            case R.id.btn_reboot:
//                DeviceUtils.reboot();
                break;
            case R.id.btn_recovery:
//                DeviceUtils.reboot2Recovery();
                break;
            case R.id.btn_bootloader:
//                DeviceUtils.reboot2Bootloader();
                break;
        }
    }
}
