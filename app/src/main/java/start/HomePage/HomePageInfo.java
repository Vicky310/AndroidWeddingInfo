package start.HomePage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import start.AboutUs.AboutActivity;
import start.AboutUs.AlarmActivity;
import start.Issues.IsuuesActivity;
import start.Location.MapsActivity;
import start.MainActivity;
import start.R;


/**
 * Created by user-- on 05-07-2017.
 */

public class HomePageInfo extends AppCompatActivity implements ClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"#0FF4EF\">" + "Ha" + "</font>ri Prasaadh weds <font color=\"#0FF4EF\">"+"Sh"+"</font>ree Byravi"));

        List<MyHolder> data = fill_with_data();

        /** RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rview);
         recyclerView.setHasFixedSize(true);
         MyAdapter adapter = new MyAdapter(data,this);
         recyclerView.setAdapter(adapter);
         LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
         layoutManager.scrollToPosition(0);
         recyclerView.setLayoutManager(layoutManager);
         adapter.setClickListener(this);**/

        RecyclerView recyclerView = (RecyclerView) findViewById(
                R.id.rview);
        MyAdapter adapter = new MyAdapter(data,this);
        //recyclerView.addItemDecoration(new MarginDecoration(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);


        /**    // First param is number of columns and second param is orientation i.e Vertical or Horizontal
         MyAdapter adapter = new MyAdapter(data,this);
         recyclerView.setHasFixedSize(true);
         StaggeredGridLayoutManager gridLayoutManager =
         new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
         // Attach the layout manager to the recycler view
         recyclerView.setLayoutManager(gridLayoutManager);
         recyclerView.setAdapter(adapter);**/

    }

    public List<MyHolder> fill_with_data() {

        List<MyHolder> data = new ArrayList<>();
        data.add(new MyHolder(R.drawable.contacts, "Contact"));
        data.add(new MyHolder(R.drawable.transport, "Transport assistance"));
        data.add(new MyHolder(R.drawable.unnamed, "Save the date"));
        data.add(new MyHolder(R.drawable.img7669, "Navigate to venue"));
        data.add(new MyHolder(R.drawable.remember,"We help you remember"));
        return data;
    }

    @Override
    public void itemClicked(View view, int position) {
        switch (position) {
            case 0:
                Intent intent = new Intent(HomePageInfo.this,MainActivity.class);
                intent.putExtra("ItemPosition", position);
                startActivity(intent);
                break;

            case 1:
                Intent intent2 = new Intent(HomePageInfo.this, IsuuesActivity.class);
                intent2.putExtra("ItemPosition", position);
                startActivity(intent2);
                break;

            case 2:
                Intent intent3 = new Intent(HomePageInfo.this,AboutActivity.class);
                intent3.putExtra("ItemPosition", position);
                startActivity(intent3);
                break;

            case 3:
                Intent intent1 = new Intent(HomePageInfo.this,MapsActivity.class);
                intent1.putExtra("ItemPosition", position);
                startActivity(intent1);
                break;

//           case 4:
//             Intent intent4 = new Intent(HomePageInfo.this, VideoActivity.class);
//             intent4.putExtra("ItemPosition", position);
//             startActivity(intent4);
//             break;

             case 4:
             Intent intent5 = new Intent(HomePageInfo.this, AlarmActivity.class);
             intent5.putExtra("ItemPosition", position);
             startActivity(intent5);
             break;

             /**
             case 6:
             Intent intent6 = new Intent(MainActivity.this, Telenor.class);
             intent6.putExtra("ItemPosition", position);
             startActivity(intent6);
             break;

             case 7:
             Intent intent7 = new Intent(MainActivity.this, Bsnl.class);
             intent7.putExtra("ItemPosition", position);
             startActivity(intent7);
             break;**/


        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }




    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//
//
//            /** case R.id.discla: {
//             Intent rateint = new Intent(MainActivity.this,Disclaimer.class);
//             startActivity(rateint);
//             return true;
//             }**/
//
//            /**case R.id.moreapp: {
//             Intent rateint = new Intent(android.content.Intent.ACTION_VIEW);
//             rateint = rateint.setData(Uri.parse("market://search?q=mh%20saif%20khan&c=apps"));
//             startActivity(Intent.createChooser(rateint,"More Apps"));
//             return true;
//             }**/
//        }
//        return super.onOptionsItemSelected(item);
//
//    }

}
