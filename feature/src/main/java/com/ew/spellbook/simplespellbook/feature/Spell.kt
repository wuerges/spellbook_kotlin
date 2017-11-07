package com.ew.spellbook.simplespellbook.feature

/**
 * Created by ew on 06/11/17.
 */
class Spell(
        val name: String,
        val description: String) {
    var memorized : Boolean = false
    var known : Boolean = false

    fun memorizeOrForget() {
        if(memorized) {
            memorized = false;
        }
        else {
            if (!known) known = true;
            memorized = true;
        }
    }
    fun learnOrForget() {
        if(known) {
            memorized = false;
            known = false;
        }
        else {
            known = true;
        }
    }

    companion object {
        val spells : Array<Spell> = arrayOf(
            Spell("Avada Kedavra 1", "Hurray 1"),
            Spell("Avada Kedavra 2", "Hurray 2"),
            Spell("Avada Kedavra 3", "Hurray 3"),
            Spell("Avada Kedavra 4", "Hurray 4"),
            Spell("Avada Kedavra 5", "Hurray 5"),
            Spell("Avada Kedavra 6", "Hurray 6")
        )
    }
}