package com.example.demo.model;

import lombok.Data;

@Data
public class transaction {
    private String account_no;
    private String deal_dt;
    private float deal_amt;
    private String from_acnt_no;
    private String to_acnt_no;
}
