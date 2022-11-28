package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] names={"Instagram","Whatsapp","outlook","Teams","Gmail","Playstore","Photos","gDMSS","Acrobat",
            "LinkdIn","Chrome", "Phone","Messages","SAS"};
    int[]image={R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,
            R.drawable.img_5,R.drawable.img_6,R.drawable.img_7, R.drawable.img_10,R.drawable.img_9,R.drawable.img_10,R.drawable.img_11
            ,R.drawable.img_12,R.drawable.img_13,R.drawable.img_14};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);

        CustomAdapter customAdapter=new CustomAdapter(names,image,this);
        gridView.setAdapter(customAdapter);

    }
    public  class CustomAdapter extends BaseAdapter
    {
        private  String[] imageNames;
        private int [] imagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames, int[] imagesPhoto, Context context) {
            this.imageNames = imageNames;
            this.imagesPhoto = imagesPhoto;
            this.context = context;
            this.layoutInflater=(LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }




        @Override
        public int getCount() {
            return imagesPhoto.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            if (view==null)
            {
                view=layoutInflater.inflate(R.layout.row_item,viewGroup, false);

            }


            TextView tvname=view.findViewById(R.id.tvname);
            ImageView imageView=view.findViewById(R.id.imageview);
            tvname.setText(imageNames[i]);

            imageView.setImageResource(imagesPhoto[i]);



            return view;
        }
    }
}
