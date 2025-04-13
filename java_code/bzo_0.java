/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZo
 */
class bzo_0
extends akk_2 {
    bzo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMonsterFollowEventId";
    }

    @Override
    public akf_1[] e() {
        akf_1[] akf_1Array = new akf_1[]{new akf_1("eventId", null, akg_2.d, false)};
        return akf_1Array;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        cue_0 cue_02 = (cue_0)cSY.x.c();
        cue_02.a(n2);
    }
}

