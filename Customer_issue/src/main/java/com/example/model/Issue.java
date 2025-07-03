package com.example.model;

import com.example.enums.IssueStatus;
import com.example.enums.IssueType;

public class Issue {
    private String id;
    private String name;
    private IssueType issueType;
    private IssueStatus issueStatus;
    private String agentid;
    private String resolution;
    private String description;

    public static IssueBuilder create(){
        return new IssueBuilder();
    }

    public Issue(IssueBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.issueType = builder.issueType;
        this.issueStatus = builder.issueStatus;
        this.resolution = builder.resolution;
        this.agentid = builder.agentid;
        this.description = builder.description;
    }

    public static class IssueBuilder{
        private String id;
        private String name;
        private IssueType issueType;
        private IssueStatus issueStatus;
        private String agentid;
        private String resolution;
        private String description;

        public IssueBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public IssueBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public IssueBuilder setIssueStatus(IssueStatus issueStatus) {
            this.issueStatus = issueStatus;
            return this;
        }

        public IssueBuilder setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }

        public IssueBuilder setAgentid(String agentid) {
            this.agentid = agentid;
            return this;
        }

        public IssueBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public IssueBuilder setIssueType(IssueType issueType) {
            this.issueType = issueType;
            return this;
        }
        public Issue build(){
            return new Issue(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public String getAgentid() {
        return agentid;
    }

    public String getDescription() {
        return description;
    }

    public String getResolution() {
        return resolution;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }
}
