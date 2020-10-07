package me.minikuma.core;

import me.minikuma.core.discount.FixDiscountPolicy;
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

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
