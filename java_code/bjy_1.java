/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bJY
 */
public class bjy_1 {
    public static void a(exk_2 exk_22) {
        aUh.a("item.unDeletable", new Object[0]);
    }

    private static String a(ArrayList<exk_2> arrayList) {
        Object object = "";
        boolean bl = true;
        for (exk_2 exk_22 : arrayList) {
            if (!bl) {
                object = (String)object + ", ";
            }
            object = (String)object + bae.h().a("item.quantity", exk_22.e(), aUi.a(exk_22));
            bl = false;
        }
        return object;
    }

    public static void a(exk_2 exk_22, epq_2 epq_22) {
        bjy_1.b(exk_22, epq_22);
    }

    public static void b(exk_2 exk_22, epq_2 epq_22) {
        bjy_1.b(exk_22, exk_22.e(), epq_22);
    }

    public static void a(exk_2 exk_22, int n, epq_2 epq_22) {
        bjy_1.b(exk_22, n, epq_22);
    }

    public static void b(exk_2 exk_22, int n, epq_2 epq_22) {
        if (exk_22.as()) {
            return;
        }
        String string = bae.h().a("item.selfLoot", bae.h().a("item.quantity", n, aUi.a(exk_22)));
        aul_0.a().c(string);
        epq_2 epq_23 = epq_22;
        if (epq_23 == null) {
            epq_23 = azu_0.j().k();
        }
        bjy_1.a(exk_22.aT_(), (apv_2)epq_23, epq_23.gX());
    }

    public static void b(exk_2 exk_22) {
        bjy_1.b(exk_22, exk_22.e());
    }

    public static void a(int n, int n2) {
        exk_2 exk_22 = eyo_1.g().g(n);
        bjy_1.b(exk_22, n2);
    }

    public static void a(exk_2 exk_22, int n) {
        bjy_1.b(exk_22, n);
    }

    public static void b(exk_2 exk_22, int n) {
        if (exk_22.as()) {
            return;
        }
        String string = bae.h().a("item.selfDrop", bae.h().a("item.quantity", n, aUi.a(exk_22)));
        aul_0.a().c(string);
    }

    public static void a(int n, apv_2 apv_22, byte by) {
        Object r2 = eyo_1.g().d(n);
        if (r2 != null && !((ezr_0)r2).V() && apv_22 != null) {
            bjy_1.a(r2, apv_22, by);
        }
    }

    private static void a(ezr_0 ezr_02, apv_2 apv_22, byte by) {
        zp_0 zp_02 = new zp_0();
        int n = by == 0 ? ezr_02.C() : ezr_02.D();
        zo_0 zo_02 = new zo_0(azs_0.a().d(n), 32, 32, (zt_0)zp_02, 3000);
        zo_02.a(apv_22);
        int n2 = zd_0.a().b(apv_22, 4);
        zo_02.g(n2 * 500);
        zd_0.a().a(zo_02);
    }
}

