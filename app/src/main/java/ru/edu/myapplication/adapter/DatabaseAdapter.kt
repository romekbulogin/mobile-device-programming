package ru.edu.myapplication.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_database.view.*
import ru.edu.myapplication.R
import ru.edu.myapplication.dto.Database

class DatabaseAdapter : RecyclerView.Adapter<DatabaseAdapter.ViewHolder>() {
    private var databases = mutableListOf<Database>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatabaseAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_database, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DatabaseAdapter.ViewHolder, position: Int) {
        holder.itemView.item_dbms.text = databases[position].dbms
        holder.itemView.item_db.text = databases[position].database
        if (databases[position].dbms == "Postgre")
            holder.itemView.dbms_image.setImageResource(R.drawable.postgresicon)
        if (databases[position].dbms == "MSSQL")
            holder.itemView.dbms_image.setImageResource(R.drawable.e215fbdada42f37f18934d6566726813)
        if (databases[position].dbms == "MySQL")
            holder.itemView.dbms_image.setImageResource(R.drawable._7fae1eb8c67cd36b2302ff2849365e9)
    }

    override fun getItemCount(): Int = databases.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: MutableList<Database>) {
        this.databases = list
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}