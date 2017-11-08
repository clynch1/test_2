package whisc.test_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    Button Login, Register, Delete, Update;
    int status = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button) findViewById(R.id.Login);
        Register = (Button) findViewById(R.id.Reg);
        Delete = (Button) findViewById(R.id.Delete);
        Update = (Button) findViewById(R.id.Update);
        Login.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                status = 1;
                Bundle b = new Bundle();
                b.putInt("status", status);
                Intent i  = new Intent(MainActivity.this, LoginActivity.class);
                i.putExtras(b);
                startActivity(i);

            }
        });

        Register.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i  = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
        Update.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                status = 2;
                Bundle b = new Bundle();
                b.putInt("status", status);
                Intent i  = new Intent(MainActivity.this, UpdateActivity.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
        Delete.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                status = 3;
                Bundle b = new Bundle();
                b.putInt("status", status);
                Intent i  = new Intent(MainActivity.this, LoginActivity.class);
                i.putExtras(b);
                startActivity(i);

            }
        });
    }
}
