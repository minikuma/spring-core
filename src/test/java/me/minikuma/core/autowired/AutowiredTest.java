package me.minikuma.core.autowired;

import me.minikuma.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

/**
 * Created by wminikuma@gmail.com on 2020/10/28
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class AutowiredTest {

    @Test
    @DisplayName("autowired 옵션")
    void autowired_option() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        @Autowired(required = false)
        public void setNoBean1(Member member) {
            System.out.println("No Bean1 = " + member);
        }

        @Autowired
        public void setNoBean2(@Nullable Member member) {
            System.out.println("No Bean2 = " + member);
        }

        @Autowired
        public void setNoBean3(Optional<Member> member) {
            System.out.println("No Bean3 = " + member);
        }
    }
}
