package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComboTreeController {
    @RequestMapping("/greeting")
    public Object greeting()

    {
        return "";
    }
}
