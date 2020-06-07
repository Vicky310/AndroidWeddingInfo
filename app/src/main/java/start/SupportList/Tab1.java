package start.SupportList;

/**
 * Created by user-- on 19-07-2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import start.R;

//Our class extending fragment
public class Tab1 extends Fragment {

    //TextView name,contact;
    private ListView listView;
    String[] name;
    String[] number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         View v=inflater.inflate(R.layout.tab1, container, false);

        listView = (ListView) v.findViewById(R.id.drawerList);

        name = getResources().getStringArray(R.array.s1);
        number = getResources().getStringArray(R.array.s2);
        int[] image={R.drawable.ic_share_icon_arrow,R.drawable.ic_action_sms,R.drawable.ic_call};



        List<ItemObject2> listViewItems = new ArrayList<ItemObject2>();

        for(int i=0;i<=3;i++)
        {
            listViewItems.add(new ItemObject2(name[i],number[i],image[0],image[1],image[2]));
        }
        listView.setAdapter(new CustomAdapter2(getContext(), listViewItems));
        return v;

    }


}
