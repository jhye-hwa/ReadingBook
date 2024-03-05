package com.reading.member.repository;

import com.reading.member.domain.Member;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Log4j2
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void testInsert() {

        // Given
        Member member = Member.builder()
                .id(1L)
                .access_token("access_token")
                .client_id("client_id")
                .refresh_token("refresh_token")
                .token_type("token_type")
                .nickname("hyebun")
                .build();


        // When
        Member result = memberRepository.save(member);

        // Then
       log.info(result);
    }

    @Test
    public void testSelect() {
        // Given
        Long id = 1L;

        // When
        Optional<Member> result = memberRepository.findById(id);
        Member member = result.orElseThrow();

        // Then
        assertEquals(member.getId(), 1L);
        assertEquals(member.getAccess_token(), "access_token");
        assertEquals(member.getRefresh_token(), "refresh_token");
        assertEquals(member.getClient_id(), "client_id");
        assertEquals(member.getToken_type(), "token_type");
        assertEquals(member.getNickname(), "hyebun");
    }

    @Test
    public void testUpdate() {
        // Given
        String refresh_token = "update refresh_token";
        Optional<Member> findMember = memberRepository.findById(1L);
        Member member = findMember.orElseThrow();

        // When
        member.changeRefreshToken(refresh_token);
        Member result = memberRepository.save(member);

        // Then
        assertEquals(result.getRefresh_token(), refresh_token);
    }

    @Test
    public void testDeleteId() {
        // Given
        Long id = 1L;

        // When & Then
        memberRepository.deleteById(id);
    }

}