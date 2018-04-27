package com.dluche.testkotlin_1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.dluche.testkotlin_1.MyConstants

import com.dluche.testkotlin_1.R

class MyAdapter(context: Context, source: ArrayList<HashMap<String, String>>, resource: Int) : BaseAdapter() {
    //class MyAdapter() : BaseAdapter() {
    private val context: Context
    private var source: ArrayList<HashMap<String, String>>
    private val resource: Int

    init {
        this.context = context
        this.source = source
        this.resource = resource

    }

    override fun getItem(position: Int): Any {
        return source.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    override fun getCount(): Int {
        return source.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View
        val item: HashMap<String, String> = source.get(position)
        //
        if (convertView == null) {
            val inflater: LayoutInflater = context.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(resource, parent, false)
        } else {
            view = convertView
        }
        //
        val iv_1: ImageView = view.findViewById(R.id.cell_iv1) as ImageView
        val tv_1: TextView = view.findViewById(R.id.cell_tv1) as TextView
        val tv_2: TextView = view.findViewById(R.id.cell_tv2) as TextView
        //
        iv_1.setImageDrawable(context.getDrawable(R.drawable.ic_launcher_background))
        when(item.get(MyConstants.KEY_1) ){
            "0" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_iron_man))
            "1" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_camerica))
            "2" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_hulk))
            "3" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_thor))
            "4" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_black_widow))
            "5" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_spider_man))
            "6" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_panter))
            "7" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_vison))
            "8" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_scarlet_witch))
            "9" -> iv_1.setImageDrawable(context.getDrawable(R.drawable.avg_falcon))

            /*
            *                 "Black Panter",
                "Vision",
                "Scarllet Witch",
                "Falcon"*/
        }
        tv_1.setText(item.get(MyConstants.KEY_1))
        tv_2.setText(item.get(MyConstants.VAL_1))
        //
        return view
    }


}