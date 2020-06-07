package start.AboutUs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import java.util.Calendar;

import start.R;

public class FragP2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.p2, container, false);

        CalendarView calendarView = (CalendarView) view.findViewById(R.id.calendarViewT);


        Calendar febFirst=Calendar.getInstance();

        febFirst.set(2017, 10, 22, 0, 0, 0);

        calendarView.setDate(febFirst.getTimeInMillis());

        return view;
    }

}
