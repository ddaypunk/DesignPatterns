package chapter1_strategy_pattern.quack

class Quack : QuackBehavior {
    override fun quack() = println("QUACK!")
}