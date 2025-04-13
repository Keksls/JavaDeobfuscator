/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class diz
extends akk_2 {
    private static final Logger a = Logger.getLogger(diz.class);

    diz(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "prepareWakfuBubble";
    }

    @Override
    public String b() {
        return "Prepare a WakfuBubble to be linked to a mobile";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", "Id du personnage", akg_2.b, false), new akf_1("offsetX", "Decalage en pixel vers la droite", akg_2.d, false), new akf_1("offsetY", "Decalage en pixel vers le haut", akg_2.d, false), new akf_1("infiniteDuration", "si true la bulle reste toujours affichee", akg_2.f, true), new akf_1("funcOnEnd", "Fonction a appeler lors de la fermeture", akg_2.c, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("displayTime", "Temps d'affichage en ms", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        abz_0 abz_02 = afz_0.d().b(l);
        if (abz_02 == null) {
            abz_02 = ahs.d().b(l);
        }
        if (abz_02 == null) {
            this.a(a, "mobile ou IE " + l + " inexistant");
            this.l();
            this.l();
            return;
        }
        String string = aNJ.a();
        fvy fvy2 = aNJ.a(string);
        try {
            fvy2.a(true, false);
        }
        catch (Exception exception) {
            a.warn((Object)exception.getMessage());
            this.l();
            this.l();
            return;
        }
        fvy2.setTarget(abz_02);
        fvy2.setBubbleObserver(azu_0.j().k().bv());
        fvy2.setXOffset(this.d(1));
        fvy2.setYOffset(this.d(2) + abz_02.ag() * 10);
        fvy2.setBubbleIsVisible(false);
        boolean bl = false;
        String string2 = null;
        if (n >= 4) {
            if (this.getParam(5).isBoolean()) {
                bl = this.l(3);
            } else if (this.getParam(5).isString()) {
                string2 = this.i(3);
            }
        }
        if (n >= 5 && this.getParam(6).isString()) {
            string2 = this.i(4);
        }
        if (bl) {
            fvy2.setDuration(-1);
        }
        int n2 = fvy2.e();
        dip.a().a(fvy2);
        if (string2 != null) {
            dio dio2 = new dio(string2, this.m(), null);
            dip.a().b(n2, dio2);
        }
        this.q(fvy2.getAdviserId());
        this.q(fvy2.getDuration());
    }
}

