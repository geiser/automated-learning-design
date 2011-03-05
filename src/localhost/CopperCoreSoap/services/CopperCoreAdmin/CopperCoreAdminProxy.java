package localhost.CopperCoreSoap.services.CopperCoreAdmin;

public class CopperCoreAdminProxy implements localhost.CopperCoreSoap.services.CopperCoreAdmin.CopperCoreAdmin {
  private String _endpoint = null;
  private localhost.CopperCoreSoap.services.CopperCoreAdmin.CopperCoreAdmin copperCoreAdmin = null;
  
  public CopperCoreAdminProxy() {
    _initCopperCoreAdminProxy();
  }
  
  public CopperCoreAdminProxy(String endpoint) {
    _endpoint = endpoint;
    _initCopperCoreAdminProxy();
  }
  
  private void _initCopperCoreAdminProxy() {
    try {
      copperCoreAdmin = (new localhost.CopperCoreSoap.services.CopperCoreAdmin.CopperCoreAdminServiceLocator()).getCopperCoreAdmin();
      if (copperCoreAdmin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)copperCoreAdmin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)copperCoreAdmin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (copperCoreAdmin != null)
      ((javax.xml.rpc.Stub)copperCoreAdmin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.CopperCoreSoap.services.CopperCoreAdmin.CopperCoreAdmin getCopperCoreAdmin() {
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin;
  }
  
  public void setProperty(int in0, java.lang.String in1, java.lang.String in2, int in3, java.lang.String in4) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.setProperty(in0, in1, in2, in3, in4);
  }
  
  public java.lang.String getProperty(int in0, java.lang.String in1, java.lang.String in2, int in3) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getProperty(in0, in1, in2, in3);
  }
  
  public java.lang.String echo(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.echo(in0);
  }
  
  public java.lang.String getVersion() throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getVersion();
  }
  
  public org.coppercore.common.Message[] validate(byte[] in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.validate(in0, in1);
  }
  
  public org.coppercore.common.Message[] validate(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.validate(in0);
  }
  
  public org.coppercore.common.Message[] publish(byte[] in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.publish(in0, in1);
  }
  
  public org.coppercore.common.Message[] publish(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.publish(in0);
  }
  
  public java.lang.String getUserRoles(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getUserRoles(in0, in1);
  }
  
  public java.lang.String getUser(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getUser(in0);
  }
  
  public org.coppercore.dto.UolDto[] listUols() throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listUols();
  }
  
  public int createRole(int in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.createRole(in0, in1);
  }
  
  public void createUser(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.createUser(in0);
  }
  
  public int getActiveRole(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getActiveRole(in0, in1);
  }
  
  public void setActiveRole(java.lang.String in0, int in1, int in2) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.setActiveRole(in0, in1, in2);
  }
  
  public java.lang.String getContentUri(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getContentUri(in0);
  }
  
  public void setContentUri(int in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.setContentUri(in0, in1);
  }
  
  public org.coppercore.dto.UolDto getUol(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getUol(in0);
  }
  
  public org.coppercore.dto.RunDto getRun(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getRun(in0);
  }
  
  public org.coppercore.dto.RunDto[] listRuns(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listRuns(in0);
  }
  
  public int createRun(org.coppercore.dto.RunDto in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.createRun(in0);
  }
  
  public void changeRun(org.coppercore.dto.RunDto in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.changeRun(in0);
  }
  
  public java.lang.String[] listUsers() throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listUsers();
  }
  
  public org.coppercore.dto.RunParticipationDTO[] listUsersInRun(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listUsersInRun(in0);
  }
  
  public org.coppercore.dto.RunParticipationDTO[] listRunsForUser(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listRunsForUser(in0);
  }
  
  public org.coppercore.dto.RunParticipationDTO[] listRunsForUser(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listRunsForUser(in0, in1);
  }
  
  public org.coppercore.dto.RunParticipationDTO[] listUsersInRole(int in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listUsersInRole(in0, in1);
  }
  
  public void addUserToRun(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.addUserToRun(in0, in1);
  }
  
  public void removeUserFromRun(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.removeUserFromRun(in0, in1);
  }
  
  public org.coppercore.dto.UolDto[] listUolsForUser(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.listUolsForUser(in0);
  }
  
  public void addUserToRole(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.addUserToRole(in0, in1);
  }
  
  public void removeUserFromRole(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.removeUserFromRole(in0, in1);
  }
  
  public boolean validateRoles(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.validateRoles(in0);
  }
  
  public java.lang.String getRolesTree(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getRolesTree(in0);
  }
  
  public java.lang.String getActiveLDRole(java.lang.String in0, int in1) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    return copperCoreAdmin.getActiveLDRole(in0, in1);
  }
  
  public void removeRun(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.removeRun(in0);
  }
  
  public void removeUol(int in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.removeUol(in0);
  }
  
  public void removeUser(java.lang.String in0) throws java.rmi.RemoteException{
    if (copperCoreAdmin == null)
      _initCopperCoreAdminProxy();
    copperCoreAdmin.removeUser(in0);
  }
  
  
}