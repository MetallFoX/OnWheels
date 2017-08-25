package org.service.onwheels.issue.service;

import org.service.onwheels.issue.dao.IssueDAO;
import org.service.onwheels.issue.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueDAO dao;

    @Override
    public Issue create(String reason) {
        Issue issue = new Issue(reason);
        return dao.save(issue);
    }

    @Override
    public Collection<Issue> getAll() {
        return dao.getAll();
    }
}
