/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dkS
 */
class dks_0
extends akk_2 {
    dks_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setUIVisible";
    }

    @Override
    public String b() {
        return "Rend visible/invisible les \u00e9l\u00e9ments d'interface qui ne font pas partis des layers permanents (Upper, Bulles de dialogue, Monde(overheads),etc...)";
    }

    @Override
    public akf_1[] e() {
        return dir_0.az;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        boolean bl = this.l(0);
        fsn_0 fsn_02 = fta_0.getInstance().getLayeredContainer();
        TObjectProcedure tObjectProcedure = fvE2 -> {
            fvE2.setVisible(bl);
            return true;
        };
        fsn_02.b((TObjectProcedure<fvE>)tObjectProcedure, 26000, 25000, 25999, -40000);
    }
}

