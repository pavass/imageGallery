package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

private lateinit var blogAdapter: BlogRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSet()

    }



    private fun addDataSet(){
        val data=DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.apply{
            layoutManager=LinearLayoutManager(this@MainActivity)
            val topSpacingDecoration=TopSpacingItemDecoration(30)//helps in spacing in recycler view
            addItemDecoration(topSpacingDecoration)//helps in spacing
            blogAdapter=BlogRecyclerAdapter()
            adapter=blogAdapter
        }
    }
}
