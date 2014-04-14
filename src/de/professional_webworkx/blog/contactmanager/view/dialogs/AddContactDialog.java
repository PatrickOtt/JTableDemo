/*
 * Copyright 2014 Patrick Ott <Patrick.Ott@professional-webworkx.de>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.professional_webworkx.blog.contactmanager.view.dialogs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddContactDialog extends JDialog {

    JButton ok, close;
    JTextField firstNameField;
    JTextField lastNameField;
    String firstName;
    String lastName;
    
    
    private final AddContactDialog dialog;
    
    public AddContactDialog() {
        this.dialog = this;
        this.setLayout(new BorderLayout(10, 10));
        this.setModal(true);
        this.setTitle("create new Contact");
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(350, 200));
        this.getContentPane().add(initInputPanel(), BorderLayout.NORTH);
        this.getContentPane().add(initDialogPanel(), BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
    }
    
    /*
        inits the TextField Panel
    */
    private JPanel initInputPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2));
        firstNameField  = new JTextField();
        lastNameField   = new JTextField();
        panel.add(new JLabel("Firstname: "));
        panel.add(firstNameField);
        
        panel.add(new JLabel("Lastname: "));
        panel.add(lastNameField);
        
        return panel;
    }
    /*
        inits the ButtonPanel
    */
    private JPanel initDialogPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        ok      = new JButton("save");
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                firstName   = firstNameField.getText();
                lastName    = lastNameField.getText();
                dialog.setVisible(false);
            }
        });
        close   = new JButton("cancel");
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        panel.add(ok);
        panel.add(close);
        return panel;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
}
