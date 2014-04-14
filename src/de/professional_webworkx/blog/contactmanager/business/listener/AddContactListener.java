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

package de.professional_webworkx.blog.contactmanager.business.listener;

import de.professional_webworkx.blog.contactmanager.domain.Contact;
import de.professional_webworkx.blog.contactmanager.view.dialogs.AddContactDialog;
import de.professional_webworkx.blog.contactmanager.view.table.model.ContactTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;

public class AddContactListener implements ActionListener {

    private JTable table;
    
    public AddContactListener(final JTable table) {
        this.table  = table;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ContactTableModel model = (ContactTableModel)this.table.getModel();
        AddContactDialog dialog = new AddContactDialog();
        String firstName = dialog.getFirstName();
        String lastName = dialog.getLastName();
        model.addContact(new Contact(firstName, lastName));
    }

}
