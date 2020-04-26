package com.example.collegeguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.collegeguru.adapters.HomeAdapters
import com.example.collegeguru.model.HomeItem

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var homeItems: ArrayList<HomeItem> ? = null
    private var gridView: GridView ? = null
    private var itemAdapter: HomeAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.grid_view)
        homeItems = ArrayList()
        homeItems = setData()

        itemAdapter = HomeAdapters(applicationContext, homeItems!!)
        gridView?.adapter = itemAdapter
        gridView?.onItemClickListener = this

    }

    private fun setData() : ArrayList<HomeItem> {
        var items: ArrayList<HomeItem> = ArrayList()

        items.add(HomeItem(R.drawable.ic_launcher_background, "Exams"))
        items.add(HomeItem(R.drawable.ic_launcher_background, "College"))
        items.add(HomeItem(R.drawable.ic_launcher_background, "Exams"))
        items.add(HomeItem(R.drawable.ic_launcher_background, "Exams"))

        return items
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item = homeItems!!.get(position)
        Toast.makeText(applicationContext, item.name, Toast.LENGTH_LONG).show()
    }
}
