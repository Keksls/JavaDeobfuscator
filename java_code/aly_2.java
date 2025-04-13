/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLy
 */
final class aly_2
extends alr_2 {
    private static final String b = "getNextActionTarget";
    private static final String c = "Retourne l'id de la cible de la prochaine action du groupe dont le type est l'id sont pass?s en param?tre";
    private static final akf_1[] d = new akf_1[]{new akf_1("actionType", null, akg_2.d, false), new akf_1("actionId", null, akg_2.d, false)};
    private static final akf_1[] g = new akf_1[]{new akf_1("targetId", null, akg_2.b, false)};

    aly_2(LuaState luaState, akx_1 akx_12) {
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
        int n2;
        int n3 = this.d(0);
        aku_1 aku_12 = this.a.a(n3, n2 = this.d(1));
        if (aku_12 != null) {
            this.b(aku_12.h());
        } else {
            this.b(0L);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

