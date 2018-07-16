package com.n2s.j2ee.departmentapis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentControllerTest {

    @Autowired
    DepartmentController departmentController;

    @Test
    public void getDepartmentNames() {
        String testString = departmentController.getDepartmentNames();
        assertNotNull( testString );
    }
}