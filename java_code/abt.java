/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class abt<T extends abz_0>
extends abs<T> {
    public int c(float f2, float f3) {
        int n = 0;
        ArrayList arrayList = this.c;
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            abz_0 abz_02 = (abz_0)arrayList.get(k);
            if (abz_02.a(f2, f3)) {
                abz_02.e(true);
                ++n;
                continue;
            }
            abz_02.e(false);
        }
        return n;
    }

    protected void a(T t, acb_0 acb_02) {
        if (!((abu)t).ax()) {
            return;
        }
        afd_1 afd_12 = aht_0.b(acb_02, t);
        int n = Hw.b(afd_12.a);
        int n2 = Hw.b(afd_12.b);
        int n3 = aht_0.a((ahg_0)acb_02, ((abu)t).ag());
        if (n != ((abu)t).i() || n2 != ((abu)t).j() || n3 != ((abu)t).k()) {
            ((abu)t).d(n);
            ((abu)t).e(n2);
            ((abu)t).f(n3);
            ((abu)t).ay();
        }
    }
}

