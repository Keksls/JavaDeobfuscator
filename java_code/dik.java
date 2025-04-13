/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class dik
extends akk_2 {
    private static final Logger a = Logger.getLogger(dik.class);

    dik(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addButton";
    }

    @Override
    public String b() {
        return "Add a button to an InteractiveBubble";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("text", "Texte du bouton a afficher", akg_2.c, false), new akf_1("function", "Nom de la fonction a appeler lors du clic sur le boutton", akg_2.c, false), new akf_1("parameters", "Parametres a passer a la fonction", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        String string = dit.a(this.i(1), new Object[0]);
        String string2 = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        akx_2 akx_22 = this.m();
        fzu fzu2 = (fzu)anl_0.a().a(akx_22, "interactiveBubbleDialog" + n2, string, "MOUSE_CLICKED", string2);
        if (fzu2 == null) {
            fzu2 = new did_0(akx_22, string2, akr_2Array);
            anl_0.a().a(akx_22, "interactiveBubbleDialog" + n2, string, "MOUSE_CLICKED", string2, fzu2);
            ckt_2 ckt_22 = dip.a().e(n2);
            if (ckt_22 != null) {
                ckt_22.a(string, fzu2, true);
            } else {
                this.a(a, "id de bulle correspondant a rien");
            }
        } else {
            ((did_0)fzu2).a(akr_2Array);
        }
    }
}

