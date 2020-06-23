package com.example.books;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Viewpage_image_adapter extends PagerAdapter {

    private Context context;
    private String image[] = new String[]{
            "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/scroller_images%2Fslide10.JPG?alt=media&token=e5fbb004-ad36-4f32-9011-e1847ad34b3c",
            "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/scroller_images%2Fslide11.JPG?alt=media&token=a69721e9-5ff1-4b3f-b64e-bdedf0950334",
            "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/scroller_images%2Fslide12.JPG?alt=media&token=0910079b-e820-4616-be5c-4689bb8c8474",
            "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/scroller_images%2Fslide13.JPG?alt=media&token=1de8b374-dc0a-4e66-aa0e-1d3124ddbb4f",
            "https://firebasestorage.googleapis.com/v0/b/books-f37f1.appspot.com/o/scroller_images%2Fslide14.JPG?alt=media&token=1d599a6e-eba5-4a7b-9936-0ad678890774"};
    public Viewpage_image_adapter(Context context) {
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.images_viewpader, null);
        ImageView imageView = view.findViewById(R.id.image_viewpager);
        Glide.with(context)
                .asBitmap()
                .load(image[position])
                .into(imageView);
        container.addView(view);
        return view;
    }

    /*
    This callback is responsible for destroying a page. Since we are using view only as the
    object key we just directly remove the view from parent container
    */
    @Override
    public void destroyItem(ViewGroup container, int position, Object view) {
        container.removeView((View) view);
    }

    /*
    Returns the count of the total pages
    */
    @Override
    public int getCount() {
        return image.length;
    }

    /*
    Used to determine whether the page view is associated with object key returned by instantiateItem.
    Since here view only is the key we return view==object
    */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object == view;
    }
}
