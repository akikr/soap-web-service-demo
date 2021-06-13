package org.sds.wsdemo.soap.apis.dtos.subtract;

import org.sds.wsdemo.soap.apis.dtos.subtract.requestV2.Subtract;

public class SubtractRequest extends Subtract {

    @Override
    public String toString() {
        return "AppRequest {" +
                "intA='" + intA + '\'' +
                ", intB='" + intB + '\'' +
                '}';
    }
}
