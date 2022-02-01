package com.distructs.dynamicdatastructuresexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.distructs.dynamicdatastructures.*
import com.distructs.dynamicdatastructures.linkedlist.SinglyLinkedList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = SinglyLinkedList<String>()
    }
}