package tbc.dma.hellotoast2homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mResetButton, mCountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.showCount);
        mCountButton = (Button) findViewById(R.id.countbutton);
        mResetButton = (Button) findViewById(R.id.button_reset);
        mCountButton.setBackgroundColor(Color.BLACK);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(MainActivity.this, R.string.toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void counter(View view) {
        mCount++;

        view.setBackgroundColor(mCount % 2 == 0 ? Color.DKGRAY : Color.BLUE);

        if (mCount > 0) {
            mResetButton.setBackgroundColor(Color.CYAN);
            mResetButton.setTextColor(Color.BLACK);
        }

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void reset(View view) {
        mCount = 0;
        mResetButton.setBackgroundColor(Color.LTGRAY);
        mCountButton.setBackgroundColor(Color.BLACK);

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}