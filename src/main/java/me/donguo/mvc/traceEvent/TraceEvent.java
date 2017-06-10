package me.donguo.mvc.traceEvent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by songway on 2017/5/18.
 */
@Controller
@RequestMapping("/trace/*")
public class TraceEvent {
    @RequestMapping(value="properties")
    public  @ResponseBody String responseTraceEventWithProperty(TraceModel model) {
        return "model: " + model.desc();
    }
}
