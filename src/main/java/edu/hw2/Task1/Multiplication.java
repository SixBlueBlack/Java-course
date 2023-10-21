package edu.hw2.Task1;

public record Multiplication(Expr firstMultiplier, Expr secondMultiplier) implements Expr {
    @Override
    public double evaluate() {
        return firstMultiplier.evaluate() * secondMultiplier.evaluate();
    }
}
