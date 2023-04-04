package com.example.demo.model;

import com.example.demo.Enums.PaymentMethod;
import com.example.demo.Enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer paymentId;
    @OneToOne
    private Order orderId;

    @Enumerated(EnumType.STRING)
    PaymentMethod paymentMethod;

    @Column(name = "Payment_amount")
    Integer paymentAmount;

    @Column(name="Payment_date")
    Date paymentDate;

    @Enumerated(EnumType.STRING)
    PaymentStatus paymentStatus;
}
