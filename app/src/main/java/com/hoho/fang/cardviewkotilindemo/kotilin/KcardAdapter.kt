package com.hoho.fang.cardviewkotilindemo.kotilin

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hoho.fang.cardviewkotilindemo.R


class KcardAdapter(var dataSet : List<String>) : Adapter<KcardAdapter.KcardViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): KcardViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.item_card_view,p0,false)
        return KcardViewHolder(v)
    }

    override fun getItemCount() = dataSet.size //replace return data.size in fun class

    override fun onBindViewHolder(p0: KcardViewHolder, p1: Int) {
        p0.tvCard1.text = "tv_card_1"
        p0.tvCard2.text = "tv_card_2"
        p0.tvCard3.text = "tv_card_3"
    }


    class KcardViewHolder(v : View) : RecyclerView.ViewHolder(v){
        val tvCard1 : TextView
        val tvCard2 : TextView
        val tvCard3 : TextView
        init {
            //Bind ID with views and set up listeners
            tvCard1 = v.findViewById(R.id.tv_card_1)
            tvCard2 = v.findViewById(R.id.tv_card_2)
            tvCard3 = v.findViewById(R.id.tv_card_3)
            tvCard1.setOnClickListener {
                //Listener here
                Log.e(TAG,"Text view is clicked")

            }

        }
    }

    companion object {
        private val TAG = "KcardAdapter"
    }
}