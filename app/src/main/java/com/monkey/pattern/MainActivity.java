package com.monkey.pattern;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.monkey.pattern.common.PatternPreference;
import com.monkey.pattern.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.sharePreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PatternPreference.putTestString(MainActivity.this, "test");
              mBinding.value.setText(PatternPreference.getTestString(MainActivity.this, "000"));
            }
        });
    }
}
