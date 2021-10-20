package com.example.first;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * @author eramiro
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//    Glide for loading girls
        ImageView mGirl = findViewById(R.id.girl);

        Glide.with(this)

                .load(R.drawable.girl)
                .transition(DrawableTransitionOptions.withCrossFade(500))

//                .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
//                .centerCrop()
//                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.fucsia_200)))
//                .circleCrop()

                .into(mGirl);

    }

    // Method for Vaccinate button
    public void onClick(View v) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
