/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from bdz
 */
public class bdz_2
implements agw_0 {
    private static final Logger a = Logger.getLogger(bdz_2.class);

    public void a(YK yK) {
        asw_2.a().a(new aQz(), aQz2 -> {
            int n = aQz2.c();
            epn_2 epn_22 = epn_2.a(n);
            if (epn_22 == null) {
                a.error((Object)("Tentative d'initialiser une breed inconnue " + n));
                return;
            }
            epn_22.a(bdz_2.a(aQz2));
            bkw_1.a().a((int)epn_22.s(), aQz2.e());
        });
        asw_2.a().a(new aqa_0(), aqa_02 -> {
            int n = aqa_02.c();
            bkw_1.a().a(new bku_1(n, 0, aqa_02.f().b(), aqa_02.f().a(), this.a(n, aqa_02.d(), aqa_02.h())));
            bkw_1.a().a(new bku_1(n, 1, aqa_02.g().b(), aqa_02.g().a(), this.a(n, aqa_02.e(), aqa_02.i())));
        });
        yK.b(this);
    }

    private Map<Short, bkv_1> a(int n, aqb_0[] aqb_0Array, HashMap<Short, Byte> hashMap) {
        Map<Short, List<aqb_0>> map = Arrays.stream(aqb_0Array).collect(Collectors.groupingBy(aqb_0::g));
        HashMap<Short, bkv_1> hashMap2 = new HashMap<Short, bkv_1>();
        for (Map.Entry<Short, List<aqb_0>> entry : map.entrySet()) {
            short s2 = entry.getKey();
            List<aqb_0> list = entry.getValue();
            bkx_1 bkx_12 = new bkx_1();
            block12: for (aqb_0 aqb_02 : list) {
                atm_1 atm_12 = atm_1.a(aqb_02.a());
                switch (atm_12) {
                    case b: {
                        bkx_12.a(bdz_2.a(aqb_02));
                        bkx_12.a(aqb_02.b() == 1);
                        continue block12;
                    }
                    case c: {
                        bkx_12.b(bdz_2.a(aqb_02));
                        bkx_12.b(aqb_02.b() == 1);
                        continue block12;
                    }
                    case i: {
                        bkx_12.c(bdz_2.a(aqb_02));
                        bkx_12.c(aqb_02.b() == 1);
                        continue block12;
                    }
                    case k: {
                        bkx_12.d(bdz_2.a(aqb_02));
                        continue block12;
                    }
                    case l: {
                        bkx_12.e(bdz_2.a(aqb_02));
                        continue block12;
                    }
                    case m: {
                        bkx_12.f(bdz_2.a(aqb_02));
                        continue block12;
                    }
                    case n: {
                        bkx_12.g(bdz_2.a(aqb_02));
                        continue block12;
                    }
                    case o: {
                        bkx_12.h(bdz_2.a(aqb_02));
                        continue block12;
                    }
                    case p: {
                        bkx_12.i(bdz_2.a(aqb_02));
                        continue block12;
                    }
                }
                a.warn((Object)("Wrong data : default color for part " + atm_12.name() + " id=" + aqb_02.a() + " defined for breed=" + n + " clothIndex=" + s2));
            }
            hashMap2.put(s2, new bkv_1(hashMap.get(s2), bkx_12));
        }
        return hashMap2;
    }

    private static int a(aqb_0 aqb_02) {
        return azj_2.c(aqb_02.c(), aqb_02.d(), aqb_02.e(), aqb_02.f());
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.ground", new Object[0]);
    }

    private static epp_2 a(aQz aQz2) {
        int n = aQz2.r();
        float[] fArray = aQz2.t();
        byte[] byArray = aQz2.s();
        short[] sArray = aQz2.u();
        epp_2 epp_22 = new epp_2(n, fArray, byArray, sArray);
        epp_22.a(eps_0.b, aQz2.f());
        epp_22.a(eps_0.c, aQz2.g());
        epp_22.a(eps_0.d, aQz2.h());
        epp_22.a(eps_0.B, aQz2.j());
        epp_22.a(eps_0.h, aQz2.k());
        epp_22.a(eps_0.i, aQz2.l());
        epp_22.a(eps_0.C, aQz2.m());
        epp_22.a(eps_0.f, aQz2.n());
        epp_22.a(eps_0.g, aQz2.o());
        epp_22.a(eps_0.A, aQz2.p());
        epp_22.a(eps_0.e, aQz2.i());
        epp_22.a(eps_0.l, aQz2.q());
        return epp_22;
    }
}

