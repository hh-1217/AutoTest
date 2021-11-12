package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void sut1(){
        System.out.println("GroupsOnClass22222中的stu11111运行");
    }
    public void sut2(){
        System.out.println("GroupsOnClass22222中的stu22222运行");
    }
}
