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

package de.professional_webworkx.blog.contactmanager;

import de.professional_webworkx.blog.contactmanager.view.frame.MainFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Patrick Ott <Patrick.Ott@professional-webworkx.de>
 */
public class ContactManager {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
            }
        });
    }
    
}
