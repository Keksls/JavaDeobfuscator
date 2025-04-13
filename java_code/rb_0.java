/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from RB
 */
public class rb_0
extends rg_0 {
    private static final Logger a = Logger.getLogger(rb_0.class);
    private String b;
    private String c;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 1 && stringArray.length != 2) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 2 : AppearanceId;AnimName(facultatif)) : " + string));
                return false;
            }
            this.b = stringArray[0];
            if (stringArray.length == 2) {
                this.c = stringArray[1];
            }
            return true;
        }
        catch (Exception exception) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.l;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }
}

