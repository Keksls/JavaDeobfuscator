/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class diI
extends akk_2 {
    private static final Logger a = Logger.getLogger(diI.class);

    diI(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "showMonologue";
    }

    @Override
    public String b() {
        return "DO NOT USE";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("mobileId", "Id du personnage", akg_2.b, false), new akf_1("texts", "Textes a afficher (sous forme de table)", akg_2.g, false), new akf_1("funcOnTerminate", "Fonction a appeler a la fin", akg_2.c, true), new akf_1("funcParams", "Parametres de la fonction de fin", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        afv afv2 = afz_0.d().b(this.g(0));
        if (afv2 == null) {
            this.a(a, "Le mobile n'existe pas " + this.g(0));
            this.q(0);
            return;
        }
        akr_2[] akr_2Array = this.j(1);
        if (akr_2Array.length == 0) {
            this.a(a, "La table de texte est vide");
        }
        String[] stringArray = new String[akr_2Array.length];
        for (int k = 0; k < akr_2Array.length; ++k) {
            stringArray[k] = dit.a((String)akr_2Array[k].b(), new Object[0]);
        }
        akx_2 akx_22 = this.m();
        int n2 = zd_0.a().b();
        ckt_2 ckt_22 = (ckt_2)fpm_0.b().a("interactiveBubbleDialog" + n2, cfi_0.a("interactiveBubbleDialog"), 8256L, (short)30000);
        fta_0.getInstance().getLayeredContainer().a(ckt_22, 25000);
        ckt_22.setVisible(false);
        ckt_22.setTarget(afv2);
        dip.a().a(n2, ckt_22);
        int[] nArray = new int[]{0};
        ckt_22.setBubbleText(stringArray[0]);
        ckt_22.setActAsButton(true);
        String string = n > 2 ? this.i(2) : null;
        akr_2[] akr_2Array2 = this.a(3, n);
        ckt_22.a(dit.a("dialog.next", new Object[0]), (fzu)new diJ(this, nArray, ckt_22, stringArray, string, akx_22, akr_2Array2, n2), true);
        ckt_22.setCloseOnClick(false);
        ckt_22.c();
        this.q(n2);
    }
}

