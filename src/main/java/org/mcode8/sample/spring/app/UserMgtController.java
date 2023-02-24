package org.mcode8.sample.spring.app;

import org.mcode8.sample.spring.app.model.MpUser;
import org.mcode8.sample.spring.app.model.User;
import org.mcode8.sample.spring.app.service.MpUserManagementService;
import org.mcode8.sample.spring.app.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *  api creation is too easy
 *  i need to learn strong knowledge of RDB management
 */

@RestController
public class UserMgtController {

    @Autowired
    UserManagementService userManagementService;

    @Autowired
    MpUserManagementService mpUserManagementService;

    @RequestMapping("/mpuser")
    public MpUser[] getMpUser(){ return mpUserManagementService.getMpUser().toArray(new MpUser[0]);}

    @RequestMapping("/users/m_add")
    public void addMpUser(@RequestBody MpUser mpUser){mpUserManagementService.addMpUser(mpUser);}
    @RequestMapping("/users")
    public User[] getUserList() {
        return userManagementService.getUserList().toArray(new User[0]);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userManagementService.addUserList(user);
    }

    @RequestMapping("/users/{Username}")
    public String getUserId(@PathVariable("Username") String username){
        return userManagementService.getUerId(username.toLowerCase());
    }

}
