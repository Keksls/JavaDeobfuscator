/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ale
 */
public final class ale_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("hide", "true = show only local player, false = show all", akg_2.f, false)};

    public ale_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "hideOtherPlayerMobile";
    }

    @Override
    public String b() {
        return "Hide player mobiles except the local player";
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
    public void a(int n) {
        boolean bl = this.l(0);
        afz_0.d().a(bl);
    }
}

