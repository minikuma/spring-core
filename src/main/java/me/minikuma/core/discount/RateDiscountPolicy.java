package me.minikuma.core.discount;

import me.minikuma.core.annotation.MainDiscountPolicy;
import me.minikuma.core.member.Grade;
import me.minikuma.core.member.Member;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by wminikuma@gmail.com on 2020/10/07
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
