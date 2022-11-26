package proses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Menu {
    
    private HashMap<String, Integer> menu;

    public Menu() {
        menu = new HashMap<String, Integer>();
        setMenu();
    }

    public int retHarga(String key) {
        return menu.get(key);
    }

    public void setMenu()
    {
        menu.put("Ayam Betutu", 40000);
        menu.put("Gudeg", 35000);
        menu.put("Mie Aceh", 30000);
        menu.put("Kerak Telor", 25000);
        menu.put("Bandrek", 20000);
        menu.put("Sarabba", 20000);
        menu.put("Bir Pletok", 25000);
        menu.put("Air Suraka", 10000);
    }

    public HashMap<String, Integer> getMenu() {
        return menu;
    }

    public String namaMakanan(int noMenu) {
        int index = noMenu - 1;

        Set<String> menuSet = menu.keySet();

        ArrayList<String> listMenu = new ArrayList<String>(menuSet);

        String key = listMenu.get(index);

        return key;
    }

}
