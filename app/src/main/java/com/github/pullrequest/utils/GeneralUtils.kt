package com.github.pullrequest.utils

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import com.cunoraz.tagview.Tag
import com.github.pullrequest.data.models.local.Label

object GeneralUtils {

    fun parseSearchResult(query: String): List<String> {
        return query.split("/")
    }

    /**
     * Transforms list of [Label] to list of [Tag]
     */
    fun generateTagListFromLabels(labels: List<Label>): MutableList<Tag>? {
        val list = mutableListOf<Tag>()
        for (label in labels) {
            //create the tag from label
            val tag = Tag(label.name)
            val backgroundDrawable = GradientDrawable()
            backgroundDrawable.cornerRadius = 16.0f
            try {
                backgroundDrawable.setColor(Color.parseColor("#${label.color}"))
            } catch (e: Exception) {
                backgroundDrawable.setColor(Color.parseColor("#212121"))
            }
            tag.background = backgroundDrawable
            tag.tagTextSize = 12.0f
            //add the tag to the list
            list.add(tag)
        }

        return list
    }
}