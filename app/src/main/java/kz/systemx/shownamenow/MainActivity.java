package kz.systemx.shownamenow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonShowName;
    private TextView textViewShowText;
    private EditText editTextenterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowName = findViewById(R.id.button);
        editTextenterName = findViewById(R.id.editText);

        buttonShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editTextenterName.getText().toString();

                textViewShowText.setText("hello " + name);
            }
        });

        textViewShowText = findViewById(R.id.textView);

    }
}
