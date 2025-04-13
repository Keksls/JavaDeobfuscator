/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYp
 */
class byp_0
extends akk_2 {
    byp_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getGfxIdByElementModelId";
    }

    @Override
    public String b() {
        return "Recupere le gfxId d'un element interactif a partir de l'id de son modele et de sa position";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("modelId", "Model id", akg_2.d, false), new akf_1("posX", "Position x", akg_2.d, false), new akf_1("posY", "Position y", akg_2.d, false), new akf_1("posZ", "Position z", akg_2.d, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("gfxId", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        ArrayList<ahv> arrayList = ahs.d().d(n3, n4);
        int n5 = arrayList.size();
        if (n5 == 0) {
            this.l();
            return;
        }
        if (n < 4) {
            for (int k = 0; k < n5; ++k) {
                ahv ahv2 = arrayList.get(k);
                pj_0 pj_02 = ahv2.d();
                if (pj_02.af() != n2) continue;
                this.q(ahv2.aG());
                return;
            }
        } else {
            int n6 = this.d(3);
            for (int k = 0; k < n5; ++k) {
                ahv ahv3 = arrayList.get(k);
                pj_0 pj_03 = ahv3.d();
                if (pj_03.af() != n2 || ahv3.L() != (float)n6) continue;
                this.q(ahv3.aG());
                return;
            }
        }
        this.a(byh_0.a, "L'element interactif de modelId=" + n2 + " en (" + n3 + "," + n4 + ") n'existe pas");
    }
}

