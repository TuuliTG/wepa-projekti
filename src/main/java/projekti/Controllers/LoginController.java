/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author tgtuuli
 */
@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}
