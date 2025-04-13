/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from RD
 */
public class rd_0
extends rg_0 {
    private static final Logger a = Logger.getLogger(rc_0.class);
    private String b;
    private boolean c;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 2) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 2 : monsterBreedId, displayEquipment) : " + string));
                return false;
            }
            this.b = stringArray[0];
            this.c = Co.a(stringArray[1]);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.p;
    }

    public boolean e() {
        return this.c;
    }

    public String f() {
        return this.b;
    }
}

