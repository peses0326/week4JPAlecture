package com.example.member.member.util;

import com.example.member.member.entity.Member;
import com.example.member.member.entity.Team;
import com.example.member.member.repository.MemberRepository;
import com.example.member.member.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class SampleApplicationRunner implements ApplicationRunner {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        Member member1 = new Member("윤지용", "jyyoon@naver.com", "1234");
        Member member2 = new Member("손윤주", "yjson@naver.com", "3421");

        memberRepository.save(member1);
        memberRepository.save(member2);

        Team team = new Team("A팀");
        teamRepository.save(team);

        member1.setTeam(team);
        member2.setTeam(team);


        // 팀에 속한 모든 멤버이름을 프린트 해주세요.
        // 이 코드는 연관 관계 편의 메소드를 사용하지 않았다면 새로 조회하더라도 멤버들의 이름을 출력할 수 없다.
        Team selectedTeam = teamRepository.findById(team.getTeamId()).get();
        for (Member member : selectedTeam.getMemberList()) {
            System.out.println("member.getName() = " + member.getName());
        }

        System.out.println("같은 객체 = " + team.equals(selectedTeam));
    }
}
