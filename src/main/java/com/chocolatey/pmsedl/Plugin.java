package com.chocolatey.pmsedl;

import net.pms.dlna.DLNAMediaInfo;
import net.pms.dlna.DLNAResource;
import net.pms.external.FinalizeTranscoderArgsListener;
import net.pms.io.OutputParams;
import net.pms.PMS;

import java.io.File;
import java.util.List;

import javax.swing.JComponent;

public class Plugin implements FinalizeTranscoderArgsListener {
    private static final String VERSION = "1.0.0";
    private static final String NAME = "PMS-EDL";
    private Options options;

    public Plugin() {
        options = new Options();
        log("Initialized PMS-EDL " + VERSION);
    }

    public String name() {
       return NAME;
    }

    private static boolean fileExists(File file) {
        return file.exists() && file.isFile();
    }

    public static void log(String msg) {
        PMS.minimal(NAME + ": " + msg);
    }

    @Override
    public List<String> finalizeTranscoderArgs(
        String engine,
        String filename,
        DLNAResource dlna,
        DLNAMediaInfo media,
        OutputParams params,
        List<String> cmdList)
    {
        if (options.isEnabled() && engine.equals("mencoder")) {
            File file = new File(filename + ".edl");

            if (!fileExists(file)) {
                file = new File(file.getParentFile(), "folder.edl");
                if (!fileExists(file)) {
                    file = null;
                }
            }

            if (file != null) {
                String path = file.getAbsolutePath();
                log("detected EDL: " + path);
                cmdList.add("-edl");
                cmdList.add(path);
            }
        }

        return cmdList;
    }

    public void shutdown() {
        // nothing to do
    }

    public JComponent config() {
        return options;
    }
}
