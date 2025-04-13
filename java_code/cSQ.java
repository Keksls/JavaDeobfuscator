/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class cSQ {
    private final frb_0 a;
    private final frb_0 b;
    private final cuh_0 c;
    private boolean d;

    public cSQ(frb_0 frb_02, frb_0 frb_03, cuh_0 cuh_02) {
        this.a = frb_02;
        this.b = frb_03;
        this.c = cuh_02;
    }

    public void a() {
        this.d = true;
        fyt_0.a().a(this.a, true);
    }

    public void b() {
        this.d = false;
        fyt_0.a().c();
    }

    public void a(aNF aNF2, int n, int n2) {
        if (!this.d) {
            return;
        }
        cUM cUM2 = this.c(aNF2, n, n2);
        if (cUM2 != null) {
            fyt_0.a().a(this.b, true);
        } else {
            fyt_0.a().a(this.a, true);
        }
    }

    public void b(aNF aNF2, int n, int n2) {
        if (!this.d) {
            return;
        }
        cUM cUM2 = this.c(aNF2, n, n2);
        if (cUM2 != null) {
            this.c.getValidAction(cUM2).ifPresent(cSS::o);
        }
        fyt_0.a().c();
        this.d = false;
    }

    @Nullable
    private cUM c(aNF aNF2, int n, int n2) {
        ArrayList<abz_0> arrayList = aNF2.e(n, n2);
        if (arrayList.isEmpty()) {
            return null;
        }
        int n3 = arrayList.size();
        for (int k = 0; k < n3; ++k) {
            cUM cUM2;
            abz_0 abz_02;
            aoc_2 aoc_22 = abz_02 = arrayList.get(k);
            if (abz_02 instanceof biI) {
                aoc_22 = ((biI)abz_02).bI();
            }
            if (!(aoc_22 instanceof cUM) || !this.c.a(cUM2 = (cUM)((Object)aoc_22))) continue;
            return cUM2;
        }
        return null;
    }
}

