package me.minikuma.core.member;

import me.minikuma.core.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by wminikuma@gmail.com on 2020/10/05
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class MemberServiceTest {

    private MemberService memberService;

    @BeforeEach
    public void init() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    @DisplayName("member를 가입한다.")
    void join() {
        // given
        Member member = new Member(1l, "MemberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertEquals(member, findMember);
    }
}
