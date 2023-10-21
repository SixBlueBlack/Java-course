package edu.hw2;

import edu.hw2.Task4.CallingInfoManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("class name test")
    void classNameTest() {
        CallingInfoManager.CallingInfo callingInfo = CallingInfoManager.callingInfo();
        assertThat(callingInfo.className()).isEqualTo(this.getClass().getName());
    }

    @Test
    @DisplayName("method name test")
    void methodNameTest() {
        CallingInfoManager.CallingInfo callingInfo = CallingInfoManager.callingInfo();
        assertThat(callingInfo.methodName()).isEqualTo(new Object() {}.getClass().getEnclosingMethod().getName());
    }
}
