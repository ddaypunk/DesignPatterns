package chapter1_strategy_pattern.fly

class FlyRocketPowered: FlyBehavior {
    override fun fly() = println("I'm flying with a rocket!")
}