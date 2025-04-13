/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;

/*
 * Renamed from eEb
 */
public class eeb_0
extends eDO {
    @Override
    protected String a(efh_0 efh_02, String object, Object[] objectArray, boolean bl, eDl eDl2) {
        int n;
        Object object2;
        short s2 = 0;
        Object object3 = null;
        if ((efh_02.j() == eDi.af || efh_02.j() == eDi.ag) && (object2 = fih_0.a().a(((Number)objectArray[0]).intValue())) != null) {
            if (efh_02.j() == eDi.af) {
                s2 = ((Number)objectArray[1]).shortValue();
                object3 = object2;
                objectArray[0] = eDi.a((fie_0)object2, s2, ((fie_0)object2).D(), true);
            } else {
                objectArray[0] = eDi.a((fie_0)object2, s2, (short)1, false);
            }
        }
        if (object3 != null && efh_02.j() == eDi.af) {
            object2 = eDi.Q.matcher((CharSequence)object);
            while (((Matcher)object2).find()) {
                String string = ((Matcher)object2).group(1);
                char c2 = string.charAt(0);
                block0 : switch (c2) {
                    case 'l': {
                        char c3 = string.charAt(1);
                        switch (c3) {
                            case 'i': {
                                String string2 = eDi.a((fie_0)object3, s2, false, 0, false, false);
                                if (string2 == null) break;
                                object = ((String)object).substring(0, ((Matcher)object2).start()) + string2 + ((String)object).substring(((Matcher)object2).end());
                                object2 = eDi.Q.matcher(((String)object).trim());
                                break block0;
                            }
                            case 'p': {
                                String string2 = eDi.a((fie_0)object3, s2, false, 0, false, true);
                                if (string2 == null) break;
                                object = ((String)object).substring(0, ((Matcher)object2).start()) + string2 + ((String)object).substring(((Matcher)object2).end());
                                object2 = eDi.Q.matcher(((String)object).trim());
                                break block0;
                            }
                        }
                        break;
                    }
                }
            }
        }
        if (efh_02.N() && !efh_02.M() && (n = ((fie_0)object3).o()) != -1000) {
            object = (String)object + "(" + wa_0.d(ww_0.a(n / 1000)) + ")";
        }
        return Cr.a((String)object, objectArray);
    }
}

