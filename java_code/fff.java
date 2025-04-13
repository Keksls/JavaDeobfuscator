/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class fff {
    protected static final Logger a = Logger.getLogger(fff.class);
    public static final int b = 1;
    public static final int c = 0;

    protected static boolean a(aff_1 aff_12, TG tG, boolean bl) {
        int n = bl ? 0 : 1;
        aff_1 aff_13 = tG.P_();
        if (Math.abs(aff_13.d() - aff_12.d()) > n) {
            return true;
        }
        return Math.abs(aff_13.e() - aff_12.e()) > n;
    }
}

