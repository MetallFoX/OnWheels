package org.service.onwheels.issue.dao;

import org.service.onwheels.issue.model.Issue;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class IssueDAOImpl implements IssueDAO {

    private ConcurrentHashMap<String, Issue> repo = new ConcurrentHashMap<>();

    @Override
    public Collection<Issue> getAll() {
        return repo.values();
    }

    @Override
    public Issue save(Issue issue) {
        return repo.put(issue.getReason(), issue);
    }
}
