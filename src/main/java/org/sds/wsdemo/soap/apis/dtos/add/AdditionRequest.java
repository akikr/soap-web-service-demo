package org.sds.wsdemo.soap.apis.dtos.add;

import org.sds.wsdemo.soap.apis.dtos.add.request.Add;

public class AdditionRequest extends Add {

    @Override
    public String toString() {
        return "AdditionRequest{" +
                "intA='" + intA + '\'' +
                ", intB='" + intB + '\'' +
                '}';
    }
}
