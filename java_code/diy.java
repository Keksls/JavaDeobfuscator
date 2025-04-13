/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diy
extends akk_2 {
    private frk_0 a;
    private int b;
    private int c;
    private boolean d;
    private int g;
    private boolean h;
    private String i;
    private akr_2[] j;
    private int k;
    private String l;
    private int m;

    diy(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "prepareInteractiveBubbleFloating";
    }

    @Override
    public String b() {
        return "Prepare an InteractiveBubble to be displayed on the screen, relative to align, screenXoffset and screenYoffset";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("align", "Alignement de la bulle de texte", akg_2.c, false), new akf_1("screenXoffset", "Decalage en pixel vers la droite", akg_2.d, false), new akf_1("screenYoffset", "Decalage en pixel vers le heut", akg_2.d, false), new akf_1("actAsButton", "La bulle se comportera comme la somme des boutons qui lui seront attaches par la suite", akg_2.f, true), new akf_1("duration", "Duree d'affichage de la bulle", akg_2.d, true), new akf_1("closeOnClick", "Ferme si on clique sur la bulle", akg_2.f, true), new akf_1("dialogFile", "Nom du fichier utilis\u00e9 pour le template de la bulle (default = interactiveBubbleDialog)", akg_2.b, true), new akf_1("dialogModalLevel", "Modal level de la bulle (default = 30000)", akg_2.b, true), new akf_1("dialogLayer", "Layer de la bulle (default = 25000)", akg_2.b, true), new akf_1("onEndFunc", "Fonction a appeler a la fermeture de la bulle", akg_2.c, true), new akf_1("funcParams", "Param\u00e8tres de la fonction", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        this.g();
        this.b(n);
        int n2 = zd_0.a().b();
        String string = "interactiveBubbleDialog" + n2;
        ckt_2 ckt_22 = this.c(string);
        this.b(string);
        this.a(ckt_22);
        this.a(n2, ckt_22);
        this.b(ckt_22);
        this.q(n2);
    }

    private void a(int n, ckt_2 ckt_22) {
        dip.a().a(n, ckt_22);
    }

    private void a(ckt_2 ckt_22) {
        fta_0.getInstance().getLayeredContainer().a(ckt_22, this.k);
    }

    private void b(String string) {
        if (this.i != null) {
            dip.a().a(string.hashCode(), new dio(this.i, this.m(), this.j));
        }
    }

    private void b(ckt_2 ckt_22) {
        ckt_22.setActAsButton(this.d);
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setAlign(this.a);
        fid_12.setXOffset(this.b);
        fid_12.setYOffset(this.c);
        ckt_22.add(fid_12);
        ckt_22.setVisible(false);
        ckt_22.setCloseOnClick(this.h);
        ckt_22.setForcedDisplaySpark(false);
        ckt_22.setUseTargetPositionning(false);
    }

    private ckt_2 c(String string) {
        return (ckt_2)fpm_0.b().a(string, cfi_0.a(this.l), this.g, 8256L, (short)this.m);
    }

    private void b(int n) {
        if (n >= 4) {
            this.d = this.l(3);
        }
        if (n >= 5) {
            this.g = this.d(4);
        }
        if (n >= 6) {
            this.h = this.l(5);
        }
        if (n >= 7) {
            this.l = this.i(6);
        }
        if (n >= 8) {
            this.m = this.d(7);
        }
        if (n >= 9) {
            this.k = this.d(8);
        }
        if (n >= 10) {
            this.i = this.i(9);
        }
        if (n >= 11) {
            this.j = this.a(10, n - 1);
        }
    }

    private void g() {
        this.a = frk_0.valueOf(this.i(0));
        this.b = this.d(1);
        this.c = this.d(2);
        this.d = false;
        this.g = Integer.MAX_VALUE;
        this.h = false;
        this.i = null;
        this.j = null;
        this.l = "interactiveBubbleDialog";
        this.m = 30000;
        this.k = 25000;
    }
}

