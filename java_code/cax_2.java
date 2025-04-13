/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caX
 */
final class cax_2
extends akk_2 {
    private static final String a = "addVideoStopOrEndCallback";
    private static final akf_1[] b = new akf_1[]{new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};

    cax_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return b;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return new akf_1[0];
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        akx_2 akx_22 = this.m();
        int n2 = akx_22.a(string, akr_2Array);
        Runnable runnable = () -> akx_22.b(n2);
        if (aVk.b) {
            runnable.run();
            return;
        }
        dfc dfc2 = new dfc(16042);
        dfc2.a(runnable);
        add_2.b().a(dfc2);
    }
}

