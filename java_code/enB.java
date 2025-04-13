/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class enB {
    private static final Logger d = Logger.getLogger(enB.class);
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;

    public static enB a(arf_1 arf_12) {
        byte by = arf_12.a();
        switch (by) {
            case 2: {
                return new enD(arf_12);
            }
            case 1: {
                return new enC(arf_12);
            }
        }
        return null;
    }

    public static void a(gk_0 gk_02, enB enB2) {
        if (enB2 == null) {
            gk_02.a((byte)0);
            return;
        }
        gk_02.a(enB2.a() ? (byte)1 : 2);
        enB2.a(gk_02);
    }

    public static enB a(enB enB2) {
        if (enB2 == null) {
            return null;
        }
        enB enB3 = null;
        enB3 = enB2.a() ? new enC() : new enD();
        enB3.c(enB2);
        return enB3;
    }

    public static boolean b(enB enB2) {
        return enB2 != null && enB2.a();
    }

    public abstract boolean a();

    public abstract void b();

    public abstract void b(arf_1 var1);

    public abstract void a(gk_0 var1);

    protected abstract void c(enB var1);
}

