package com.later;

public class Customer {

    private Long customer_id;
    private String myName;

    public Long getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
    public String getMyName() {
        return myName;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }

    public static void main(String[] args) {
        Customer customer =  getId();
        System.out.println("id：" + customer.getCustomer_id());
        System.out.println("我是：" + customer.getMyName());
    }

    public static Customer getId() {
        Customer cus = new Customer();
        cus.setCustomer_id(100L);
        cus.setMyName("later");
        return cus;
    }


}
