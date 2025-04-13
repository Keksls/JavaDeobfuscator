/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cdd
 */
class cdd_1 {
    final ccj_2 a;
    final ccj_2 b;
    final ccj_2 c;
    final ccj_2 d;
    esy_2[] e;

    cdd_1(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        this.a = (ccj_2)fkk_02;
        this.b = (ccj_2)fkk_03;
        this.c = (ccj_2)fkk_04;
        this.d = (ccj_2)fkk_05;
    }

    void a(@NotNull esy_2[] esy_2Array) {
        this.e = esy_2Array;
    }

    private int a(ccj_2 ccj_22) {
        return ccj_22 == null ? 0 : ccj_22.b().a();
    }

    int a() {
        int n;
        int n2 = n = Hw.a(this.a(this.a), this.a(this.b), this.a(this.c), this.a(this.d));
        for (esy_2 esy_22 : this.e) {
            cdj_1 cdj_12 = (cdj_1)esy_22;
            int n3 = ((cdl_1)cdj_12.m()).c() + cdj_12.a();
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2 + 1;
    }
}

