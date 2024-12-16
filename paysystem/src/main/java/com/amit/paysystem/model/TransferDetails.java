package com.amit.paysystem.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TransferDetails {
private String name;
private String amount;
private BankDetails toAcct;
private BankDetails fromAcct;
}
