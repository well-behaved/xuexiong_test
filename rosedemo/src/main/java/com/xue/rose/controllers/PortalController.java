package com.xue.rose.controllers;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.portal.Portal;

import java.util.Random;
@Path("portal")
public class PortalController {
    @Get("/3.7")
    public String portal(Portal portal) {
        portal.addWindow("p1", "/wp1");
        portal.addWindow("p2", "/wp2");
        portal.addWindow("p3", "/wp3");
        portal.addWindow("p4", "/wp4");
        return "@portal";
    }

    @Get("/wp1")
    public String portal1() throws InterruptedException {
        System.out.println("------p1开始-------");
        Thread.sleep(new Random().nextInt(1300));
        System.out.println("-----p1开始------");
        return "@this is p1";
    }

    @Get("/wp2")
    public String portal2() throws InterruptedException {
        System.out.println("------p2开始-------");
        Thread.sleep(new Random().nextInt(1300));
        System.out.println("-----p2开始------");
        return "@this is p2";
    }
    @Get("/wp3")
    public String portal3() throws InterruptedException {
        System.out.println("------p3开始-------");
        Thread.sleep(new Random().nextInt(1300));
        System.out.println("-----p3开始------");
        return "@this is p3";
    }
    @Get("/wp4")
    public String portal4() throws InterruptedException {
        System.out.println("------p4开始-------");
        Thread.sleep(new Random().nextInt(1300));
        System.out.println("-----p4开始------");
        return "@this is p4";
    }
}
