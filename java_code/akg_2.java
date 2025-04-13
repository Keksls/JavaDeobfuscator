/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKG
 */
public abstract class akg_2
extends Enum<akg_2>
implements hv_1 {
    public static final /* enum */ akg_2 a = new akh_1();
    public static final /* enum */ akg_2 b = new aki_2();
    public static final /* enum */ akg_2 c = new akj_1();
    public static final /* enum */ akg_2 d = new akk_1();
    public static final /* enum */ akg_2 e = new akl_2();
    public static final /* enum */ akg_2 f = new akm_1();
    public static final /* enum */ akg_2 g = new akn_2();
    public static final /* enum */ akg_2 h = new ako_2();
    public static final /* enum */ akg_2 i = new akp_2();
    private static final /* synthetic */ akg_2[] j;

    public static akg_2[] values() {
        return (akg_2[])j.clone();
    }

    public static akg_2 valueOf(String string) {
        return Enum.valueOf(akg_2.class, string);
    }

    final boolean a(akg_2 akg_22) {
        if (this == akg_22) {
            return true;
        }
        if (this == d) {
            return akg_22 == e;
        }
        if (this == e) {
            return akg_22 == d;
        }
        return false;
    }

    public abstract boolean a(LuaState var1, int var2);

    static {
        j = new akg_2[]{a, b, c, d, e, f, g, h, i};
    }
}

