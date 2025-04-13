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
 * Renamed from caJ
 */
public class caj_1
extends akk_2 {
    private static final Logger a = Logger.getLogger(caj_1.class);

    public caj_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "invokeAtLocalFightEnd";
    }

    @Override
    public String b() {
        return "Invoke a method when fight end (/!\\ executed at call if no fight found)";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("func", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        akx_2 akx_22 = this.m();
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak()) {
            akx_22.b();
            bvx_2 bvx_22 = bmr_12.bz();
            bvx_22.a(new cak_1(this, akx_22, string, akr_2Array));
        } else {
            akx_22.a(string, akr_2Array, new akq_1[0]);
        }
    }
}

