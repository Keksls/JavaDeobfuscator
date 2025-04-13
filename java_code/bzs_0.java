/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZS
 */
final class bzs_0
extends cap_2 {
    private static final String a = "displayFlyingItem";
    private static final String c = "Affiche le gfx d'un item au dessus de la cible de l'effet (le refId de l'item correspond ? la valeur de l'effet)";

    bzs_0(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.b.w();
        long l = this.b.h();
        blx_1 blx_12 = bmf_2.a().c(l);
        bmr_1 bmr_12 = azu_0.j().k();
        aff_1 aff_12 = blx_12 != null ? blx_12.P_() : this.b.z();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null && this.b.C() != bvx_22.c()) {
            return;
        }
        if (aff_12 == null) {
            return;
        }
        bjy_1.a(n2, (apv_2)new cam_2(aff_12), blx_12.gX());
    }

    @Override
    public String b() {
        return c;
    }
}

