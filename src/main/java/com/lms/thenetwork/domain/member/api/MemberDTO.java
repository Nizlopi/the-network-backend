package com.lms.thenetwork.domain.member.api;

import java.util.Objects;

public class MemberDTO {
    private String username;
    private String email;
    private String password;

    public MemberDTO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public MemberDTO() {
    }

    public MemberDTO withUsername(String username) {
        this.username = username;
        return this;
    }

    public MemberDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    public MemberDTO withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUsername() {
        return username;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(username, memberDTO.username) && Objects.equals(email, memberDTO.email)&& Objects.equals(password, memberDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password);
    }
}
