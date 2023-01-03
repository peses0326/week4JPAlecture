package com.example.member.member.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;

    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    // 게시판 게시글 -> 댓글 1:N 연관관계

    // 내가쓴 댓글 모아보기? 빈번하다 ->> 연관관계 x

    // 유저 -> 1:N -> 게시글 (member_id) fk -> 댓글 ->(post_id)



    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * 연관관계 편의 메서드
     * @param team
     */
    public void setTeam(Team team) {
        this.team = team;
        team.getMemberList().add(this);
    }
}
