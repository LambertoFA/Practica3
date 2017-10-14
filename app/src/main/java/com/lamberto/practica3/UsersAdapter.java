package com.lamberto.practica3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lamberto on 07/10/2017.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ViewHolder>
{
    private Context context;
    private List<Users> usersList;

    public UsersAdapter(Context context, List<Users> usersList) {
        this.context = context;
        this.usersList = usersList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Users user = usersList.get(position);
        holder.nombre.setText(user.getNombre());
        holder.edad.setText(user.getEdad());
        holder.telefono.setText(user.getTelefono());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public  static  class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombre, edad, telefono;
        public ViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            edad = (TextView) itemView.findViewById(R.id.edad);
            telefono = (TextView) itemView.findViewById(R.id.telefono);
        }
    }
}
