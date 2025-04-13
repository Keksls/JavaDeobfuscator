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
 * Renamed from cba
 */
class cba_2
extends akk_2 {
    private static final Logger a = Logger.getLogger(cba_2.class);
    private static final String b = "startVideoLoading";
    private static final String c = "[WIP] Charge une vid\u00e9o donn\u00e9e et affiche une interface de chargement";
    private static final akf_1[] d = new akf_1[]{new akf_1("videoName", null, akg_2.c, false)};

    cba_2(LuaState luaState) {
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
        aVk.a.a(string, true);
    }
}

