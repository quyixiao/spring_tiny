package com.spring_101_200.test_191_200.test_197_directFieldAccessor;


@IWheres({
        @IWhere(tableName = "lsd_user", columns = {"id", "username"}, values = {"id", "userName"}),
        @IWhere(tableName = "lsd_user_log", columns = "id", values = "id")
})
public class RiskData {

    @ITable(tableName = "lsd_user", column = "password")
    private String password;

    @ITable(tableName = "lsd_user",
            columns = {"id", "username", "password"},
            values = {"id", "userName", "password"}
    )
    @ISelect(sqls = {
            "select username from lz_user where username = #{username}",
            "select gmt_create from lz_user_log where password = #{userId}",
        },
            values = {
                "userName",
                "createTime"
        }
    )
    private String map;

    @ISelect("select username as userName from lz_user where id=#{id} and username=#{username}")
    private String logInfo;

}
