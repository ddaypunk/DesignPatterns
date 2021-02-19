package chapter1_assignment.characters

import chapter1_assignment.weapons.SwordBehavior
import chapter1_assignment.weapons.WeaponBehavior

class Knight : Character() {
    override var weaponBehavior: WeaponBehavior = SwordBehavior()
}