/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bsj
 */
public class bsj_1
implements bkj_1 {
    private static final bsj_1 b = new bsj_1();
    private final aei_0 c = new bsk_1(this);
    private byte d = 0;
    private int e = 0;
    private bsx_2 f;

    private bsj_1() {
    }

    public static bsj_1 c() {
        return b;
    }

    public void a(biE biE2) {
        switch (this.d) {
            case 1: {
                assert (this.f != null);
                this.b(biE2);
                break;
            }
            case -1: {
                assert (this.f == null);
                this.b();
            }
        }
        this.d = 0;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        aed.a.b(this.c);
        aNM.a(this.e);
    }

    public void a(bsx_2 bsx_22) {
        assert (bsx_22 != null);
        this.d = 1;
        this.f = bsx_22;
    }

    public void d() {
        this.d = (byte)-1;
        this.f = null;
    }

    private void b(biE biE2) {
        if (this.f != null) {
            this.a();
        }
    }
}

