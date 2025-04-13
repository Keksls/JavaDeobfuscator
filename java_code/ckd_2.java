/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TFloatArrayList;
import gnu.trove.list.array.TIntArrayList;
import java.util.Arrays;

/*
 * Renamed from cKD
 */
public class ckd_2
extends fig_2 {
    final /* synthetic */ ckw_2 a;

    public ckd_2(ckw_2 ckw_22) {
        this.a = ckw_22;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.getContentPreferedSize(fso2);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = this.a.f();
        fjf_22.a(fjf_22.height + this.a.p.size() * 40);
        return fjf_22;
    }

    @Override
    public void a(fso fso2) {
        if (this.a.F) {
            return;
        }
        fjf_2 fjf_22 = this.a.f();
        int n = fso2.getAppearance().getContentHeight() - fjf_22.height;
        int n2 = fso2.getAppearance().getContentWidth();
        if (this.a.A != null && this.a.A.length != 0) {
            int n3 = this.a.A.length;
            int[] nArray = new int[n3];
            ckr_2 ckr_22 = this.a.getDecorator().getMesh();
            int n4 = (int)Math.floor((float)n / (float)this.a.p.size());
            int n5 = ckr_22.c().d();
            for (int k = 0; k < this.a.A.length; ++k) {
                n5 += ckr_22.f().d();
                if (k != 0) {
                    n5 += this.a.D[k - 1] * n4;
                }
                nArray[k] = n5;
            }
            int[] nArray2 = this.a.getDecorator().getPixelSeparations();
            int[] nArray3 = new int[nArray2.length];
            TIntArrayList tIntArrayList = new TIntArrayList();
            TIntArrayList tIntArrayList2 = new TIntArrayList();
            TIntArrayList tIntArrayList3 = new TIntArrayList();
            TFloatArrayList tFloatArrayList = new TFloatArrayList();
            TFloatArrayList tFloatArrayList2 = new TFloatArrayList();
            float[] fArray = new float[nArray2.length];
            float[] fArray2 = new float[nArray2.length];
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = this.a.getAppearance().getContentHeight() + ckr_22.f().d();
            while (n7 < this.a.B.length || n6 < this.a.A.length) {
                int n10;
                int n11 = this.a.B.length > n7 && n7 >= 0 ? this.a.B[n7] : 0;
                int n12 = n10 = this.a.A.length > n6 && n6 >= 0 ? this.a.A[n6] : 0;
                if (n6 >= this.a.A.length || n7 < this.a.B.length && n11 < n10) {
                    if (nArray2.length <= n7) {
                        ++n7;
                        continue;
                    }
                    tIntArrayList.add(n11);
                    tIntArrayList2.add(nArray2[n7]);
                    tIntArrayList3.add(n8);
                    tFloatArrayList.add(1.0f);
                    tFloatArrayList2.add(0.0f);
                    ++n7;
                    continue;
                }
                if (n7 >= this.a.B.length || n6 < this.a.A.length && n11 > n10) {
                    if (nArray.length <= n6) {
                        ++n6;
                        continue;
                    }
                    n8 = nArray[n6];
                    tIntArrayList.add(n10);
                    tIntArrayList2.add(nArray[n6]);
                    tIntArrayList3.add(nArray[n6]);
                    tFloatArrayList.add(0.0f);
                    tFloatArrayList2.add(1.0f);
                    ++n6;
                    continue;
                }
                if (nArray2.length <= n7 || nArray.length <= n6) {
                    ++n6;
                    ++n7;
                    continue;
                }
                tIntArrayList.add(n10);
                tIntArrayList2.add(nArray2[n7]);
                tIntArrayList3.add(nArray[n6]);
                tFloatArrayList.add(1.0f);
                tFloatArrayList2.add(1.0f);
                n8 = nArray[n6];
                ++n7;
                ++n6;
            }
            nArray2 = tIntArrayList2.toArray();
            nArray3 = tIntArrayList3.toArray();
            fArray = tFloatArrayList.toArray();
            fArray2 = tFloatArrayList2.toArray();
            for (ftj_0 ftj_02 : this.a.r) {
                ftj_02.setSizeToPrefSize();
            }
            for (ftj_0 ftj_03 : this.a.s) {
                ftj_03.setSizeToPrefSize();
            }
            for (int k = 0; k < this.a.A.length; ++k) {
                fsM fsM2 = this.a.t.get(k);
                fsM2.c(String.valueOf(this.a.A[k] + 1));
                fsM2.setSizeToPrefSize();
            }
            this.a.u.setSizeToPrefSize();
            float[] fArray3 = new float[nArray.length];
            Arrays.fill(fArray3, 1.0f);
            this.a.removeTweensOfType(ckb_2.class);
            ckb_2 ckb_22 = new ckb_2(this.a, nArray2, nArray3, nArray, fArray, fArray2, fArray3, this.a.A, tIntArrayList.toArray(), this.a, 0, 300, 1, fjw_2.b);
            this.a.addTween(ckb_22);
        }
    }
}

