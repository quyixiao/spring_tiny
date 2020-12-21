package com.api.admin.controller;




@RestController
@RequestMapping("/userBill")
public class UserBillController {


    @Autowired
    private UserBillService userBillService;


    @RequestMapping("/list")
     public R list(@RequestBody String body) {
        Map<String,Object> params = new HashMap<>();
        if(StringUtil.isNotBlank(body)){
            params = JSONObject.parseObject(body,Map.class);
        }
        PageUtils page = userBillservice.queryPage(params);
        return R.ok().put("page", page);
     }


     @RequestMapping("/getById")
     public R getById(@RequestBody UserBill userBill) {
        userBill = userBillService.selectUserBillById(userBill.getId());
        return R.ok().put("userBill",userBill);
     }


     @RequestMapping("/update")
     public R update(@RequestBody UserBill userBill) {
        userBillService.updateUserBillById(userBill);
        return R.ok();
     }


     @RequestMapping("/save")
        public R save(@RequestBody UserBill userBill) {
        userBillService.insertUserBill(userBill);
        return R.ok();
     }


    @RequestMapping("/delete")
    public R delete(@RequestBody Long id) {
        userBillService.deleteUserBillById(id);
        return R.ok();
     }
}
