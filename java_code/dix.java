/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class dix
extends akk_2 {
    private static final Logger a = Logger.getLogger(dix.class);
    private boolean b;
    private int c;
    private boolean d;
    private String g;
    private akr_2[] h;
    private int i;
    private String j;
    private int k;

    dix(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "prepareInteractiveBubble";
    }

    @Override
    public String b() {
        return "Prepare an InteractiveBubble to be linked to a mobile";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("mobileId", "Id du mobile sur lequel attacher la bulle", akg_2.b, false), new akf_1("actAsButton", "La bulle se comportera comme la somme des boutons qui lui seront attaches par la suite", akg_2.f, true), new akf_1("duration", "Duree d'affichage de la bulle", akg_2.d, true), new akf_1("closeOnClick", "Ferme si on clique sur la bulle", akg_2.f, true), new akf_1("dialogFile", "Nom du fichier utilis\u00e9 pour le template de la bulle (default = interactiveBubbleDialog)", akg_2.b, true), new akf_1("dialogModalLevel", "Modal level de la bulle (default = 30000)", akg_2.b, true), new akf_1("dialogLayer", "Layer de la bulle (default = 25000)", akg_2.b, true), new akf_1("onEndFunc", "Fonction a appeler a la fermeture de la bulle", akg_2.c, true), new akf_1("funcParams", "Param\u00e8tres de la fonction", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        afv afv2 = afz_0.d().b(l);
        if (afv2 == null) {
            this.a(a, "Le mobile n'existe pas " + l);
            this.l();
            return;
        }
        this.g();
        this.b(n);
        int n2 = zd_0.a().b();
        String string = "interactiveBubbleDialog" + n2;
        ckt_2 ckt_22 = this.c(string);
        this.b(string);
        this.a(ckt_22);
        this.a(afv2, ckt_22);
        dix.a(n2, ckt_22);
        this.q(n2);
    }

    private void b(String string) {
        if (this.g != null) {
            dip.a().a(string.hashCode(), new dio(this.g, this.m(), this.h));
        }
    }

    private ckt_2 c(String string) {
        return (ckt_2)fpm_0.b().a(string, cfi_0.a(this.j), this.c, 8256L, (short)this.k);
    }

    private static void a(int n, ckt_2 ckt_22) {
        dip.a().a(n, ckt_22);
    }

    private void a(ckt_2 ckt_22) {
        fta_0.getInstance().getLayeredContainer().a(ckt_22, this.i);
    }

    private void a(afv afv2, ckt_2 ckt_22) {
        ckt_22.setTarget(afv2);
        ckt_22.setActAsButton(this.b);
        ckt_22.setVisible(false);
        ckt_22.setCloseOnClick(this.d);
    }

    private void g() {
        this.c = Integer.MAX_VALUE;
        this.b = false;
        this.d = false;
        this.g = null;
        this.h = null;
        this.j = "interactiveBubbleDialog";
        this.k = 30000;
        this.i = 25000;
    }

    private void b(int n) {
        if (n >= 2) {
            this.b = this.l(1);
        }
        if (n >= 3) {
            this.c = this.d(2);
        }
        if (n >= 4) {
            this.d = this.l(3);
        }
        if (n >= 5) {
            this.j = this.i(4);
        }
        if (n >= 6) {
            this.k = this.d(5);
        }
        if (n >= 7) {
            this.i = this.d(6);
        }
        if (n >= 8) {
            this.g = this.i(7);
        }
        if (n >= 9) {
            this.h = this.a(8, n - 1);
        }
    }
}

