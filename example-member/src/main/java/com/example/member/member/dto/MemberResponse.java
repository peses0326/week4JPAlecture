package com.example.member.member.dto;

import com.example.member.member.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponse {

    private final Long id;

    private final String name;

    private final String email;

    private final String password;

    public MemberResponse(final Member member) {
        this.id = member.getMemberId();
        this.name = member.getName();
        this.email = member.getEmail();
        this.password = member.getPassword();
    }
}
