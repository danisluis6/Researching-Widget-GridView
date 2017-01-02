package tutorial.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tutorial.gridview.adapter.ImageAdapter;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        this.findViewById(R.id.img).setBackgroundResource((Integer) new ImageAdapter(FullImageActivity.this).getItem(position));
    }
}
