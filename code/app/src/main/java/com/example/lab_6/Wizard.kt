package com.example.lab_6

/**
 * Represents a wizard character that can cast spells using mana
 * A wizard has a name, current mana, and spell power stat. The
 * wizard needs sufficient mana to cast spells, and spell power
 * is used to calculate how much damage is dealt when a valid
 * spell is cast.
 *
 * @property name the name of the wizard
 * @property mana the amount of magic power available for casting spells
 * @property spellPower strength of the spell cast, it's used for damage calculation
 */
class Wizard(val name: String, var mana: Int, var spellPower: Int) {

    /**
     * Casts a spell and return damage dealt
     *
     * Supported spells:
     * - "Explosion": costs 10 mana, deals 3 × spellPower damage
     * - "Frostbite": costs 5 mana, deals 2 × spellPower damage
     *
     * If the wizard does not have enough mana or the spell name is invalid,
     * the spell fails and returns 0.
     *
     * @param spell name of the spell cast by the user
     * @return integer for damage dealt, 0 if spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }
}