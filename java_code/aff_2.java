/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aFF
 */
public class aff_2 {
    protected long a;
    protected final List<afj_2> b;

    public aff_2(List<afe_2> list, long l) {
        this.a = l;
        this.b = new ArrayList<afj_2>();
        this.a(list, l);
    }

    protected void a(List<afe_2> list, long l) {
        if (list.size() == 1) {
            afe_2 afe_22 = list.get(0);
            afb_2 afb_22 = new afb_2();
            afb_22.a(afe_22.a());
            afb_22.b(l + afe_22.d());
            afb_22.b(afe_22.e());
            afb_22.c(afe_22.b());
            afb_22.c_(l + afe_22.c());
            afb_22.d(afe_22.e());
            this.b.add(afb_22);
        } else {
            for (int k = 0; k < list.size() - 1; ++k) {
                afe_2 afe_23 = list.get(k);
                afe_2 afe_24 = list.get(k + 1);
                afb_2 afb_23 = new afb_2();
                if (k == 0) {
                    afb_23.a(afe_23.a());
                    afb_23.b(l);
                    afb_23.b(afe_23.e());
                } else {
                    afb_23.a(afe_23.b().d(afe_23.a()).g(0.5f));
                    afb_23.b(l + afe_23.d() + afe_23.g() / 2L);
                    afb_23.b(afe_23.e().g(0.5f));
                }
                if (k == list.size() - 2) {
                    afb_23.d(afe_24.e());
                    afb_23.c_(afb_23.d() + afe_23.g() / 2L + afe_24.g());
                    afb_23.c(afe_24.b());
                } else {
                    afb_23.c(afe_24.a().d(afe_24.b()).g(0.5f));
                    if (k == 0) {
                        afb_23.c_(afb_23.d() + afe_23.g() + afe_24.g() / 2L);
                    } else {
                        afb_23.c_(afb_23.d() + afe_23.g() / 2L + afe_24.g() / 2L);
                    }
                    afb_23.d(afe_24.e().g(0.5f));
                }
                this.b.add(afb_23);
            }
        }
    }

    public afr_2 a(long l) {
        if (l < this.a) {
            l = this.a;
        }
        if (l > this.b()) {
            l = this.b();
        }
        for (int k = 0; k < this.b.size(); ++k) {
            afj_2 afj_22 = this.b.get(k);
            if (afj_22.d() > l || afj_22.c() < l) continue;
            return afj_22.a(l);
        }
        return null;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b.get(this.b.size() - 1).c();
    }

    public void b(long l) {
        this.a = l;
    }

    public void c(long l) {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Smoothed trajectory : ");
        for (afj_2 afj_22 : this.b) {
            stringBuilder.append(afj_22.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public afr_2 c() {
        return this.b.get(this.b.size() - 1).b();
    }

    public List<afj_2> d() {
        return this.b;
    }
}

