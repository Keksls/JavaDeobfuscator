/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class amL
extends akk_2 {
    public amL(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "runOnFadeIn";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("func", null, akg_2.c, false), new akf_1("funcParams", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        if (auy_2.a().d()) {
            this.m().a(string, akr_2Array, new akq_1[0]);
        } else {
            auy_2.a().a(new amM(string, this.m(), akr_2Array));
        }
    }
}

