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
 * Renamed from cal
 */
class cal_2
extends akk_2 {
    private static final Logger a = Logger.getLogger(cal_2.class);
    private static final String b = "hasState";
    private static final String c = "Renvoie true si le personnage dont l'id pass? en param porte l'?tat d'id et de niveau (optionnel) donn?";
    private static final akf_1[] d = new akf_1[]{new akf_1("characterId", null, akg_2.d, false), new akf_1("stateId", null, akg_2.d, false), new akf_1("stateLevel", null, akg_2.d, true)};
    private static final akf_1[] g = new akf_1[]{new akf_1("hasState", null, akg_2.f, false)};

    cal_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return g;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(a, "CharacterInfo introuvable : " + l);
            this.l();
            return;
        }
        int n2 = this.d(1);
        if (n == 2) {
            this.a(blx_12.d_(n2));
        } else if (n == 3) {
            int n3 = this.d(2);
            this.a(blx_12.a_(n2, n3));
        } else {
            this.a(a, "Nombre de parametres invalides : " + n);
            this.l();
        }
    }

    @Override
    public String b() {
        return c;
    }
}

