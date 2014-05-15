
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.o2wifi.olympus.webservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "appointmentAvailabilityResponse".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.AppointmentAvailabilityResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "completionCode".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.CompletionCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "maintenanceCategory".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.MaintenanceCategory.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "getAppointmentAvailabilityResponse".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "appointmentAction".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.AppointmentAction.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "AppointmentException".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.AppointmentException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "appointment".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.Appointment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "appointmentAvailabilityRequest".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.AppointmentAvailabilityRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "getAppointmentAvailability".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.GetAppointmentAvailability.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "user".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "appointmentType".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.AppointmentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservice.olympus.o2wifi.com/".equals(namespaceURI) &&
                  "TimeoutException".equals(typeName)){
                   
                            return  com.o2wifi.olympus.webservice.TimeoutException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    