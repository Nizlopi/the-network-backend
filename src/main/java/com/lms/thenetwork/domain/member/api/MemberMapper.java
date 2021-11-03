package com.lms.thenetwork.domain.member.api;

import com.lms.thenetwork.domain.member.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    public Member toEntity (MemberDTO memberDTO) {
        return new Member(memberDTO.getUsername(), memberDTO.getEmail(), memberDTO.getPassword());
    }

    public MemberDTO toMemberDTO (Member member) {
        return new MemberDTO()
                .withUsername(member.getUsername())
                .withEmail(member.getEmail())
                .withPassword(member.getPassword());
    }
}
