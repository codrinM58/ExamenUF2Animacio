package cat.dam.codrin.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView sol1;
    ImageView terra1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnimationDrawable sol;
        sol = new AnimationDrawable();
        sol1 = (ImageView) findViewById(R.id.sol);
        sol.setBackgroundResource(R.drawable.sol);
        sol = (AnimationDrawable) sol.getBackground();
        sol.start();

        AnimationDrawable terra;
        terra = new AnimationDrawable();
        terra1 = (ImageView) findViewById(R.id.terra);
        terra.setBackgroundResource(R.drawable.terra);
        terra (AnimationDrawable) terra.getBackground();
        sol.start();

    }
}