/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWU
extends akk_2 {
    bWU(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "deleteActor";
    }

    @Override
    public String b() {
        return "Delete a mobile in the world. /!\\ Server doesn't knows this mobile.";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.f;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        afz_0.d().a(l);
        blf_1.a(0, l, (blo_0)ble_1.E());
    }
}

