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
 * Renamed from cay
 */
public final class cay_1
extends akk_2 {
    public cay_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String b() {
        return "Return leader character id";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return null;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return new akf_1[]{new akf_1("leaderId", "Leader character id (0 if unknown)", akg_2.b, false)};
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            this.q(0);
        } else {
            this.b(bmr_12.a_());
        }
    }

    @Override
    public String a() {
        return "getLeaderId";
    }
}

