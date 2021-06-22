package org.sds.wsdemo.service;

import org.sds.wsdemo.soap.apis.dtos.add.AdditionRequest;
import org.sds.wsdemo.soap.apis.dtos.divide.DivideRequest;
import org.sds.wsdemo.soap.apis.dtos.multiply.MultiplyRequest;
import org.sds.wsdemo.soap.apis.dtos.subtract.SubtractRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/calculate")
public interface AppService {

    @GetMapping(value = "/addition",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    String addition(AdditionRequest request);

    @GetMapping(value = "/subtraction",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    String subtraction(SubtractRequest request);

    @GetMapping(value = "/multiplication",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    String multiplication(MultiplyRequest request);

    @GetMapping(value = "/division",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    String division(DivideRequest request);
}
