package com.pattern.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class TicketFactory {

    /**
     * 享元模式：关注对象从用，不管他创建了几次，注意和单例的区别
     */
    private static Map<String, ITicket> sTicketPool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (TicketFactory.sTicketPool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return TicketFactory.sTicketPool.get(key);
        }
        System.out.println("首次查询，创建对象: " + key);
        ITicket ticket = new TrainTicket(from, to);
        TicketFactory.sTicketPool.put(key, ticket);
        return ticket;
    }
}