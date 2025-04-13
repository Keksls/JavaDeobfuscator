/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

final class bZH
extends bZs {
    private static final String b = "isTargetCellInRange";
    private static final String c = "Renvoie true si la cellule cibl\u00e9e et situer dans la zone de port\u00e9e du sort";
    private static final akf_1[] d = new akf_1[]{new akf_1("targetCellInRange", null, akg_2.f, false)};

    bZH(LuaState luaState, bal_0 bal_02) {
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
        this.a(this.a.x());
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

