/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akK
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("funcParams", null, akg_2.h, true)};

    public akK(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addMobileCreationCallback";
    }

    @Override
    public String b() {
        return "Run a function when the mobile is loaded by the client. The function is run if the mobile is already loaded";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        akx_2 akx_22 = this.m();
        long l = this.g(0);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        if (this.a_(l) != null) {
            akx_22.a(string, akr_2Array, new akq_1[0]);
        }
        afz_0.d().b(afv2 -> {
            if (afv2.a() == l) {
                akx_22.a(string, akr_2Array, new akq_1[0]);
            }
        });
    }
}

