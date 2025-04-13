/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cac
 */
final class cac_2
extends akk_2 {
    public static final String a = "getEffectAreaBaseId";
    private static final String b = "Retourne le reference id de la zone dont l'uid est pass? en param?tre";
    private static final akf_1[] c = new akf_1[]{new akf_1("areaId", null, akg_2.b, false)};
    private static final akf_1[] d = new akf_1[]{new akf_1("areaBaseId", null, akg_2.b, false)};

    cac_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        bwh_0 bwh_02 = apw_0.a().d();
        if (bwh_02 == null) {
            return;
        }
        ss_0 ss_02 = bwh_02.i();
        if (ss_02 == null) {
            return;
        }
        sr_0 sr_02 = ss_02.a(l);
        if (sr_02 == null || !(sr_02 instanceof bhr_2)) {
            return;
        }
        this.b(sr_02.A());
    }

    @Override
    public String b() {
        return b;
    }
}

