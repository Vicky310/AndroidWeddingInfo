package start.AboutUs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import start.HomePage.HomePageInfo;
import start.R;

public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_content, new AboutUsInfo()).commit();

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Save the date");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), HomePageInfo.class);
                startActivity(a);
            }
        });

    }

    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {


            /** case R.id.discla: {
             Intent rateint = new Intent(MainActivity.this,Disclaimer.class);
             startActivity(rateint);
             return true;
             }**/

            /**case R.id.moreapp: {
             Intent rateint = new Intent(android.content.Intent.ACTION_VIEW);
             rateint = rateint.setData(Uri.parse("market://search?q=mh%20saif%20khan&c=apps"));
             startActivity(Intent.createChooser(rateint,"More Apps"));
             return true;
             }**/
        }
        return super.onOptionsItemSelected(item);

    }

}

