package com.chocolatey.pmsedl;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

class Options extends JPanel implements ItemListener {
    private boolean enabled = true;
    private JCheckBox checkbox;
    private static final ResourceBundle labels = ResourceBundle.getBundle("messages");
    private static final String ENABLE = labels.getString("Options.Enable");

    protected Options() {
        checkbox = new JCheckBox(ENABLE, true);
        checkbox.setMnemonic(KeyEvent.VK_E);
        checkbox.addItemListener(this);
        add(checkbox);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        enabled = checkbox.isSelected();
        Plugin.log(enabled ? "enabled" : "disabled");
    }

    public boolean isEnabled() {
        return enabled;
    }
}
