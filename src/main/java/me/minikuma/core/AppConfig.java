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

/**
 * Created by wminikuma@gmail.com on 2020/10/07
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class AppConfig {

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
