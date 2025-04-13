/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caq
 */
public class caq_2
extends akr_1 {
    private static final String a = "SpellEffect";
    private static final String d = "Librairie ? utiliser dans les scripts d'effets uniquement";
    private final bbo_0 e;

    public caq_2(bbo_0 bbo_02) {
        this.e = bbo_02;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new can_2(luaState, this.e), new cai_2(luaState, this.e), new bzt_0(luaState, this.e), new cad_2(luaState, this.e), new cah_2(luaState, this.e), new caj_2(luaState, this.e), new bzz_0(luaState, this.e), new caf_2(luaState, this.e), new cak_2(luaState, this.e), new cag_2(luaState, this.e), new bzs_0(luaState, this.e), new cab_2(luaState, this.e), new caa_2(luaState, this.e), new bzx_0(luaState, this.e), new cao_2(luaState), new cal_2(luaState), new cac_2(luaState), new bzv_0(luaState, this.e), new bzw_0(luaState, this.e), new bzy_0(luaState, this.e), new bzu_0(luaState, this.e), new cae_2(luaState, this.e)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return a;
    }

    @Override
    public String b() {
        return d;
    }
}

