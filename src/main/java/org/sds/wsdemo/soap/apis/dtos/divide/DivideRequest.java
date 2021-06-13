package org.sds.wsdemo.soap.apis.dtos.divide;

import org.sds.wsdemo.soap.apis.dtos.divide.request.Divide;

public class DivideRequest extends Divide {

    @Override
    public String toString() {
        return "DivideRequest{" +
                "intA='" + intA + '\'' +
                ", intB='" + intB + '\'' +
                '}';
    }
}
