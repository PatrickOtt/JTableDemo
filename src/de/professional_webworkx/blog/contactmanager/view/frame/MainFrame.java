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

package de.professional_webworkx.blog.contactmanager.view.frame;

import de.professional_webworkx.blog.contactmanager.business.listener.AddContactListener;
import de.professional_webworkx.blog.contactmanager.domain.Contact;
import de.professional_webworkx.blog.contactmanager.view.table.model.ContactTableModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Patrick Ott <Patrick.Ott@professional-webworkx.de>
 * @version 1.0
 */
public class MainFrame extends JFrame {

    private JTable contactTable;
    private JScrollPane scrollPane;
    private ContactTableModel tableModel;
    private List<Contact> contactList = new ArrayList<Contact>();
    
    private JButton addContact;
    
    public MainFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Contact List Manager");
        JPanel contactTablePanel = initComponents();
        addContact = new JButton("add new Contact");
        addContact.addActionListener(new AddContactListener(contactTable));
        this.getContentPane().add(addContact, BorderLayout.NORTH);
        this.getContentPane().add(contactTablePanel, BorderLayout.CENTER);
        
        this.setSize(new Dimension(1024, 768));
        this.setVisible(true);
    }

    private JPanel initComponents() {
        JPanel panel = new JPanel();
        contactTable = new JTable(new ContactTableModel());
        scrollPane = new JScrollPane(contactTable);
        panel.add(scrollPane);
        return panel;
    }
    
}
