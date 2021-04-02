package com.example.profileiconfrominitials

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.TextDrawable
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.example.profileiconfrominitials.databinding.ItemLayoutLibraryBinding


/**
 * Text Drawable Library
 */
class EmailAdapterWithLibrary(var list: ArrayList<Email>) :
    RecyclerView.Adapter<EmailAdapterWithLibrary.EmailVh>() {

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailVh {
        if (context == null)
            context = parent.context

        val layoutBinding =
            ItemLayoutLibraryBinding.inflate(LayoutInflater.from(context), parent, false)

        return EmailVh(layoutBinding)
    }

    override fun onBindViewHolder(holder: EmailVh, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private fun getNameInitials(fullName: String): String {
        return fullName[0].toUpperCase().toString()
    }

    inner class EmailVh(var layoutBinding: ItemLayoutLibraryBinding) :
        RecyclerView.ViewHolder(layoutBinding.root) {

        fun bind(position: Int) {

            val email = list[position]

            layoutBinding.nameText.text = email.fullName
            layoutBinding.subjectText.text = email.subject
            layoutBinding.bodyText.text = email.body
            layoutBinding.dateText.text = email.time


            //--------------Rounded Image Drawable Start-----------------
            val generator = ColorGenerator.MATERIAL
            val color = generator.randomColor

            val roundedTextDrawable = TextDrawable.builder()
                .beginConfig()
                .width(48)
                .height(48)
                .endConfig()
                .buildRound(getNameInitials(email.fullName), color)

            layoutBinding.personImage.setImageDrawable(roundedTextDrawable)
            //--------------Rounded Image Drawable End-----------------

        }

    }
}