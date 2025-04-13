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
 * Renamed from dkO
 */
class dko_0
extends akk_2 {
    dko_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setTextWidget";
    }

    @Override
    public String b() {
        return "Set the text of a TextWidget";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bj;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.i(1);
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "Element " + string2 + " inconnu dans le dialog " + string);
            return;
        }
        if (!(fyb_02 instanceof ful_0)) {
            this.a(dir_0.a, "l'Element n'est pas du type TextWidget");
            return;
        }
        ((ful_0)fyb_02).c(this.i(2));
    }
}

