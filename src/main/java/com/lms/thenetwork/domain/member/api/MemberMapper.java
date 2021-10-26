package com.lms.thenetwork.domain.member.api;

import com.lms.thenetwork.domain.member.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    public Member toEntity (MemberDTO memberDTO) {
        return new Member(memberDTO.isAccountEnabled(), memberDTO.getMembershipType(), memberDTO.getEmail(), memberDTO.getCompanyName(), memberDTO.getFirstName(), memberDTO.getLastName(), memberDTO.getPassword(), memberDTO.getPhotoUrl());
    }

    public MemberDTO toMemberDTO (Member member) {
        return new MemberDTO()
                .withAccountEnabled(member.isAccountEnabled())
                .withMembershipType(member.getMembershipType())
                .withEmail(member.getEmail())
                .withCompanyName(member.getCompanyName())
                .withFirstName(member.getFirstName())
                .withLastName(member.getLastName())
                .withPassword(member.getPassword())
                .withPhotoUrl(member.getPhotoUrl());
    }
}
