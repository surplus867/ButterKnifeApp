package com.example.android.butterknifeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edit_text_name)
    EditText edtName;

    @BindView(R.id.text_view_message)
    TextView txtMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_say_hello, R.id.button_say_goodbye})
    public void onSayHelloClick(View view) {
        String name = edtName.getText().toString();
        switch (view.getId()) {
            case R.id.button_say_hello:
                txtMessage.setText("Hello " + name);
                break;
            case R.id.button_say_goodbye:
                txtMessage.setText("GoodBye " + name);
                break;
        }

    }
}
