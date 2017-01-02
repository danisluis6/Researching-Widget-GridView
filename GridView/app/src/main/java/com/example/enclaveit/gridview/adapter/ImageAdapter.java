package com.example.enclaveit.gridview.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.enclaveit.gridview.R;

import java.util.List;

/**
 * Created by vuongluis on 02/01/2017.
 */

public class ImageAdapter extends ArrayAdapter<Integer> {

    private Activity activity;
    private int resource;
    private List<Integer> objects;

    public ImageAdapter(Activity activity, int resource, List<Integer> objects){
        super(activity,resource,objects);
        this.activity = activity;
        this.resource = resource;
        this.objects = objects;
    }

    /**
     * Purpose of using getView to draw GUI
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        // Connect widget android with xml
        ImageView img = (ImageView)row.findViewById(R.id.img);
        img.setImageResource(this.objects.get(position));
        return row;
    }
}
