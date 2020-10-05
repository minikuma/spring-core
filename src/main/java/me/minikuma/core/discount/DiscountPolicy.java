package me.minikuma.core.discount;

import me.minikuma.core.member.Member;

/**
 * Created by wminikuma@gmail.com on 2020/10/06
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public interface DiscountPolicy {
    /**
     *
     * @param member
     * @param price
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
