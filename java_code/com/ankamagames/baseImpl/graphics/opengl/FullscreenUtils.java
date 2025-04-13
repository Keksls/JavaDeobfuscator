/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.opengl;

import org.apache.log4j.Logger;

public class FullscreenUtils {
    private static final Logger b = Logger.getLogger(FullscreenUtils.class);
    public static final FullscreenUtils a;

    private FullscreenUtils() {
    }

    public native void showMenuAndDock(boolean var1);

    static {
        try {
            if (ahu_2.b()) {
                System.loadLibrary("fullscreenutils");
            }
        }
        catch (Throwable throwable) {
            b.error((Object)"Unable to load fullscreenutils library (So full screen management on mac isn't available :c)", throwable);
        }
        a = new FullscreenUtils();
    }
}

