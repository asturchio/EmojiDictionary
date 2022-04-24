package com.example.emojidictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emojidictionary.databinding.ActivityMainBinding

class EmojiAdapter : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row,parent))
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        holder
    }

    override fun getItemCount(): Int {
        return 10
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private lateinit var itemTextView: TextView
        var view : View = v
        var emoji : String = ""
        fun bindEmoji(emoji:String) {
            setContentView
            itemTextView = findViewById(R.id.itemTextView)
            this.emoji = emoji
            view.itemTextView.text = emoji

        }
        override fun onClick(v: View?) {

        }
    }


}