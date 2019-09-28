package com.example.lenovo520.diseaseprediction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DoctorActivity extends AppCompatActivity {
    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;
    CardView card5;
    CardView card6;
    CardView card7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Doctors");
        actionBar.setDisplayHomeAsUpEnabled(true);
        card1=(CardView)findViewById(R.id.card1);
        card2=(CardView)findViewById(R.id.card2);
        card3=(CardView)findViewById(R.id.card3);
        card4=(CardView)findViewById(R.id.card4);
        card5=(CardView)findViewById(R.id.card5);
        card6=(CardView)findViewById(R.id.card6);
        card7=(CardView)findViewById(R.id.card7);



        ImageView imageView1=findViewById(R.id.profile_image1);
        ImageView imageView2=findViewById(R.id.profile_image2);
        ImageView imageView3=findViewById(R.id.profile_image3);
        ImageView imageView4=findViewById(R.id.profile_image4);
        ImageView imageView5=findViewById(R.id.profile_image5);
        ImageView imageView6=findViewById(R.id.profile_image6);
        ImageView imageView7=findViewById(R.id.profile_image7);

        String url1="https://imagesx.practo.com/providers/0b2645dc-8078-4e91-ae2e-81de2c546214.jpg?i_type=t_100x100-2x";
        String url2="https://imagesx.practo.com/providers/6e720000-6b18-4043-a6a5-c58202747479.jpg?i_type=t_100x100-2x";
        String url3="https://imagesx.practo.com/providers/0b0dc748-a3a3-42bd-85e2-0da7a12ead02.jpg?i_type=t_100x100-2x";
        String url4="https://imagesx.practo.com/providers/b1b82f71-6346-4a70-8afd-46c5cf61e9b9.jpg?i_type=t_100x100-2x";
        String url5="https://imagesx.practo.com/providers/1df9a1b1-bc52-476a-942d-8e48eaa0b55e.jpg?i_type=t_100x100-2x";
        String url6="https://imagesx.practo.com/providers/25c9a6c0-3f81-4afc-85c7-51e757440605.jpg?i_type=t_100x100-2x";
        String url7="https://imagesx.practo.com/providers/91145716-9549-4ff0-98dd-b2eed9d09cbb.jpg?i_type=t_100x100-2x";

        Picasso.with(this).load(url1).into(imageView1);
        Picasso.with(this).load(url2).into(imageView2);
        Picasso.with(this).load(url3).into(imageView3);
        Picasso.with(this).load(url4).into(imageView4);
        Picasso.with(this).load(url5).into(imageView5);
        Picasso.with(this).load(url6).into(imageView6);
        Picasso.with(this).load(url7).into(imageView7);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/snehalatha-1-dermatologist-cosmetologist?specialization=Dermatologist&practice_id=783019"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/dr-jyothsna-2-dermatologist-dermatologist?specialization=Dermatologist&practice_id=1062980"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/dr-ganga-ravikumar-dermatologist-cosmetologist?specialization=Dermatologist&practice_id=709159"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/dr-n-krishnan?specialization=Ophthalmologist&practice_id=1139788"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/rajendran-d-ophthalmologist?specialization=Ophthalmologist&practice_id=1132595"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/dr-shankar-m-n-ear-nose-throat-ent-specialist?specialization=Ear-Nose-Throat%20(ENT)%20Specialist&practice_id=702067"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.practo.com/chennai/doctor/prabha-karthik-ear-nose-throat-ent-specialist?specialization=Ear-Nose-Throat%20(ENT)%20Specialist&practice_id=1132595"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
