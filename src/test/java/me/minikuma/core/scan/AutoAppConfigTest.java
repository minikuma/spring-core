package me.minikuma.core.scan;

import me.minikuma.core.AutoAppConfig;
import me.minikuma.core.member.MemberRepository;
import me.minikuma.core.member.MemberService;
import me.minikuma.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/10/22
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class AutoAppConfigTest {

    @Test
    @DisplayName("Component scan 을 통한 기본 빈 스캔")
    void basic_scan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

        OrderServiceImpl bean = ac.getBean(OrderServiceImpl.class);
        MemberRepository memberRepository = bean.getMemberRepository();
        System.out.println("memberRepository = " + memberRepository);
    }
}
