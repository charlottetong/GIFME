package entities;
// Generated Nov 7, 2016 4:37:39 PM by Hibernate Tools 4.3.1



/**
 * UserPassword generated by hbm2java
 */
public class UserPassword  implements java.io.Serializable {


     private Integer usrId;
     private UserInfo userInfo;
     private String usrPwd;

    public UserPassword() {
    }

	
    public UserPassword(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public UserPassword(UserInfo userInfo, String usrPwd) {
       this.userInfo = userInfo;
       this.usrPwd = usrPwd;
    }
   
    public Integer getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }
    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public String getUsrPwd() {
        return this.usrPwd;
    }
    
    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd;
    }




}


