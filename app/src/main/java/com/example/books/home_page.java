package com.example.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class home_page extends AppCompatActivity {

    private RecyclerView new_books, blogs_recyclerview, stories_recycleview;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private FloatingActionButton profile_user;
    private Button current_books;
    private Button want_books;
    private Books books_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initWidgets();

        Viewpage_image_adapter viewpage_image_adapter = new Viewpage_image_adapter(this);
        viewPager.setAdapter(viewpage_image_adapter);
        viewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Coming Soon",Toast.LENGTH_SHORT).show();
            }
        });
        circleIndicator.setViewPager(viewPager);



        profile_see();
        setBooks();

    }

    private void initWidgets(){
        new_books = (RecyclerView) findViewById(R.id.books_recyclerview);
        blogs_recyclerview = (RecyclerView) findViewById(R.id.blogs_recyclerview);
        stories_recycleview = (RecyclerView) findViewById(R.id.stories_recyclerview);
        viewPager = (ViewPager) findViewById(R.id.image_layout_viewpager);
        circleIndicator = (CircleIndicator) findViewById(R.id.circle);
        profile_user = (FloatingActionButton) findViewById(R.id.fab);
    }

    private void profile_see() {
        profile_user.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(getApplicationContext(),log_in.class));

                return false;
            }
        });

        profile_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "LOng press for logOUT", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),AboutUs.class));
            }
        });
    }

    private void setBooks (){
        BooksRecyclerview_adapter adapter = new BooksRecyclerview_adapter(this);
        new_books.setAdapter(adapter);
        new_books.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        BooksRecyclerview_adapter blog_adapter = new BooksRecyclerview_adapter(this);
        blogs_recyclerview.setAdapter(blog_adapter);
        blogs_recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        BooksRecyclerview_adapter stories_adapter = new BooksRecyclerview_adapter(this);
        stories_recycleview.setAdapter(stories_adapter);
        stories_recycleview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        Util util = new Util();

        ArrayList<Books> books = util.getAll_books();
        adapter.setBook(books);

        for(Books b :books){
            if(b.getCategory()=="blog"){
                blog_adapter.setBook(books);
            }
            else if(b.getCategory()=="stories"){
                stories_adapter.setBook(books);
            }
        }
    }
}
















