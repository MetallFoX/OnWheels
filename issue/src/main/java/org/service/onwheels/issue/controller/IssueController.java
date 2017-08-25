package org.service.onwheels.issue.controller;

import org.service.onwheels.issue.model.Issue;
import org.service.onwheels.issue.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class IssueController {

    @Autowired
    private IssueService service;

    @RequestMapping(path = "/", method = POST)
    public Issue createNewIssue(@PathVariable String reason) {
        return service.create(reason);
    }

    @RequestMapping(path = "/list", method = GET)
    public Collection<Issue> getList() {
        return service.getAll();
    }

}
