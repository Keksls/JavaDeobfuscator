/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caY
 */
class cay_2
extends akk_2 {
    private static final Logger a = Logger.getLogger(cay_2.class);
    private static final String b = "playCinematicVideo";
    private static final String c = "Joue une video en plein \u00e9cran";
    private static final akf_1[] d = new akf_1[]{new akf_1("videoName", "Video name", akg_2.c, false), new akf_1("volume", "Video volume", akg_2.e, true)};

    cay_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public String b() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        float f2 = n >= 2 ? this.f(1) : 1.0f;
        aVk.a.a(string, f2);
    }
}

