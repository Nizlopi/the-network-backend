package com.lms.thenetwork.domain.member.api;

import java.util.Objects;
import java.util.UUID;

public class MemberDTO {
    private boolean accountEnabled;
    private String membershipType;
    private String email;
    private String companyName;
    private String firstName;
    private String lastName;
    private String password;
    private String photoUrl;

    public MemberDTO(boolean accountEnabled, String membershipType, String email, String companyName, String firstName, String lastName, String password, String photoUrl) {
        this.accountEnabled = accountEnabled;
        this.membershipType = membershipType;
        this.email = email;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.photoUrl = photoUrl;
    }

    public MemberDTO() {
    }

    public MemberDTO withAccountEnabled(boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    public MemberDTO withMembershipType(String membershipType) {
        this.membershipType = membershipType;
        return this;
    }

    public MemberDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    public MemberDTO withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public MemberDTO withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public MemberDTO withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public MemberDTO withPassword(String password) {
        this.password = password;
        return this;
    }

    public MemberDTO withPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    public boolean isAccountEnabled() {
        return accountEnabled;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return accountEnabled == memberDTO.accountEnabled && Objects.equals(membershipType, memberDTO.membershipType) && Objects.equals(email, memberDTO.email) && Objects.equals(companyName, memberDTO.companyName) && Objects.equals(firstName, memberDTO.firstName) && Objects.equals(lastName, memberDTO.lastName) && Objects.equals(password, memberDTO.password) && Objects.equals(photoUrl, memberDTO.photoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountEnabled, membershipType, email, companyName, firstName, lastName, password, photoUrl);
    }
}
