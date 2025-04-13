/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYo
 */
class byo_0
extends akk_2 {
    byo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getElementsId";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("type", "ClientInteractiveAnimatedElementSceneView GFX id", akg_2.d, false), new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, true)};
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
        boolean bl = false;
        if (n5 != 0) {
            if (n < 4) {
                for (int k = 0; k < n5; ++k) {
                    ahv ahv2 = arrayList.get(k);
                    if (ahv2.aG() != n2) continue;
                    this.b(ahv2.a());
                    bl = true;
                }
            } else {
                int n6 = this.d(3);
                for (int k = 0; k < n5; ++k) {
                    ahv ahv3 = arrayList.get(k);
                    if (ahv3.aG() != n2 || ahv3.L() != (float)n6) continue;
                    this.b(ahv3.a());
                    bl = true;
                }
            }
        }
        if (!bl) {
            this.l();
            this.a(byh_0.a, "L'element interactif de type=" + n2 + " en (" + n3 + "," + n4 + ") n'existe pas");
        }
    }
}

