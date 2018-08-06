package com.edc.jvm;

import org.springframework.stereotype.Service;

/**
 * Created by Mtime on 2018/8/2.
 */
@Service
public class WinJvmServiceImpl implements JvmService {
    public void doSomeThing() {
        System.out.println("windows");
    }
}
