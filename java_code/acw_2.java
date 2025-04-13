/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from aCW
 */
public final class acw_2 {
    protected static final Logger a = Logger.getLogger(acw_2.class);
    private static final acw_2 b = new acw_2();

    public static acw_2 a() {
        return b;
    }

    private acw_2() {
    }

    public boolean a(Object object, acv_2 acv_22, act_2[] act_2Array, acu_2 acu_22, Object ... objectArray) {
        if (acv_22 == null) {
            a.error((Object)"Liste des cible pour la diffusion manquante");
            return false;
        }
        Iterator iterator = acv_22.a();
        if (objectArray.length > 0 && iterator != null && acu_22 != null) {
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                boolean bl = true;
                if (act_2Array != null) {
                    for (act_2 act_22 : act_2Array) {
                        if (act_22.a(object, e2, objectArray)) continue;
                        bl = false;
                        break;
                    }
                }
                if (!bl) continue;
                acu_22.a(object, e2, objectArray);
            }
        } else {
            if (objectArray.length <= 0) {
                a.error((Object)"Nombre d'content incorrects");
            }
            if (iterator == null) {
                a.error((Object)"Iterateur sur la liste des recepteurs incorrect");
            }
            if (acu_22 == null) {
                a.error((Object)"Processeur d'arguments manquant");
            }
            return false;
        }
        return true;
    }
}

