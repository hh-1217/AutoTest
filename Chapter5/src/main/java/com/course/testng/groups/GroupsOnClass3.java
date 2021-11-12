package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass33333中的teacher11111运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass33333中的teacher22222运行");
    }
}
