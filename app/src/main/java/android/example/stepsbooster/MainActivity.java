package android.example.stepsbooster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Register (View view){
        Intent s=new Intent(this,createAccount.class);
        startActivity(s);
    }
    public void SignIn (View view){
        Intent s=new Intent(this,Main2Activity.class);
        startActivity(s);
    }
}
