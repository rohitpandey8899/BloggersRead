package com.example.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class Books_activity extends AppCompatActivity {

    ImageView imageView;
    TextView book_name, author, category,description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_activity);

        intiWidgets();


        Intent intent = getIntent();
        int id  = intent.getIntExtra("bookID",0);
        Util util = new Util();
        ArrayList<Books> books = util.getAll_books();

                for(Books b: books){
                    if(b.getId()==id){
                          book_name.setText(b.getName());
                author.setText(b.getAuthor());
                category.setText(b.getCategory());
                description.setText(b.getDis_author());

                Glide.with(getApplicationContext())
                        .asBitmap()
                        .load(b.getImageUrl())
                        .into(imageView);
            }
        }
    }

    private void intiWidgets(){
        imageView = (ImageView) findViewById(R.id.book_image_view);
        book_name = (TextView) findViewById(R.id.books_name);
        author = (TextView) findViewById(R.id.author_name);
        category = (TextView) findViewById(R.id.category);
        description = (TextView) findViewById(R.id.description);
    }
}