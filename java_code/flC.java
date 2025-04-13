/*
 * Decompiled with CFR 0.152.
 */
public class flC {
    public static boolean a(short s2) {
        switch (s2) {
            case -1: 
            case 1: 
            case 2: 
            case 14: 
            case 16: 
            case 20: 
            case 33: {
                return false;
            }
        }
        return true;
    }

    public static boolean a(long l) {
        if (!euv_2.a.a(l)) {
            return true;
        }
        Object t = euu_2.h(l);
        return t == null || flC.a(((epq_2)t).hB());
    }

    public static boolean b(short s2) {
        return flC.a(s2) && s2 != 27;
    }
}

