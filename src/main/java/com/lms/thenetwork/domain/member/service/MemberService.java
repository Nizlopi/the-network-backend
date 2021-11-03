package com.lms.thenetwork.domain.member.service;

import com.lms.thenetwork.domain.member.Member;
import com.lms.thenetwork.domain.member.repositories.MemberRepository;
import com.lms.thenetwork.domain.member.api.MemberDTO;
import com.lms.thenetwork.domain.member.api.MemberMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public MemberService(MemberRepository memberRepository, MemberMapper memberMapper) {
        this.memberRepository = memberRepository;
        this.memberMapper = memberMapper;
    }

    public List<MemberDTO> getAllMembers() {
        return memberRepository.findAll().stream().map(memberMapper::toMemberDTO).collect(Collectors.toList());
    }

    public void saveMember(MemberDTO memberDTO) {
        Member member = memberMapper.toEntity(memberDTO);
        memberRepository.save(member);
    }
}
