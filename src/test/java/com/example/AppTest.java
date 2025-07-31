package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("1 + 2 == 3")
    void addTest1() {
        // given
        App app = new App();

        // when
        int rs = app.plus(1, 2);
    
        // then
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("3 + 5 == 8")
    void addTest2() {
        // given
        App app = new App();

        // when
        int rs = app.plus(3, 5);

        // then
        assertThat(rs).isEqualTo(8);
    }
}