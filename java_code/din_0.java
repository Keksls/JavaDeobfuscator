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
 * Renamed from diN
 */
class din_0
extends dim_0 {
    private static final String a = "addParticleToBorder";
    private static final String b = "Ajoute un syst\u00e8me de particule sur la bordure d'un \u00e9l\u00e9ment d'interface";
    private static final akf_1[] c = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false), new akf_1("particleFileName", "Nom du fichier de particule", akg_2.c, false), new akf_1("posX", "Position x", akg_2.e, false), new akf_1("posY", "Position y", akg_2.e, false), new akf_1("alignment", "Alignement du systeme", akg_2.c, true), new akf_1("level", "Niveau du systeme", akg_2.e, true), new akf_1("speed", "Vitesse du syst\u00e8me", akg_2.e, true)};

    din_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @NotNull
    fbx_1 b(int n) {
        fbx_1 fbx_12 = super.b(n);
        fbx_12.setFollowBorders(true);
        if (n > 7 && this.getParam(9).isNumber()) {
            fbx_12.setSpeed(this.f(7));
        }
        return fbx_12;
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
}

