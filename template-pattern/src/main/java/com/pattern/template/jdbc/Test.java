package com.pattern.template.jdbc;

import com.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * Created by wangzhengpeng
 */
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
