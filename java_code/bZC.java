/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

final class bZC
extends bZs {
    private static final String b = "getValidInputGatePosition";
    private static final String c = "Renvoie la position d'un portail d'entr\u00e9e valide";
    private static final akf_1[] d = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};

    bZC(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[0];
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        sr_0 sr_02 = this.a.y();
        if (sr_02 == null) {
            this.l();
            this.l();
            this.l();
            return;
        }
        aff_1 aff_12 = sr_02.P_();
        this.q(aff_12.d());
        this.q(aff_12.e());
        this.q(aff_12.f());
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public String b() {
        return c;
    }
}

