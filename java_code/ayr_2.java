/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from ayR
 */
final class ayr_2
implements TObjectProcedure<ays_2> {
    private final ArrayList<ays_2> b = new ArrayList(64);
    private float c;

    ayr_2() {
    }

    public boolean a(ays_2 ays_22) {
        if (ays_22 == null) {
            return true;
        }
        ays_22.q();
        if (ays_22.p() <= 0) {
            assert (ays_22.aw() == 0);
            this.b.add(ays_22);
            this.c += ays_22.n();
        }
        return true;
    }

    void a() {
        this.b.clear();
        this.c = 0.0f;
    }

    float a(ArrayList<ays_2> arrayList, float f2) {
        float f3 = 0.0f;
        if (this.c > f2) {
            int n = this.b();
            for (int k = 0; k < n; ++k) {
                ays_2 ays_22 = this.b.get(k);
                arrayList.add(ays_22);
                f3 += ays_22.n();
                if (!((f2 -= ays_22.n()) < 0.0f)) {
                    continue;
                }
                break;
            }
        } else {
            int n = this.b.size();
            for (int k = 0; k < n; ++k) {
                ays_2 ays_23 = this.b.get(k);
                arrayList.add(ays_23);
                f3 += ays_23.n();
            }
        }
        return f3;
    }

    private int b() {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            for (int i2 = k + 1; i2 < n; ++i2) {
                ays_2 ays_22 = this.b.get(k);
                ays_2 ays_23 = this.b.get(i2);
                if (ays_23.o() <= ays_22.o()) continue;
                this.b.set(k, ays_23);
                this.b.set(i2, ays_22);
            }
        }
        return n;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ays_2)object);
    }
}

