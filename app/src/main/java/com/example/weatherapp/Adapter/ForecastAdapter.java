package com.example.weatherapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.Common.Common;
import com.example.weatherapp.Model.ForecastResult;
import com.example.weatherapp.R;
import com.squareup.picasso.Picasso;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.MyViewHolder> {

    Context context;
    ForecastResult forecastResult;

    public ForecastAdapter(Context context, ForecastResult forecastResult) {
        this.context = context;
        this.forecastResult = forecastResult;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.card_weather_forecast,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Load icon
        Picasso.get().load(new StringBuilder("https://openweathermap.org/img/wn/")
                .append(forecastResult.list.get(position).weather.get(0).getIcon())
                .append(".png").toString()).into(holder.img_weather);

        holder.txt_date_time.setText(new StringBuilder(Common.convertUnixToDate(forecastResult
                .list.get(position).dt)));

        //holder.txt_description.setText(new StringBuilder(forecastResult.list.get(position).weather.get(0).getDescription()));

        holder.txt_temperature.setText(new StringBuilder(String.valueOf(forecastResult.list.get(position).main.getTemp())).append("°C"));


    }

    @Override
    public int getItemCount() {
        return forecastResult.list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_date_time,txt_temperature;
        ImageView img_weather;
        public MyViewHolder( View itemView) {
            super(itemView);

            //init views
            img_weather =itemView.findViewById(R.id.img_weather);
            txt_date_time = itemView.findViewById(R.id.txt_date);
            //txt_description = itemView.findViewById(R.id.txt_description);
            txt_temperature = itemView.findViewById(R.id.txt_temperature);

        }
    }
}