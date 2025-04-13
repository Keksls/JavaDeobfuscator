/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZf
 */
class czf_0
implements ftm {
    final /* synthetic */ fvE a;
    final /* synthetic */ fvE b;
    final /* synthetic */ czd_0 c;

    czf_0(czd_0 czd_02, fvE fvE2, fvE fvE3) {
        this.c = czd_02;
        this.a = fvE2;
        this.b = fvE3;
    }

    @Override
    public void a(byte by) {
        switch (by) {
            case 0: {
                this.a.setVisible(false);
                break;
            }
            case 2: {
                this.b.setVisible(false);
                break;
            }
            case 1: {
                this.a.setVisible(true);
                this.b.setVisible(true);
            }
        }
    }

    @Override
    public void b(byte by) {
    }
}

