package com.example.recyclerviewdesign;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<users> mylist;
    RecyclerView recyclerView;
    usersAdapter usersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylist = new ArrayList<>();
        mylist.add(new users("google",1, getResources().getDrawable(R.drawable.google),"https://www.google.com"));
        mylist.add(new users("facebook",2, getResources().getDrawable(R.drawable.fb),"https://www.facebook.com"));
        mylist.add(new users("instagram",3, getResources().getDrawable(R.drawable.instagram),"https://www.instagram.com"));
        mylist.add(new users("twitter",4, getResources().getDrawable(R.drawable.twitter),"https://www.twitter.com"));
        mylist.add(new users("Linkedin",5, getResources().getDrawable(R.drawable.linkedin),"https://linkedin.com"));
        mylist.add(new users("Quora",6, getResources().getDrawable(R.drawable.quora),"https://www.quora.com"));
        mylist.add(new users("YouTube",7, getResources().getDrawable(R.drawable.youtube),"https://www.youtube.com"));
        mylist.add(new users("Amazon",8, getResources().getDrawable(R.drawable.amazon),"https://www.amazon.com"));

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        usersAdapter = new usersAdapter(this,mylist);
        recyclerView.setAdapter(usersAdapter);


    }
}
