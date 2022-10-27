package com.example.tugascallapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import okhttp3.Interceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    TextView dDesc, dParticipant, dType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        dDesc = findViewById(R.id.d_desc);
        dParticipant = findViewById(R.id.d_participant);
        dType = findViewById(R.id.d_type);

        Bundle bundle = getIntent().getExtras();
        String actType = bundle.getString("TYPE");

        getActivityTyped(actType);
    }

    private void getActivityTyped(String userActType){
        Call<Activities> activitiesCall = RetrofitClient.getInstance().getMyApi().getTypeActivity(userActType);
        activitiesCall.enqueue(new Callback<Activities>() {
            @Override
            public void onResponse(Call<Activities> call, Response<Activities> response) {
                Activities randomAct = response.body();
                dType.setText(randomAct.getActType());
                dParticipant.setText(Integer.toString(randomAct.getActParticipant()));
                dDesc.setText(randomAct.getActDesc());
            }

            @Override
            public void onFailure(Call<Activities> call, Throwable t) {

            }
        });
    }
}