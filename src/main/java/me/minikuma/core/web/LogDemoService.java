package me.minikuma.core.web;

import lombok.RequiredArgsConstructor;
import me.minikuma.core.common.MyLogger;
import org.springframework.stereotype.Service;

/**
 * Created by wminikuma@gmail.com on 2020/11/05
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Service
@RequiredArgsConstructor
public class LogDemoService {

//    private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}
