package tutorial.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import tutorial.gridview.adapter.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addControlItem();
    }

    private void addControlItem() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,FullImageActivity.class);
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });
    }

    private void initComponents() {
        gridView = (GridView)this.findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(MainActivity.this));
    }
}
