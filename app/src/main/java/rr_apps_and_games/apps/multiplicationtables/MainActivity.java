package rr_apps_and_games.apps.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText;
    Button button;
    TextView result;
    long ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button:
                StringBuffer buffer = new StringBuffer();
                long num = Long.parseLong(editText.getText().toString());

                for (long i = 1; i <= 10; i++) {
                    ans = (i * num);
                    buffer.append(num + " × " + i + " = " + ans + "\n\n");
                }

                result.setText(buffer);
                break;
        }

    }
}