package com.app.listadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        UserGenerator userGenerator = new UserGenerator();
        List<UserModel> users = userGenerator.generateUsers(100);
        UserAdapter userAdapter = new UserAdapter(this, users);
        listView.setAdapter(userAdapter);
    }
}