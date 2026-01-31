package com.example._107097.cse.kuet.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final MyUserRepository myUserRepository; // updated here

    @GetMapping("/")
    public String hello(Model model) {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john@example.com");
        myUserRepository.save(user);

        model.addAttribute("message", "Hello World! User saved with ID: " + user.getId());
        return "hello";
    }
}
