package Exercise47;

public interface NodeList {

 ListItem getRoot();
 boolean addItem(ListItem item);
 boolean removeItem(ListItem item);
 void traverse(ListItem root);
}
