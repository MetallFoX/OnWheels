package org.service.onwheels.issue.dao;

import org.service.onwheels.issue.model.Issue;

import java.util.Collection;

public interface IssueDAO {
    Collection<Issue> getAll();

    Issue save(Issue issue);
}
