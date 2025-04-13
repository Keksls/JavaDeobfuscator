/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class dez {
    private static final Logger a = Logger.getLogger(dez.class);

    public static boolean b(adt_1 adt_12) {
        return adt_12.a() == 17127 || adt_12.a() == 19672;
    }

    public static boolean c(adt_1 adt_12) {
        return adt_12.a() == 19751 || adt_12.a() == 18907 || adt_12.a() == 17976 || adt_12.a() == 16119 || adt_12.a() == 16875 || adt_12.a() == 18984;
    }

    public static boolean d(adt_1 adt_12) {
        return dez.c(adt_12) || dez.b(adt_12);
    }
}

