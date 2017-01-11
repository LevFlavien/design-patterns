
package abstractfactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * DESCRIPTION FICHIER
 */
public class ThemeCatalog extends AbstractListModel implements ComboBoxModel {
    
    private ArrayList<ThemeFactory> themes = new ArrayList();
    //Hashtable<String, ThemeFactory> ComputerComps = new Hashtable();
    //private String selection;
    private ThemeFactory selectedTheme = null;
    
    public ThemeCatalog() {
        themes.add(new Theme1());
        themes.add(new Theme2());
        selectedTheme = themes.get(0);
    }
    
    @Override
    public int getSize() {
        return themes.size();
    }

    @Override
    public Object getElementAt(int index) {
        return themes.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedTheme = (ThemeFactory) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedTheme;
    }
    
    
    
}
