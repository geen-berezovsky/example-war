package ru.geen.test.examplewar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by geen on 03.04.17.
 */
@RestController
public class TestController2
{
    @RequestMapping("/test2")
    public String test()
    {
        return "TEST2";
    }
}
