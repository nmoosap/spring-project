package User;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController

public class UserController {
    @RequestMapping("/user")
    public ArrayList<Map<String,String>> getUserData() {
        ArrayList<Map<String, String>> list = new ArrayList<>();

        Map<String, String> userData = new HashMap<String, String>();
        userData.put("UserFirstName","Nikitha");
        userData.put("UserLastName","Moosapet");
        userData.put("Id", "432");
        userData.put("UserId","nmoosap");
        userData.put("UserEmail","nmoosap@gmail.com");
        list.add(userData);
        return list;
    }









    }
