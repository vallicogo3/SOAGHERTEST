
/**
 * TimeoutExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.o2wifi.olympus.webservice;

public class TimeoutExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1400081293090L;
    
    private com.o2wifi.olympus.webservice.TimeoutExceptionE faultMessage;

    
        public TimeoutExceptionException() {
            super("TimeoutExceptionException");
        }

        public TimeoutExceptionException(java.lang.String s) {
           super(s);
        }

        public TimeoutExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TimeoutExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.o2wifi.olympus.webservice.TimeoutExceptionE msg){
       faultMessage = msg;
    }
    
    public com.o2wifi.olympus.webservice.TimeoutExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    