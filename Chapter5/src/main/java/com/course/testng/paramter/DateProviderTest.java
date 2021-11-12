package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.jws.Oneway;
import java.lang.reflect.Method;

public class DateProviderTest {
    @Test(dataProvider = "data")
    public void TestDateProvider(String name, int age) {
        System.out.println("name = " + name + ";   age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] h = new Object[][]{
                {"张三", 10},
                {"李四", 20},
                {"王五", 30}
        };
        return h;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test11111方法 name= " + name + ";  number=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test22222方法的 name= " + name + ";  number=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result =new Object[][]{
                    {"水",5},
                    {"碳水化合物",6},
                    {"蛋白质",7}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"脂肪",8},
            };
        }
        return result;
    }
}
