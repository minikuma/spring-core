package me.minikuma.core.order;

import me.minikuma.core.member.Grade;
import me.minikuma.core.member.Member;
import me.minikuma.core.member.MemberService;
import me.minikuma.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by wminikuma@gmail.com on 2020/10/06
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertEquals(order.getDiscountPrice(), 1000);
    }
}
