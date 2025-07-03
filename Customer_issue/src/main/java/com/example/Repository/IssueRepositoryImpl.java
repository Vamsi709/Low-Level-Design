package com.example.Repository;

import com.example.model.Issue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IssueRepositoryImpl implements IssueRepository{
    private final Map<String,Issue> issueMap = new ConcurrentHashMap<>();
    @Override
    public void addIssue(Issue issue) {
        issueMap.put(issue.getId(),issue);
        System.out.println("Issue added successfully");

    }

    @Override
    public Issue getIssueStatus(String issueID) {
        return issueMap.get(issueID);
    }

    @Override
    public List<Issue> getAllIssues() {
        return new ArrayList<>(issueMap.values());
    }
}
