package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


/**
 * @author hakiba
 */
public class HealthCheckAction extends ActionSupport {

    @Action(value = "healthcheck",
            results = {@Result(name = ActionSupport.SUCCESS, location = "index.html")})
    public String healthcheck(){
        return SUCCESS;
    }
}
