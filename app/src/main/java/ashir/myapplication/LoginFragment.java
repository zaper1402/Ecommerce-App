package ashir.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment {
    View view;
    TextView textView4;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment, container, false);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        if (container.getId()== R.id.fragmentLayoutLogin) {
            textView4.setText("SignUp");
        } else {
            textView4.setText("SignIn");
        }
            textView4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if (container.getId()==R.id.fragmentLayoutLogin) {
               Intent intent=new Intent(getContext(),SignupActivity.class);
               startActivity(intent);
             }
             else {
                 Intent intent=new Intent(getContext(),LoginActivity.class);
                 startActivity(intent);
             }
         }
     } );
        return view;

    }
}



