package week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ioana.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewContacts;
    private List<Contacte> mContacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mRecyclerViewContacts=findViewById(R.id.recyclerview_contacts);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);

        mRecyclerViewContacts.setLayoutManager(layoutManager);


            ContactsAdapter contactsAdapter=new ContactsAdapter(mContacts);


    }

    private List<Contacte> getContacts() {
        List<Contacte> contacts = new ArrayList<>();
        contacts.add(new Contacte("Ion", "Ionescu"));
        contacts.add(new Contacte("Maria", "Popescu"));
        contacts.add(new Contacte("Vlad", "Mihaescu"));
        contacts.add(new Contacte("Marius", "Manole"));
        contacts.add(new Contacte("Ioana", "Mocanu"));
        return contacts;
    }
}