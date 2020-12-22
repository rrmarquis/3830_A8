/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;

/**
 *
 * @author roger
 */
@Stateless
public class SimpleSessionBean implements SimpleSessionBeanRemote {

    public String getEchoString(String clientString) {
        return clientString + " - from session bean";
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 
}
