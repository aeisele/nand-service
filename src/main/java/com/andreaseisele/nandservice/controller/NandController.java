package com.andreaseisele.nandservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NandController {

    @GetMapping("/nand")
    @ResponseBody
    public Boolean nand(@RequestParam Boolean a, @RequestParam Boolean b) {
        return !(a & b);
    }

}
