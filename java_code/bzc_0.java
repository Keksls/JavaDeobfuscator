/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZc
 */
class bzc_0
extends akk_2 {
    bzc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPetVisible";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("playerId", null, akg_2.b, false), new akf_1("visible", null, akg_2.f, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        boolean bl = this.l(1);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null && blx_12 instanceof bnh_1) {
            bMk bMk2 = ((bnh_1)blx_12).er();
            if (bMk2 != null) {
                bMk2.g().c(bl);
            } else {
                this.a(bza_0.g(), "character " + l + " hasn't pet");
            }
        } else {
            this.a(bza_0.h(), "character " + l + " don't exist");
        }
    }
}

