package org.sds.wsdemo.service;

import org.sds.wsdemo.soap.apis.dtos.add.AdditionRequest;
import org.sds.wsdemo.soap.apis.dtos.add.response.AddResponse;
import org.sds.wsdemo.soap.apis.dtos.divide.DivideRequest;
import org.sds.wsdemo.soap.apis.dtos.divide.response.DivideResponse;
import org.sds.wsdemo.soap.apis.dtos.multiply.MultiplyRequest;
import org.sds.wsdemo.soap.apis.dtos.multiply.response.MultiplyResponse;
import org.sds.wsdemo.soap.apis.dtos.subtract.SubtractRequest;
import org.sds.wsdemo.soap.apis.dtos.subtract.responseV2.SubtractResponse;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class AppService {

    private Jaxb2Marshaller marshaller;

    public AppService(Jaxb2Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private WebServiceTemplate getWebServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate template = new WebServiceTemplate(marshaller);
        template.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        return template;
    }

    public String addition(AdditionRequest request) {
        AddResponse addResponse = (AddResponse) getWebServiceTemplate(marshaller)
                .marshalSendAndReceive(request, new SoapActionCallback("http://tempuri.org/Add"));
        return addResponse.getAddResult();
    }

    public String subtraction(SubtractRequest request) {
        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate(marshaller)
                .marshalSendAndReceive(request, new SoapActionCallback("http://tempuri.org/Subtract"));
        return subtractResponse.getSubtractResult();
    }

    public String multiplication(MultiplyRequest request) {
        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate(marshaller)
                .marshalSendAndReceive(request, new SoapActionCallback("http://tempuri.org/Multiply"));
        return multiplyResponse.getMultiplyResult();
    }

    public String division(DivideRequest request) {
        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate(marshaller)
                .marshalSendAndReceive(request, new SoapActionCallback("http://tempuri.org/Divide"));
        return divideResponse.getDivideResult();
    }
}
