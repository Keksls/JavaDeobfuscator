/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZe
 */
class bze_0
extends akk_2 {
    bze_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addResourceCreationCallback";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("Resource X", null, akg_2.e, false), new akf_1("Resource Y", null, akg_2.e, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("funcParam", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        akx_2 akx_22 = this.m();
        int n2 = this.d(0);
        int n3 = this.d(1);
        String string = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        if (bNT.f().c(n2, n3) != null) {
            akx_22.a(string, akr_2Array, new akq_1[0]);
        }
        bNT.f().b(new bzf_0(this, n2, n3, akx_22, string, akr_2Array));
    }
}

