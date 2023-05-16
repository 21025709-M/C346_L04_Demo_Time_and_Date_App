package sg.edu.rp.c346.id21025709.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker) ;
        btnDisplayDate = findViewById(R.id.buttonDisplay_Date);
        btnDisplayTime = findViewById(R.id.buttonDisplay_Time);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.reset);

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int day = dp.getDayOfMonth();
                int month = dp.getMonth() + 1;
                int year = dp.getYear();

                tvDisplay.setText("Date is " + day + "/" + month + "/" + year);

            }
        });

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = "Time is " + tp.getHour() + ":" + tp.getMinute();
                tvDisplay.setText(time);

            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setHour(0);
                tp.setMinute(0);
                dp.updateDate(2020, 0, 1);
                tvDisplay.setText("");
            }
        });
    }
}