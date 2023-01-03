package com.example.member.member.controller;

import com.example.member.member.dto.MemberResponse;
import com.example.member.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    private List<MemberResponse> getMembers() {
        return memberService.findAllMember();
    }

    @GetMapping("/{id}")
    private MemberResponse getMember(@PathVariable Long id) {
        return memberService.findMemberBy(id);
    }
}
