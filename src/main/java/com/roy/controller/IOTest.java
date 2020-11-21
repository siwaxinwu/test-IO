package com.roy.controller;

import com.roy.utils.UtilMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * description：
 * author：dingyawu
 * date：created in 13:59 2020/11/21
 * history:
 */
@RestController
public class IOTest {


    @RequestMapping("/test")
    public String test() throws Exception{
        File file = new File("D:/test.txt");

        UtilMethod.write(file);
        String str = UtilMethod.read(file);
        System.out.println(str);
        return null;
    }



}
