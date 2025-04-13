/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cKO
 */
class cko_2
extends fjh_2 {
    private final ArrayList<ftj_0> o;
    private final int[] p;
    private final int[] q;
    private final int[] r;
    private final int[] s;
    private boolean t = true;
    final /* synthetic */ ckf_2 a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cko_2(ckf_2 ckf_22, ArrayList arrayList, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, fjw_2 fjw_22) {
        this.a = ckf_22;
        this.c(250);
        this.b(250);
        this.d(1);
        this.a(fjw_22);
        this.o = arrayList;
        this.p = nArray;
        this.q = nArray2;
        this.r = nArray3;
        this.s = nArray4;
        for (ftj_0 ftj_02 : this.o) {
            int n = ckf_22.l.get(ftj_02);
            ckf_22.l.put(ftj_02, n + 1);
        }
    }

    private int b() {
        return this.o.size();
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            int n2 = this.a.getAppearance().getContentWidth();
            int n3 = this.e - 100;
            if (this.d < n3) {
                int n4 = this.o.size();
                for (int k = 0; k < n4; ++k) {
                    ftj_0 ftj_02 = this.o.get(k);
                    if (this.t) {
                        this.t = false;
                    }
                    int n5 = (int)this.c.a(this.p[k * 2], this.q[k * 2], this.d, n3);
                    int n6 = (int)this.c.a(this.p[k * 2 + 1], this.q[k * 2 + 1], this.d, n3);
                    int n7 = (int)this.c.a(this.r[k * 2], this.s[k * 2], this.d, n3);
                    int n8 = (int)this.c.a(this.r[k * 2 + 1], this.s[k * 2 + 1], this.d, n3);
                    ftj_02.setPosition(n5 + n2, n6);
                    ftj_02.setSize(n7, n8);
                }
            } else {
                int n9 = this.d - n3;
                int n10 = 0;
                if (n9 < 40) {
                    n10 = (int)this.c.a(0.0f, 10.0f, n9, 40);
                } else if (n9 < 80) {
                    n10 = (int)this.c.a(10.0f, 0.0f, n9 - 40, 40);
                } else if (n9 < 90) {
                    n10 = (int)this.c.a(0.0f, 4.0f, n9 - 80, 10);
                } else if (n9 < 100) {
                    n10 = (int)this.c.a(4.0f, 0.0f, n9 - 90, 10);
                }
                int n11 = this.o.size();
                for (int k = 0; k < n11 && k < this.q.length * 2; ++k) {
                    ftj_0 ftj_03 = this.o.get(k);
                    ftj_03.setY(this.q[k * 2 + 1] + n10);
                }
            }
            this.t = false;
        }
        return true;
    }

    @Override
    public void a() {
        int n = this.a.getAppearance().getContentWidth();
        int n2 = this.o.size();
        for (int k = 0; k < n2; ++k) {
            ftj_0 ftj_02 = this.o.get(k);
            if (k >= this.q.length * 2) break;
            ftj_02.setPosition(this.q[k * 2] + n, this.q[k * 2 + 1]);
            ftj_02.setSize(this.s[k * 2], this.s[k * 2 + 1]);
            int n3 = this.a.l.get(ftj_02);
            if (n3 == 1) {
                this.a.l.remove(ftj_02);
                ftj_02.destroySelfFromParent();
                continue;
            }
            this.a.l.put(ftj_02, n3 - 1);
        }
        if (this.a.r.size() > 0) {
            this.a.addTween(this.a.r.remove(0));
        }
        if (this.a.s.size() > 0) {
            this.a.addTween(this.a.s.remove(0));
        }
        super.a();
    }
}

