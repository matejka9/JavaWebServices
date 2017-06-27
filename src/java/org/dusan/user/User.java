/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dusan.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "User" )
public class User {
    
    @XmlElement (name = "first")
    private String first;
    @XmlElement (name = "last")
    private String last;
    
    public User() {
        
    }
    
    public User(String first, String last){
        this.first = first;
        this.last = last;
    }

    public void setFirst(String first) {
        this.first = first;
    }
    public void setLast(String last) {
        this.last = last;
    }
    
    
    
}
