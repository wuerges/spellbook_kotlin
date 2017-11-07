package com.ew.spellbook.simplespellbook.feature

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by ew on 06/11/17.
 */
class SpellListAdapter(val context : Context, val spells : Array<Spell>) : BaseAdapter() {

    override fun isEmpty(): Boolean {
        return spells.isEmpty()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return SpellView(context, spells[position])
    }

    override fun getItem(position: Int): Any {
        return spells[position];
    }

    override fun getCount(): Int {
        return spells.size
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }
}