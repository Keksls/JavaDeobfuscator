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
 * Renamed from cav
 */
public final class cav_1
extends akk_2 {
    private static final Logger a = Logger.getLogger(cav_1.class);

    public cav_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getCharacteristicValue";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", null, akg_2.b, false), new akf_1("charac", null, akg_2.c, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("characValue", null, akg_2.b, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            a.error((Object)("No character found :" + l));
            this.l();
            return;
        }
        if (!blx_12.a((ru_0)eps_0.valueOf(string))) {
            a.error((Object)("No charac found (" + string + ") for character " + l));
            this.l();
            return;
        }
        this.q(blx_12.c(eps_0.valueOf(string)));
    }
}

