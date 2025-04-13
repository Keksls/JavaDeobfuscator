/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZb
 */
class bzb_0
extends akk_2 {
    bzb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPetId";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("playerId", null, akg_2.b, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("petId", null, akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null && blx_12 instanceof bnh_1) {
            bMk bMk2 = ((bnh_1)blx_12).er();
            if (bMk2 != null) {
                this.b(bMk2.g().a());
            } else {
                this.l();
                this.a(bza_0.e(), "le character " + l + " n'a pas de pet");
            }
        } else {
            this.l();
            this.a(bza_0.f(), "le character " + l + " n'existe pas ou n'est pas un joueur");
        }
    }
}

