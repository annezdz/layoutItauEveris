package com.example.livedioeveris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<MenuItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList = findViewById(R.id.rv_list)
        rvList.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        rvList.adapter = photoAdapter

        dataList.add(MenuItemModel("cartões",R.drawable.i_cartao))

    }



    }
}

/*  rv componente android que é o componente visual que recicla as listas, mas precisamos de um
adapter, que é uma classe adaptadora que vai fazer com que tenha o dinamismo de como você quer exibir
cada item
 */