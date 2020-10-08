package me.minikuma.core;

import me.minikuma.core.member.Grade;
import me.minikuma.core.member.Member;
import me.minikuma.core.member.MemberService;
import me.minikuma.core.order.Order;
import me.minikuma.core.order.OrderService;

/**
 * Created by wminikuma@gmail.com on 2020/10/08
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
