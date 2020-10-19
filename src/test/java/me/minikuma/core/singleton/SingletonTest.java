package me.minikuma.core.singleton;

import me.minikuma.core.AppConfig;
import me.minikuma.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/10/20
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class SingletonTest {

    @Test
    @DisplayName("순수한 DI 컨테이너")
    void pure_container() {
        AppConfig appConfig = new AppConfig();
        // 1. 조회: 호출 할 때마다 새로운 객체 생성
        MemberService memberService1 = appConfig.memberService();

        // 2. 조회: 호출 할 때마다 새로운 객체 생성
        MemberService memberService2 = appConfig.memberService();

        // 주소 값으로 새로운 객체가 생성됨을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("싱글톤 패턴 적용한 객체 사용")
    void singleton_service() {
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        assertThat(singletonService1).isSameAs(singletonService2);
    }
}
