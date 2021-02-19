package chapter1_assignment.characters

import chapter1_assignment.weapons.KnifeBehavior
import chapter1_assignment.weapons.WeaponBehavior

class King : Character() {
    override var weaponBehavior: WeaponBehavior = KnifeBehavior()
}