package org.service.onwheels.issue.service;

import org.service.onwheels.issue.model.Issue;

import java.util.Collection;

public interface IssueService {
    Issue create(String reason);

    Collection<Issue> getAll();
}
