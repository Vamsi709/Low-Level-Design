package com.example.model;

import com.example.enums.IssueType;

import java.util.ArrayList;
import java.util.List;

public class Agent {
    private String id;
    private String name;
    private String email_id;
    private boolean isAvailable;
    private final List<IssueType> issueTypeList;

    public static Builder create() {
        return new Builder();
    }


    private Agent(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email_id = builder.email_id;
        this.isAvailable = builder.isAvailable;
        this.issueTypeList = builder.issueTypeList;
    }

    public static class Builder{
        private String id;
        private String name;
        private String email_id;
        private boolean isAvailable;
        private final List<IssueType> issueTypeList = new ArrayList<>();



        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAvailable(boolean available) {
            isAvailable = available;
            return this;
        }

        public Builder setEmail_id(String email_id) {
            this.email_id = email_id;
            return this;
        }

        public Builder setIssueTypeList(IssueType issueType) {
            this.issueTypeList.add(issueType);
            return this;
        }

        public Agent build(){
            return new Agent(this);
        }
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public List<IssueType> getIssueTypeList() {
        return issueTypeList;
    }
}