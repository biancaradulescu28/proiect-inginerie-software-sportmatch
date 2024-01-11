package com.example.sportmatch;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChildAdapterBottom extends RecyclerView.Adapter<ChildAdapterBottom.ChildViewHolder> {

    ArrayList<Event> eventList;
    Context context;

    public ChildAdapterBottom(ArrayList<Event> eventList, Context context) {
        this.eventList= eventList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChildViewHolder( LayoutInflater.from(context).inflate(R.layout.category_row_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapterBottom.ChildViewHolder holder, int position) {
//        holder.itemImage.setImageResource(eventList.get(position).getImage());
//        Glide.with(context).load(eventList.get(position).getDa)
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        final Event data_position = eventList.get(position);
        if(eventList.get(position).getSport().equalsIgnoreCase("handball"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.hanball1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.handball3jpeg);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.handball2);
        }
        else  if(eventList.get(position).getSport().equalsIgnoreCase("football"))
        {
            if (randomNumber==1)  holder.itemImage.setImageResource(R.drawable.football1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.football2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.football3);
        }

        else  if(eventList.get(position).getSport().equalsIgnoreCase("badminton"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.badminton1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.badminton2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.badminton3);
        }

        else  if(eventList.get(position).getSport().equalsIgnoreCase("tennis"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.tennis1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.tennis2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.tennis3);
        }
        else  if(eventList.get(position).getSport().equalsIgnoreCase("basketball"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.basket1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.basket2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.basket3);
        }
        else  if(eventList.get(position).getSport().equalsIgnoreCase("bowling"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.bowlingposter);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.bowling2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.bowling3);
        }
        else  if(eventList.get(position).getSport().equalsIgnoreCase("ping-pong"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.pingpong1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.pingpong2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.pingpong3);
        }
        else  if(eventList.get(position).getSport().equalsIgnoreCase("volleyball"))
        {
            if (randomNumber==1) holder.itemImage.setImageResource(R.drawable.volleyball1);
            else if(randomNumber==2)  holder.itemImage.setImageResource(R.drawable.volleyball2);
            else if (randomNumber==3)  holder.itemImage.setImageResource(R.drawable.volleyball3);
        }
        String nbrPart=eventList.get(position).getNrPlayers();
        String numberOnly = nbrPart.replaceAll("[^0-9]", "");
        int result = Integer.parseInt(numberOnly);
        String resultString = String.valueOf(result);
        holder.nbrParticipants.setText(resultString);
        holder.eventName.setText(eventList.get(position).getEventName());
        holder.time.setText(eventList.get(position).getTime());
        holder.date.setText(eventList.get(position).getDate());
        holder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                FirebaseUser currentUser = firebaseAuth.getCurrentUser();
                String currentUserId = currentUser.getUid();
                Intent intent;
                intent = new Intent(v.getContext(), EventDetailsActivity.class);

                if (data_position.getCreator() != null) {
                    Log.e("eventulll", data_position.getCreator());
                }
                Log.e("eventullll", currentUserId);

                intent.putExtra("valTitle",data_position.getEventName());
                intent.putExtra("valSport",data_position.getSport());
                intent.putExtra("valPlayers",data_position.getNrPlayers());
                intent.putExtra("valLoc",data_position.getLocation());
                intent.putExtra("valDate",data_position.getDate());
                intent.putExtra("valTime",data_position.getTime());
                intent.putExtra("valDesc",data_position.getDescription());

                intent.putExtra("eventul", data_position);
                intent.putExtra("stringul", "stringul");

                //TODO:Legatura event user

                v.getContext().startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class ChildViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView date;
        TextView time;
        TextView eventName;
        TextView nbrParticipants;
        CardView cardView;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage=itemView.findViewById(R.id.item_image);
            date=itemView.findViewById(R.id.eventDate);
            eventName=itemView.findViewById(R.id.eventTitle);
            time=itemView.findViewById(R.id.eventTime);
            nbrParticipants=itemView.findViewById(R.id.eventParticipants);
            cardView = itemView.findViewById(R.id.cardEvent);
        }
    }
}
