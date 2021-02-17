package chapter1_strategy_pattern

import chapter1_strategy_pattern.ducks.Duck
import chapter1_strategy_pattern.ducks.DuckCall
import chapter1_strategy_pattern.ducks.MallardDuck
import chapter1_strategy_pattern.ducks.ModelDuck
import chapter1_strategy_pattern.fly.FlyRocketPowered


fun main(){
    val mallard: Duck = MallardDuck()
    mallard.display()
    mallard.performQuack()
    mallard.performFly()

    val model: Duck = ModelDuck()
    model.display()
    model.performFly()
    model.flyBehavior = FlyRocketPowered() // Question: isn't immutability preferred to? Setters are against this
    model.performFly()

    val call = DuckCall()
    call.display()
    call.quackBehavior.quack()
    call.flyBehavior.fly()
}