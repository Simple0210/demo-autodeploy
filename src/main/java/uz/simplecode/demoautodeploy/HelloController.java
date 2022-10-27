package uz.simplecode.demoautodeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("/hi")
  public String getHi() {
    return "Hi everyone!!! Welcome to my Spring boot project!";

  }

  @GetMapping("/bye")
  public String getBye() {
    return "Bye-bye everyone!!!";
  }


}
