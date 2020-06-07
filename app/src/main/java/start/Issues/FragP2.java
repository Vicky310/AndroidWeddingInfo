package start.Issues;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import start.R;


public class FragP2 extends Fragment {
    TextView textView,textView1,t2,t3,t4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.normal , container, false);

//        textView = (TextView)v.findViewById(R.id.textView);
//        textView.setText(Html.fromHtml(getString(R.string.P1)));
        //Railwaystation
        textView =(TextView)v.findViewById(R.id.textView);
        textView.setText(Html.fromHtml(getString(R.string.p2_text1)));

        //Maatuthavani
        textView1 =(TextView)v.findViewById(R.id.textView1);
        textView1.setText(Html.fromHtml(getString(R.string.p2_text)));

        //Periyar
        t2 =(TextView)v.findViewById(R.id.textView2);
        t2.setText(Html.fromHtml(getString(R.string.p2_text2)));

        //Arapalayam
        t3 =(TextView)v.findViewById(R.id.textView3);
        t3.setText(Html.fromHtml(getString(R.string.p2_text3)));


        //SETC
        t4 =(TextView)v.findViewById(R.id.textView4);
        t4.setText(Html.fromHtml(getString(R.string.p2_text4)));
        return v;

    }


}
