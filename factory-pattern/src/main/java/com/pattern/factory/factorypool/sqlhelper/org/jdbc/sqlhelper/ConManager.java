package com.pattern.factory.factorypool.sqlhelper.org.jdbc.sqlhelper;

import com.pattern.factory.factorypool.org.jdbc.sqlhelper.Pool;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class ConManager {

    private static Pool dbPool;

    private static ConManager instance = null;// ��������

    private ConManager() {
    }

    protected static void closeCon(Connection con) {
        dbPool.freeConnection(con);
    }

    private static ConManager getInstance() {
        if (null == instance) {
            instance = new ConManager();
        }
        return instance;
    }

    protected static Connection getConnection() {
        Connection conn = null;
        try {
            if (dbPool == null) {
                dbPool = DBConnectionPool.getInstance();
            }
            conn = dbPool.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    protected static Connection getConnection(String lookupStr) {
        Connection conn = null;
        try {
            ConManager.getInstance();
            //ʹ�� JNDI ��Tomcat ���������ݿ����ӳ��� ���һ�����Ӷ���
            Context ctx = new InitialContext();
            DataSource ds = (DataSource)ctx.lookup(lookupStr);
            conn = ds.getConnection();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return conn;
    }

}
