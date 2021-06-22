package org.sds.wsdemo.controller;

import org.sds.wsdemo.service.AppService;
import org.sds.wsdemo.soap.apis.dtos.add.AdditionRequest;
import org.sds.wsdemo.soap.apis.dtos.divide.DivideRequest;
import org.sds.wsdemo.soap.apis.dtos.multiply.MultiplyRequest;
import org.sds.wsdemo.soap.apis.dtos.subtract.SubtractRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/add")
    public String doAddition(@RequestBody AdditionRequest request) {
        return appService.addition(request);
    }

    @GetMapping("/subtract")
    public String doSubtract(@RequestBody SubtractRequest request) {
        return appService.subtraction(request);
    }

    @GetMapping("/multiply")
    public String doMultiplication(@RequestBody MultiplyRequest request) {
        return appService.multiplication(request);
    }

    @GetMapping("/divide")
    public String doDivision(@RequestBody DivideRequest request) {
        return appService.division(request);
    }
}
