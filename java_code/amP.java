/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class amP
extends akk_2 {
    public amP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setLoading";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("anmName", null, akg_2.c, true), new akf_1("durationMin", null, akg_2.d, true), new akf_1("soundId", null, akg_2.d, true), new akf_1("fadeInDuration", null, akg_2.d, true), new akf_1("fadeOutDuration", null, akg_2.d, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        aeM aeM2 = aeM.a();
        if (n == 0) {
            aeM2.h();
            return;
        }
        String string = n > 0 ? this.i(0) : null;
        int n2 = n > 1 ? this.d(1) : 0;
        int n3 = n > 2 ? this.d(2) : 0;
        int n4 = n > 3 ? this.d(3) : 1000;
        int n5 = n > 4 ? this.d(4) : 1000;
        aeM2.a(string);
        aeM2.c(n2);
        aeM2.d(n3);
        aeM2.a(n4);
        aeM2.b(n5);
    }
}

