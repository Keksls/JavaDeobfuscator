/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHA
 */
public class bha_0 {
    private bha_0() {
    }

    public static boolean a(exk_2 exk_22) {
        long l = azu_0.j().n().u();
        return euu_2.f(l, exk_22.a()) != null;
    }

    public static boolean b(exk_2 exk_22) {
        long l = azu_0.j().n().u();
        List<eBt> list = eBo.a.a(l);
        for (eBt eBt2 : list) {
            if (!eBt2.h().e(exk_22)) continue;
            return true;
        }
        return false;
    }

    public static void a(bmr_1 bmr_12) {
        bha_0.a(bmr_12, (byte)-1);
    }

    public static void a(bmr_1 bmr_12, byte by) {
        cnP cnP2 = new cnP(bmr_12.a_(), by, new short[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        aaw_22.c(cnP2);
    }

    public static void a(long l) {
        btb_1 btb_12;
        Object object = fis_1.a().d("itemDetail", "inventoryDialog");
        if (object instanceof exk_2 && ((exk_2)object).a() == l) {
            fis_1.a().a("itemDetail", (Object)null, "inventoryDialog");
        }
        if ((btb_12 = cyq_0.a.d()) != null && btb_12.h() != null && btb_12.h().a() == l) {
            btb_12.a((exk_2)null);
        }
        if (btb_12 != null && btb_12.i() != null && btb_12.i().a() == l) {
            btb_12.b((exk_2)null);
        }
    }

    @Contract(value="null, _, _ -> null")
    public static exk_2 a(@Nullable epq_2 epq_22, long l, boolean bl) {
        if (epq_22 == null) {
            return null;
        }
        exk_2 exk_22 = epq_22.dS().g(l);
        if (exk_22 != null) {
            if (cZI.A()) {
                cZI.a().b(exk_22);
            }
            if (bl) {
                bjy_1.b(exk_22);
            }
        }
        return exk_22;
    }
}

