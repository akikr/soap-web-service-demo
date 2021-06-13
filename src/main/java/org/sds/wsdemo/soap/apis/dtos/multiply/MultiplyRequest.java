package org.sds.wsdemo.soap.apis.dtos.multiply;

import org.sds.wsdemo.soap.apis.dtos.multiply.request.Multiply;

public class MultiplyRequest extends Multiply {

    @Override
    public String toString() {
        return "MultiplyRequest{" +
                "intA='" + intA + '\'' +
                ", intB='" + intB + '\'' +
                '}';
    }
}
