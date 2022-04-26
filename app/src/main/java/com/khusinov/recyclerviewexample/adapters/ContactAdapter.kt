package com.khusinov.recyclerviewexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khusinov.recyclerviewexample.R
import com.khusinov.recyclerviewexample.models.Contact
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactAdapter(var contactList: List<Contact>): RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {



    inner class MyViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
         fun onBind(contact: Contact){
             itemView.name.text = contact.name
             itemView.number.text = contact.number
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_contact , parent , false)
        var viewHolder = MyViewHolder(itemView)
        return viewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         val contact = contactList[position]
        holder.onBind(contact)
    }

    override fun getItemCount(): Int = contactList.size
}