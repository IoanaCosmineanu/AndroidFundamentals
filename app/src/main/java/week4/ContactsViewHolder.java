package week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ioana.androidfundamentals.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextViewFirstNAme;
    public TextView mTextViewLastNAme;



    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewFirstNAme=itemView.findViewById(R.id.TextView_FirstName);
        mTextViewFirstNAme=itemView.findViewById(R.id.TextView_LastName);
    }
}
