package com.n2s.j2ee.departmentapis;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @GetMapping(value="/getDepartments", produces=MediaType.APPLICATION_JSON_VALUE )
    public String getDepartmentNames(){
        return "Department Names API";
    }

    @PutMapping(value="/updateDepartments", produces=MediaType.APPLICATION_JSON_VALUE )
    public String updateDepartmentNames(){
        return "Updated OK";
    }
}
