package com.jaime.shopplatzi

import android.app.Activity
import android.content.Intent
import android.util.Pair
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.item_landing.view.*


class AdapterLanding(val data:List<ItemLanding>): RecyclerView.Adapter<AdapterLanding.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder(parent?.inflate(R.layout.item_landing))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder?.bindView(data[position])
    }

    class Holder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindView(itemLanding: ItemLanding){

            with(itemLanding){

                itemView.txtTitleItem.text = title
                itemView.txtDescItem.text = desc
                itemView.txtPriceItem.text = "$ ${String.format("%.2f", price)}"

                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra("title", title)
                    intent.putExtra("desc", desc)
                    intent.putExtra("price", price)

                    val p1: Pair<View, String>? = Pair.create(itemView.imgItemHeader, "transitionHeader")
                    val p2: Pair<TextView, String>? = Pair.create(itemView.txtTitleItem, "transitionTitle")
                    val p3: Pair<TextView, String>? = Pair.create(itemView.txtDescItem, "transitionDesc")
                    val p4: Pair<TextView, String>? = Pair.create(itemView.txtPriceItem, "transitionPrice")

                    val options: androidx.core.app.ActivityOptionsCompat = androidx.core.app.ActivityOptionsCompat.makeSceneTransitionAnimation(itemView.context as Activity, p1, p2)

                    (itemView.context as Activity).startActivities(arrayOf(intent), options.toBundle())
                }

            }


        }
    }

}