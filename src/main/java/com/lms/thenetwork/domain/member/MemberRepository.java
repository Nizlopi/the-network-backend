package com.lms.thenetwork.domain.member;

import com.lms.thenetwork.domain.member.api.MemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
