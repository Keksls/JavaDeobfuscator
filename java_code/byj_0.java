/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYJ
 */
class byj_0
extends akk_2 {
    byj_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "selectPosition";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("funcName", null, akg_2.c, false), new akf_1("funcParams", null, akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        akx_2 akx_22 = this.m();
        int n2 = akr_2Array != null ? akr_2Array.length : 0;
        akr_2[] akr_2Array2 = new akr_2[n2 + 4];
        if (n2 != 0) {
            System.arraycopy(akr_2Array, 0, akr_2Array2, 4, akr_2Array.length);
        }
        if (azu_0.j().c(bji_2.a())) {
            azu_0.j().b(bji_2.a());
        }
        int n3 = akx_22.a(string, akr_2Array2);
        bji_2.a().a((byte)1);
        bji_2.a().a(new byk_0(this, akr_2Array2, akx_22, n3));
        azu_0.j().a(bji_2.a());
    }
}

