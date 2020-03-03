package com.fernandopaniagua.ejercicio8;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

public class NotificationsGenerator {
    /**
     * Generate O.S. Notification
     * 
     * @param appName Application name
     * @param message Message to display
     */
    public static void generateNotification(String appName, String message){
        try {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, appName);
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip(appName + message);
            tray.add(trayIcon);
            trayIcon.displayMessage(message, appName, MessageType.INFO);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
