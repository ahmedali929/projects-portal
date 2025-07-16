package com.company.projectportal.Controller;

import com.company.projectportal.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobPostActivityController {

    private final UsersService usersService;

    @Autowired
    public JobPostActivityController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/dashboard")
    public String searchJobs(Model model) {

        Object currentUserProfile = usersService.getCurrentUserProfile();

        return "dashboard";
    }

}
