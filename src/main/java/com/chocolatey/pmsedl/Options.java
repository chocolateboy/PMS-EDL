package com.chocolatey.pmsedl;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ResourceBundle;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

class Options extends JPanel implements ItemListener {
    private boolean enabled = true;
    private JCheckBox checkbox;
    private static final ResourceBundle messages = ResourceBundle.getBundle("com.chocolatey.pmsedl.lang.messages");
    private static final String ENABLE = messages.getString("Options.Enable");

    protected Options() {
        checkbox = new JCheckBox(ENABLE, true);
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
