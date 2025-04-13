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
 * Renamed from anF
 */
public class anf_1
extends and_1 {
    public static final String d = "playRandomSoundWithPitch";
    private static final akf_1[] g = new akf_1[]{new akf_1("stopOnAnimationChange", null, akg_2.f, false), new akf_1("soundId, gain, minPitch, maxPitch", null, akg_2.h, true)};

    public anf_1(abu abu2, LuaState luaState, Logger logger) {
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
        List<anj_1> list = this.a(1, n, true);
        return new ani_1<anj_1>(bl, list);
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

