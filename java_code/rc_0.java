/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from RC
 */
public class rc_0
extends rg_0 {
    private static final Logger a = Logger.getLogger(rc_0.class);
    private int b;
    private boolean c;
    private RH d = RH.a;

    @Override
    protected boolean a(String string) {
        try {
            if (string.contains(";")) {
                return this.c(string);
            }
            this.b = Integer.parseInt(string);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " invalid  " + illegalArgumentException.getMessage()));
            return false;
        }
    }

    private boolean c(String string) {
        String[] stringArray = Cz.a(string, ';');
        if (stringArray.length != 2 && stringArray.length != 3) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " nombre de param\u00e8tre invalide: " + string + "(attendu: idParticule(int)[;alwaysActivated(boolean)][;localisation(string)])"));
            return false;
        }
        this.b = Integer.parseInt(stringArray[0]);
        String string2 = stringArray[1];
        String string3 = null;
        if (stringArray.length == 3) {
            string3 = stringArray[2];
        }
        if (string2.equalsIgnoreCase("true") || string2.equalsIgnoreCase("false")) {
            this.c = Boolean.parseBoolean(string2);
        } else if (stringArray.length == 2) {
            string3 = string2;
        }
        if (string3 == null) {
            return true;
        }
        if (string3.equalsIgnoreCase("tete")) {
            this.d = RH.d;
        } else if (string3.equalsIgnoreCase("corps")) {
            this.d = RH.c;
        } else if (string3.equalsIgnoreCase("pied")) {
            this.d = RH.b;
        } else {
            a.error((Object)("Erreur de parametre, localisation inconnue " + string3 + ", " + this.toString()));
            return false;
        }
        return true;
    }

    @Override
    public ri_0 a() {
        return ri_0.b;
    }

    public int e() {
        return this.b;
    }

    public boolean f() {
        return this.c;
    }

    public RH g() {
        return this.d;
    }

    @Override
    public String toString() {
        return "HMIParticleSystemAction{m_particleSystemId=" + this.b + ", m_alwaysActivated=" + this.c + ", m_localisation=" + this.d + "} " + super.toString();
    }
}

