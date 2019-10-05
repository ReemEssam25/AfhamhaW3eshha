package com.example.afhamhaw3eshha.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.afhamhaw3eshha.Model.Post;
import com.example.afhamhaw3eshha.R;
import com.google.android.material.button.MaterialButton;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {

    private List <Post>posts ;
    private Post post;
    Context context;

    public ArticleAdapter(List<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_item, parent , false);
        ArticleViewHolder holder =new ArticleViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        post = posts.get(position);
        holder.titleTextView.setText(post.getTitle());
        holder.articleTextView.setText(post.getArticle());
        holder.userNameTextView.setText(post.getUserName());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ArticleViewHolder extends RecyclerView.ViewHolder{

        private TextView userNameTextView , titleTextView, articleTextView;
        private ImageButton likeButton, commentButton , seeButton;
        private CircleImageView userImageView;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);

            userNameTextView = itemView.findViewById(R.id.userName_TextView);
            titleTextView = itemView.findViewById(R.id.title_TextText);
            articleTextView = itemView.findViewById(R.id.article_TextText);
            likeButton = itemView.findViewById(R.id.like_Button);
            commentButton = itemView.findViewById(R.id.comment_Button);
            seeButton = itemView.findViewById(R.id.see_Button);
            userImageView = itemView.findViewById(R.id.user_img);
        }
    }
}
