package com.amit.paysystem.controller;

import com.amit.paysystem.model.TransferDetails;
import com.amit.paysystem.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class PaysystemController {

    @Autowired
    private TransferService transferService;

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/sayHi/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name){
        return new ResponseEntity<>("Hello "+name, HttpStatus.OK);
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transferAmt(@RequestBody TransferDetails transferDetails){
        return new ResponseEntity<>(transferService.transferMoney(transferDetails),HttpStatus.OK);
    }

}
