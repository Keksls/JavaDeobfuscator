/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYD
extends akk_2 {
    bYD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setVisible";
    }

    @Override
    public String b() {
        return "Change InteractiveElement visibility";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("id", "elementId", akg_2.b, false), new akf_1("visible", "Visibility", akg_2.f, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        boolean bl = this.l(1);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            this.a(byh_0.a, "l'element interactif d'id " + l + " n'existe pas.");
            return;
        }
        ahv2.c(bl);
    }
}

