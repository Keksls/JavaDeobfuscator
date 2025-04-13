/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class FlyingTextCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(FlyingTextCommand.class);
    private static Runnable b;
    private static final int c = 500;
    private static final float d = 0.65f;
    private static final float e = 1.3f;
    public int f;

    public float a(int n) {
        int n2 = Hw.a(n, 0, 500);
        int n3 = n2 / 50;
        float f2 = (float)(n3 * 50) / 500.0f;
        return Hw.a(0.65f, 1.3f, f2);
    }

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (b == null) {
            b = new aZl(this);
            ado_1.a().a(b, 500L, -1);
        } else {
            ado_1.a().b(b);
            b = null;
            this.f = 0;
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

