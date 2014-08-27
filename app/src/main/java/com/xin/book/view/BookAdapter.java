package com.xin.book.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class BookAdapter implements IAdapter {
    private List<String> strList = new ArrayList<String>();

    private Context mContext;
    private Bitmap _bitmap;
    private Bitmap _bitmapCover;
    public BookAdapter(Context context) {
        super();
        this.mContext = context;
    }

    public void addItem(List<String> list) {
        strList.addAll(list);
    }

    public int getCount() {
        return strList.size();
    }

    public String getItem(int position) {
        return strList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position) {
        ImageView imageView = new ImageView(mContext);
        if(position != 0) {
            imageView.setImageBitmap(_bitmap);
        }
        else {
            imageView.setImageBitmap(_bitmapCover);
        }
        return imageView;
    }

    public void setBitmap(Bitmap bitmap) {
        _bitmap = bitmap;
    }

    public void setCoverBitmap(Bitmap bitmap) {
        _bitmapCover = bitmap;
    }
}