package com.risehackathon.chatting.api;

import com.risehackathon.chatting.jaxb.AppUser;
import com.risehackathon.chatting.model.UserDetails;
import com.risehackathon.chatting.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class SignInController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registerNewUser(@RequestBody @Valid AppUser appUser){
        UserDetails userDetails = new UserDetails();
        BeanUtils.copyProperties(appUser,userDetails);
        userRepository.save(userDetails);
    }

    @RequestMapping(value = "/{userName}/pwd/{pwd}",
                    method = RequestMethod.GET)
    public boolean loginExistingUser(@RequestParam(value = "userName")String userName,
                                     @RequestParam(value="pwd")String password){
        return true;
    }


}
