package chapter1_assignment.characters

import chapter1_assignment.weapons.AxeBehavior
import chapter1_assignment.weapons.WeaponBehavior

class Troll : Character() {
    override var weaponBehavior: WeaponBehavior = AxeBehavior()
}