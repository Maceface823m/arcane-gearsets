package net.maceface.arcanegearsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.commons.compress.harmony.pack200.PackingUtils.log;

public class ModEvents {

    private static final Logger log = LoggerFactory.getLogger(ModEvents.class);

    public ModEvents() { throw new AssertionError(); }

    public static void addListeners() {
        log("Registering items");
    }

}
