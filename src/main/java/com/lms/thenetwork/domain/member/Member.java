package com.lms.thenetwork.domain.member;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "account_enabled")
    private boolean accountEnabled;
    @Column(name = "membership_type")
    private String membershipType;
    @Column(name = "email")
    private String email;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "photo_url")
    private String photoUrl;

    public Member(boolean accountEnabled, String membershipType, String email, String companyName, String firstName, String lastName, String password, String photoUrl) {
        id = UUID.randomUUID();
        this.accountEnabled = accountEnabled;
        this.membershipType = membershipType;
        this.email = email;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.photoUrl = photoUrl;
    }

    public Member() {

    }

    public UUID getId() {
        return id;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return accountEnabled == member.accountEnabled && Objects.equals(id, member.id) && Objects.equals(membershipType, member.membershipType) && Objects.equals(email, member.email) && Objects.equals(companyName, member.companyName) && Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && Objects.equals(password, member.password) && Objects.equals(photoUrl, member.photoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountEnabled, membershipType, email, companyName, firstName, lastName, password, photoUrl);
    }
}
