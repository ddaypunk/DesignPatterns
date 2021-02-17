package chapter1_strategy_pattern.ducks

import chapter1_strategy_pattern.fly.FlyBehavior
import chapter1_strategy_pattern.quack.QuackBehavior

abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() = flyBehavior.fly()
    fun performQuack() = quackBehavior.quack()
    fun swim() = println("All ducks float, even decoys!")
}