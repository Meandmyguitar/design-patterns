package com.pattern.template.jdbc.framework;

import java.sql.ResultSet;

/**
 * Created by wangzhengpeng
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;

}
