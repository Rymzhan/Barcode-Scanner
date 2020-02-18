package com.example.dimash.barcodescanner.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.dimash.barcodescanner.R
import com.example.dimash.barcodescanner.data.model.firm.Data
import com.example.dimash.barcodescanner.ui.adapters.FirmAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //dataList
    private val dataList: MutableList<Data> = mutableListOf()
    private lateinit var firmAdapter: FirmAdapter

    //Navigation
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        bottom_nav.setupWithNavController(navController)
/*

        //setup adapter
        firmAdapter = FirmAdapter(dataList)

        //setup recyclerview
        my_recycler_view.layoutManager = LinearLayoutManager(this)
        my_recycler_view.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        my_recycler_view.adapter = firmAdapter

        AndroidNetworking.get("https://api.kmf.kz:8443/practice/firmList")
            .build()
            .getAsObject(FirmStructure::class.java, object : ParsedRequestListener<FirmStructure>{
                override fun onResponse(response: FirmStructure?) {
                    if (response != null) {
                        dataList.addAll(response.data)
                        firmAdapter.notifyDataSetChanged()
                    }
                }

                override fun onError(anError: ANError?) {

                }

            })
*/

    }




}
