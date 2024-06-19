package com.example.foodclub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter1 extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerContactAdapter1.ViewHolder> {

    private Context context;
    private ArrayList<itemModel1> arrContacts;

    RecyclerContactAdapter1(Context context, ArrayList<itemModel1> arrContacts) {
        this.context = context;
        this.arrContacts = arrContacts;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (arrContacts == null || position < 0 || position >= arrContacts.size()) {
            return;
        }
        itemModel1 contact = arrContacts.get(position);
        if (contact == null) {
            return;
        }
        holder.imgContact.setImageResource(contact.img);
        holder.txtName.setText(contact.name);
        holder.txtNumber.setText(contact.number);
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtNumber;
        ImageView imgContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.textNumber);
            imgContact = itemView.findViewById(R.id.imgcontact);

        }


    }

    private void setAnimation(View viewToAnimate, int position) {
        Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        viewToAnimate.startAnimation(slideIn);
    }
}