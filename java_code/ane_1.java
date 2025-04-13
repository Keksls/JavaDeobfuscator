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
 * Renamed from anE
 */
public class ane_1
extends and_1 {
    public static final String d = "playRandomSoundWithGlobalPitch";
    private static final akf_1[] g = new akf_1[]{new akf_1("stopOnAnimationChange", null, akg_2.f, false), new akf_1("minPitch", null, akg_2.e, false), new akf_1("maxPitch", null, akg_2.e, false), new akf_1("soundId, gain", null, akg_2.h, true)};

    public ane_1(abu abu2, LuaState luaState, Logger logger) {
        super(abu2, luaState, logger);
    }

    @Override
    public String a() {
        return d;
    }

    @Override
    public akf_1[] e() {
        return g;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected ani_1<anj_1> b(int n) {
        boolean bl = this.l(0);
        float f2 = this.f(1);
        float f3 = this.f(2);
        List<anj_1> list = this.a(3, n, false, (l, f4) -> new anj_1((long)l, f4.floatValue(), f2, f3));
        return new ani_1<anj_1>(bl, list);
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

