package com.ew.spellbook.simplespellbook.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView

class Spellbook : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spellbook)

        val listView = findViewById<ListView>(R.id.spell_list)

        listView.adapter = SpellListAdapter(this, Spell.spells)

    }
}
