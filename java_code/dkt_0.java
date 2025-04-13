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
 * Renamed from dkT
 */
class dkt_0
extends akk_2 {
    dkt_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setWidgetBlockability";
    }

    @Override
    public String b() {
        return "Sp?cifie si un widget sp?cifi? bloque ou non les interactions de clic de souris";
    }

    @Override
    public akf_1[] e() {
        return dir_0.W;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        String string2 = this.i(1);
        boolean bl = this.l(2);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            return;
        }
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        if (!(fyb_02 instanceof fvE)) {
            this.a(dir_0.a, "le widget n'est pas du type Widget");
            return;
        }
        fvE fvE2 = (fvE)fyb_02;
        fvE2.setNonBlocking(!bl);
    }
}

