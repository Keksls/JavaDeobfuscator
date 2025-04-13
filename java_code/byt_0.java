/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYt
 */
class byt_0
extends akk_2 {
    byt_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getState";
    }

    @Override
    public String b() {
        return "Return interactiveElement state";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("state", "Depends on IE type", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            this.a(byh_0.a, "l'element interactif d'id " + l + " n'existe pas....");
            this.l();
            return;
        }
        bFZ bFZ2 = (bFZ)ahv2.d();
        this.q(bFZ2.B());
    }
}

