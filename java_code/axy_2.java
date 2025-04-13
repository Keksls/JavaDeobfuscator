/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;

/*
 * Renamed from axy
 */
public class axy_2
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(axy_2.class);
    public static final axy_2 b = new axy_2();
    private final EnumMap<axx_2, Boolean> d = new EnumMap(axx_2.class);
    private static final String[] e;

    private axy_2() {
    }

    public void a(axx_2 axx_22, boolean bl) {
        this.d.put(axx_22, bl);
    }

    public boolean a(axx_2 ... axx_2Array) {
        for (axx_2 axx_22 : axx_2Array) {
            Boolean bl = this.d.get((Object)axx_22);
            if (bl != null && bl.booleanValue()) continue;
            return false;
        }
        return true;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        return this.a(axx_2.a(string));
    }

    public boolean a() {
        return this.a(axx_2.e, axx_2.f);
    }

    public boolean b() {
        return this.a(axx_2.g, axx_2.h);
    }

    public boolean c() {
        return this.a() && this.b();
    }

    static {
        axx_2[] axx_2Array = axx_2.values();
        e = new String[axx_2Array.length];
        for (int k = 0; k < axx_2Array.length; ++k) {
            axy_2.e[k] = axx_2Array[k].b();
        }
    }
}

