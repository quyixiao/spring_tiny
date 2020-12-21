package com.api.admin.controller;




@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/list")
     public R list(@RequestBody String body) {
        Map<String,Object> params = new HashMap<>();
        if(StringUtil.isNotBlank(body)){
            params = JSONObject.parseObject(body,Map.class);
        }
        PageUtils page = userservice.queryPage(params);
        return R.ok().put("page", page);
     }


     @RequestMapping("/getById")
     public R getById(@RequestBody User user) {
        user = userService.selectUserById(user.getId());
        return R.ok().put("user",user);
     }


     @RequestMapping("/update")
     public R update(@RequestBody User user) {
        userService.updateUserById(user);
        return R.ok();
     }


     @RequestMapping("/save")
        public R save(@RequestBody User user) {
        userService.insertUser(user);
        return R.ok();
     }


    @RequestMapping("/delete")
    public R delete(@RequestBody Long id) {
        userService.deleteUserById(id);
        return R.ok();
     }
}
