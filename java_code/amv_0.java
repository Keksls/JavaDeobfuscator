/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amv
 */
public class amv_0
extends amt_0 {
    private static final Logger c = Logger.getLogger(amv_0.class);
    public static final String b = "playRandomApsSoundWithGlobalPitch";
    private static final akf_1[] d = new akf_1[]{new akf_1("fightId", null, akg_2.d, false), new akf_1("apsId", null, akg_2.d, false), new akf_1("duration", null, akg_2.d, false), new akf_1("fadeOutTime", null, akg_2.d, false), new akf_1("rollOffId", null, akg_2.d, false), new akf_1("loop", null, akg_2.f, false), new akf_1("minPitch", null, akg_2.e, false), new akf_1("maxPitch", null, akg_2.e, false), new akf_1("soundId, gain", null, akg_2.h, true)};

    public amv_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected amu_0 b(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        int n5 = this.d(3);
        int n6 = this.d(4);
        boolean bl = this.l(5);
        float f2 = this.f(6);
        float f3 = this.f(7);
        if (n < 9) {
            return new amu_0(n2, n3, n4, n5, n6, bl);
        }
        List<anj_1> list = this.a(6, n, false, (l, f4) -> new anj_1((long)l, f4.floatValue(), f2, f3));
        return new amu_0(n2, n3, n4, n5, n6, bl, list);
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

