package me.minikuma.core.order;

/**
 * Created by wminikuma@gmail.com on 2020/10/06
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
