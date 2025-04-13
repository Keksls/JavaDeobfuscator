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
 * Renamed from dkQ
 */
class dkq_0
extends akk_2 {
    dkq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setTrainingParameters";
    }

    @Override
    public akf_1[] e() {
        return dir_0.x;
    }

    @Override
    public String b() {
        return "Sp\u00e9cifie les param\u00e8tres d'un combat d'entrainement en les fournissant \u00e0 l'action MRU qui correspond";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        cTj cTj2;
        int n2 = this.d(0);
        if (n2 == cSY.q.b()) {
            cTj2 = (cTj)cSY.q.c();
        } else if (n2 == cSY.r.b()) {
            cTj2 = (cTj)cSY.r.c();
        } else {
            dir_0.a.error((Object)"Il n'y a que 2 actions diff\u00e9rentes de combat d'entrainement");
            return;
        }
        cTj2.a(this.l(1));
        cTj2.a(this.d(2));
        cTj2.d(this.l(3));
        cTj2.a((byte)this.d(4));
        akr_2[] akr_2Array = this.a(5, n);
        int[] nArray = null;
        if (akr_2Array.length > 0) {
            nArray = new int[akr_2Array.length];
            for (int k = 0; k < akr_2Array.length; ++k) {
                if (akr_2Array[k].a() == akg_2.d || akr_2Array[k].a() == akg_2.e) {
                    nArray[k] = ((Double)akr_2Array[k].b()).intValue();
                    continue;
                }
                dir_0.a.error((Object)"Les param\u00e8tres de battleground doivent imp\u00e9rativement \u00eatre de type nombre");
                nArray[k] = 0;
            }
        }
        cTj2.a(nArray);
    }
}

