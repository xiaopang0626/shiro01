package com.xiaopang;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;

public class HelloWorld {
    public static void main(String[] args) {
        IniRealm ini = new IniRealm("classpath:jdbc_realm.ini");
        SecurityManager securityManager = new DefaultSecurityManager(ini);
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken u = new UsernamePasswordToken("xiaopang","321123");
        subject.login(u);
        System.out.println("ok");
        subject.logout();
    }
}
