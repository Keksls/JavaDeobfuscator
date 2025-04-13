/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZp
 */
class bzp_0
extends akk_2 {
    bzp_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "triggerEvent";
    }

    @Override
    public String b() {
        return "Trigger an event on the server";
    }

    @Override
    public akf_1[] e() {
        akf_1[] akf_1Array = new akf_1[]{new akf_1("eventId", "Used as filter on server", akg_2.d, false)};
        return akf_1Array;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        clb_1 clb_12 = new clb_1();
        clb_12.b(n2);
        azu_0.j().K().c(clb_12);
    }
}

