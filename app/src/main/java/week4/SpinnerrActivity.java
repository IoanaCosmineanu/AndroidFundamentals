package week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ioana.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerrActivity extends AppCompatActivity {
private List<String> mFruits;
    private Spinner mSpinnerFruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);

        Toast.makeText(this, "Hello from a Toast",Toast.LENGTH_SHORT).show();


        //get data source
        mFruits=getFruits();
        //get the Spinner from xml Layout
         mSpinnerFruits=findViewById(R.id.spinner_fruits);
         //set the adapter on the Spinner
         mSpinnerFruits.setAdapter(getAdapter());
    }

    //data source
    private List<String> getFruits(){

        List<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Capsuni");
        fruits.add("Mar");
        fruits.add("Ananas");
        fruits.add("Lamaie");
       return fruits;
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<>( this,
                android.R.layout.simple_spinner_item,
        mFruits);
    }
    }


