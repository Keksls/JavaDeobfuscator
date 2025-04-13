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
 * Renamed from dju
 */
class dju_0
extends akk_2 {
    dju_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayButton";
    }

    @Override
    public String b() {
        return "Display a button";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return dir_0.h;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        boolean bl = this.l(0);
        String string = this.i(1);
        String string2 = this.i(2);
        String string3 = this.i(3);
        if (n > 4) {
            akr_2[] akr_2Array = this.a(4, n);
            cxv_0.a.a(akr_2Array);
        }
        cxv_0.a.b(string2);
        cxv_0.a.a(this.m());
        cxv_0.a.c(string3);
        cxv_0.a.a(bl);
        cxv_0.a.a(string);
        if (!azu_0.j().c(cxv_0.a)) {
            azu_0.j().a(cxv_0.a);
        }
    }
}

