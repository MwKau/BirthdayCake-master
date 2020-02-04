package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView view = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(view);

        Button button_blowout = findViewById(R.id.button_blowout);
        button_blowout.setOnClickListener(controller);

        Switch switch_candles = findViewById(R.id.switch_candles);
        switch_candles.setOnCheckedChangeListener(controller);

        SeekBar seekBar_candles = findViewById(R.id.seekBar);
        seekBar_candles.setOnSeekBarChangeListener(controller);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
