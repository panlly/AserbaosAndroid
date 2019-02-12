package com.aserbao.aserbaosandroid.aaSource.android.app.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aserbao.aserbaosandroid.base.BaseActivity;
import com.aserbao.aserbaosandroid.opengl.ClassBean;

public class ActivityClass extends BaseActivity {

    @Override
    public void initGetData() {
        mClassBeen.add(new ClassBean("BasicActivity",BasicActivity.class));
        mClassBeen.add(new ClassBean("BottomNavigationActivity",BottomNavigationActivity.class));
        mClassBeen.add(new ClassBean("FragmentViewModelActivity",FragmentViewModelActivity.class));
        mClassBeen.add(new ClassBean("FullscreenActivity",FullscreenActivity.class));
        mClassBeen.add(new ClassBean("LoginActivity",LoginActivity.class));
        mClassBeen.add(new ClassBean("Master/Detail flow",PersonListActivity.class));
    }
}
