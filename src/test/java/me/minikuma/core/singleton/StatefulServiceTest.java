package me.minikuma.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/10/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
class StatefulServiceTest {

    @Test
    @DisplayName("상태를 가진 객체를 싱글톤으로 하게 되면 문제 발생")
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // Thread A: A 사용자 10,000원 주문
        statefulService1.order("userA", 10000);
        // Thread B: B 사용자 20,000원 주문
        statefulService2.order("userB", 20000);

        int price = statefulService1.getPrice(); // 20,000원
        System.out.println("price = " + price);

        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}