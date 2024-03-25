package tum.shuaiwei.randomchicken.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tum.shuaiwei.randomchicken.user.UserEntity;
import tum.shuaiwei.randomchicken.user.UserService;

@RestController
@RequestMapping("/api/user")
public class UserApi {

    private final UserService userService;

    @Autowired
    public UserApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public UserEntity getUser(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    public UserEntity saveUser(@RequestBody UserEntity userEntity) {
        return userService.save(userEntity);
    }

    @PutMapping("/user")
    public UserEntity updateUser(@RequestBody UserEntity userEntity) {
        return userService.save(userEntity);
    }

}
