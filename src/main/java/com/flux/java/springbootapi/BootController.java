package com.flux.java.springbootapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {


    // spting boot mapping

    private final Logger logger= LoggerFactory.getLogger(BootController.class);


    @RequestMapping("/springbootapp")
    public String dataPush()
    {
        String methodName="dataPush";
        logger.info("Method enter {}",methodName);

        return  "spring boot app";
    }
}
