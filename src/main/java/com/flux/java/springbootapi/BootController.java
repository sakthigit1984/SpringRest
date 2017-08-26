package com.flux.java.springbootapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    // spting boot mapping
    @RequestMapping("/springbootapp")
    public String dataPush()
    {
     return  "spring boot app";
    }
}
