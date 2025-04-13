/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;

class bsd {
    private final bsc a;
    private int b;
    private final int c;

    bsd(bsc bsc2, int n) {
        this.a = bsc2;
        this.c = n;
    }

    void a(int n) {
        this.b = n;
    }

    int a() {
        return this.b;
    }

    String b() {
        return this.b + 1 + "/" + this.c();
    }

    int c() {
        return Math.max((int)Math.ceil((float)this.d().size() / (float)this.c), 1);
    }

    private List<brw_0> d() {
        ArrayList<brw_0> arrayList = new ArrayList<brw_0>();
        bmr_1 bmr_12 = azu_0.j().k();
        for (brw_0 brw_02 : this.a.g()) {
            short s2;
            if (this.a.n && !bsc.a(bmr_12, brw_02) || !Strings.isNullOrEmpty((String)this.a.o) && !Cz.a(brw_02.e(), this.a.o) || (s2 = brw_02.c()) > this.a.q || s2 < this.a.p) continue;
            arrayList.add(brw_02);
        }
        return arrayList;
    }

    List<brw_0> e() {
        List<brw_0> list = this.d();
        int n = this.b * this.c;
        int n2 = Math.min(list.size(), n + this.c);
        ArrayList<brw_0> arrayList = new ArrayList<brw_0>();
        for (int k = n; k < n2; ++k) {
            arrayList.add(list.get(k));
        }
        return arrayList;
    }
}

