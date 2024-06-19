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

public class RecyclerContactAdapter2 extends RecyclerView.Adapter<RecyclerContactAdapter2.ViewHolder> {

    private Context context2;
    private ArrayList<itemModel1> arrContacts2;

    RecyclerContactAdapter2(Context context, ArrayList<itemModel1> arrContacts2) {
        this.context2 = context;
        this.arrContacts2 = arrContacts2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context2).inflate(R.layout.item_row2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (arrContacts2 == null || position < 0 || position >= arrContacts2.size()) {
            return;
        }
        itemModel1 contact = arrContacts2.get(position);
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
        return arrContacts2.size();
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
        Animation slideIn = AnimationUtils.loadAnimation(context2, android.R.anim.slide_in_left);
        viewToAnimate.startAnimation(slideIn);
    }
}
