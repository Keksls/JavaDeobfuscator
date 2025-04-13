/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class bWm {
    private static final Logger a = Logger.getLogger(bWm.class);
    private static final String b = "action";

    public static void a(URL uRL, agk_0 agk_02, ajb_1 ajb_12, int n) {
        Object object;
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        try {
            object = uRL.openStream();
            atg_22.a((InputStream)object);
            atg_22.a(ath_22, new aqy_2[0]);
            ((InputStream)object).close();
        }
        catch (Exception exception) {
            a.warn((Object)"Probl\u00e8me \u00e0 l'ouverture : ", (Throwable)exception);
            return;
        }
        object = bWm.a(ath_22, n);
        bWm.a((List<bWi>)object, agk_02, ajb_12);
    }

    private static List<bWi> a(ath_2 ath_22, int n) {
        ati_2 ati_22 = ath_22.a();
        ArrayList<aqx_2> arrayList = ati_22.d(b);
        ArrayList<bWi> arrayList2 = new ArrayList<bWi>(arrayList.size());
        for (aqx_2 aqx_22 : arrayList) {
            bWi bWi2 = bWj.a.a(aqx_22, n);
            if (bWi2 == null) continue;
            arrayList2.add(bWi2);
        }
        return arrayList2;
    }

    private static void a(List<bWi> list, agk_0 agk_02, ajb_1 ajb_12) {
        for (bWi bWi2 : list) {
            bWi2.a(agk_02, ajb_12);
        }
    }
}

