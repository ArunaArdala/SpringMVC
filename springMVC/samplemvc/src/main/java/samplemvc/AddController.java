package samplemvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mv = new ModelAndView();
		int i = Integer.parseInt(request.getAttribute("t1").toString());
		int j = Integer.parseInt(request.getAttribute("t2").toString());
		
		int k = i+j;
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		return mv;
	}
}
