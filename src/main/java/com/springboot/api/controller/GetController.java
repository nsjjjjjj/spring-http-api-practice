package com.springboot.api.controller;

import com.springboot.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @GetMapping("/user")
    public PostRequestDto getUser() {
        PostRequestDto dto = new PostRequestDto();
        dto.setName("nsj");
        dto.setEmail("user@example.com");
        dto.setAge("21");
        dto.setAddress("Sample City");
        dto.setPhoneNumber("010-0000-0000");
        return dto;
    }
}