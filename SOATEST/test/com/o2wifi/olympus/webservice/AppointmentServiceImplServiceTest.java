

/**
 * AppointmentServiceImplServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.o2wifi.olympus.webservice;

    /*
     *  AppointmentServiceImplServiceTest Junit test case
    */

    public class AppointmentServiceImplServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void main testgetAppointmentAvailability() throws java.lang.Exception{

        com.o2wifi.olympus.webservice.AppointmentServiceImplServiceStub stub =
                    new com.o2wifi.olympus.webservice.AppointmentServiceImplServiceStub();//the default implementation should point to the right endpoint

           com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE getAppointmentAvailability6=
                                                        (com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE)getTestObject(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE.class);
                    // TODO : Fill in the getAppointmentAvailability6 here
                
                        assertNotNull(stub.getAppointmentAvailability(
                        getAppointmentAvailability6));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAppointmentAvailability() throws java.lang.Exception{
            com.o2wifi.olympus.webservice.AppointmentServiceImplServiceStub stub = new com.o2wifi.olympus.webservice.AppointmentServiceImplServiceStub();
             com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE getAppointmentAvailability6=
                                                        (com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE)getTestObject(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE.class);
                    // TODO : Fill in the getAppointmentAvailability6 here
                

                stub.startgetAppointmentAvailability(
                         getAppointmentAvailability6,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends com.o2wifi.olympus.webservice.AppointmentServiceImplServiceCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultgetAppointmentAvailability(
                         com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE result
                            ) {
                
            }

            public void receiveErrorgetAppointmentAvailability(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    