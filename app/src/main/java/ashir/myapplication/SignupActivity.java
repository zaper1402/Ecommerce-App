package ashir.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    TextView textTool;
    ImageView signinBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        textTool = (TextView) findViewById(R.id.textTool);
        signinBack = (ImageView) findViewById(R.id.signinBack);
        // textView_4=(TextView)findViewById(R.id.textView4);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentLayoutSignup, new LoginFragment());
        ft.commit();

        textTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        signinBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}
