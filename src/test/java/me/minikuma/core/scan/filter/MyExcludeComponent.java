package me.minikuma.core.scan.filter;

import java.lang.annotation.*;

/**
 * Created by wminikuma@gmail.com on 2020/10/26
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
