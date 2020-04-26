package com.example.collegeguru.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.collegeguru.R
import com.example.collegeguru.model.HomeItem

class HomeAdapters(var context: Context, var arrayList: ArrayList<HomeItem>): BaseAdapter() {

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = View.inflate(context, R.layout.card_view_item_grid, null)
        var icon: ImageView = view.findViewById(R.id.icon)
        var name: TextView = view.findViewById(R.id.name)

        var homeItem: HomeItem = arrayList.get(position)
        icon.setBackgroundColor(R.color.colorPrimary)

//        icon.setImageResource(homeItem.icon!!)
        name.text = homeItem.name

        return view
    }

}