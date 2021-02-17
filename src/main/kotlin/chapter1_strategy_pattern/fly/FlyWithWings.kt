package chapter1_strategy_pattern.fly

class FlyWithWings : FlyBehavior {
    override fun fly() = println("I'm flying!!!")
}