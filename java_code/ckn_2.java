/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cKN
 */
public class ckn_2
extends fig_2 {
    final /* synthetic */ ckf_2 a;

    public ckn_2(ckf_2 ckf_22) {
        this.a = ckf_22;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return new fjf_2();
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.a.getPrefSize();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(fso fso2) {
        if (!this.a.o && !this.a.p) {
            return;
        }
        Object object = this.a.v;
        synchronized (object) {
            boolean bl = this.a.p;
            this.a.o = false;
            this.a.p = false;
            if (this.a.j == null) {
                return;
            }
            int n = fso2.getAppearance().getContentWidth();
            int n2 = fso2.getAppearance().getContentHeight();
            if (this.a.m != null) {
                this.a.m.setSizeToPrefSize();
                this.a.m.setPosition(n - this.a.m.getWidth() - 62, 0);
            }
            int[] nArray = new int[(this.a.j.size() + 1) * 2];
            int[] nArray2 = new int[(this.a.j.size() + 1) * 2];
            int[] nArray3 = new int[(this.a.j.size() + 1) * 2];
            int[] nArray4 = new int[(this.a.j.size() + 1) * 2];
            int n3 = 5;
            boolean bl2 = false;
            ckm_2 ckm_22 = null;
            int n4 = this.a.j.size() + 1;
            for (int k = 0; k < n4; ++k) {
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                boolean bl3;
                int n11 = k;
                boolean bl4 = bl3 = k == this.a.h + 1;
                if (k > this.a.h + 1) {
                    --n11;
                }
                switch (k) {
                    case 0: {
                        int n12 = -3;
                        n10 = 7;
                        n9 = 59;
                        n8 = 101;
                        n7 = 35;
                        n6 = 113;
                        n5 = 47;
                        break;
                    }
                    case 1: {
                        int n12 = 7;
                        n10 = 7;
                        n9 = 94;
                        n8 = 96;
                        n7 = 31;
                        n6 = 101;
                        n5 = 35;
                        break;
                    }
                    case 2: {
                        int n12 = 7;
                        n10 = 7;
                        n9 = 125;
                        n8 = 91;
                        n7 = 26;
                        n6 = 96;
                        n5 = 31;
                        break;
                    }
                    default: {
                        int n12 = 7;
                        n10 = 7;
                        n9 = 125 + 26 * (k - 2);
                        n6 = 91;
                        n8 = 91;
                        n5 = 26;
                        n7 = 26;
                    }
                }
                if (k == n4 - 2 && k == this.a.h || k == n4 - 1 && !bl3) {
                    n10 = 5;
                    n9 = 5;
                    n8 = 113;
                    n7 = 47;
                }
                if (k == n4 - 1 && bl3) {
                    n10 = 7;
                    n9 = 59;
                    n8 = 101;
                    n7 = 35;
                }
                ftj_0 ftj_02 = !bl3 ? this.a.j.get(n11).c() : this.a.k.c();
                nArray3[k * 2] = n12 -= n6;
                nArray3[k * 2 + 1] = n3;
                nArray4[k * 2] = n6;
                nArray4[k * 2 + 1] = n5;
                boolean bl5 = false;
                if (!bl || ftj_02.getWidth() == 0) {
                    nArray[k * 2] = nArray3[k * 2];
                    nArray[k * 2 + 1] = nArray3[k * 2 + 1];
                    nArray2[k * 2] = nArray4[k * 2];
                    nArray2[k * 2 + 1] = nArray4[k * 2 + 1];
                    ftj_02.setPosition(n + nArray[k * 2], nArray[k * 2 + 1]);
                    ftj_02.setSize(nArray2[k * 2], nArray2[k * 2 + 1]);
                } else {
                    nArray[k * 2] = n10 - n8;
                    nArray[k * 2 + 1] = n9;
                    nArray2[k * 2] = n8;
                    nArray2[k * 2 + 1] = n7;
                    bl5 = true;
                    bl2 = true;
                }
                n3 += n5;
                if (k == 0) {
                    n3 += 7;
                }
                if (!bl5 || !(k == n4 - 2 && k == this.a.h || k == n4 - 1 && !bl3) && (k != n4 - 1 || !bl3)) continue;
                int n13 = -108;
                int n14 = n9;
                int n15 = -8;
                int n16 = n14;
                int n17 = -8;
                int n18 = n2 - n5;
                int n19 = nArray3[k * 2];
                int n20 = n18;
                int n21 = nArray4[k * 2];
                int n22 = nArray4[k * 2 + 1];
                if (ckm_22 == null) {
                    ckm_22 = new ckm_2(this.a, fjw_2.b);
                }
                if (bl3) {
                    ckm_22.b(ftj_02, -108, n14, -8, n16, -8, n18, n19, n20, n21, n22);
                } else {
                    ckm_22.a(ftj_02, -108, n14, -8, n16, -8, n18, n19, n20, n21, n22);
                }
                nArray[k * 2] = -8;
                nArray[k * 2 + 1] = n18;
                nArray2[k * 2] = n21;
                nArray2[k * 2 + 1] = n22;
            }
            if (!bl2) {
                return;
            }
            if (ckm_22 != null && ckm_22.b()) {
                if (this.a.hasTweensOfType(ckm_2.class)) {
                    this.a.r.add(ckm_22);
                } else {
                    this.a.addTween(ckm_22);
                }
            }
            ArrayList<ftj_0> arrayList = new ArrayList<ftj_0>(this.a.j.size() + 1);
            for (n4 = 0; n4 <= this.a.h; ++n4) {
                arrayList.add(this.a.j.get(n4).c());
            }
            arrayList.add(this.a.k.c());
            while (n4 < this.a.j.size()) {
                arrayList.add(this.a.j.get(n4).c());
                ++n4;
            }
            cko_2 cko_22 = new cko_2(this.a, arrayList, nArray, nArray3, nArray2, nArray4, fjw_2.b);
            if (this.a.hasTweensOfType(cko_2.class)) {
                this.a.s.add(cko_22);
            } else {
                this.a.addTween(cko_22);
            }
        }
    }
}

