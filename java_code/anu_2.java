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
 * Renamed from anu
 */
public class anu_2
extends akr_1 {
    private final Logger a = Logger.getLogger(anu_2.class);
    private final abu d;

    public anu_2(abu abu2) {
        this.d = abu2;
    }

    @Override
    public final String a() {
        return "Sound";
    }

    @Override
    public String b() {
        return "Library used for code in animations";
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new ang_1(this.d, luaState, this.a), new and_1(this.d, luaState, this.a), new anf_1(this.d, luaState, this.a), new ane_1(this.d, luaState, this.a), new anb_1(this.d, luaState, this.a), new any_2(this.d, luaState, this.a), new ana_0(this.d, luaState, this.a), new anz_2(this.d, luaState, this.a), new anc_1(this.d, luaState, this.a), new anv_2(this.d, luaState, this.a), new anx_2(this.d, luaState, this.a)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

