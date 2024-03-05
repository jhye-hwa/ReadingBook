package com.reading.member.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Table(name = "member")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String client_id;

    @Column(length = 500, nullable = false)
    private String access_token;

    @Column(length = 500, nullable = false)
    private String token_type;

    @Column(length = 500, nullable = false)
    private String refresh_token;

    private String nickname;

    public void changeRefreshToken(String refresh_token){
        this.refresh_token = refresh_token;
    }
}
