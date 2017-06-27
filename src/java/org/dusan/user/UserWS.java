/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dusan.user;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author dusanmatejka
 */
@WebService(serviceName = "UserWS")
@Stateless()
public class UserWS {
    
    List<User> users = new ArrayList<>();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "addUser")
    public void addUser(@WebParam(name = "first") String first, @WebParam(name = "last") String last) {
        users.add(new User(first, last));
    }

    @WebMethod(operationName = "getUsers")
    public List<User> getUsers() {
        return users;
    }
}
