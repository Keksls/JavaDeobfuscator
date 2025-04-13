/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caV
 */
public class cav_2
extends akr_1 {
    private long a = -1L;

    @Override
    public final String a() {
        return "Sound";
    }

    @Override
    public String b() {
        return "Library used for code related to sound inside interactive dialogs";
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new cau_2(this, luaState, b), new car_2(this, luaState, b), new cat_2(this, luaState, b), new cas_2(this, luaState, b)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public long d() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public cav_2() {
    }

    public cav_2(long l) {
        this.a = l;
    }
}

