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
 * Renamed from caS
 */
public class cas_2
extends car_2 {
    public static final String b = "playRandomSoundWithGlobalPitch";
    private static final akf_1[] c = new akf_1[]{new akf_1("minPitch", null, akg_2.e, false), new akf_1("maxPitch", null, akg_2.e, false), new akf_1("soundId, gain", null, akg_2.h, true)};

    public cas_2(cav_2 cav_22, LuaState luaState, Logger logger) {
        super(cav_22, luaState, logger);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected List<anj_1> b(int n) {
        float f2 = this.f(0);
        float f3 = this.f(1);
        return this.a(2, n, false, (l, f4) -> new anj_1((long)l, f4.floatValue(), f2, f3));
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

