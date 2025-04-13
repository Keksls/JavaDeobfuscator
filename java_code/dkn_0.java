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
 * Renamed from dkN
 */
class dkn_0
extends akk_2 {
    dkn_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setStaticProtectorInterval";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aI;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        bRz bRz2;
        if (n < 4) {
            dir_0.a.warn((Object)"On utilise setStaticProtectorInterval avec trop peu d'arguments !");
            return;
        }
        if (bwa_2.X.b() == -1) {
            dir_0.a.error((Object)"On ajoute un interval de volont? au protecteur static qui n'existe pas");
            return;
        }
        boolean bl = this.l(0);
        int n2 = this.d(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        if (n4 < n3) {
            dir_0.a.error((Object)"On ajoute un interval de volont? dont la borne max est inf?rieure ? la borne min au protecteur static !");
            return;
        }
        bRz bRz3 = bRz2 = bl ? bRC.c().a(n2) : bRD.c().a(n2);
        if (bRz2 == null) {
            dir_0.a.error((Object)"Impossible de retrouver la famille de ressource pour laquelle on cherche ? ajouter un interval de volont? de mdc");
            return;
        }
        aeo_2 aeo_22 = new aeo_2(n3, n4);
        bRz2.a(aeo_22);
        bwa_2.X.a(n2, aeo_22);
    }
}

