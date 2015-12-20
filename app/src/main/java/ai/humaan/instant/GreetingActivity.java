package ai.humaan.instant;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.devspark.robototextview.util.RobotoTypefaceManager;
import com.devspark.robototextview.util.RobotoTypefaceUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class GreetingActivity extends AppCompatActivity {

    Handler handler;
    Typeface typefaceL;

    @InjectView(R.id.titleLine1)
    TextView mTitleLine1;
    @InjectView(R.id.titleLine2)
    TextView mTitleLine2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_greeting);
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
}
