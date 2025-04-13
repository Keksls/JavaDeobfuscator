/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYz
 */
class byz_0
extends akk_2 {
    byz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setAnimation";
    }

    @Override
    public String b() {
        return "Joue l'animation donn?e pour un element interactif";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("interactiveElementId", null, akg_2.b, false), new akf_1("animationName", null, akg_2.c, false), new akf_1("func", null, akg_2.c, true), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            this.a(byh_0.a, "Element ID " + l + " unknown");
            return;
        }
        ahv2.e(string);
        if (n <= 2) {
            return;
        }
        akx_2 akx_22 = this.m();
        String string2 = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        int n2 = akx_22.a(string2, akr_2Array);
        ahv2.a(new bya_0(this, ahv2, akx_22, n2));
    }
}

