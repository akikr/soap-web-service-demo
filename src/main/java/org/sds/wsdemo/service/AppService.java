package org.sds.wsdemo.service;

import org.sds.wsdemo.soap.apis.dtos.add.AdditionRequest;
import org.sds.wsdemo.soap.apis.dtos.divide.DivideRequest;
import org.sds.wsdemo.soap.apis.dtos.multiply.MultiplyRequest;
import org.sds.wsdemo.soap.apis.dtos.subtract.SubtractRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/calculate")
public interface AppService {

    @GetMapping("/addition")
    String addition(AdditionRequest request);

    @GetMapping("/subtraction")
    String subtraction(SubtractRequest request);

    @GetMapping("/multiplication")
    String multiplication(MultiplyRequest request);

    @GetMapping("/division")
    String division(DivideRequest request);
}
