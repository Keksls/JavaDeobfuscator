/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class din
extends akk_2 {
    private static final Logger a = Logger.getLogger(din.class);

    din(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "attachToMobile";
    }

    @Override
    public String b() {
        return "Applique une bulle ? un mobile";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("mobileId", "Id du mobile auquel lier la bulle", akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        ckt_2 ckt_22 = dip.a().e(n2);
        if (ckt_22 == null) {
            this.a(a, "pas de bulle de texte " + n2);
            return;
        }
        long l = this.g(1);
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            ckt_22.setTarget(afv2);
            ckt_22.a(afv2, afv2.i(), afv2.j(), afv2.k());
        } else {
            this.a(a, "mobile inconnu " + l);
        }
        a.info((Object)("attachtoMobile " + ckt_22 + " " + l));
    }
}

