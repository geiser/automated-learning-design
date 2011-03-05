/**
 * Message.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.coppercore.common;

public class Message  implements java.io.Serializable {
    private long elapsedTime;

    private int level;

    private java.lang.String message;

    public Message() {
    }

    public Message(
           long elapsedTime,
           int level,
           java.lang.String message) {
           this.elapsedTime = elapsedTime;
           this.level = level;
           this.message = message;
    }


    /**
     * Gets the elapsedTime value for this Message.
     * 
     * @return elapsedTime
     */
    public long getElapsedTime() {
        return elapsedTime;
    }


    /**
     * Sets the elapsedTime value for this Message.
     * 
     * @param elapsedTime
     */
    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }


    /**
     * Gets the level value for this Message.
     * 
     * @return level
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this Message.
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Gets the message value for this Message.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Message.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Message)) return false;
        Message other = (Message) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.elapsedTime == other.getElapsedTime() &&
            this.level == other.getLevel() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getElapsedTime()).hashCode();
        _hashCode += getLevel();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Message.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.coppercore.org", "Message"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elapsedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
