/**
 * RunDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.coppercore.dto;

public class RunDto  implements java.io.Serializable {
    private int runId;

    private java.util.Calendar starttime;

    private java.lang.String title;

    private int uolId;

    public RunDto() {
    }

    public RunDto(
           int runId,
           java.util.Calendar starttime,
           java.lang.String title,
           int uolId) {
           this.runId = runId;
           this.starttime = starttime;
           this.title = title;
           this.uolId = uolId;
    }


    /**
     * Gets the runId value for this RunDto.
     * 
     * @return runId
     */
    public int getRunId() {
        return runId;
    }


    /**
     * Sets the runId value for this RunDto.
     * 
     * @param runId
     */
    public void setRunId(int runId) {
        this.runId = runId;
    }


    /**
     * Gets the starttime value for this RunDto.
     * 
     * @return starttime
     */
    public java.util.Calendar getStarttime() {
        return starttime;
    }


    /**
     * Sets the starttime value for this RunDto.
     * 
     * @param starttime
     */
    public void setStarttime(java.util.Calendar starttime) {
        this.starttime = starttime;
    }


    /**
     * Gets the title value for this RunDto.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RunDto.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the uolId value for this RunDto.
     * 
     * @return uolId
     */
    public int getUolId() {
        return uolId;
    }


    /**
     * Sets the uolId value for this RunDto.
     * 
     * @param uolId
     */
    public void setUolId(int uolId) {
        this.uolId = uolId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunDto)) return false;
        RunDto other = (RunDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.runId == other.getRunId() &&
            ((this.starttime==null && other.getStarttime()==null) || 
             (this.starttime!=null &&
              this.starttime.equals(other.getStarttime()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.uolId == other.getUolId();
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
        _hashCode += getRunId();
        if (getStarttime() != null) {
            _hashCode += getStarttime().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += getUolId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.coppercore.org", "RunDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starttime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uolId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uolId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
