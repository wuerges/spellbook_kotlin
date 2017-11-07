package com.ew.spellbook.simplespellbook.feature

import android.content.Context
import android.view.LayoutInflater
import android.widget.*

/**
 * A fragment representing a list of Spells.
 *
 *
 * Activities containing this fragment MUST implement the [OnListFragmentInteractionListener]
 * interface.
 */

class SpellView(context: Context, val spell : Spell) : LinearLayout(context) {

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.spell_layout, this)
        val textView = findViewById<TextView>(R.id.spellName)
        val checkMemo = findViewById<CheckBox>(R.id.spellMemo)
        val checkKnown = findViewById<CheckBox>(R.id.spellKnown)
        textView.text = spell.name
        checkMemo.isChecked = spell.memorized
        checkMemo.text = "M"
        checkKnown.isChecked = spell.known
        checkKnown.text = "K"

        checkMemo.setOnCheckedChangeListener {
            _, isChecked -> spell.memorized = isChecked
        }

        checkKnown.setOnCheckedChangeListener {
            _, isChecked -> spell.known = isChecked
        }

    }
}
