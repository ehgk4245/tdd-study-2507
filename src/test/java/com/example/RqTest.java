package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RqTest {

    @Test
    @DisplayName("rq.getActionName()")
    void t1() {
        // given
        Rq rq = new Rq("수정?id=1");

        // when
        String actionName = rq.getActionName();

        // then
        assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName("rq.getActionName()")
    void t2() {
        // given
        Rq rq = new Rq("삭제?id=1");

        // when
        String actionName = rq.getActionName();

        // then
        assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName("등록?이름=홍길동 : rq.getParam(\"이름\", \"\")")
    void t3() {
        // given
        Rq rq = new Rq("등록?이름=홍길동");

        // when
        String rs = rq.getParam("이름", "");

        // then
        assertThat(rs).isEqualTo("홍길동");
    }

    @Test
    @DisplayName("등록?고향=동해 : rq.getParam(\"고향\", \"\")")
    void t4() {
        // given
        Rq rq = new Rq("등록?고향=동해");

        // when
        String rs = rq.getParam("고향", "");

        // then
        assertThat(rs).isEqualTo("동해");
    }

    @Test
    @DisplayName("등록 : rq.getParam(\"고향\", \"\")")
    void t5() {
        // given
        Rq rq = new Rq("등록");

        // when
        String rs = rq.getParam("고향", "");

        // then
        assertThat(rs).isEmpty();
    }
}