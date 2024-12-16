package com.amit.paysystem.service;

import com.amit.paysystem.model.TransferDetails;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
    Logger logger= LoggerFactory.getLogger(TransferService.class);
public String transferMoney(TransferDetails transferDetails){
    logger.info("Transfer details - {} ",transferDetails.toString());
    return "SUCCESS";
}
}
