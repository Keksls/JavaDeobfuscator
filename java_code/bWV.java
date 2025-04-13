/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bWV
extends akk_2 {
    bWV(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "equip";
    }

    @Override
    public String b() {
        return "Generate a fake item skin on a mobile";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.m;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        String string = this.i(1);
        String[] stringArray = new String[n - 2];
        for (int k = 2; k < n; ++k) {
            stringArray[k - 2] = this.i(k);
        }
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            try {
                String string2 = azs_0.a().a("ANMEquipmentPath");
                string2 = String.format(string2, string);
                afv2.a(string2, atn_2.a(stringArray));
            }
            catch (gm_0 gm_02) {
                bwk_0.n().error((Object)"Erreur au chargement d'une propri?t?", (Throwable)gm_02);
            }
        } else {
            this.a(bwk_0.o(), "le mobile " + l + " n'existe pas ");
        }
    }
}

