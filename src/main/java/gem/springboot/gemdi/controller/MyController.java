package gem.springboot.gemdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String hello()
    {
        System.out.println("Hellow World!!!");
        return "Hiii Dhanashree.........";
    }
}
