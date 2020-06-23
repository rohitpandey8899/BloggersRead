package com.example.books;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

public class BooksRecyclerview_adapter extends RecyclerView.Adapter<BooksRecyclerview_adapter.ViewHolder> {

    private ArrayList<Books> book = new ArrayList<Books>();

    Context context;

    public BooksRecyclerview_adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.books_recycleview, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.books_name.setText(book.get(position).getName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Books_activity.class);
                intent.putExtra("bookID",book.get(position).getId());
                context.startActivity(intent);

            }
        });


        Glide.with(context)
                .asBitmap()
                .load(book.get(position).getImageUrl())
                .into(holder.books_image);
    }

    @Override
    public int getItemCount() {
        return book.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView books_name;
        ImageView books_image;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            books_image = itemView.findViewById(R.id.book_image);
            books_name = itemView.findViewById(R.id.books_name);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }

    public void setBook(ArrayList<Books> book) {
        this.book = book;
        notifyDataSetChanged();
    }
}
