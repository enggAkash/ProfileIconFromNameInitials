package com.example.profileiconfrominitials

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.profileiconfrominitials.databinding.ItemLayoutShapeDrawableBinding
import kotlin.math.roundToInt

/**
 * CUSTOM SHAPE DRAWABLE
 */
class EmailAdapterWithShapeDrawable(var list: ArrayList<Email>) :
    RecyclerView.Adapter<EmailAdapterWithShapeDrawable.EmailVh>() {

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailVh {
        if (context == null)
            context = parent.context

        val layoutBinding =
            ItemLayoutShapeDrawableBinding.inflate(LayoutInflater.from(context), parent, false)

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

    private fun getNameInitialsBg(): Drawable? {
        val drawables = arrayOf(
            R.drawable.name_bg1, R.drawable.name_bg2,
            R.drawable.name_bg3, R.drawable.name_bg4, R.drawable.name_bg5,
            R.drawable.name_bg6, R.drawable.name_bg7, R.drawable.name_bg8
        )

        return ContextCompat.getDrawable(context!!, drawables[(Math.random() * 7).roundToInt()])
    }

    inner class EmailVh(var layoutBinding: ItemLayoutShapeDrawableBinding) :
        RecyclerView.ViewHolder(layoutBinding.root) {

        fun bind(position: Int) {

            val email = list[position]

            layoutBinding.nameInitialsText.text = getNameInitials(email.fullName)
            layoutBinding.nameText.text = email.fullName
            layoutBinding.subjectText.text = email.subject
            layoutBinding.bodyText.text = email.body
            layoutBinding.dateText.text = email.time

            //--------------Rounded Image Drawable Start-----------------
            layoutBinding.nameInitialsText.background = getNameInitialsBg()
            //--------------Rounded Image Drawable End-----------------

        }

    }


}