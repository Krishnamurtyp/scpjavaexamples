package com.lowes.scpjavaexamples.sqlinjection.parameterizedqueries.controller;

import com.lowes.scpjavaexamples.sqlinjection.parameterizedqueries.beans.User;
import com.lowes.scpjavaexamples.sqlinjection.parameterizedqueries.mitigation.SqlInjectionMitigation;
import com.lowes.scpjavaexamples.sqlinjection.parameterizedqueries.vulnerability.SqlInjectionVulnerability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SQLInjectionController {
    @Autowired
    SqlInjectionVulnerability sqlInjectionVulnerability;

    @Autowired
    SqlInjectionMitigation sqlInjectionMitigation;

    @GetMapping(value="/sqlinjection", produces = MediaType.TEXT_HTML_VALUE)

    public String sqlInjection(Model model) {
        // This is a normal loginCall to SqlInjectionVulnerability.loginUser
        User normalCallToLogin = sqlInjectionVulnerability.loginUser("userName1", "password1");

        // This is a SQLInjection loginCall to SqlInjectionVulnerability.loginUser
        User sqlInjectionCallToLogin = sqlInjectionVulnerability.loginUser("administrator' --", "");

        // This is a SQLInjection loginCall to SqlInjectionMitigation.loginUser
        User sqlInjectionCallToLoginMitigated =  sqlInjectionMitigation.loginUser("administrator' --", "");

        model.addAttribute("normalCallToLogin",normalCallToLogin);
        model.addAttribute("sqlInjectionCallToLogin",sqlInjectionCallToLogin);
        model.addAttribute("sqlInjectionCallToLoginMitigated",sqlInjectionCallToLoginMitigated);

        // The following code renders the page.
        return "/sqlinjection/sqlInjectionParameterizedQueries";
    }
}
