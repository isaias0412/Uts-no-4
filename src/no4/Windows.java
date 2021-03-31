/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no4;
 import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class Windows {

    private ArrayList<Menu> menuList = new ArrayList<Menu>();
    private Titlebar titlebar;
    private Scrollbar scrollbar;
    public Windows(Titlebar titlebar, Scrollbar scrollbar) {
        this.titlebar = titlebar;
        this.scrollbar = scrollbar;
    }
    public void addMenu(Menu menu){
        menuList.add(menu);
    }
    public Titlebar getTitlebar() {
        return titlebar;
    }
    public void setTitlebar(Titlebar titlebar) {
        this.titlebar = titlebar;
    }
    public Scrollbar getScrollbar() {
        return scrollbar;
    }
    public void setScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
    }
    
}
