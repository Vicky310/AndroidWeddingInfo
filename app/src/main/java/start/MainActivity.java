package start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import start.HomePage.HomePageInfo;
import start.SupportList.Introduction;



public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                if (savedInstanceState == null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, new Introduction()).commit();

                }

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle("Contacts");
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



}

