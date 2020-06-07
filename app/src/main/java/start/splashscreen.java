package start;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

import start.HomePage.HomePageInfo;

/**
 * Created by user-- on 06-07-2017.
 */

public class splashscreen extends AppCompatActivity {

    TextView HaSh;
    private GifImageView gifImageView;
    //    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        gifImageView = (GifImageView)findViewById(R.id.gifImageView);
//        progressBar = (ProgressBar)findViewById(R.id.progressBar);
//        progressBar.setVisibility(progressBar.VISIBLE);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Vtks Garota Bonita.ttf");
        HaSh = (TextView)findViewById(R.id.HaSh);
        HaSh.setTypeface(tf);
        //Set GIFImageView resource
        try{
            InputStream inputStream = getAssets().open("cropped.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }
        catch (IOException ex)
        {

        }

        //Wait for 3 seconds and start Activity Main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashscreen.this.startActivity(new Intent(splashscreen.this,HomePageInfo.class));
                splashscreen.this.finish();
            }
        },5000); // 3000 = 3seconds
        Animation fade1= AnimationUtils.loadAnimation(splashscreen.this,R.anim.fade_in);
        HaSh.startAnimation(fade1);

        HaSh.startAnimation(fade1);

        fade1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                startActivity(new
                        Intent(splashscreen.this, MainActivity.class));
                splashscreen.this.finish();
            }

            public void onAnimationRepeat(Animation animation){
            }
            public void onAnimationStart(Animation animation){
            }



        });
    }



}