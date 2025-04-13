/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bkI
 */
public class bki_2 {
    private final bkf_2 a;
    private final int b;
    private int c;

    public bki_2(bkf_2 bkf_22, int n) {
        this.a = bkf_22;
        this.b = n;
    }

    public void a(int n) {
        this.c = n;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.c + "/" + this.c();
    }

    public int c() {
        int n = (int)Math.ceil((double)this.a.a().size() / (double)this.b);
        return Math.max(n, 0);
    }

    public List<bkn_2> d() {
        List<bkn_2> list = this.a.a();
        int n = (this.c - 1) * this.b;
        int n2 = Math.min(list.size(), n + this.b);
        ArrayList<bkn_2> arrayList = new ArrayList<bkn_2>();
        for (int k = n; k < n2; ++k) {
            arrayList.add(list.get(k));
        }
        return arrayList;
    }
}

