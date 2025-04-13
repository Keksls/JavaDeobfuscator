/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fuA
 */
class fua_0
extends fig_2 {
    final /* synthetic */ fut_0 a;

    fua_0(fut_0 fut_02) {
        this.a = fut_02;
    }

    public boolean a() {
        return false;
    }

    private int a(boolean bl, boolean bl2) {
        int n = 0;
        if (bl2) {
            for (ftI ftI2 : this.a.w) {
                n = Math.max(bl ? ftI2.getMinSize().width : ftI2.getMinSize().height, n);
            }
        } else {
            for (ftI ftI3 : this.a.w) {
                n = Math.max(bl ? ftI3.getPrefSize().width : ftI3.getPrefSize().height, n);
            }
        }
        return n;
    }

    private int a(Iterable<ftI> iterable, boolean bl, boolean bl2) {
        int n = 0;
        if (bl2) {
            for (ftI ftI2 : iterable) {
                n += bl ? ftI2.getMinSize().width : ftI2.getMinSize().height;
            }
        } else {
            for (ftI ftI3 : iterable) {
                n += bl ? ftI3.getPrefSize().width : ftI3.getPrefSize().height;
            }
        }
        return n;
    }

    private boolean a(ArrayList<ftI> arrayList, int n, int n2, boolean bl) {
        this.a.A.invalidateMinSize();
        ftI ftI2 = null;
        int n3 = 0;
        int n4 = 0;
        for (ftI ftI3 : arrayList) {
            int n5 = bl ? ftI3.getPrefSize().width : ftI3.getPrefSize().height;
            fin_1 fin_12 = this.a.v.get(ftI3);
            if (n3 < n || n4 > n2) {
                ftI3.setVisible(false);
            } else {
                ftI3.setVisible(fin_12.isVisible());
                if ((n4 += n5) > n2) {
                    ftI2 = ftI3;
                }
            }
            ++n3;
        }
        if (this.a.K != null) {
            if (ftI2 != null && ftI2 == this.a.K) {
                this.a.P = Math.min(this.a.w.size() - 1, this.a.P + 1);
                return this.a(arrayList, this.a.P, n2, bl);
            }
            this.a.K = null;
        }
        return n4 <= n2;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22 = new fjf_2();
        ArrayList<ftI> arrayList = this.a.w;
        switch (this.a.E) {
            case a: 
            case b: {
                if (!arrayList.isEmpty()) {
                    fjf_22.a(arrayList.get((int)0).getMinSize().height);
                }
                fjf_22.b(Math.min(this.a(true, true), this.a(arrayList, true, true)));
                break;
            }
            case d: 
            case c: {
                if (!arrayList.isEmpty()) {
                    fjf_22.b(arrayList.get((int)0).getMinSize().width);
                }
                fjf_22.a(Math.min(this.a(false, true), this.a(arrayList, false, true)));
            }
        }
        return fjf_22;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = new fjf_2();
        ArrayList<ftI> arrayList = this.a.w;
        switch (this.a.E) {
            case a: 
            case b: {
                if (!arrayList.isEmpty()) {
                    fjf_22.a(arrayList.get((int)0).getPrefSize().height);
                }
                fjf_22.b(Math.min(this.a(true, false), this.a(arrayList, true, false)));
                break;
            }
            case d: 
            case c: {
                if (!arrayList.isEmpty()) {
                    fjf_22.b(arrayList.get((int)0).getPrefSize().width);
                }
                fjf_22.a(Math.min(this.a(false, false), this.a(arrayList, false, false)));
            }
        }
        return fjf_22;
    }

    @Override
    public void a(fso fso2) {
        this.a.D = 0.0;
        int n = this.a.m_appearance.getContentWidth();
        int n2 = this.a.m_appearance.getContentHeight();
        ArrayList<ftI> arrayList = this.a.getVisibleTabs();
        this.a.N.setSize(this.a.N.getPrefSize());
        this.a.O.setSize(this.a.O.getPrefSize());
        switch (this.a.E) {
            case a: 
            case b: {
                this.a.Q = n < this.a(arrayList, true, false);
                break;
            }
            case d: 
            case c: {
                boolean bl = this.a.Q = n2 < this.a(arrayList, false, false);
            }
        }
        if (this.a.Q) {
            this.a.N.setVisible(true);
            this.a.O.setVisible(true);
        } else {
            this.a.N.setVisible(false);
            this.a.O.setVisible(false);
        }
        boolean bl = true;
        switch (this.a.E) {
            case a: 
            case b: {
                fin_1 fin_12;
                if (this.a.Q) {
                    bl = this.a(this.a.getVisibleTabs(), this.a.P, n - this.a.N.getWidth() - this.a.O.getHeight(), true);
                } else {
                    for (ftI ftI2 : this.a.w) {
                        fin_12 = this.a.v.get(ftI2);
                        ftI2.setVisible(fin_12.isVisible());
                    }
                }
                this.a.A.setSize((int)this.a.A.getPrefSize().getWidth(), (int)this.a.A.getPrefSize().getHeight());
                this.a.C.setSize(n - (this.a.Q ? this.a.N.getWidth() + this.a.O.getHeight() : 0), (int)this.a.A.getPrefSize().getHeight());
                this.a.y.setSize(n, this.a.A.getHeight());
                this.a.z.setSize(n, (int)this.a.z.getPrefSize().getHeight());
                if (this.a.x == null) break;
                this.a.x.setSize(n, n2 - this.a.A.getHeight() - this.a.z.getHeight());
                break;
            }
            case d: 
            case c: {
                fin_1 fin_12;
                if (this.a.Q) {
                    bl = this.a(this.a.w, this.a.P, n2 - this.a.N.getHeight() - this.a.O.getHeight(), false);
                } else {
                    for (ftI ftI2 : this.a.w) {
                        fin_12 = this.a.v.get(ftI2);
                        ftI2.setVisible(fin_12.isVisible());
                    }
                }
                this.a.A.setSize((int)this.a.A.getPrefSize().getWidth(), (int)this.a.A.getPrefSize().getHeight());
                this.a.C.setSize((int)this.a.A.getPrefSize().getWidth(), n2 - (this.a.Q ? this.a.N.getHeight() + this.a.O.getHeight() : 0));
                this.a.y.setSize(this.a.A.getWidth(), n2);
                this.a.z.setSize((int)this.a.z.getPrefSize().getWidth(), n2);
                if (this.a.x == null) break;
                this.a.x.setSize(n - this.a.A.getWidth() - this.a.z.getWidth(), n2);
            }
        }
        this.a.N.setEnabled(!bl);
        this.a.O.setEnabled(this.a.P != 0);
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        switch (this.a.E) {
            case a: {
                n5 = n3 = this.a.T;
                n7 = n3;
                n6 = n4 = this.a.m_appearance.getContentHeight() - this.a.A.getHeight() + this.a.U;
                n14 = n4;
                n12 = n4;
                n8 = n4 - this.a.z.getHeight();
                if (this.a.Q) {
                    if (this.a.M) {
                        if (this.a.L) {
                            n13 = n3;
                            n11 = n13 + this.a.O.getWidth();
                            n3 += this.a.O.getWidth() + this.a.N.getWidth();
                        } else {
                            n11 = this.a.m_appearance.getContentWidth() - this.a.N.getWidth();
                            n13 = n11 - this.a.O.getWidth();
                        }
                    } else {
                        n13 = n3;
                        n3 += this.a.O.getWidth();
                        n11 = this.a.m_appearance.getContentWidth() - this.a.N.getWidth();
                    }
                } else if (this.a.F.equals((Object)fro_0.e)) {
                    n3 += (n - this.a.A.getWidth()) / 2;
                } else if (!this.a.F.equals((Object)fro_0.d)) {
                    n3 += n - this.a.A.getWidth();
                }
                n9 = 0;
                n10 = 0;
                break;
            }
            case b: {
                n5 = n3 = this.a.T;
                n7 = n3;
                n6 = n4 = this.a.U;
                n14 = n4;
                n12 = n4;
                n8 = n4 + this.a.A.getHeight();
                if (this.a.Q) {
                    if (this.a.M) {
                        if (this.a.L) {
                            n13 = n3;
                            n11 = n13 + this.a.O.getWidth();
                            n3 += this.a.O.getWidth() + this.a.N.getWidth();
                        } else {
                            n11 = this.a.m_appearance.getContentWidth() - this.a.N.getWidth();
                            n13 = n11 - this.a.O.getWidth();
                        }
                    } else {
                        n13 = n3;
                        n3 += this.a.O.getWidth();
                        n11 = this.a.m_appearance.getContentWidth() - this.a.N.getWidth();
                    }
                } else if (this.a.F.equals((Object)fro_0.e)) {
                    n3 += (n - this.a.A.getWidth()) / 2;
                } else if (!this.a.F.equals((Object)fro_0.d)) {
                    n3 += n - this.a.A.getWidth();
                }
                n9 = 0;
                n10 = n8 + this.a.z.getHeight();
                break;
            }
            case c: {
                n5 = n3 = this.a.m_appearance.getContentWidth() - this.a.A.getWidth() + this.a.T;
                n13 = n3;
                n11 = n3;
                n6 = n4 = this.a.U;
                n8 = n4;
                n7 = n3 - this.a.z.getWidth();
                if (this.a.Q) {
                    if (this.a.M) {
                        if (this.a.L) {
                            n14 = this.a.m_appearance.getContentHeight() - this.a.O.getHeight();
                            n12 = n14 - this.a.N.getHeight();
                        } else {
                            n12 = n4;
                            n14 = this.a.N.getWidth();
                            n4 += this.a.O.getHeight() + this.a.N.getHeight();
                        }
                    } else {
                        n12 = n4;
                        n4 += this.a.N.getHeight();
                        n14 = this.a.m_appearance.getContentHeight() - this.a.O.getWidth();
                    }
                    this.a.C.setLocation(n3, n4);
                    this.a.D = (double)this.a.A.getHeight() - this.a.C.getHeight();
                    n4 = (int)((double)n4 - this.a.D);
                } else if (this.a.F.equals((Object)fro_0.e)) {
                    n4 += (n2 - this.a.A.getHeight()) / 2;
                } else if (!this.a.F.equals((Object)fro_0.b)) {
                    n4 += n2 - this.a.A.getHeight();
                }
                n9 = 0;
                n10 = 0;
                break;
            }
            case d: {
                n5 = n3 = this.a.T;
                n13 = n3;
                n11 = n3;
                n6 = n4 = this.a.U;
                n8 = n4;
                n7 = n3 + this.a.A.getWidth();
                if (this.a.Q) {
                    if (this.a.M) {
                        if (this.a.L) {
                            n14 = this.a.m_appearance.getContentHeight() - this.a.O.getHeight();
                            n12 = n14 - this.a.N.getHeight();
                        } else {
                            n12 = n4;
                            n14 = this.a.N.getWidth();
                            n4 += this.a.O.getHeight() + this.a.N.getHeight();
                        }
                    } else {
                        n12 = n4;
                        n4 += this.a.N.getHeight();
                        n14 = this.a.m_appearance.getContentHeight() - this.a.O.getWidth();
                    }
                    this.a.C.setLocation(n3, n4);
                    this.a.D = (double)this.a.A.getHeight() - this.a.C.getHeight();
                    n4 = (int)((double)n4 - this.a.D);
                } else if (this.a.F.equals((Object)fro_0.e)) {
                    n4 += (n2 - this.a.A.getHeight()) / 2;
                } else if (!this.a.F.equals((Object)fro_0.b)) {
                    n4 += n2 - this.a.A.getHeight();
                }
                n9 = n7 + this.a.z.getWidth();
                n10 = 0;
            }
        }
        this.a.A.setPosition(n3, n4);
        this.a.y.setPosition(n5, n6);
        this.a.z.setPosition(n7, n8);
        this.a.N.setPosition(n11, n12);
        this.a.O.setPosition(n13, n14);
        if (this.a.x != null) {
            this.a.x.setPosition(n9, n10);
        }
    }
}

