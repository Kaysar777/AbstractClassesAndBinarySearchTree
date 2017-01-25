package com.company;

/**
 * Created by Kaisar on 1/21/17.
 */
public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);

}
