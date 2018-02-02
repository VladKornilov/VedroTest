package com.example.bloodik.vedrotest2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Bloodik on 02.02.2018.
 */

public class OrderView extends View {
    LinearLayout order_info;
    ImageButton make_order;
    public OrderView(Context context) {
        super(context);
        order_info = findViewById(R.id.order_layout);

    }

    protected void onDraw(Canvas canvas) {

    }
}
