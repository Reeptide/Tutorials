package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tutorials.databinding.ActivityMainBinding

data class Person(val name: String, val age: Int)


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val contact = createContacts()
        binding.rvContacts.adapter = ContactsAdapter(this, contact)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)


    }
    private fun createContacts() : List<Person>{
        val contacts : MutableList<Person> = mutableListOf<Person>()
        for (i in 1..100){
            contacts.add(Person("Person $i" , i))

        }
        return contacts
    }
}