/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

public class aWe
extends aXj {
    private final int a;
    private final short b;

    public aWe(int n, short s2) {
        this.a = n;
        this.b = s2;
    }

    @Override
    public boolean a() {
        return this.b > 0;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Optional<eco_0> optional = brs_0.a.b(this.a);
        if (optional.isEmpty()) {
            aVo.a().d("La recette n'existe pas");
            return;
        }
        long l = awd_0.c();
        eco_0 eco_02 = optional.get();
        Map<Integer, Cm<Short, Short>> map = eco_02.r();
        map.forEach((n, cm) -> {
            short s2 = (Short)cm.a();
            long l2 = s2 * this.b;
            double d2 = Math.ceil((float)l2 / 32767.0f);
            long l3 = l2;
            int n2 = 0;
            while ((double)n2 < d2) {
                short s3 = l3 > 32767L ? (short)Short.MAX_VALUE : (short)l3;
                Pt pt = new Pt();
                pt.a((byte)3);
                pt.a((short)389);
                pt.a(l);
                pt.a((int)n);
                pt.b(s3);
                pt.a(true);
                aaw_22.c(pt);
                l3 -= (long)s3;
                ++n2;
            }
        });
    }
}

