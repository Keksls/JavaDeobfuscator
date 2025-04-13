/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aly
 */
public final class aly_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("speed", "Global movement speed (default = 1.0)", akg_2.e, false)};

    public aly_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setGlobalMovementSpeed";
    }

    @Override
    public String b() {
        return "Set the global movement speed. (default = 1.0)";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        afc_0.a(this.f(0));
    }
}

