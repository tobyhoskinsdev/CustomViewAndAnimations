package examples.aaronhoskins.com.customviewandanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Circle myCircle;
    ExampleCompound exampleCompound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCircle = findViewById(R.id.cir);
        exampleCompound = findViewById(R.id.compound);
        exampleCompound.setCounter(500);
        exampleCompound.setCounterTwo(1);




    }
}
