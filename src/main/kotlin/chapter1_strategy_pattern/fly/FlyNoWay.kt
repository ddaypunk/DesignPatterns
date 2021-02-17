package chapter1_strategy_pattern.fly

class FlyNoWay : FlyBehavior {
    override fun fly() = println("I can't fly!")
}