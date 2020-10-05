package me.minikuma.core.order;

import me.minikuma.core.discount.DiscountPolicy;
import me.minikuma.core.discount.FixDiscountPolicy;
import me.minikuma.core.member.Member;
import me.minikuma.core.member.MemberRepository;
import me.minikuma.core.member.MemoryMemberRepository;

/**
 * Created by wminikuma@gmail.com on 2020/10/06
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
