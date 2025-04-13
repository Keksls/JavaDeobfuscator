/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class fvj
extends fig_2 {
    static final /* synthetic */ boolean a;
    final /* synthetic */ fvb_0 b;

    fvj(fvb_0 fvb_02) {
        this.b = fvb_02;
    }

    public boolean a() {
        return false;
    }

    private azt_1 isRadiusValid(int n, boolean bl, ArrayList<fru_0> arrayList) {
        int n2 = arrayList.size();
        if (n2 == 1) {
            fjf_2 fjf_22 = arrayList.get(0).getPrefSize();
            return azt_1.a(0, 0, fjf_22.width, fjf_22.height);
        }
        if (!a && n2 <= 1) {
            throw new AssertionError((Object)"Le nombre de boutons est inf\u00e9rieur \u00e0 2");
        }
        float f2 = fvb_0.a(n2);
        float f3 = n2 == 8 ? 4.712389f : 1.5707964f + (float)(n2 - 1) * f2 / 2.0f;
        azt_1 azt_12 = azt_1.a();
        azt_1 azt_13 = azt_1.a();
        azt_1 azt_14 = azt_1.a();
        azt_1 azt_15 = null;
        for (int k = 0; k < n2; ++k) {
            fvE fvE2 = arrayList.get(k);
            fjf_2 fjf_23 = bl ? fvE2.getMinSize() : fvE2.getPrefSize();
            azt_13.b(fjf_23.width);
            azt_13.a(fjf_23.height);
            azt_13.c((int)((float)n * Hw.i(f3)) + n);
            azt_13.d((int)((float)n * Hw.h(f3)) + n);
            azt_14.b(azt_13);
            if (azt_15 != null) {
                if (azt_13.d(azt_15)) {
                    azt_14.release();
                    azt_13.release();
                    azt_12.release();
                    azt_15.release();
                    return null;
                }
            } else {
                azt_15 = azt_1.a();
            }
            azt_15.e(azt_13);
            if (k == 0) {
                azt_12.e(azt_13);
            }
            f3 -= f2;
        }
        if (azt_13.d(azt_12)) {
            azt_14.release();
            azt_13.release();
            azt_12.release();
            if (azt_15 != null) {
                azt_15.release();
            }
            return null;
        }
        azt_13.release();
        azt_12.release();
        if (azt_15 != null) {
            azt_15.release();
        }
        return azt_14;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22;
        fvb_0 fvb_02 = (fvb_0)fso2;
        if (fvb_02.q.size() == 0) {
            fjf_22 = new fjf_2(0, 0);
        } else {
            ArrayList<fru_0> arrayList = fvb_02.q.get((int)fvb_02.r).b;
            int n = 40;
            azt_1 azt_12 = this.isRadiusValid(n, true, arrayList);
            while (azt_12 == null) {
                azt_12 = this.isRadiusValid(n += 5, true, arrayList);
            }
            this.b.p = n;
            fjf_22 = new fjf_2(this.b.p * 2, this.b.p * 2);
            if (this.b.q.size() > 1) {
                if (arrayList.size() > 3) {
                    fjf_22.width += this.b.s.getMinSize().width + this.b.t.getMinSize().width;
                    fjf_22.height += this.b.s.getMinSize().height + this.b.t.getMinSize().height;
                }
                fjf_22.width = Math.max(this.b.s.getMinSize().width + this.b.t.getMinSize().width, fjf_22.width);
                fjf_22.height = Math.max(this.b.s.getMinSize().height + this.b.t.getMinSize().height, fjf_22.height);
            }
        }
        return fjf_22;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22;
        fvb_0 fvb_02 = (fvb_0)fso2;
        if (fvb_02.q.size() == 0) {
            fjf_22 = new fjf_2(0, 0);
        } else {
            fjf_2 fjf_23 = fvb_02.q.get((int)0).b.get(0).getPrefSize();
            int n = fjf_23.width;
            int n2 = fjf_23.height;
            this.b.p = 40;
            int n3 = fvb_02.q.size();
            for (int k = 0; k < n3; ++k) {
                fvi fvi2 = fvb_02.q.get(k);
                ArrayList<fru_0> arrayList = fvi2.b;
                fvi2.a = 40;
                azt_1 azt_12 = this.isRadiusValid(fvi2.a, false, arrayList);
                while (azt_12 == null) {
                    fvi2.a += 5;
                    azt_12 = this.isRadiusValid(fvi2.a, false, arrayList);
                }
                fvi2.a = Math.max(fvi2.a, Math.max(azt_12.b(), azt_12.c()) / 2);
                azt_12.release();
                this.b.p = Math.max(this.b.p, fvi2.a);
            }
            fjf_22 = new fjf_2(n + this.b.p * 2, n2 + this.b.p * 2);
        }
        return fjf_22;
    }

    @Override
    public void a(fso fso2) {
        int n;
        int n2;
        if (this.b.q.size() == 0) {
            return;
        }
        fvi fvi2 = this.b.q.get(this.b.r);
        ArrayList<fru_0> arrayList = fvi2.b;
        int n3 = arrayList.size();
        float f2 = fvb_0.a(n3);
        float f3 = n3 == 8 ? 4.712389f : 1.5707964f + (float)(n3 - 1) * f2 / 2.0f;
        for (n2 = 0; n2 < n3; ++n2) {
            arrayList.get(n2).setSizeToPrefSize();
        }
        n2 = this.b.p - fvi2.a;
        if (this.b.q.size() > 1) {
            this.b.t.setVisible(true);
            this.b.t.setSizeToPrefSize();
            n = fro_0.e.a(this.b.t.getWidth(), fso2.getAppearance().getContentWidth()) - this.b.t.getWidth();
            int n4 = fro_0.e.b(this.b.t.getHeight(), fso2.getAppearance().getContentHeight());
            this.b.t.setPosition(this.b.p, this.b.p);
            this.b.t.setUsePositionTween(true);
            this.b.t.setPosition(n, n4);
            this.b.t.setUsePositionTween(false);
            this.b.s.setVisible(true);
            this.b.s.setSizeToPrefSize();
            n = fro_0.e.a(this.b.s.getWidth(), fso2.getAppearance().getContentWidth()) + this.b.s.getWidth();
            n4 = fro_0.e.b(this.b.s.getHeight(), fso2.getAppearance().getContentHeight());
            this.b.s.setPosition(this.b.p, this.b.p);
            this.b.s.setUsePositionTween(true);
            this.b.s.setPosition(n, n4);
            this.b.s.setUsePositionTween(false);
        } else {
            this.b.t.setVisible(false);
            this.b.s.setVisible(false);
        }
        for (n = 0; n < n3; ++n) {
            fvE fvE2 = arrayList.get(n);
            fvE2.setVisible(true);
            int n5 = (int)Math.round(Math.toDegrees(f3)) % 360;
            switch (n5) {
                case 0: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonEast", true);
                    break;
                }
                case -315: 
                case -300: 
                case 45: 
                case 60: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonNorthEast", true);
                    break;
                }
                case -270: 
                case 90: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonNorth", true);
                    break;
                }
                case -240: 
                case -225: 
                case 120: 
                case 135: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonNorthWest", true);
                    break;
                }
                case -180: 
                case 180: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonWest", true);
                    break;
                }
                case -135: 
                case -120: 
                case 225: 
                case 240: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonSouthWest", true);
                    break;
                }
                case -90: 
                case 270: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonSouth", true);
                    break;
                }
                case -60: 
                case -45: 
                case 300: 
                case 315: {
                    fvE2.setStyle("MRU" + this.b.getStyle() + "$buttonSouthEast", true);
                }
            }
            int n6 = (int)((double)fvi2.a * Math.cos(f3)) + fvi2.a + n2;
            int n7 = (int)((double)fvi2.a * Math.sin(f3)) + fvi2.a + n2;
            fvE2.setPosition(n6, n7);
            f3 -= f2;
        }
    }

    static {
        a = !fvb_0.class.desiredAssertionStatus();
    }
}

