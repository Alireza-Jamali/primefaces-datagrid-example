package web.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 *
 * @author Naseri
 */
@ManagedBean
@SessionScoped
public class SignInBean {

    private String username;
    private String password;
    private boolean remember;
    private int tabViewActiveIndex;

    public int getTabViewActiveIndex() {
        return tabViewActiveIndex;
    }

    public void setTabViewActiveIndex(int tabViewActiveIndex) {
        this.tabViewActiveIndex = tabViewActiveIndex;
    }
    

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signIn() {
        validate();
        /*ur codes here*/
    }

    private void validate() {

        if (false) {

            FacesMessage msg = new FacesMessage("ایمیل یا رمز عبور اشتباه است", null);
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, msg);

        }
    }
    
    public String signUp() {
    
        if(tabViewActiveIndex == 1){ 
            tabViewActiveIndex  = 0;
        }else {tabViewActiveIndex  = 1;}
        
        return "datagridproducts";
        
    }
}
