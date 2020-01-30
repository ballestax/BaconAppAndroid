package com.ballestax.baconapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ballestax.baconapp.model.DataProvider
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_row.view.*
import java.text.DecimalFormat


class MainAdapter(val dataProvider: DataProvider ) : RecyclerView.Adapter<CustomViewHolder>() {




    //NumberOfItems
    override fun getItemCount(): Int {
        return dataProvider?.getProducts()?.size!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.product_row, parent, false)


        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val product = dataProvider.getProducts()?.get(position)

        val DF = DecimalFormat("###,###,###.##")

        //if(position%2!=0)
            //holder.view.setBackgroundColor(Color.LTGRAY)
        //else
            //holder.view.setBackgroundColor(Color.GRAY)


        holder.view.tvName.text = product?.name?.toUpperCase()
        holder.view.tvDescription.text = product?.description
        holder.view.tvCategory.text = product?.category?.toUpperCase()
        holder.view.tvPrice.text = DF.format(product?.price)

        val path = "http://baconapp.deroelectoral.com/img/"
        val photoImageView = holder?.view?.photoImageView
        Picasso.get().load(path+product?.image).into(photoImageView)


    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}