package com.brilliance.ejvm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sinosong
 */
@Controller
public class FirstController {

    /**
     * http://localhost:10336/index
     */
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * http://localhost:10336/login
     */
    @ResponseBody
    @RequestMapping(value={"/login"})
    public String login(){
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        return "当前时间是=="+date;
    }

}
