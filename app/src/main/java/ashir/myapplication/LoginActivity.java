package ashir.myapplication;

//import android.app.FragmentManager;
import android.content.Intent;
//import android.support.v4.app.Fragment;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {
    TextView textTool;
    ImageView loginBack;
    boolean doubleBackToExitPressedOnce = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentLayoutLogin, new LoginFragment());
        ft.commit();
        textTool = (TextView) findViewById(R.id.textTool);
        loginBack = (ImageView) findViewById(R.id.signinBack);
      //  textView_3 = (TextView) findViewById(R.id.textView4);
        textTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        loginBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doubleBackToExitPressedOnce) {
                    finish();
                    System.exit(0);
                    return;
                }
                doubleBackToExitPressedOnce = true;
                Toast.makeText(LoginActivity.this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        doubleBackToExitPressedOnce=false;
                    }
                }, 2000);
            }

        });


    }


    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish();
            System.exit(0);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}

