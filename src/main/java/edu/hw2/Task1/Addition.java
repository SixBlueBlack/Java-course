package edu.hw2.Task1;

public record Addition(Expr firstConstant, Expr secondConstant) implements Expr {
    @Override
    public double evaluate() {
        return firstConstant.evaluate() + secondConstant.evaluate();
    }
}
