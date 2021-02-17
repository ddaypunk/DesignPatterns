package chapter1_strategy_pattern.ducks

import chapter1_strategy_pattern.fly.FlyBehavior
import chapter1_strategy_pattern.fly.FlyNoWay
import chapter1_strategy_pattern.quack.Quack
import chapter1_strategy_pattern.quack.QuackBehavior

class DuckCall {
    val quackBehavior: QuackBehavior = Quack()
    val flyBehavior: FlyBehavior = FlyNoWay()

    fun display() = println("I'm a duck call!")
}