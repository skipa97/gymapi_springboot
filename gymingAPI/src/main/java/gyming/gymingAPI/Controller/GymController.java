package gyming.gymingAPI.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GymController {

    @GetMapping("/Monday")
    public String getMondaySession(){
        return "Today is Monday and you doing Chest work out";
    }
    @GetMapping("/Tuesday")
    public String getTuesdaySession(){
        return "Today is Tuesday and you doing Arms work out";
    }
    @GetMapping("/Wednesday")
    public String getWednesdaySession(){
        return "Today is Wednesday and you doing Back work out";
    }
    @GetMapping("/Thursday")
    public String getThursdaySession(){
        return "Today is Thursday and you doing Shoulders work out";
    }
    @GetMapping("/Friday")
    public String getFridaySession(){
        return "Today is Friday, we doing all exercises";
    }

}
