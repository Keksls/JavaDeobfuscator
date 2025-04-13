/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDC
 */
class cdc_0
implements Runnable {
    private static final byte b = 0;
    private static final byte c = 1;
    private static final byte d = 2;
    private final byte e;
    private final float f;
    private final float g;
    private final int h;
    private int i;
    float j;
    final /* synthetic */ cdw_0 a;

    cdc_0(cdw_0 cdw_02, byte by, float f2, float f3, int n) {
        this.a = cdw_02;
        this.e = by;
        this.f = f2;
        this.g = f3;
        this.h = n;
    }

    @Override
    public void run() {
        this.j = Hw.a(this.f, this.g, (float)(++this.i) / (float)this.h);
        switch (this.e) {
            case 0: {
                cdl_0.a.c().c(this.j);
                cdl_0.a.b().c(this.j);
                cdl_0.a.d().c(this.j);
                break;
            }
            case 1: {
                cdl_0.b.b().c(this.j);
                cdl_0.b.c().c(this.j);
                cdl_0.b.d().c(this.j);
                cdl_0.c.d().c(this.j);
                cdl_0.g.c().c(this.j);
                cdl_0.g.d().c(this.j);
                cdl_0.d.c().c(this.j);
                cdl_0.d.d().c(this.j);
                cdl_0.f.c().c(this.j);
                cdl_0.f.d().c(this.j);
                cdl_0.i.c().c(this.j);
                cdl_0.i.d().c(this.j);
                cdl_0.h.c().c(this.j);
                cdl_0.h.d().c(this.j);
                break;
            }
            case 2: {
                cdl_0.e.c().c(this.j);
            }
        }
        if (this.i == this.h) {
            switch (this.e) {
                case 0: {
                    this.a.ci = null;
                    break;
                }
                case 1: {
                    this.a.cj = null;
                    break;
                }
                case 2: {
                    this.a.ck = null;
                }
            }
        }
    }
}

