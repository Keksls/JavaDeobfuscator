/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diM
 */
class dim_0
extends akk_2 {
    private static final String a = "addParticle";
    private static final String b = "Ajoute un syst\u00e8me de particule sur un \u00e9l\u00e9ment d'interface";
    private static final akf_1[] c = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false), new akf_1("particleFileName", "Nom du fichier de particule", akg_2.c, false), new akf_1("posX", "Position x", akg_2.e, false), new akf_1("posY", "Position y", akg_2.e, false), new akf_1("alignment", "Alignement du systeme", akg_2.c, true), new akf_1("level", "Niveau du systeme", akg_2.e, true)};
    private static final akf_1[] d = new akf_1[]{new akf_1("particleId", "Id de l'APS", akg_2.d, false)};
    private static int g;

    dim_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public final akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            this.l();
            return;
        }
        String string2 = this.i(1);
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            this.l();
            return;
        }
        if (!(fyb_02 instanceof fvE)) {
            this.a(dir_0.a, "le widget n'est pas du type Widget");
            this.l();
            return;
        }
        int n2 = ++g;
        fbx_1 fbx_12 = this.b(n);
        ((fvE)fyb_02).getAppearance().add(fbx_12);
        dir_0.e().d.put(n2, (Object)fbx_12);
        this.q(n2);
    }

    @NotNull
    fbx_1 b(int n) {
        String string = this.i(2);
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile(string);
        fbx_12.setX(this.d(3));
        fbx_12.setY(this.d(4));
        frs_0 frs_02 = frs_0.e;
        int n2 = 1;
        if (n > 5) {
            if (this.getParam(7).isString()) {
                frs_02 = frs_0.valueOf(this.i(5));
            } else if (this.getParam(7).isNumber()) {
                n2 = this.d(5);
            }
        }
        if (n > 6 && this.getParam(8).isNumber()) {
            n2 = this.d(6);
        }
        if (n2 != 1) {
            fbx_12.setLevel(n2);
        }
        fbx_12.setAlignment(frs_02);
        return fbx_12;
    }

    static void g() {
        g = 0;
    }
}

