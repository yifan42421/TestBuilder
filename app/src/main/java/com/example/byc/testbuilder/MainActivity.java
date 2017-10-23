package com.example.byc.testbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);
        Person person = new Person.PersonBuilder("QQ","qq").setMiddleName("is ").setIsFemale(false).build();
        PersonInnerBuilder person1 = new PersonInnerBuilder.Builder("白","皓宇").middleName("小小白").isFemale(false).build();
        tv.setText(person1.getFirstName() +  person1.getLastName() + "小名："+person1.getMiddleName());
    }
}
