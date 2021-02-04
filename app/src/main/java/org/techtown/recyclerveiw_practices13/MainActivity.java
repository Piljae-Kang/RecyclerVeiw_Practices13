package org.techtown.recyclerveiw_practices13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EditText name;
    EditText birthday;
    EditText mobile;
    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new PersonAdapter();

        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView2);
        recyclerView.setAdapter(adapter);
        int num = adapter.getItemCount();
        name = findViewById(R.id.editTextTextPersonName);
        birthday = findViewById(R.id.editTextTextPersonName2);
        mobile = findViewById(R.id.editTextTextPersonName3);


        adapter.addItem(new Person("김지영 820101", "010-1234-5678"));
        adapter.addItem(new Person("박형식 810202", "010-1357-2468"));
        recyclerView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = name.getText().toString() + " "+ birthday.getText().toString();
                String str3 = mobile.getText().toString();

                adapter.addItem(new Person(str, str3));

                adapter.notifyDataSetChanged();
            }
        });

    }
}