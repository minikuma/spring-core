package me.minikuma.core;

import me.minikuma.core.discount.DiscountPolicy;
import me.minikuma.core.discount.FixDiscountPolicy;
import me.minikuma.core.discount.RateDiscountPolicy;
import me.minikuma.core.member.MemberRepository;
import me.minikuma.core.member.MemberService;
import me.minikuma.core.member.MemberServiceImpl;
import me.minikuma.core.member.MemoryMemberRepository;
import me.minikuma.core.order.OrderService;
import me.minikuma.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wminikuma@gmail.com on 2020/10/07
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Configuration
public class AppConfig {

    // @Bean memberService -> new MemoryMemberRepository()
    // @Bean orderService -> new MemoryMemberRepository()

    @Bean
    public OrderService orderService() {
        System.out.println("Call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("Call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    @Bean
    public MemberService memberService() {
        System.out.println("Call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }
}
