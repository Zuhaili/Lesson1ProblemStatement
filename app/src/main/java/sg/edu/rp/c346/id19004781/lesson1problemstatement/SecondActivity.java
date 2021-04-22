package sg.edu.rp.c346.id19004781.lesson1problemstatement;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    HolidaysAdapter aa;
    ArrayList<Holidays> holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvHolidays);

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
