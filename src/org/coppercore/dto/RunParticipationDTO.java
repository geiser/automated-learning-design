/**
 * RunParticipationDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.coppercore.dto;

public class RunParticipationDTO  implements java.io.Serializable {
    private int activeRole;

    private java.lang.String roleId;

    private int runId;

    private java.lang.String userId;

    public RunParticipationDTO() {
    }

    public RunParticipationDTO(
           int activeRole,
           java.lang.String roleId,
           int runId,
           java.lang.String userId) {
           this.activeRole = activeRole;
           this.roleId = roleId;
           this.runId = runId;
           this.userId = userId;
    }


    /**
     * Gets the activeRole value for this RunParticipationDTO.
     * 
     * @return activeRole
     */
    public int getActiveRole() {
        return activeRole;
    }


    /**
     * Sets the activeRole value for this RunParticipationDTO.
     * 
     * @param activeRole
     */
    public void setActiveRole(int activeRole) {
        this.activeRole = activeRole;
    }


    /**
     * Gets the roleId value for this RunParticipationDTO.
     * 
     * @return roleId
     */
    public java.lang.String getRoleId() {
        return roleId;
    }


    /**
     * Sets the roleId value for this RunParticipationDTO.
     * 
     * @param roleId
     */
    public void setRoleId(java.lang.String roleId) {
        this.roleId = roleId;
    }


    /**
     * Gets the runId value for this RunParticipationDTO.
     * 
     * @return runId
     */
    public int getRunId() {
        return runId;
    }


    /**
     * Sets the runId value for this RunParticipationDTO.
     * 
     * @param runId
     */
    public void setRunId(int runId) {
        this.runId = runId;
    }


    /**
     * Gets the userId value for this RunParticipationDTO.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this RunParticipationDTO.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunParticipationDTO)) return false;
        RunParticipationDTO other = (RunParticipationDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.activeRole == other.getActiveRole() &&
            ((this.roleId==null && other.getRoleId()==null) || 
             (this.roleId!=null &&
              this.roleId.equals(other.getRoleId()))) &&
            this.runId == other.getRunId() &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        _hashCode += getActiveRole();
        if (getRoleId() != null) {
            _hashCode += getRoleId().hashCode();
        }
        _hashCode += getRunId();
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunParticipationDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.coppercore.org", "RunParticipationDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
