package chapter1_strategy_pattern.ducks

import chapter1_strategy_pattern.fly.FlyBehavior
import chapter1_strategy_pattern.fly.FlyWithWings
import chapter1_strategy_pattern.quack.Quack
import chapter1_strategy_pattern.quack.QuackBehavior

class MallardDuck : Duck() {
    override var quackBehavior: QuackBehavior = Quack()
    override var flyBehavior: FlyBehavior = FlyWithWings()

    override fun display() = println("I'm a real mallard duck!!!")
}