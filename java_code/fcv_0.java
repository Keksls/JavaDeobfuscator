/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcv
 */
public class fcv_0 {
    public static boolean a(fcu_0 fcu_02, fcu_0 fcu_03) {
        if (fcu_02 == null || fcu_03 == null) {
            return false;
        }
        if (fcu_02 == fcu_0.a) {
            return fcu_03 != fcu_0.a;
        }
        if (fcu_02 == fcu_0.b) {
            return fcu_03 != fcu_0.a && fcu_03 != fcu_0.b;
        }
        return false;
    }

    public static boolean b(fcu_0 fcu_02, fcu_0 fcu_03) {
        if (fcu_02 == null || fcu_03 == null) {
            return false;
        }
        if (fcu_02 == fcu_03) {
            return true;
        }
        if (fcu_02 == fcu_0.a) {
            return true;
        }
        if (fcu_02 == fcu_0.b) {
            return fcu_03 != fcu_0.a;
        }
        return false;
    }

    public static boolean a(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: 
            case g: 
            case f: 
            case e: 
            case j: {
                return true;
            }
        }
        return false;
    }

    public static boolean b(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: 
            case g: {
                return true;
            }
        }
        return false;
    }

    public static boolean c(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: 
            case j: {
                return true;
            }
        }
        return false;
    }

    public static boolean d(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: 
            case f: {
                return true;
            }
        }
        return false;
    }

    public static boolean e(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: 
            case f: {
                return true;
            }
        }
        return false;
    }

    public static boolean f(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: 
            case e: {
                return true;
            }
        }
        return false;
    }

    public static boolean g(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: {
                return true;
            }
        }
        return false;
    }

    public static boolean h(fcu_0 fcu_02) {
        if (fcu_02 == null) {
            return false;
        }
        switch (fcu_02) {
            case a: 
            case b: {
                return true;
            }
        }
        return false;
    }
}

