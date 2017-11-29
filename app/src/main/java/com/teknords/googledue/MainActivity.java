package com.teknords.googledue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

        private AdView mAdView;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                mAdView = (AdView) findViewById(R.id.adView);
                AdRequest adRequest = new AdRequest.Builder()
                        .addTestDevice("ca-app-pub-1261846064716355/9584487822").build();
                mAdView.loadAd(adRequest);


                ListView listView = (ListView)findViewById(R.id.listView);

                final String[] data ={"How to Set up Google Duo",
                "How To Find and invite contacts",
                "How To Make calls to other kinds of phones",
                "How to Fix video call connection",
                "How To Set phone to vibrate for calls",
                "How to Disconnect your phone number from Google Duo",
                "Can’t verify phone number",
                "Can't find or sync contacts"};

                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.mytextview, data);

                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent intent = new Intent(MainActivity.this,Text.class);
                                intent.putExtra("selectedDua",position);
                                startActivity(intent);



                        }
                });



        }
}