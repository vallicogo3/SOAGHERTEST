
/**
 * AppointmentServiceImplServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.o2wifi.olympus.webservice;

        /**
        *  AppointmentServiceImplServiceMessageReceiverInOut message receiver
        */

        public class AppointmentServiceImplServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AppointmentServiceImplServiceSkeleton skel = (AppointmentServiceImplServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getAppointmentAvailability".equals(methodName)){
                
                com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE getAppointmentAvailabilityResponse1 = null;
	                        com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE wrappedParam =
                                                             (com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAppointmentAvailabilityResponse1 =
                                                   
                                                   
                                                         skel.getAppointmentAvailability(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAppointmentAvailabilityResponse1, false, new javax.xml.namespace.QName("http://webservice.olympus.o2wifi.com/",
                                                    "getAppointmentAvailability"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (AppointmentExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AppointmentException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (TimeoutExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"TimeoutException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.o2wifi.olympus.webservice.AppointmentExceptionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.o2wifi.olympus.webservice.AppointmentExceptionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.o2wifi.olympus.webservice.TimeoutExceptionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.o2wifi.olympus.webservice.TimeoutExceptionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE wrapgetAppointmentAvailability(){
                                com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE wrappedElement = new com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE.class.equals(type)){
                
                           return com.o2wifi.olympus.webservice.GetAppointmentAvailabilityE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE.class.equals(type)){
                
                           return com.o2wifi.olympus.webservice.GetAppointmentAvailabilityResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.o2wifi.olympus.webservice.AppointmentExceptionE.class.equals(type)){
                
                           return com.o2wifi.olympus.webservice.AppointmentExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.o2wifi.olympus.webservice.TimeoutExceptionE.class.equals(type)){
                
                           return com.o2wifi.olympus.webservice.TimeoutExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    