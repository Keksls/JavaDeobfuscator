/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYs
extends akk_2 {
    bYs(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPosition";
    }

    @Override
    public String b() {
        return "Return interactiveElement position";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("x", "Position x", akg_2.d, false), new akf_1("y", "Position y", akg_2.d, false), new akf_1("z", "Position z", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null || ahv2.d() == null) {
            this.a(byh_0.a, this.a() + " : l'element interactif d'id " + l + " n'existe pas...");
            this.l();
            this.l();
            this.l();
            return;
        }
        aff_1 aff_12 = ahv2.d().P_();
        this.q(aff_12.d());
        this.q(aff_12.e());
        this.q(aff_12.f());
    }
}

