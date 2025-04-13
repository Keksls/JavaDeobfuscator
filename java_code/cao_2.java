/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cao
 */
final class cao_2
extends akk_2 {
    private static final String a = "setEffectAreaPlayDeathAnim";
    private static final String b = "Active ou d?sactive l'anim de mort sur la zone dont l'uid est pass? en param?tre";
    private static final akf_1[] c = new akf_1[]{new akf_1("areaId", null, akg_2.b, false), new akf_1("playAnim", null, akg_2.f, false)};

    cao_2(LuaState luaState) {
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
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        boolean bl = this.l(1);
        bwh_0 bwh_02 = apw_0.a().d();
        if (bwh_02 == null) {
            return;
        }
        ss_0 ss_02 = bwh_02.i();
        if (ss_02 == null) {
            return;
        }
        sr_0 sr_02 = ss_02.a(l);
        if (!(sr_02 instanceof bhr_2)) {
            return;
        }
        ((bhr_2)((Object)sr_02)).aq().a(bl);
    }

    @Override
    public String b() {
        return b;
    }
}

