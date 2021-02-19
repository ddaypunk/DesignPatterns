package chapter1_assignment.characters

import chapter1_assignment.weapons.BowAndArrowBehavior
import chapter1_assignment.weapons.WeaponBehavior

class Queen : Character() {
    override var weaponBehavior: WeaponBehavior = BowAndArrowBehavior()
}