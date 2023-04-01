package com.neu.opportunitymanagement.oppManagement.dto.common;

import java.io.Serializable;

public class RespBean implements Serializable {

    //	Message notification: Correct message Error message
    //Create correct message prompt information does not include encapsulated entity beans such as user information
    public static RespBean ok(Integer status ,String msg ) {
        return new RespBean(status,msg,null);
    }
    //Create correct message prompt information including encapsulated entity beans such as user information
    public static RespBean ok(Integer status ,String msg,Object obj ) {
        return new RespBean(status,msg,obj);
    }

    //Create error message prompt information does not include encapsulated entity beans such as user information
    public static RespBean error(Integer status ,String msg ) {
        return new RespBean(status,msg,null);
    }
    //Create error message prompt information, including encapsulated entity beans such as user information
    public static RespBean error(Integer status ,String msg,Object obj  ) {
        return new RespBean(status,msg,obj);
    }


    private RespBean() {

    }

    private RespBean(Integer status, String msg, Object obj) {
//		super();
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    private Integer status;
    private String msg;
    private Object obj;
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "RespBean{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}

