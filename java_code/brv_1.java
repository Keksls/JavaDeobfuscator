/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from brv
 */
public class brv_1
implements ebv_0 {
    public static final brv_1 a = new brv_1();

    protected brv_1() {
    }

    @Override
    public void a(@NotNull ect_0 ect_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        bHi bHi2 = bmr_12.da();
        ArrayList<exk_2> arrayList = bHi2.i(ect_02.b());
        for (exk_2 exk_22 : arrayList) {
            if (bHi2.d(exk_22) == null) continue;
            exk_22.release();
        }
        aUh.b("craft.jobLearnt", bae.h().a(43, (long)ect_02.a(), new Object[0]));
        bua_0.a.a(new bux_1(ect_02.a()));
    }

    @Override
    public void a(int n, long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l2 = bmr_12.eX().i(n);
        int n2 = ecu_0.c(l2) - ecu_0.c(l2 - l);
        String string = bae.h().a(43, (long)n, new Object[0]);
        String string2 = bae.h().a("infoPop.xpGain", string, l, bmr_12.eX().h(n), aup_0.d.e(), n2);
        aul_0.a().c(string2);
        if (n2 == 0) {
            return;
        }
        String string3 = bae.h().a("notification.skillLevelUpTitle", string);
        String string4 = cIg.createLink(bae.h().a("notification.skillLevelUpText", string, bmr_12.eX().f(n)), blr_1.b, "" + n);
        dhc dhc2 = new dhc(string3, string4, blr_1.b);
        add_2.b().a(dhc2);
        bmr_12.cS();
    }

    @Override
    public void a(int n) {
    }

    @Override
    public void a(int n, int n2) {
        eco_0 eco_02 = ecn_0.a.a(n).a(n2);
        String string = bae.h().a("craft.recipeDiscovered", bae.h().a(15, (long)eco_02.k().a(), new Object[0]));
        aul_0.a().c(string);
    }
}

