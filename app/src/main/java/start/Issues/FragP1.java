package start.Issues;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import start.R;

/**
 * Created by user-- on 05-07-2017.
 */

public class FragP1 extends Fragment {

    TextView textView,textView1,t2,t3,t4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.normal , container, false);

//        textView = (TextView)v.findViewById(R.id.textView);
//        textView.setText(Html.fromHtml(getString(R.string.P1)));

        textView =(TextView)v.findViewById(R.id.textView);
        String text1="Destination: Tirumangalam or Madurai";
        textView.setText(Html.fromHtml(text1));

        //Redbus
        textView1 =(TextView)v.findViewById(R.id.textView1);
        textView1.setClickable(true);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        String text = "<b>Bus:</b> <a href='http://www.redbus.com'> Redbus </a>/<a href='http://www.abhibus.com'> Abhibus </a>";
        textView1.setText(Html.fromHtml(text));

        //Abhibus
        t2 =(TextView)v.findViewById(R.id.textView2);
        t2.setClickable(true);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        String text2 = "Swipe to nex tab to get more details after reaching the destination";
        t2.setText(Html.fromHtml(text2));

        //IRCTC
        t3 =(TextView)v.findViewById(R.id.textView3);
        t3.setClickable(true);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        String text3 = "<b>Rail:</b> <a href='http://www.irctc.com'> IRCTC </a><br>Station code <br> Madurai : MDU <br>or<br> Tirumangalam : TMQ";
        t3.setText(Html.fromHtml(text3));


        //SETC
        t4 =(TextView)v.findViewById(R.id.textView4);
        t4.setClickable(true);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        String text4 = "Swipe to nex tab to get more details after reaching the destination";
        t4.setText(Html.fromHtml(text4));
        return v;

    }

}
