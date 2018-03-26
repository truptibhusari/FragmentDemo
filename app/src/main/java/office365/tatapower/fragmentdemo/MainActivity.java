package office365.tatapower.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import office365.tatapower.fragmentdemo.fragments.FragmentA;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentA fragmentA=new FragmentA();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment,fragmentA);
        //fragmentTransaction.addToBackStack("a");
        fragmentTransaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Fragment fragment=getFragmentManager().findFragmentById(R.id.fragment);
        Toast.makeText(MainActivity.this,"Fragment",Toast.LENGTH_LONG).show();
    }
}
