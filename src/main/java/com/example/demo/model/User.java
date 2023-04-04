package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer userId;
    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cart_id",referencedColumnName = "cartId")
    Cart cart_id;
    @OneToMany
//    @JoinColumn(name = "order_id" ,  referencedColumnName = "orderId")
    List<Order> order_id = new ArrayList<>();
    String userName;
    String address;
    String email;
    String password;

}

