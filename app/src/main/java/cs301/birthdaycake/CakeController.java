package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    // Var
    private CakeView view;
    private CakeModel model;

    // Constructor
    public CakeController(CakeView newView) {
        view = newView;
        model = view.getModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("button","onClick");
        model.candlesLit = false;
        this.view.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton view, boolean isChecked) {
        model.cakeCandles = isChecked;
        this.view.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar view, int progress, boolean fromUser) {
        model.candlesNum = progress;
        this.view.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
