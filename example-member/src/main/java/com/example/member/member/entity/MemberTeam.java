package com.example.member.member.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 다대다 관계를 풀 때 사용하는 매핑 엔티티
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class MemberTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberTeamId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
