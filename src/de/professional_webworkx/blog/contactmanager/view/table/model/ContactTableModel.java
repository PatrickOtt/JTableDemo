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

package de.professional_webworkx.blog.contactmanager.view.table.model;

import de.professional_webworkx.blog.contactmanager.domain.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Patrick Ott <Patrick.Ott@professional-webworkx.de>
 * @version 1.0
 */
public class ContactTableModel extends AbstractTableModel {

    private final String[] columnNames = {"Firstname", "Lastname"};
    List<Contact> contactList;

    public ContactTableModel() {
    contactList = new ArrayList<>();
    contactList.add(new Contact("Patrick", "Ott"));
    }
    
    @Override
    public int getRowCount() {
        return contactList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contact contact = contactList.get(rowIndex);
        switch(columnIndex) {
            case(0):
                return contact.getFirstName();
            case(1):
                return contact.getLastName();
        }
        
        return null;
    }

    public void addContact(final Contact contact) {
        contactList.add(contact);
        fireTableDataChanged();
    }
}
