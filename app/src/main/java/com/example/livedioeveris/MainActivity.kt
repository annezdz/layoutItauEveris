package com.example.livedioeveris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItensLista()
    }

    private fun iniciaViews(){
        rvList = findViewById(R.id.rv_list) /*localiza o rv_list criando na activitu_main*/
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)
    }

    /* lista fake para demosntração */
    private fun setItensLista(){
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "cartoes",
                   "img.jpg"
                ),
                MenuItemModel(
                    "comprovantes",
                    "img1.jpg"
                ),
                MenuItemModel(
                    "investimentos",
                    "img2.jpg"
                ),
                MenuItemModel(
                    "portabilidade",
                    "img3.jpg"
                )
            )
        )

    }
}

/*  rv componente android que é o componente visual que recicla as listas, mas precisamos de um
adapter, que é uma classe adaptadora que vai fazer com que tenha o dinamismo de como você quer exibir
cada item
 */