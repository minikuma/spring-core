package me.minikuma.core.member;

/**
 * Created by wminikuma@gmail.com on 2020/10/05
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
