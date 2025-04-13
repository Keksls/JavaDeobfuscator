/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djP
 */
class djp_0
extends akk_2 {
    djp_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getSpellPosition";
    }

    @Override
    public String b() {
        return "Return the position of a spell in shortcut bar";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bf;
    }

    @Override
    public final akf_1[] f() {
        return dir_0.bg;
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        int n2 = this.d(0);
        fiO fiO2 = bmr_12.dz();
        if (fiO2 == null) {
            this.q(-1);
            this.q(-1);
            return;
        }
        int n3 = fiO2.b(n2);
        if (n3 == -1) {
            this.q(-1);
            this.q(-1);
            return;
        }
        if (n3 >= 6) {
            this.q(n3 % 6);
            this.q(1);
        } else {
            this.q(n3);
            this.q(0);
        }
    }
}

