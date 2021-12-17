package com.example.listview.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.listview.Model.Datos;


import java.util.List;

public class DatosAdaptar extends RecyclerView.Adapter<DatosAdaptar.DatosViewHolder> {
    private Context Ctx;
    private List<Datos> lstDatos;

    public DatosAdaptar(Context mCtx, List<Datos> usuarios) {
        this.lstDatos = usuarios;
        Ctx = mCtx;
    }
    @Override
    public DatosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.item_usuario, null);
        return new DatosViewHolder(view);
    }
    @Override
    public void onBindViewHolder(DatosViewHolder holder, int position) {

        Datos datos = lstDatos.get(position);

        holder.textViewIssue.setText(datos.getIdevaluador());
        holder.textViewVolume.setText(datos.getNombres());
        holder.textViewNumber.setText(datos.getArea());
        holder.textViewYear.setText(datos.getImgJPG());
        holder.textViewDatePub.setText(datos.getImgjpg());
        Glide.with(Ctx)
                .load(datos.)
                .into(holder.imageView);

    }

}
