package sg.edu.rp.c346.id19004781.lesson1problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidaysAdapter extends ArrayAdapter<Holidays> {
    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvnewyear, tvlabourday;
    private ImageView ivnewyear, ivlabourday;

    public HolidaysAdapter(Context context, int resource, ArrayList<Holidays> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvnewyear = (TextView) rowView.findViewById(R.id.tvnewyear);
        tvlabourday = (TextView) rowView.findViewById(R.id.tvlabourday);
        // Get the ImageView object
        ivnewyear = (ImageView) rowView.findViewById(R.id.ivnewyear);
        ivlabourday = (ImageView) rowView.findViewById(R.id.ivlabourday);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holidays currentHoliday = holidays.get(position);
        // Set the TextView to show the food

        tvnewyear.setText(currentHoliday.getTitle());
        // Set the image to star or nostar accordingly
        if(currentHoliday.isImage()) {
            ivnewyear.setImageResource(R.drawable.newyear);
        }
        else {
            ivlabourday.setImageResource(R.drawable.labourday);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
