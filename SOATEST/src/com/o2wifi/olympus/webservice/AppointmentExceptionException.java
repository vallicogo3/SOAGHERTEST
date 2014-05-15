
/**
 * AppointmentExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.o2wifi.olympus.webservice;

public class AppointmentExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1400081293059L;
    
    private com.o2wifi.olympus.webservice.AppointmentExceptionE faultMessage;

    
        public AppointmentExceptionException() {
            super("AppointmentExceptionException");
        }

        public AppointmentExceptionException(java.lang.String s) {
           super(s);
        }

        public AppointmentExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AppointmentExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.o2wifi.olympus.webservice.AppointmentExceptionE msg){
       faultMessage = msg;
    }
    
    public com.o2wifi.olympus.webservice.AppointmentExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    