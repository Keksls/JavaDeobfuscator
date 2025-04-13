/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLs
 */
final class als_2
extends alr_2 {
    private static final String b = "executeAction";
    private static final String c = "Force l'execution d'une action dont l'uid est pass? en param?tre";
    private static final akf_1[] d = new akf_1[]{new akf_1("actionUID", null, akg_2.d, false)};
    private static final akf_1[] g = new akf_1[]{new akf_1("actionExists", null, akg_2.f, false)};

    als_2(LuaState luaState, akx_1 akx_12) {
        super(luaState, akx_12);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return g;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        aku_1 aku_12 = this.a.a(n2);
        if (aku_12 != null) {
            this.a.a(aku_12, false);
            this.a(true);
        } else {
            this.a(false);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

