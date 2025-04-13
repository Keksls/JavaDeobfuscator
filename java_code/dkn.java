/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkn
extends akk_2 {
    dkn(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "pushStaticProtector";
    }

    @Override
    public String b() {
        return "Initialise et affiche les interfaces de protecteur avec les informations d'un protecteur donn? (static)";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aH;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n < 1) {
            dir_0.a.warn((Object)"On utilise pushStaticProtector sans argument !");
            return;
        }
        int n2 = this.d(0);
        dcd_0 dcd_02 = dcd_0.a();
        if (bwa_2.X.b() != -1) {
            dir_0.a.warn((Object)"Attention, on push un protecteur static au-dessus d'un autre protecteur !");
        }
        bwa_2.X.a(n2);
        if (!azu_0.j().c(dcd_02)) {
            azu_0.j().a(dcd_02);
        }
    }
}

