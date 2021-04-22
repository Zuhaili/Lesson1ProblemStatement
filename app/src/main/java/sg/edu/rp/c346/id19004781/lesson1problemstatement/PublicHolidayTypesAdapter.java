package sg.edu.rp.c346.id19004781.lesson1problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PublicHolidayTypesAdapter  extends ArrayAdapter<PublicHolidayTypes>{

    private ArrayList<PublicHolidayTypes> aa;
    private Context context;
    private TextView textView;

    public PublicHolidayTypesAdapter(@NonNull Context context, int resource, ArrayList<PublicHolidayTypes> aa) {
        super(context, resource, aa);
        this.aa = aa;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.publicholidays_row, parent, false);

        PublicHolidayTypes currentHolidayType = aa.get(position);

        textView = rowView.findViewById(R.id.tvHolidayTypes);
        textView.setText(currentHolidayType.getHolidaytypes());

        return rowView;
    }
}
