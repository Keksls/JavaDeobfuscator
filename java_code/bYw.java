/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYw
extends akk_2 {
    bYw(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isVisible";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("visible", null, akg_2.f, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            this.a(byh_0.a, "l'element interactif d'id " + l + " n'existe pas..");
            this.l();
            return;
        }
        this.a(ahv2.at());
    }
}

