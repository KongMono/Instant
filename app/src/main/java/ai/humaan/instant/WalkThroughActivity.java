package ai.humaan.instant;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.devspark.robototextview.util.RobotoTypefaceManager;
import com.devspark.robototextview.util.RobotoTypefaceUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class WalkThroughActivity extends AppCompatActivity {

    Handler handler;
    Typeface typefaceL;

    @InjectView(R.id.titleLine1)
    TextView mTitleLine1;
    @InjectView(R.id.titleLine2)
    TextView mTitleLine2;
    @InjectView(R.id.mButton)
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_walkthrough);
        ButterKnife.inject(this);

        init();
    }

    private void init() {
        handler = new Handler();

        typefaceL = RobotoTypefaceManager.
                obtainTypeface(getApplicationContext(), RobotoTypefaceManager.Typeface.ROBOTO_LIGHT);

        RobotoTypefaceUtils.setup(mTitleLine1, typefaceL);
        RobotoTypefaceUtils.setup(mTitleLine2, typefaceL);

    }

    @OnClick(R.id.mButton)
    public void PressBtn() {
        Intent intent = new Intent(getApplicationContext(),GreetingActivity.class);
        startActivity(intent);
    }

}
