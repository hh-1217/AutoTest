package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass11111中的stu11111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass11111中的stu22222运行");
    }
}
