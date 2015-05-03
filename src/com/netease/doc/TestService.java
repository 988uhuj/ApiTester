package com.netease.doc;

/**
 * Created by chenupt@gmail.com on 14-3-22.
 */
public interface TestService {


    /**
     * 用户登陆
     * @param account 账号
     * @param password 密码
     * @return true 成功
     */
    public boolean login(String account, String password);

}
