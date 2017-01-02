package com.example.enclaveit.gridview.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.enclaveit.gridview.R;
import com.example.enclaveit.gridview.adapter.ImageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    /**
     * @author: Lorence
     * @param savedInstanceState
     * Source Data: Create A Root Data
     * ArrayList<Integer> contain resId of picture that put in folder drawable
     */
    List<Integer> listOfImages = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    protected void initComponents(){
        listOfImages.add(R.drawable.a1);
        listOfImages.add(R.drawable.a2);
        listOfImages.add(R.drawable.a3);
        listOfImages.add(R.drawable.a4);
        listOfImages.add(R.drawable.a5);
        listOfImages.add(R.drawable.a6);
        listOfImages.add(R.drawable.a7);
        listOfImages.add(R.drawable.a8);
        listOfImages.add(R.drawable.a9);
        listOfImages.add(R.drawable.a10);
        listOfImages.add(R.drawable.a11);
        listOfImages.add(R.drawable.a12);
        listOfImages.add(R.drawable.a13);
        listOfImages.add(R.drawable.a14);
        listOfImages.add(R.drawable.a15);
        listOfImages.add(R.drawable.a16);
        listOfImages.add(R.drawable.a17);
        listOfImages.add(R.drawable.a6);

        gridView = (GridView)this.findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(MainActivity.this,R.layout.item_grid_view,listOfImages));
    }
}
