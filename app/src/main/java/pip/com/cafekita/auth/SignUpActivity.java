package pip.com.cafekita.auth;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import pip.com.cafekita.R;

public class SignUpActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        button = (Button)findViewById(R.id.btnProsesSignUp);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(SignUpActivity.this, SignInActivity.class);


                startActivity(i);

            }
        });
    }
}
