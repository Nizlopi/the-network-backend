package com.lms.thenetwork.domain.member.api;

import com.lms.thenetwork.domain.member.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/members")
public class MemberController {

    private final static Logger LOGGER = LoggerFactory.getLogger(MemberController.class);
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(produces = "application/json")
    public List<MemberDTO> getMembers() {
        return memberService.getAllMembers();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMember(@RequestBody MemberDTO memberDTO) {
        LOGGER.info("New member created at: " + LocalDateTime.now());
        memberService.saveMember(memberDTO);
    }
}
