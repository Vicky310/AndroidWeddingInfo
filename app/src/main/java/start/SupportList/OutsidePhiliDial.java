package start.SupportList;

/**
 * Created by user-- on 19-07-2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import start.R;

//Our class extending fragment
public class OutsidePhiliDial extends Fragment {

   TextView textView,textView1,textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         View v=inflater.inflate(R.layout.outside, container, false);
//
//        textView = (TextView)v.findViewById(R.id.textView);
//        textView.setText(Html.fromHtml(getString(R.string.daip)));
//
//        textView1 = (TextView)v.findViewById(R.id.textView1);
//        textView1.setText(Html.fromHtml(getString(R.string.darch)));
//
//        textView2 = (TextView)v.findViewById(R.id.textView2);
//        textView2.setText(Html.fromHtml(getString(R.string.ddata)));



        return v;

    }


}
