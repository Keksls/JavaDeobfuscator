/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fku
 */
public class fku_0 {
    public static boolean a(fkt_0 fkt_02, Object object) {
        if (fkt_02 == object) {
            return true;
        }
        if (object == null || fkt_02.getClass() != object.getClass()) {
            return false;
        }
        fkt_0 fkt_03 = (fkt_0)object;
        return fkt_02.d() == fkt_03.d();
    }

    public static int a(fkt_0 fkt_02) {
        return (int)fkt_02.d();
    }
}

