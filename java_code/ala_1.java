/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLA
 */
final class ala_1
extends alr_2 {
    private static final String b = "getNextActionsTargets";
    private static final String c = "Retourne un tableau contenant les ids des cibles des prochaines actions du groupe dont le type est l'id sont pass?s en param?tre";
    private static final akf_1[] d = new akf_1[]{new akf_1("actionType", null, akg_2.d, false), new akf_1("actionId", null, akg_2.d, false)};
    private static final akf_1[] g = new akf_1[]{new akf_1("targetId", null, akg_2.g, false)};

    ala_1(LuaState luaState, akx_1 akx_12) {
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
        int n3 = this.d(1);
        this.L.newTable();
        int n4 = 1;
        for (aku_1 aku_12 : this.a.a()) {
            if (aku_12.e() != n3 || aku_12.d() != n2) continue;
            this.L.pushNumber((double)n4++);
            this.L.pushObjectValue((Object)aku_12.h());
            this.L.setTable(-3);
        }
        ++this.e;
    }

    @Override
    public String b() {
        return c;
    }
}

