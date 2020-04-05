package BIA.Business.Impact.Analysis.Controller;

import BIA.Business.Impact.Analysis.Model.Employees;
import BIA.Business.Impact.Analysis.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class LoginController {

	public static final String SESSION_ME = "ME";

	@Autowired
	private EmployeesService employeesService;

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@PostMapping("/login")
	public String postlogIn(HttpServletRequest request, @RequestParam("id") String id, @RequestParam("p") String password,
			Model model) throws IOException {
		String msg = null;
		try {
			Employees me = employeesService.get(id);
			if (me == null) {
				msg = "Wrong ID.";
			} else if (!password.equals(me.getPassword())) {
				msg = "Wrong Password.";
			} else {
				HttpSession session = request.getSession();
				session.setAttribute(SESSION_ME, me);
				return "redirect:/";
			}
		} catch (Exception e) {
			msg = "Failed.";
		}
		model.addAttribute("msg", msg);
		return "login";
	}
}
