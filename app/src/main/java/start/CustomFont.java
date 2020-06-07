package start;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by user-- on 15-04-2016.
 */
public class CustomFont extends TextView {

    public CustomFont(Context context) {
        super(context);
        setFont();
    }
    public CustomFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }
    public CustomFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"fonts/SourceSansPro-Regular.otf");
        setTypeface(font, Typeface.NORMAL);

    }
}