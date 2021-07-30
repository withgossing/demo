package com.example.demo.model;

import lombok.Data;

@Data
public class Account {
    private String acnt_no;
    private String acnt_name;
    private String open_dt;
    private float acnt_amt;
    private String user_id;
}
