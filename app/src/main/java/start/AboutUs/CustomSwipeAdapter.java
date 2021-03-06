package start.AboutUs;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import start.R;
/**
 * Created by vigneshwaran.bs on 10/24/2017.
 */

public class CustomSwipeAdapter extends PagerAdapter {
    private int[] image_resource = {R.drawable.image, R.drawable.image_1};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_fragment, container, false);
        ImageView imageview = (ImageView) item_view.findViewById(R.id.image_view);
        TextView textView = (TextView)  item_view.findViewById(R.id.image_count);
        imageview.setImageResource(image_resource[position]);
       textView.setText("" + position);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}