

/**
 * AppointmentServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.o2wifi.olympus.webservice;

    /*
     *  AppointmentServiceImplService java interface
     */

    public interface AppointmentServiceImplService {
          

        /**
          * Auto generated method signature
          * Returns available appointment times for the requested site.
                    * @param getAppointmentAvailability0
                
             * @throws com.o2wifi.olympus.webservice.AppointmentExceptionException : 
             * @throws com.o2wifi.olympus.webservice.TimeoutExceptionException : 
         */

         
                     public com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE getAppointmentAvailability(

                        com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE getAppointmentAvailability0)
                        throws java.rmi.RemoteException
             
          ,com.o2wifi.olympus.webservice.AppointmentExceptionException
          ,com.o2wifi.olympus.webservice.TimeoutExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns available appointment times for the requested site.
                * @param getAppointmentAvailability0
            
          */
        public void startgetAppointmentAvailability(

            com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE getAppointmentAvailability0,

            final com.o2wifi.olympus.webservice.AppointmentServiceImplServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    