/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aFD
 */
public class afd_2
implements afg_1 {
    protected final List<afe_2> a;
    protected long b;
    protected long c;

    public afd_2(List<afe_2> list, long l) {
        this.a = list;
        this.b = l;
        this.c = 0L;
        for (afe_2 afe_22 : this.a) {
            this.c += afe_22.g();
            afe_22.e(l);
        }
    }

    @Override
    public afr_2 a(long l) {
        if (l <= this.b) {
            return this.a();
        }
        if (l >= this.b + this.c) {
            return this.b();
        }
        for (int k = 0; k < this.a.size(); ++k) {
            afe_2 afe_22 = this.a.get(k);
            if (l < afe_22.d() || l >= afe_22.c()) continue;
            afr_2 afr_22 = afe_22.a(l);
            afr_22.c(afe_22.a().c());
            return afr_22;
        }
        return this.b();
    }

    @Override
    public afr_2 a(long l, aej_2 aej_22, apl_1 apl_12) {
        return afd_2.a(this, l, aej_22, apl_12);
    }

    @Override
    public void c(long l) {
        for (afe_2 afe_22 : this.a) {
            afe_22.e(l);
        }
        this.b += l;
    }

    @Override
    public afr_2 a() {
        if (this.a == null || this.a.size() <= 0) {
            return null;
        }
        return this.a.get(0).a();
    }

    @Override
    public afr_2 b() {
        if (this.a == null || this.a.size() <= 0) {
            return null;
        }
        return this.a.get(this.a.size() - 1).b();
    }

    @Override
    public long c() {
        return this.b + this.c;
    }

    @Override
    public long d() {
        return this.b;
    }

    @Override
    public boolean b_(long l) {
        return false;
    }

    public static afr_2 a(afg_1 afg_12, long l, aej_2 aej_22, apl_1 apl_12) {
        int n;
        int n2;
        long l2 = 75L;
        afr_2 afr_22 = afg_12.a(l);
        if (afg_12.b_(l)) {
            return afr_22;
        }
        switch (aej_22.m) {
            case -1: {
                n2 = Hw.d(afr_22.a());
                break;
            }
            case 1: {
                n2 = Hw.c(afr_22.a());
                break;
            }
            default: {
                n2 = Hw.b(afr_22.a());
            }
        }
        switch (aej_22.n) {
            case -1: {
                n = Hw.d(afr_22.b());
                break;
            }
            case 1: {
                n = Hw.c(afr_22.b());
                break;
            }
            default: {
                n = Hw.b(afr_22.b());
            }
        }
        afr_2 afr_23 = new afr_2(n2, n, Hw.b(afr_22.c()));
        afr_2 afr_24 = new afr_2(afr_23);
        afr_2 afr_25 = afr_23;
        long l3 = afg_12.c();
        boolean bl = apl_12.a(new int[]{(int)afr_24.a(), (int)afr_24.b(), (int)afr_24.c()});
        while (l < l3 && (afr_24.equals(afr_23) || !bl)) {
            int n3;
            int n4;
            afr_25 = afg_12.a(l + 75L);
            switch (aej_22.m) {
                case -1: {
                    n4 = Hw.d(afr_25.a());
                    break;
                }
                case 1: {
                    n4 = Hw.c(afr_25.a());
                    break;
                }
                default: {
                    n4 = Hw.b(afr_25.a());
                }
            }
            switch (aej_22.n) {
                case -1: {
                    n3 = Hw.d(afr_25.b());
                    break;
                }
                case 1: {
                    n3 = Hw.c(afr_25.b());
                    break;
                }
                default: {
                    n3 = Hw.b(afr_25.b());
                }
            }
            afr_24.a(n4, n3, Hw.b(afr_25.c()));
            l += 75L;
            bl = apl_12.b(new int[]{(int)afr_24.a(), (int)afr_24.b()});
        }
        return afr_25;
    }
}

