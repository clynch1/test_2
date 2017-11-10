package whisc.test_2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button Login, Register, Delete, Update, Number;
    int status = 0;
    Context CTX = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button) findViewById(R.id.Login);
        Register = (Button) findViewById(R.id.Reg);
        Delete = (Button) findViewById(R.id.Delete);
        Update = (Button) findViewById(R.id.Update);
        Number = (Button) findViewById(R.id.number_btn);
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
                Intent i  = new Intent(MainActivity.this, DeleteActivity.class);
                i.putExtras(b);
                startActivity(i);

            }
        });
        Number.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseOperations DOP = new DatabaseOperations(CTX);
                Cursor CR = DOP.getInformation(DOP);
                CR.moveToFirst();
                int numberOfRows = 0;
                do
                {
                    numberOfRows ++;
                }while(CR.moveToNext());
                Toast.makeText(getBaseContext(), "There are: "+numberOfRows+" Rows", Toast.LENGTH_LONG).show();
            }
        });
    }
}
