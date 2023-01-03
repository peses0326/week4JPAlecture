package com.example.member.member.service;

import com.example.member.member.dto.MemberResponse;
import com.example.member.member.entity.Member;
import com.example.member.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberResponse> findAllMember() {
        List<Member> members = memberRepository.findAll();

        List<MemberResponse> memberResponses = new ArrayList<>();
        for (Member member : members) {
            memberResponses.add(new MemberResponse(member));
        }
        members.forEach(member -> memberResponses.add(new MemberResponse(member)));
        return memberResponses;
    }

    public MemberResponse findMemberBy(Long id) {
        Optional<Member> optional = memberRepository.findById(id);
        if (optional.isEmpty()) {
            throw new NullPointerException("회원 상세 조회 실패");
//            throw new IllegalArgumentException("회원 상세 조회 실패, target:" + id);
        }
        Member member = optional.get();
        return new MemberResponse(member);
    }
}
