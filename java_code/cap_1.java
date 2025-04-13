/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caP
 */
public final class cap_1
extends akk_2 {
    static final Logger a = Logger.getLogger(cap_1.class);

    public cap_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setCharacteristicListenerOn";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", null, akg_2.b, false), new akf_1("characteristic", null, akg_2.c, false), new akf_1("functionOnUpdate", null, akg_2.c, false), new akf_1("unregisterAfterTrigger", "true if function must be executed once", akg_2.f, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        String string2 = this.i(2);
        boolean bl = this.l(3);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            a.error((Object)("No character found :" + l));
            return;
        }
        if (!blx_12.a((ru_0)eps_0.valueOf(string))) {
            a.error((Object)("No charac found (" + string + ") for character " + l));
            return;
        }
        epa_1 epa_12 = blx_12.a_(eps_0.valueOf(string));
        epa_12.a(new caq_1(this, string2, bl, epa_12));
    }

    static /* synthetic */ akx_2 a(cap_1 cap_12) {
        return cap_12.m();
    }
}

