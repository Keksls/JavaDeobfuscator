/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dhR
 */
public class dhr_0
extends akr_1 {
    public static final dhr_0 a = new dhr_0();

    private dhr_0() {
    }

    @Override
    @Nullable
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new dic_0(luaState), new dht_0(luaState), new dhx_0(luaState), new dhv_0(luaState), new dhz_0(luaState), new dia_0(luaState), new dib_0(luaState), new dhy_0(luaState), new dhw_0(luaState), new dhs_0(luaState), new dhu_0(luaState)};
    }

    @Override
    @Nullable
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public String a() {
        return "Focus";
    }

    @Override
    public String b() {
        return "Manage and display the focus layer (vignetting)";
    }
}

