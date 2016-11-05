package com.igormelo.fontawesomeicon;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by igor_ on 29/10/2016.
 */

public class FontAwesomeIcon extends TextView {
    private final static String NAME = "FONTAWESOME";
    private static LruCache<String, Typeface> sTypefaceCache = new LruCache<String, Typeface>(12);
    public static final String fontAwesome = "fontawesome-webfont.ttf";

    public FontAwesomeIcon(Context context) {
        super(context);
        init();
    }

    public FontAwesomeIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontAwesomeIcon(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void init() {
        Typeface typeface = sTypefaceCache.get(NAME);

        if (typeface == null) {

            typeface = Typeface.createFromAsset(getContext().getAssets(), fontAwesome);
            sTypefaceCache.put(NAME, typeface);

        }

        //Set Font type
        setTypeface(typeface);
        //Set Padding
        setPadding(0, 0, 0, 0);
        //Set Gravity
        setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            setTextAlignment(TEXT_ALIGNMENT_CENTER);
        }

        //Set Height
        LinearLayout.LayoutParams buttonsParams =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(buttonsParams);

    }
}
