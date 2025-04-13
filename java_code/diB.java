/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class diB
extends akk_2 {
    private static final Logger a = Logger.getLogger(diB.class);

    diB(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setCharacterSpeak";
    }

    @Override
    public String b() {
        return "Display a message in the chat and the corresponding WakfuBubble will be displayed";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("translationKey", null, akg_2.c, false), new akf_1("translation parameters", null, akg_2.g, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        Object[] objectArray;
        afv afv2;
        long l = this.g(0);
        String string = this.i(1);
        akr_2[] akr_2Array = null;
        boolean bl = false;
        if (n > 2) {
            if (this.m(2)) {
                akr_2Array = this.j(2);
            } else if (this.p(2)) {
                bl = this.l(2);
            }
        }
        if (n > 3) {
            bl = this.l(3);
        }
        if ((afv2 = afz_0.d().b(l)) == null) {
            this.a(a, "mobile inconnu " + l);
            return;
        }
        if (!(afv2 instanceof biI)) {
            this.a(a, "le mobile " + l + " n'est pas valide");
            return;
        }
        blx_1 blx_12 = ((biI)afv2).bI();
        if (akr_2Array != null) {
            objectArray = new String[akr_2Array.length];
            for (int k = 0; k < akr_2Array.length; ++k) {
                objectArray[k] = dit.a((String)akr_2Array[k].b(), new Object[0]);
            }
        } else {
            objectArray = new String[]{};
        }
        String string2 = bae.h().a(string, objectArray);
        aUm aUm2 = new aUm(blx_12.dp(), l, string2);
        aUm2.a(aup_0.b);
        aUm2.a(bl);
        bab_0.a(() -> aul_0.a().a(aUm2));
    }
}

