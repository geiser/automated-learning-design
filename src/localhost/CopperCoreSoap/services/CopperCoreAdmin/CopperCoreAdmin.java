/**
 * CopperCoreAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.CopperCoreSoap.services.CopperCoreAdmin;

public interface CopperCoreAdmin extends java.rmi.Remote {
    public void setProperty(int in0, java.lang.String in1, java.lang.String in2, int in3, java.lang.String in4) throws java.rmi.RemoteException;
    public java.lang.String getProperty(int in0, java.lang.String in1, java.lang.String in2, int in3) throws java.rmi.RemoteException;
    public java.lang.String echo(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getVersion() throws java.rmi.RemoteException;
    public org.coppercore.common.Message[] validate(byte[] in0, java.lang.String in1) throws java.rmi.RemoteException;
    public org.coppercore.common.Message[] validate(java.lang.String in0) throws java.rmi.RemoteException;
    public org.coppercore.common.Message[] publish(byte[] in0, java.lang.String in1) throws java.rmi.RemoteException;
    public org.coppercore.common.Message[] publish(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getUserRoles(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public java.lang.String getUser(java.lang.String in0) throws java.rmi.RemoteException;
    public org.coppercore.dto.UolDto[] listUols() throws java.rmi.RemoteException;
    public int createRole(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public void createUser(java.lang.String in0) throws java.rmi.RemoteException;
    public int getActiveRole(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public void setActiveRole(java.lang.String in0, int in1, int in2) throws java.rmi.RemoteException;
    public java.lang.String getContentUri(int in0) throws java.rmi.RemoteException;
    public void setContentUri(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public org.coppercore.dto.UolDto getUol(int in0) throws java.rmi.RemoteException;
    public org.coppercore.dto.RunDto getRun(int in0) throws java.rmi.RemoteException;
    public org.coppercore.dto.RunDto[] listRuns(int in0) throws java.rmi.RemoteException;
    public int createRun(org.coppercore.dto.RunDto in0) throws java.rmi.RemoteException;
    public void changeRun(org.coppercore.dto.RunDto in0) throws java.rmi.RemoteException;
    public java.lang.String[] listUsers() throws java.rmi.RemoteException;
    public org.coppercore.dto.RunParticipationDTO[] listUsersInRun(int in0) throws java.rmi.RemoteException;
    public org.coppercore.dto.RunParticipationDTO[] listRunsForUser(java.lang.String in0) throws java.rmi.RemoteException;
    public org.coppercore.dto.RunParticipationDTO[] listRunsForUser(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public org.coppercore.dto.RunParticipationDTO[] listUsersInRole(int in0, int in1) throws java.rmi.RemoteException;
    public void addUserToRun(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public void removeUserFromRun(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public org.coppercore.dto.UolDto[] listUolsForUser(java.lang.String in0) throws java.rmi.RemoteException;
    public void addUserToRole(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public void removeUserFromRole(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public boolean validateRoles(int in0) throws java.rmi.RemoteException;
    public java.lang.String getRolesTree(int in0) throws java.rmi.RemoteException;
    public java.lang.String getActiveLDRole(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public void removeRun(int in0) throws java.rmi.RemoteException;
    public void removeUol(int in0) throws java.rmi.RemoteException;
    public void removeUser(java.lang.String in0) throws java.rmi.RemoteException;
}
