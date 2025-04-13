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
 * Renamed from amz
 */
public class amz_0
extends amx_0 {
    private static final Logger c = Logger.getLogger(amA.class);
    public static final String b = "playRandomSoundWithPitch";
    private static final akf_1[] d = new akf_1[]{new akf_1("soundId, gain, minPitch, maxPitch", null, akg_2.h, true)};

    public amz_0(LuaState luaState) {
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
    protected List<anj_1> b(int n) {
        return this.a(0, n, true);
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

