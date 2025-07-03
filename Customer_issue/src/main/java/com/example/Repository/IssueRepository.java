package com.example.Repository;

import com.example.model.Issue;

import java.util.List;

public interface IssueRepository {
    void addIssue(Issue issue);
    Issue getIssueStatus(String issueID);
    List<Issue> getAllIssues();
}
