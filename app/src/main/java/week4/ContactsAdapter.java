package week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ioana.androidfundamentals.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    private List<Contacte> mContacts;

    public ContactsAdapter(List<Contacte> mContacts) {
        this.mContacts = mContacts;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item, viewGroup, false);
        return new ContactsViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {

Contacte currentContacte=mContacts.get(i);
contactsViewHolder.mTextViewFirstNAme.setText(currentContacte.getmFirstName());

        contactsViewHolder.mTextViewLastNAme.setText(currentContacte.getmLastName());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
