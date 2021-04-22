package sg.edu.rp.c346.id19004781.lesson1problemstatement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    HolidaysAdapter aa;
    ArrayList<Holidays> holidays;
    TextView tvHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);

        ListView lv = this.findViewById(R.id.lvsecond);
        TextView tvHoliday = this.findViewById(R.id.tvHolidayTypes);

        Intent intent = getIntent();
        String message = intent.getStringExtra("holiday");
        tvHoliday.setText(message);

        // Create a few food objects in Food array
        holidays = new ArrayList<Holidays>();
        holidays.add(new Holidays("New Year's Day", "1 Jan 2017", true));
        holidays.add(new Holidays("Labour Day", "1 May 2017", false));


        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidaysAdapter(this, R.layout.row, holidays);
        lv.setAdapter(aa);

    }
}
