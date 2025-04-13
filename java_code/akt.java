/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akt
extends akk_2 {
    private static final Logger a = Logger.getLogger(akt.class);
    private static final boolean b = true;

    public akt(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "attachCameraToMobile";
    }

    @Override
    public String b() {
        return "Attache la cam?ra ? un mobile. Quand le mobile se d?place, la cam?ra continue de le suivre.";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("mobileId", "id du mobile ? suivre", akg_2.b, false), new akf_1("funcName", "Fonction ? appeler lorsque la cam?ra est centr?e sur le mobile", akg_2.c, true), new akf_1("funcParams", "Param?tres de la fonction appel?e", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            acb_0 acb_02 = ajI.e().d();
            if (acb_02 != null) {
                abY abY2 = acb_02.b();
                abY2.a(afv2);
                if (n > 1) {
                    akx_2 akx_22 = this.m();
                    String string = this.i(1);
                    akr_2[] akr_2Array = this.a(2, n);
                    abY2.a(new aku(this, abY2, akx_22, string, akr_2Array));
                }
            } else {
                this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
            }
        } else {
            this.a(a, "mobile inconnu " + l);
        }
    }
}

