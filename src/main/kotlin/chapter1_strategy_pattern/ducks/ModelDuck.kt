package chapter1_strategy_pattern.ducks

import chapter1_strategy_pattern.fly.FlyBehavior
import chapter1_strategy_pattern.fly.FlyNoWay
import chapter1_strategy_pattern.quack.Quack
import chapter1_strategy_pattern.quack.QuackBehavior

class ModelDuck: Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() = println("I'm a model duck")
}