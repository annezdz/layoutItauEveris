package com.example.livedioeveris

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*O RecyclerView.Adapter pede uma view holder (VH) que é uma classe que vai gerenciar cada posicao
da nossa lista
 */
class MenuItemAdapter: RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>() {

    /*classe VH criada, herdando de RecyclerViewHolder
    O construtor da VH pede uma View, que é criada no construtor
    na val list vamos criar uma lista mutável da classe MenuItemModel
    na implementação da val view, é informado o parent.context pois é ela
    que está acima desse adapter e chamamos o inflate, pois conseguimos inflar, criar esse menu
    no adapter*/

    private val list = mutableListOf<MenuItemModel>()

    class MenuItemAdapterViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        /*carregamento lento. O by lazy só vai ser iniciado quando for feito o set .
        * O lateinit funcionaria também. */
        private val tvTitle by lazy{
            itemView.findViewById<TextView>(R.id.tv_title)
        }
        fun iniciaViews(item:MenuItemModel){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        //aqui vamos literalmente inflar o menu no adapter, para isso passamos o layout, o parent e false).
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_menu,parent,false)
        return MenuItemAdapterViewHolder(view)
        //essa view é a que foi passada no parâmentro acima
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        //usa-se o holder, a variavel view e a posição
        holder.iniciaViews(list[position])
    }

    /* Método para limpar a lista e depois setar ela com todos os dados,
    * impedindo assim a duplicação de dados */

    fun setItensList(lista:List<MenuItemModel>){
        this.list.clear()
        this.list.addAll(list)
    }
}
