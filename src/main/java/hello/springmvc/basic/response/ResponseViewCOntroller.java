package hello.springmvc.basic.response;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewCOntroller {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseviewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data","hello");
        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseviewV2(Model model){
        model.addAttribute("data","hello");
        return "response/hello";
    }

    @RequestMapping("/response/hello")
    public void responseviewV3(Model model){
        model.addAttribute("data","hello");
    }

}
