/**
 * UolDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.coppercore.dto;

public class UolDto  implements java.io.Serializable {
    private java.lang.String contentUri;

    private int id;

    private java.lang.String rolesId;

    private java.lang.String title;

    private java.lang.String uri;

    public UolDto() {
    }

    public UolDto(
           java.lang.String contentUri,
           int id,
           java.lang.String rolesId,
           java.lang.String title,
           java.lang.String uri) {
           this.contentUri = contentUri;
           this.id = id;
           this.rolesId = rolesId;
           this.title = title;
           this.uri = uri;
    }


    /**
     * Gets the contentUri value for this UolDto.
     * 
     * @return contentUri
     */
    public java.lang.String getContentUri() {
        return contentUri;
    }


    /**
     * Sets the contentUri value for this UolDto.
     * 
     * @param contentUri
     */
    public void setContentUri(java.lang.String contentUri) {
        this.contentUri = contentUri;
    }


    /**
     * Gets the id value for this UolDto.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this UolDto.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the rolesId value for this UolDto.
     * 
     * @return rolesId
     */
    public java.lang.String getRolesId() {
        return rolesId;
    }


    /**
     * Sets the rolesId value for this UolDto.
     * 
     * @param rolesId
     */
    public void setRolesId(java.lang.String rolesId) {
        this.rolesId = rolesId;
    }


    /**
     * Gets the title value for this UolDto.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this UolDto.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the uri value for this UolDto.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this UolDto.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UolDto)) return false;
        UolDto other = (UolDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentUri==null && other.getContentUri()==null) || 
             (this.contentUri!=null &&
              this.contentUri.equals(other.getContentUri()))) &&
            this.id == other.getId() &&
            ((this.rolesId==null && other.getRolesId()==null) || 
             (this.rolesId!=null &&
              this.rolesId.equals(other.getRolesId()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri())));
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
        if (getContentUri() != null) {
            _hashCode += getContentUri().hashCode();
        }
        _hashCode += getId();
        if (getRolesId() != null) {
            _hashCode += getRolesId().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UolDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.coppercore.org", "UolDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentUri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rolesId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uri"));
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
