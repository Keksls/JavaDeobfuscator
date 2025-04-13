/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djV
 */
class djv_0
extends akk_2 {
    djv_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "highlightFighterInTimeline";
    }

    @Override
    public String b() {
        return "S?lectionne un personnage dans la timeLine";
    }

    @Override
    public akf_1[] e() {
        return dir_0.o;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.bz();
        blx_1 blx_12 = bmf_2.a().c(this.g(0));
        if (blx_12 == null) {
            return;
        }
        if (bvx_22 != null && bvx_22.l(blx_12)) {
            bvx_22.A().a(blx_12, this.l(1));
        }
    }
}

