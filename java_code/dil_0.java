/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diL
 */
final class dil_0
extends akk_2 {
    private static final Logger a = Logger.getLogger(dil_0.class);

    dil_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "showText";
    }

    @Override
    public String b() {
        return "Display a WakfuBubble above the character. If not infinite, it will be removed after a duration based on the text's length";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", "Id du mobile", akg_2.b, false), new akf_1("text", "Texte a afficher", akg_2.c, false), new akf_1("offsetX", "Decalage en pixel vers la droite", akg_2.d, false), new akf_1("offsetY", "Decalage en pixel vers le haut", akg_2.d, false), new akf_1("infiniteDuration", "Si true la bulle reste toujours affichee", akg_2.f, true), new akf_1("funcOnEnd", "Fonction a appeler a la fin", akg_2.c, true), new akf_1("params", "Parametres de fonction de fin", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("displayTime", "Temps d'affichage en ms", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            String string = dit.a(this.i(1), new Object[0]);
            String string2 = aNJ.a();
            fvy fvy2 = aNJ.a(string2);
            try {
                fvy2.a(true, false);
                fvy2.setText(string);
            }
            catch (Exception exception) {
                a.warn((Object)exception.getMessage());
                return;
            }
            fvy2.setTarget(afv2);
            fvy2.setBubbleObserver(azu_0.j().k().bv());
            fvy2.setXOffset(this.d(2));
            fvy2.setYOffset(this.d(3));
            boolean bl = false;
            String string3 = null;
            akr_2[] akr_2Array = null;
            if (n >= 5) {
                if (this.getParam(6).isBoolean()) {
                    bl = this.l(4);
                } else if (this.getParam(6).isString()) {
                    string3 = this.i(4);
                    if (n >= 6) {
                        akr_2Array = this.a(5, n);
                    }
                }
            }
            if (n >= 6) {
                if (this.getParam(7).isString()) {
                    string3 = this.i(5);
                }
                if (n >= 7) {
                    akr_2Array = this.a(6, n);
                }
            }
            if (bl) {
                fvy2.setDuration(-1);
            }
            int n2 = fvy2.e();
            dip.a().a(fvy2);
            if (string3 != null) {
                dio dio2 = new dio(string3, this.m(), akr_2Array);
                dip.a().b(n2, dio2);
            }
            this.q(fvy2.getAdviserId());
            this.q(fvy2.getDuration());
        } else {
            this.a(a, "mobile " + l + " inexistant");
            this.l();
            this.l();
        }
    }
}

