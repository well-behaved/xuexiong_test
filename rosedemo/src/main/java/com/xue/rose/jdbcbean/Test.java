package com.xue.rose.jdbcbean;

public class Test {
    private int id;
    private String msg;

    @Override
    public String toString() {
        return id+"--------"+msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
