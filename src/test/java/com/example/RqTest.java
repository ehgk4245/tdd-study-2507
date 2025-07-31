package com.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RqTest {

    @Test
    @DisplayName("rq.getActionName()")
    void t1() {
        // given
        Rq rq = new Rq("수정?id=1");

        // when
        String actionName = rq.getActionName();

        // then
        Assertions.assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName("rq.getActionName()")
    void t2() {
        // given
        Rq rq = new Rq("삭제?id=1");

        // when
        String actionName = rq.getActionName();

        // then
        Assertions.assertThat(actionName).isEqualTo("삭제");
    }
}