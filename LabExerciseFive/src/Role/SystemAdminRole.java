/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import AppSystem.UserAccount;
import UI.SystemAdminWorkArea.SystemAdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Yue
 */
public class SystemAdminRole extends Role {
    
     public SystemAdminRole() {
    }

    
    @Override
    public JFrame getWorkArea(AppSystem appSystem, UserAccount useraccount) {
        return new SystemAdminJFrame(appSystem, useraccount);
    }
}
