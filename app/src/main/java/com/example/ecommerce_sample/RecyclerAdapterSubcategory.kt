package com.example.ecommerce_sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapterSubcategory(listdata: Array<ListData>) :
    RecyclerView.Adapter<RecyclerAdapterSubcategory.ViewHolder>(){
    private val listdata: Array<ListData>
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View =
            layoutInflater.inflate(R.layout.list_item_used, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ListData: ListData = listdata[position]
        holder.textView.setText(listdata[position].description)
        holder.imageView.setImageResource(listdata[position].imgId)
        holder.relativeLayout.setOnClickListener { view ->
            Toast.makeText(
                view.context,
                "click on item: " + ListData.description,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var relativeLayout: RelativeLayout

        init {
            imageView = itemView.findViewById<View>(R.id.imageView) as ImageView
            textView = itemView.findViewById<View>(R.id.textView) as TextView
            relativeLayout = itemView.findViewById<View>(R.id.relativeLayout) as RelativeLayout
        }
    }

    // RecyclerView recyclerView;
    init {
        this.listdata = listdata
    }



}