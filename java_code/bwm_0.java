/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWM
 */
class bwm_0
extends akk_2 {
    bwm_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "applyColorFrom";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.a;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        afv afv2 = afz_0.d().b(l);
        afv afv3 = afz_0.d().b(l2);
        if (afv2 == null) {
            bwk_0.e().error((Object)("impossible de trouver le mobile " + l));
            return;
        }
        if (afv3 == null) {
            bwk_0.f().error((Object)("impossible de trouver le mobile " + l2));
            return;
        }
        afv2.f(afv3);
    }
}

