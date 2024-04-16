package com.example.Cors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:1780")
public class NameController {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    public String getName(@RequestParam String name){
        return name;
    }
    @RequestMapping(method = RequestMethod.POST, path = "/reversedName")
    public String reversedName(@RequestBody String name){
        StringBuilder reversedName = new StringBuilder().append(name).reverse();
        return reversedName.toString();
    }

}
