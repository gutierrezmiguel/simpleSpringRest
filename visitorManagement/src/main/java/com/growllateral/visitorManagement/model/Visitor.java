package com.growllateral.visitorManagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Visitor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private long id;
    private String name;
    private String email;
    private String communityMessage;
    private String imageUrl;
    @Column(nullable = false,updatable = false)
    private String visitorCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCommunityMessage() {
        return communityMessage;
    }

    public void setCommunityMessage(String communityMessage) {
        this.communityMessage = communityMessage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVisitorCode() {
        return visitorCode;
    }

    public void setVisitorCode(String visitorCode) {
        this.visitorCode = visitorCode;
    }

    public Visitor(long id, String name, String email, String communityMessage, String imageUrl, String visitorCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.communityMessage = communityMessage;
        this.imageUrl = imageUrl;
        this.visitorCode = visitorCode;
    }

    public Visitor() {
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", communityMessage='" + communityMessage + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", visitorCode='" + visitorCode + '\'' +
                '}';
    }
}

