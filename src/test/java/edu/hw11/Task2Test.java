package edu.hw11;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {
    public static int sum(int a, int b) {
        return a * b;
    }

    @Test
    void task2Test() throws Exception {
        assertThat(new ByteBuddy()
            .subclass(ArithmeticUtils.class)
            .method(ElementMatchers.named("sum"))
            .intercept(MethodDelegation.to(Task2Test.class))
            .make()
            .load(getClass().getClassLoader())
            .getLoaded()
            .getDeclaredConstructor()
            .newInstance()
            .sum(15, 15))
            .isEqualTo(225);
    }
}
