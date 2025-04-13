/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bfp
 */
public final class bfp_2
implements agw_0 {
    static final Logger a = Logger.getLogger(bfp_2.class);
    private static final bfp_2 b = new bfp_2();

    public static bfp_2 a() {
        return b;
    }

    private bfp_2() {
    }

    public void a(YK yK) {
        asw_2.a().a(new asx_0(), new bfq_1(this));
        fbc_0.a.a(fdo_0.a);
        yK.b(this);
    }

    static ArrayList<aot_2> a(String[] stringArray) {
        ArrayList<aot_2> arrayList = new ArrayList<aot_2>(stringArray.length);
        for (int k = 0; k < stringArray.length; ++k) {
            try {
                ArrayList<aot_2> arrayList2 = eyS.a(stringArray[k]);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                    continue;
                }
                arrayList.add(null);
                continue;
            }
            catch (Exception exception) {
                a.error((Object)("Erreur lors de la compilation de Param\u00e8tres sur une loi : " + stringArray[k]), (Throwable)exception);
            }
        }
        return arrayList;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.citizen.rules", new Object[0]);
    }
}

