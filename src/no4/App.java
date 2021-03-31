/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no4;

/**
 *
 * @author hp
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scrollbar scrollbar = new Scrollbar();
        Titlebar titlebar = new Titlebar();
        Menu menu = new Menu();
        Windows windows = new Windows(titlebar, scrollbar);
        windows.addMenu(menu);
    }
}
