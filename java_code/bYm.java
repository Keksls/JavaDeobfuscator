/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYm
extends akk_2 {
    bYm(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "fireAction";
    }

    @Override
    public String b() {
        return "Execute an action on element";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("interactiveElementId", null, akg_2.b, false), new akf_1("action", "Action name on InteractiveElementAction", akg_2.c, false), new akf_1("userId", null, akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("executed", "true if has been executed", akg_2.f, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        long l2 = this.g(2);
        ahv ahv2 = ahs.d().b(l);
        try {
            blx_1 blx_12 = bmf_2.a().c(l2);
            Tv tv = Tv.valueOf(string);
            boolean bl = ahv2.d().a(tv, blx_12);
            this.a(bl);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a(byh_0.a, "type d'action inconnue " + string);
            this.l();
            return;
        }
    }
}

