package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "order")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    private User userId;

    private int quantity;

    private LocalDate date;

    private  double totalCost;
    @OneToOne
    private Payment paymentId;

    @ManyToMany
          //  (cascade = CascadeType.ALL)
    private List<Product> item_Id=new ArrayList<>();

}
