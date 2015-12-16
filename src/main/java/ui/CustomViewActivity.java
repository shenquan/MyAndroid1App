package ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.hsq.app1.R;


/**
 * Created by HSQ on 2015/12/16.
 */
public class CustomViewActivity extends Activity{
    @Override
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.ball);
        LinearLayout root = (LinearLayout)findViewById(R.id.ball);
        final DrawView draw = new DrawView(this);
        draw.setMinimumHeight(500);
        draw.setMinimumWidth(300);
        root.addView(draw);


    }
}
