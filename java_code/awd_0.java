/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from aWd
 */
public class awd_0
extends aXj {
    private static final byte a = 0;
    private static final byte b = 1;
    private final byte c;
    private final int d;
    private final String e;
    private final short f;
    private final boolean g;

    public awd_0(int n, short s2, boolean bl) {
        this.c = 0;
        this.d = n;
        this.e = null;
        this.f = s2;
        this.g = bl;
    }

    public awd_0(String string, short s2, boolean bl) {
        this.c = 1;
        this.d = -1;
        this.e = string;
        this.f = s2;
        this.g = bl;
    }

    @Override
    public boolean a() {
        if (this.f <= 0) {
            return false;
        }
        return this.c == 0 && this.d >= 0 || this.c == 1 && this.e != null;
    }

    @Override
    public void b() {
        if (this.c == 0) {
            this.e();
        } else if (this.c == 1) {
            this.f();
        }
    }

    private void e() {
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(this.d);
        if (bjw_12 == null) {
            aVo.a().d("Item Ref ID " + this.d + " not found.");
            return;
        }
        this.a(this.d);
    }

    private void f() {
        List<bjw_1> list = aXZ.d(this.e);
        String string = aXZ.a(list, this.e);
        aVo.a().a(string, 0xFFFFFF);
        if (list.size() == 1) {
            this.a(list.get(0).n());
            return;
        }
        List list2 = list.stream().filter(bjw_12 -> Cz.b(bjw_12.e(), this.e)).sorted(Collections.reverseOrder((bjw_12, bjw_13) -> {
            byte by = bjw_12.M() == null ? exw_1.a.b() : bjw_12.M().b();
            byte by2 = bjw_13.M() == null ? exw_1.a.b() : bjw_13.M().b();
            return Byte.compare(by, by2);
        })).collect(Collectors.toList());
        if (!list2.isEmpty()) {
            aVo.a().a("\nExact match found.", 0xFFFFFF);
            bjw_1 bjw_14 = (bjw_1)list2.get(0);
            if (list2.size() > 1) {
                String string2 = bae.h().a("item.rarity." + bjw_14.M().name(), new Object[0]);
                aVo.a().a("Creating highest rarity: " + string2.toUpperCase(), 0xFFFFFF);
            }
            this.a(bjw_14.n());
        }
    }

    private void a(int n) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        long l = awd_0.c();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)389);
        pt.a(l);
        pt.a(n);
        pt.b(this.f);
        pt.a(this.g);
        aaw_22.c(pt);
        eyq_1.a(this.g);
        aVo.a().a("\nCreated " + this.f + "x " + n, 0xFFFFFF);
    }

    static long c() {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = euu_2.a() ? (azu_0.j().c(cyt_0.a()) ? cyt_0.a().r() : euv_2.a.b(bmr_12.U_())) : bmr_12.a_();
        return l;
    }

    public int d() {
        return this.d;
    }
}

