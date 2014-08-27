package com.xin.book;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.xin.book.view.BookAdapter;
import com.xin.book.view.BookLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	 BookLayout bk = new BookLayout(this);
         Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.background);
         Bitmap bitmapCover = BitmapFactory.decodeResource(this.getResources(), R.drawable.cover);
         List<String> str = new ArrayList<String>();
         str.add("aaaaaaaaaaaaaaaaaaaa");
         str.add("bbbbbbbbbbbbbbbbbbbb");
         str.add("cccccccccccccccccccc");
         str.add("dddddddddddddddddddd");
         str.add("eeeeeeeeeeeeeeeeeeee");
         str.add("ffffffffffffffffffff");
         BookAdapter ba = new BookAdapter(this);
         ba.addItem(str);
         bk.setPageAdapter(ba);
         bk.setViewBitmap(bitmap, bitmapCover);
         setContentView(bk);
    }

}