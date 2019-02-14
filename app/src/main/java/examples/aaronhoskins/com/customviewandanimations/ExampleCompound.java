package examples.aaronhoskins.com.customviewandanimations;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExampleCompound extends LinearLayout {
    TextView tvCounter;
    TextView tvCounterTwo;

    public ExampleCompound(Context context) {
        this(context, null);
    }

    public ExampleCompound(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExampleCompound(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ExampleCompound(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        inflate(getContext(), R.layout.coumpound_example, this);
        tvCounter = findViewById(R.id.tvCounter);
        tvCounterTwo = findViewById(R.id.tvCounter2);

    }

    public void setCounter(int i) {
        tvCounter.setText(String.valueOf(i));
    }

    public void setCounterTwo(int i) {
        tvCounterTwo.setText(String.valueOf(i));
    }
}
