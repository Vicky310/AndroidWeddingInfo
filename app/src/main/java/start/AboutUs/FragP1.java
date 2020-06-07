package start.AboutUs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import start.R;

/**
 * Created by user-- on 05-07-2017.
 */

public class FragP1 extends Fragment{

    ViewPager viewPager;
    CustomSwipeAdapter adapter;

    public FragP1() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.pager);
        adapter = new CustomSwipeAdapter(this.getActivity());
        viewPager.setAdapter(adapter);
        return view;
    }


    }

