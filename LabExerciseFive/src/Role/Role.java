/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import AppSystem.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author Yue
 */
public abstract class Role {
    static String[] roles = {"systemadmin", "customer", "librarian"};

    public static String[] getRoles() {
        return roles;
    }

    public abstract JFrame getWorkArea(AppSystem appSystem, UserAccount useraccount);
}
