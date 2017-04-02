package ru.geen.test.examplewar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by geen on 02.04.17.
 */
@RestController
public class TestController
{
    @RequestMapping("/test")
    public String test()
    {
        return "TEST";
    }
}
