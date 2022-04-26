package com.khusinov.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.khusinov.recyclerviewexample.adapters.ContactAdapter
import com.khusinov.recyclerviewexample.models.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var contactList:ArrayList<Contact>
    lateinit var contactAdapter: ContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        contactAdapter = ContactAdapter(contactList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = contactAdapter

    }

    private fun loadData() {
        contactList = ArrayList()
        for (i in 1 until 100){
            contactList.add(Contact("Shaxryor Xuisnov $i" , "998 94 233 17 05"))
        }
    }
}