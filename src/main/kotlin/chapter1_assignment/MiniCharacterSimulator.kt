package chapter1_assignment

import chapter1_assignment.characters.*
import chapter1_assignment.weapons.GreatSwordBehavior

fun main() {
    println("A troll has arrived in the throne room! Defend the King!")
    val knight = Knight()
    val queen = Queen()
    val king = King()
    val troll = Troll()

    println("The troll ${troll.weaponBehavior.useWeapon()}")
    println("The knight ${knight.weaponBehavior.useWeapon()}")
    println("The king ${king.weaponBehavior.useWeapon()}")
    println("The queen ${queen.weaponBehavior.useWeapon()}")

    println("They notice the knife and arrows do little to the tough hide of the troll!")
    println("They decide to don new weapons!")

    knight.weaponBehavior = GreatSwordBehavior()
    queen.weaponBehavior = GreatSwordBehavior()
    king.weaponBehavior = GreatSwordBehavior()

    println("The troll swings it's might axe again, but our characters avoid the blow and strike back!")
    println("The troll ${troll.weaponBehavior.useWeapon()}")
    println("The knight ${knight.weaponBehavior.useWeapon()}")
    println("The king ${king.weaponBehavior.useWeapon()}")
    println("The queen ${queen.weaponBehavior.useWeapon()}")

    println("The troll is badly hurt and runs away! The kingdom is saved!")
}