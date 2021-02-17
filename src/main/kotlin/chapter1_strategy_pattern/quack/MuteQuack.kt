package chapter1_strategy_pattern.quack

class MuteQuack : QuackBehavior {
    override fun quack() = println("<< Silence >>")
}