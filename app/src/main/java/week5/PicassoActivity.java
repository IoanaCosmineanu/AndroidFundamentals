package week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PicassoActivity extends AppCompatActivity {
private ImageView mImageView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5);

        mImageView=findViewById(R.id.imageView2);
        Picasso.get().load(path:"/http://i.imgur.com/DvpvkIR.png").into(mImageView);

    }

    private void into(ImageView mImageView) {
    }
}
