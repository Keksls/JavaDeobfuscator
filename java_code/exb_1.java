/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eXB
 */
public class exb_1
implements tt_0<exk_2> {
    private static final Logger p = Logger.getLogger(exb_1.class);
    public static final exb_1 o = new exb_1();

    @Override
    public int a(tr_0<exk_2> tr_02, exk_2 exk_22) {
        if (!exk_22.aU_()) {
            return -3;
        }
        if (tr_02.l()) {
            if (tr_02.h()) {
                if (exk_22.D() > 0 && exk_22.Y()) {
                    ArrayList<exk_2> arrayList = tr_02.d(exk_22.T().n());
                    for (int k = arrayList.size() - 1; k >= 0; --k) {
                        if (arrayList.get(k).a() == exk_22.a()) {
                            return -12;
                        }
                        if (!arrayList.get(k).a(exk_22) || arrayList.get(k).e() + exk_22.e() > exk_22.aR_()) continue;
                        return 1;
                    }
                }
                return -1;
            }
            return -1;
        }
        return 0;
    }

    @Override
    public int a(tr_0<exk_2> tr_02, exk_2 exk_22, short s2) {
        if (!exk_22.aU_()) {
            return -3;
        }
        if (!(tr_02 instanceof TK)) {
            p.warn((Object)"Utilisation du BagInventoryChecker sur un inventaire qui ne contient pas un ArrayInventory", (Throwable)new IllegalArgumentException("Utilisation du BagInventoryChecker sur un inventaire qui ne contient pas un ArrayInventory"));
            return this.a(tr_02, exk_22);
        }
        Object c2 = ((TK)tr_02).e(s2);
        if (c2 == null) {
            return 0;
        }
        if (!tr_02.h()) {
            return -1;
        }
        if (!c2.a(exk_22)) {
            return -1;
        }
        return 1;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, exk_2 exk_23) {
        if (!exk_23.aU_()) {
            return -3;
        }
        return 0;
    }

    @Override
    public int b(tr_0 tr_02, exk_2 exk_22) {
        return 0;
    }

    @Override
    public boolean a(exk_2 exk_22, Su su, So so) {
        return true;
    }

    @Override
    public boolean a(tr_0<exk_2> tr_02, Su su, So so) {
        return true;
    }
}

