/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from acg
 */
public class acg_0 {
    private final abq_2<ach> a = new abq_2<ach>(ach.a);

    public void a(byte by, float f2, float f3, float f4) {
        this.a.add(new ach(by, f2, f3, f4));
    }

    public ach a(int n) {
        ach ach2 = this.a.b();
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            ach ach3 = (ach)this.a.get(k);
            if (n < ach3.b) {
                return ach2;
            }
            ach2 = ach3;
        }
        return this.a.b();
    }

    public ach a(ach ach2) {
        int n = this.a.indexOf(ach2);
        return n < this.a.size() - 1 ? (ach)this.a.get(n + 1) : this.a.a();
    }
}

