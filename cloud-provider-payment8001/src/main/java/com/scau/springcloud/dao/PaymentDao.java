package com.scau.springcloud.dao;

import com.scau.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
