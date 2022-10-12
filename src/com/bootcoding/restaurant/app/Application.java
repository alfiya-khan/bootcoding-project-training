package com.bootcoding.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import java.util.Date;
import java.lang.String;
public class Application {
    public static void main(String args[]){
        Customer alfiya = new Customer();
        alfiya.setName("Alfiya");
        alfiya.setCity("Nagpur");
        alfiya.setAddress("New Nandanvan, Nagpur");
        alfiya.setState("Maharashtra");
        alfiya.setEmailId("alfiyakhan19@gmail.com");
        alfiya.setPhoneNumber(992129341L);

        System.out.println("Name: "+alfiya.getName());
        System.out.println("City: "+alfiya.getCity());
        System.out.println("Address: "+alfiya.getAddress());
        System.out.println("State: "+alfiya.getState());
        System.out.println("EmailId: "+alfiya.getEmailId());
        System.out.println("PhoneNumber: "+alfiya.getPhoneNumber());

    Vendor haldiram = new Vendor();
    haldiram.setName("Haldiram Veg Restaurant");
    haldiram.setAddress("Ajni Square, Nagpur");
    haldiram.setCategory("veg");
    haldiram.setRating(5.0);
    haldiram.setCity("Nagpur");

        Order order = new Order();
        order.setOrderId(123);
        order.setOrderNumber(12);
        order.setPrice(999);
        order.setQuantity(11);

  }
}
