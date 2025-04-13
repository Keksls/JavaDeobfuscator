/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

class bYn
extends akk_2 {
    bYn(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getElementId";
    }

    @Override
    public String b() {
        return "R?cup?re l'id d'un element interactif ? une position";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("type", "ClientInteractiveAnimatedElementSceneView GFX id", akg_2.d, false), new akf_1("posX", "Position x", akg_2.d, false), new akf_1("posY", "Position y", akg_2.d, false), new akf_1("posZ", "Position z", akg_2.d, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("id", null, akg_2.b, false)};
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
                if (ahv2.aG() != n2) continue;
                this.b(ahv2.a());
                return;
            }
        } else {
            int n6 = this.d(3);
            for (int k = 0; k < n5; ++k) {
                ahv ahv3 = arrayList.get(k);
                if (ahv3.aG() != n2 || ahv3.L() != (float)n6) continue;
                this.b(ahv3.a());
                return;
            }
        }
        this.a(byh_0.a, "L'element interactif de type=" + n2 + " en (" + n3 + "," + n4 + ") n'existe pas");
    }
}

