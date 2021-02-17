package chapter1_strategy_pattern.quack

class Squeak : QuackBehavior {
    override fun quack() = println("SQUEAK!")
}