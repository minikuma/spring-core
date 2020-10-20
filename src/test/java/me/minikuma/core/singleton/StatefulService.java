package me.minikuma.core.singleton;

/**
 * Created by wminikuma@gmail.com on 2020/10/21
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class StatefulService {

    private int price; // stateful field

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
