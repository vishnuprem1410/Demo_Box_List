package sg.edu.rp.c346.id18015059.demoboxlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
     int images[] = {R.drawable.blue_box, R.drawable.orange_box, R.drawable.brown_box};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewBox);

        MyAdapter adapter = new MyAdapter(this, images);

    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        int rImgs[];

        MyAdapter ( Context c, int imgs[]){
            super(c, R.layout.row);
            this.context = c;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            return super.getView(position, convertView, parent);
            View row = layoutInflater.inflate(R.layout.row, parent, false)
            ImageView images = row.findViewById(R.id.image);

            images.setImageResource(rImgs[position]);

            return row;
        }


    }
}
