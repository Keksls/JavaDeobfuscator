/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bZk
extends akk_2 {
    bZk(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isResourceVisible";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("Resource X", null, akg_2.e, false), new akf_1("Resource Y", null, akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("visible", null, akg_2.f, false)};
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        bNK bNK2 = bNT.f().c(n2, n3);
        if (bNK2 == null) {
            this.a(bZd.e(), "Aucune ressource trouv?e en [" + n2 + ";" + n3 + "]");
            return;
        }
        this.a(bNK2.at());
    }
}

