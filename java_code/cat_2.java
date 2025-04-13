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
 * Renamed from caT
 */
public class cat_2
extends car_2 {
    public static final String b = "playRandomSoundWithPitch";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundId, gain, minPitch, maxPitch", null, akg_2.h, true)};

    public cat_2(cav_2 cav_22, LuaState luaState, Logger logger) {
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
        return this.a(0, n, true);
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

