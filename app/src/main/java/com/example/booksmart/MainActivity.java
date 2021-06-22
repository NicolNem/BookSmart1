package com.example.booksmart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Screens> aryIntents = new ArrayList<Screens>();
    ListView ListAct;
    private AdapterView.OnItemClickListener ActListner = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent i = aryIntents.get(position).getIntent();
            startActivity(i);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAct=findViewById(R.id.ListAct);
        getIntents();
       ScreensAdapter SA= new ScreensAdapter(this,R.layout.screens_layout,aryIntents);
       ListAct.setAdapter(SA);
        ListAct.setOnItemClickListener(ActListner);
        //ListAct.setOnItemLongClickListener(ActLongListner);

    }

    private void getIntents(){
        Intent I=new Intent(this,Questionnaire.class);
        Screens s=new Screens(I,"Questionnaire");
        aryIntents.add(s);
        I=new Intent(this,Main.class);
        s=new Screens(I,"About us");
        aryIntents.add(s);
        I=new Intent(this,Profile.class);
         s=new Screens(I,"Profile");
        aryIntents.add(s);
         I=new Intent(this,Recommendations.class);
         s=new Screens(I,"Recommends");
        aryIntents.add(s);
         I=new Intent(this,Requests.class);
        s=new Screens(I,"Requests");
        aryIntents.add(s);
        I=new Intent(this,Search.class);
        s=new Screens(I,"Search");
        aryIntents.add(s);
        I=new Intent(this,Author_Info.class);
        s=new Screens(I,"Author Information");
        aryIntents.add(s);
        I=new Intent(this,Book_Info.class);
         s=new Screens(I,"Book Information");
        aryIntents.add(s);
    }
    public class ScreensAdapter extends ArrayAdapter<Screens> {
        private Context context;
        private  int resource;
        private ArrayList<Screens> objects;
        public ScreensAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Screens> objects) {
            super(context, resource, objects);
            this.context=context;
            this.resource=resource;
            this.objects=objects;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View v;
            LayoutInflater li=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(convertView== null)
                v=li.inflate(this.resource,null);
            else
                v=convertView;

            Screens s=this.objects.get(position);
            TextView tvScreenName= v.findViewById(R.id.tvScreenName);
            tvScreenName.setText(s.getName());
            return v;
        }
        @Override
        public int getCount() {
            return objects.size();
        }
    }










   /* public void change1(View view) {
        Intent i=new Intent(this,Questionnaire.class);
        startActivity(i);
    }

    public void change2(View view) {
        Intent i=new Intent(this,Main.class);
        startActivity(i);
    }

    public void Change3(View view) {
        Intent i=new Intent(this,Profile.class);
        startActivity(i);
    }

    public void change4(View view) {
        Intent i=new Intent(this,Recommendations.class);
        startActivity(i);
    }

    public void Change5(View view) {
        Intent i=new Intent(this,Requests.class);
        startActivity(i);
    }

    public void Change6(View view) {
        Intent i=new Intent(this,Search.class);
        startActivity(i);
    }

    public void Change7(View view) {
        Intent i=new Intent(this,Author_Info.class);
        startActivity(i);
    }

    public void change8(View view) {
        Intent i=new Intent(this,Book_Info.class);
        startActivity(i);
    }*/
}