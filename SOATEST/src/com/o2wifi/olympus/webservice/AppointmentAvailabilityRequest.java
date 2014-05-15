
/**
 * AppointmentAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.o2wifi.olympus.webservice;
            

            /**
            *  AppointmentAvailabilityRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AppointmentAvailabilityRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = appointmentAvailabilityRequest
                Namespace URI = http://webservice.olympus.o2wifi.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for PstnNumber
                        */

                        
                                    protected java.lang.String localPstnNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPstnNumber(){
                               return localPstnNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PstnNumber
                               */
                               public void setPstnNumber(java.lang.String param){
                            
                                            this.localPstnNumber=param;
                                    

                               }
                            

                        /**
                        * field for ProductName
                        */

                        
                                    protected java.lang.String localProductName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProductName(){
                               return localProductName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProductName
                               */
                               public void setProductName(java.lang.String param){
                            
                                            this.localProductName=param;
                                    

                               }
                            

                        /**
                        * field for CustomerRequiredDate
                        */

                        
                                    protected java.util.Calendar localCustomerRequiredDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomerRequiredDateTracker = false ;

                           public boolean isCustomerRequiredDateSpecified(){
                               return localCustomerRequiredDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCustomerRequiredDate(){
                               return localCustomerRequiredDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerRequiredDate
                               */
                               public void setCustomerRequiredDate(java.util.Calendar param){
                            localCustomerRequiredDateTracker = param != null;
                                   
                                            this.localCustomerRequiredDate=param;
                                    

                               }
                            

                        /**
                        * field for MaintenanceCategory
                        */

                        
                                    protected com.o2wifi.olympus.webservice.MaintenanceCategory localMaintenanceCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaintenanceCategoryTracker = false ;

                           public boolean isMaintenanceCategorySpecified(){
                               return localMaintenanceCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.o2wifi.olympus.webservice.MaintenanceCategory
                           */
                           public  com.o2wifi.olympus.webservice.MaintenanceCategory getMaintenanceCategory(){
                               return localMaintenanceCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaintenanceCategory
                               */
                               public void setMaintenanceCategory(com.o2wifi.olympus.webservice.MaintenanceCategory param){
                            localMaintenanceCategoryTracker = param != null;
                                   
                                            this.localMaintenanceCategory=param;
                                    

                               }
                            

                        /**
                        * field for AddressRef
                        */

                        
                                    protected java.lang.String localAddressRef ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressRefTracker = false ;

                           public boolean isAddressRefSpecified(){
                               return localAddressRefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAddressRef(){
                               return localAddressRef;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddressRef
                               */
                               public void setAddressRef(java.lang.String param){
                            localAddressRefTracker = param != null;
                                   
                                            this.localAddressRef=param;
                                    

                               }
                            

                        /**
                        * field for AddressDistrictCode
                        */

                        
                                    protected java.lang.String localAddressDistrictCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressDistrictCodeTracker = false ;

                           public boolean isAddressDistrictCodeSpecified(){
                               return localAddressDistrictCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAddressDistrictCode(){
                               return localAddressDistrictCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddressDistrictCode
                               */
                               public void setAddressDistrictCode(java.lang.String param){
                            localAddressDistrictCodeTracker = param != null;
                                   
                                            this.localAddressDistrictCode=param;
                                    

                               }
                            

                        /**
                        * field for ServiceId
                        */

                        
                                    protected java.lang.String localServiceId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceIdTracker = false ;

                           public boolean isServiceIdSpecified(){
                               return localServiceIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServiceId(){
                               return localServiceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceId
                               */
                               public void setServiceId(java.lang.String param){
                            localServiceIdTracker = param != null;
                                   
                                            this.localServiceId=param;
                                    

                               }
                            

                        /**
                        * field for AppointmentAction
                        */

                        
                                    protected com.o2wifi.olympus.webservice.AppointmentAction localAppointmentAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppointmentActionTracker = false ;

                           public boolean isAppointmentActionSpecified(){
                               return localAppointmentActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.o2wifi.olympus.webservice.AppointmentAction
                           */
                           public  com.o2wifi.olympus.webservice.AppointmentAction getAppointmentAction(){
                               return localAppointmentAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AppointmentAction
                               */
                               public void setAppointmentAction(com.o2wifi.olympus.webservice.AppointmentAction param){
                            localAppointmentActionTracker = param != null;
                                   
                                            this.localAppointmentAction=param;
                                    

                               }
                            

                        /**
                        * field for AppointmentType
                        */

                        
                                    protected com.o2wifi.olympus.webservice.AppointmentType localAppointmentType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppointmentTypeTracker = false ;

                           public boolean isAppointmentTypeSpecified(){
                               return localAppointmentTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.o2wifi.olympus.webservice.AppointmentType
                           */
                           public  com.o2wifi.olympus.webservice.AppointmentType getAppointmentType(){
                               return localAppointmentType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AppointmentType
                               */
                               public void setAppointmentType(com.o2wifi.olympus.webservice.AppointmentType param){
                            localAppointmentTypeTracker = param != null;
                                   
                                            this.localAppointmentType=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservice.olympus.o2wifi.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":appointmentAvailabilityRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "appointmentAvailabilityRequest",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "";
                                    writeStartElement(null, namespace, "pstnNumber", xmlWriter);
                             

                                          if (localPstnNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("pstnNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPstnNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "productName", xmlWriter);
                             

                                          if (localProductName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("productName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProductName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCustomerRequiredDateTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "customerRequiredDate", xmlWriter);
                             

                                          if (localCustomerRequiredDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("customerRequiredDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerRequiredDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaintenanceCategoryTracker){
                                            if (localMaintenanceCategory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("maintenanceCategory cannot be null!!");
                                            }
                                           localMaintenanceCategory.serialize(new javax.xml.namespace.QName("","maintenanceCategory"),
                                               xmlWriter);
                                        } if (localAddressRefTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "addressRef", xmlWriter);
                             

                                          if (localAddressRef==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("addressRef cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAddressRef);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAddressDistrictCodeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "addressDistrictCode", xmlWriter);
                             

                                          if (localAddressDistrictCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("addressDistrictCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAddressDistrictCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServiceIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "serviceId", xmlWriter);
                             

                                          if (localServiceId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("serviceId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServiceId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAppointmentActionTracker){
                                            if (localAppointmentAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("appointmentAction cannot be null!!");
                                            }
                                           localAppointmentAction.serialize(new javax.xml.namespace.QName("","appointmentAction"),
                                               xmlWriter);
                                        } if (localAppointmentTypeTracker){
                                            if (localAppointmentType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("appointmentType cannot be null!!");
                                            }
                                           localAppointmentType.serialize(new javax.xml.namespace.QName("","appointmentType"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservice.olympus.o2wifi.com/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "pstnNumber"));
                                 
                                        if (localPstnNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPstnNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("pstnNumber cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "productName"));
                                 
                                        if (localProductName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("productName cannot be null!!");
                                        }
                                     if (localCustomerRequiredDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "customerRequiredDate"));
                                 
                                        if (localCustomerRequiredDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerRequiredDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("customerRequiredDate cannot be null!!");
                                        }
                                    } if (localMaintenanceCategoryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "maintenanceCategory"));
                            
                            
                                    if (localMaintenanceCategory==null){
                                         throw new org.apache.axis2.databinding.ADBException("maintenanceCategory cannot be null!!");
                                    }
                                    elementList.add(localMaintenanceCategory);
                                } if (localAddressRefTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "addressRef"));
                                 
                                        if (localAddressRef != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressRef));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("addressRef cannot be null!!");
                                        }
                                    } if (localAddressDistrictCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "addressDistrictCode"));
                                 
                                        if (localAddressDistrictCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressDistrictCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("addressDistrictCode cannot be null!!");
                                        }
                                    } if (localServiceIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceId"));
                                 
                                        if (localServiceId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("serviceId cannot be null!!");
                                        }
                                    } if (localAppointmentActionTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "appointmentAction"));
                            
                            
                                    if (localAppointmentAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("appointmentAction cannot be null!!");
                                    }
                                    elementList.add(localAppointmentAction);
                                } if (localAppointmentTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "appointmentType"));
                            
                            
                                    if (localAppointmentType==null){
                                         throw new org.apache.axis2.databinding.ADBException("appointmentType cannot be null!!");
                                    }
                                    elementList.add(localAppointmentType);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static AppointmentAvailabilityRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AppointmentAvailabilityRequest object =
                new AppointmentAvailabilityRequest();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"appointmentAvailabilityRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AppointmentAvailabilityRequest)com.o2wifi.olympus.webservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pstnNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pstnNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPstnNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","productName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"productName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProductName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","customerRequiredDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"customerRequiredDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCustomerRequiredDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","maintenanceCategory").equals(reader.getName())){
                                
                                                object.setMaintenanceCategory(com.o2wifi.olympus.webservice.MaintenanceCategory.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","addressRef").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"addressRef" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAddressRef(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","addressDistrictCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"addressDistrictCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAddressDistrictCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serviceId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServiceId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","appointmentAction").equals(reader.getName())){
                                
                                                object.setAppointmentAction(com.o2wifi.olympus.webservice.AppointmentAction.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","appointmentType").equals(reader.getName())){
                                
                                                object.setAppointmentType(com.o2wifi.olympus.webservice.AppointmentType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    