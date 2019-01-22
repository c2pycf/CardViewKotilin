package com.hoho.fang.cardviewkotilindemo.kotilin


import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hoho.fang.cardviewkotilindemo.R

class KcardFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManagerType : LayoutManagerType
    private lateinit var myLayoutManager : RecyclerView.LayoutManager
    private lateinit var dataSet: ArrayList<String>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_card_view,container,false)
        recyclerView = view.findViewById(R.id.kcard_recycle_view)
        myLayoutManager = LinearLayoutManager(activity)//get Activity
        layoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER
        recyclerView.layoutManager = myLayoutManager
        recyclerView.adapter = KcardAdapter(dataSet)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Set up the data of dataSet for recycler view adapter
        prepareDataSet()
    }

    private fun prepareDataSet() {
        //adding data to dataSet
        dataSet = ArrayList()
        dataSet.add("b16")
        dataSet.add("Android")
        dataSet.add("Fun")
    }

    companion object {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    enum class LayoutManagerType{
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }
}