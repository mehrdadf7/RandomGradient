package com.github.mehrdadf7.randomGradient;

import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutAnimation(
                new LayoutAnimationController(
                        AnimationUtils.loadAnimation(this,
                                android.R.anim.fade_in)));

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("TextView " + i);
        }

        ColorAdapter colorAdapter = new ColorAdapter(list);
        recyclerView.setAdapter(colorAdapter);

    }
}
