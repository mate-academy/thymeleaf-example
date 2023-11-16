package mate.academy.thymeleafexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
  @GetMapping("/index")
  public String getIndexPage(@RequestParam (required = false) String message, Model model) {
    model.addAttribute("message", StringUtils.hasText(message) ? message : "<YOUR MESSAGE COULD BE HERE>");
    return "index";
  }
}
