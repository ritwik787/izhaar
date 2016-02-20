package com.tominc.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shubham on 20/2/16.
 */
public class MyAdapter extends BaseAdapter {
    private Context c;
    private ArrayList<Confession> items = new ArrayList<>();

    public MyAdapter(ArrayList<Confession> items, Context c) {
        this.items = items;
        this.c = c;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row;

        if(view==null){
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item, viewGroup, false);
        } else{
            row = view;
        }

        TextView to = (TextView) row.findViewById(R.id.item_to);
        TextView from = (TextView) row.findViewById(R.id.item_from);
        TextView des = (TextView) row.findViewById(R.id.item_des);

        to.setText(items.get(i).getTo());
        from.setText(items.get(i).getFrom());
        des.setText(items.get(i).getDes());


        return row;


    }
}
