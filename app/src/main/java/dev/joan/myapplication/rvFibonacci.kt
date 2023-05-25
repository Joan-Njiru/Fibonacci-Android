package dev.joan.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRVAdapter(var fiboList: List<Int>):RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numView=LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter,parent,false)
        return NumbersViewHolder(numView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentNumber=fiboList.get(position).toString()
        holder.tvRvNum.text=currentNumber
    }

    override fun getItemCount(): Int {
        return fiboList.size
    }


}

class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvRvNum=itemView.findViewById<TextView>(R.id.tvRvNum)
}