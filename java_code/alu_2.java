/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLu
 */
final class alu_2
extends alr_2 {
    private static final String b = "executeAllAction";
    private static final String c = "Execute toutes les actions dont le type est l'id sont pass?s en param?tre";
    private static final akf_1[] d = new akf_1[]{new akf_1("actionType", null, akg_2.d, false), new akf_1("actionId", null, akg_2.d, false)};

    alu_2(LuaState luaState, akx_1 akx_12) {
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
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        aku_1 aku_12 = this.a.a(n2, n3);
        while (aku_12 != null) {
            this.a.a(aku_12, false);
            aku_12 = this.a.a(n2, n3);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

