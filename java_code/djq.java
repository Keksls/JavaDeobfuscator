/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djq
extends akk_2 {
    djq(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "clickButton";
    }

    @Override
    public String b() {
        return "Simule un clique sur un bouton";
    }

    @Override
    public akf_1[] e() {
        return dir_0.D;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        fyy_0 fyy_02 = fpm_0.b().h().d(this.i(0));
        if (fyy_02 == null) {
            return;
        }
        fyb_0 fyb_02 = fyy_02.a(this.i(1));
        if (fyb_02 instanceof fru_0) {
            if (n > 2) {
                int n2;
                switch (this.d(2)) {
                    case 2: {
                        n2 = 2;
                        break;
                    }
                    case 3: {
                        n2 = 3;
                        break;
                    }
                    default: {
                        n2 = 1;
                    }
                }
                ((fru_0)fyb_02).a(n2, n == 4 ? this.d(3) : 1, 0);
            } else {
                ((fru_0)fyb_02).a();
            }
        }
    }
}

