package com.example.aplikasikasirsederhana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button


class MenuAdapter(private var makananList: List<Menu>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView: TextView = view.findViewById(R.id.textView)
        val priceTextView: TextView = view.findViewById(R.id.priceTextView)
        val buttonPlus: Button = view.findViewById(R.id.buttonPlus)
        val buttonMinus: Button = view.findViewById(R.id.buttonMinus)
        val textViewQuantity: TextView = view.findViewById(R.id.textViewQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val menu = makananList[position]
        holder.imageView.setImageResource(menu.imageResId)
        holder.textView.text = menu.name
        holder.priceTextView.text = menu.price
        holder.textViewQuantity.text = menu.quantity.toString()
        holder.buttonPlus.setOnClickListener {
            menu.quantity++
            holder.textViewQuantity.text = menu.quantity.toString()
            notifyItemChanged(position)
        }
        holder.buttonMinus.setOnClickListener {
            if (menu.quantity > 0) {
                menu.quantity--
                holder.textViewQuantity.text = menu.quantity.toString()
                notifyItemChanged(position)
            }
        }
    }
    override fun getItemCount(): Int {
        return makananList.size
    }
}



