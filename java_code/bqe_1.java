/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQe
 */
public class bqe_1
extends bpx_0 {
    protected final int q;

    public bqe_1(evp_1 evp_12, fiy_0 fiy_02) {
        this.q = evp_12.m();
        for (byte by = 0; by < evp_12.e(); by = (byte)(by + 1)) {
            evq_1 evq_12 = evp_12.b(by);
            fiv_0 fiv_02 = fiy_02.a(evq_12.a());
            if (fiv_02 != null) {
                this.n.add(new bpz_0(evq_12, by, fiv_02));
                continue;
            }
            this.n.add(new bpz_0(evq_12, by));
        }
        this.o = (bpy_0)this.n.get(0);
    }

    @Override
    protected String f() {
        return bae.h().a(104, (long)this.q, new Object[0]);
    }

    @Override
    protected fjf_2 g() {
        return new fjf_2(200, 120);
    }

    @Override
    protected int h() {
        return 5;
    }

    @Override
    protected int i() {
        return 3;
    }

    @Override
    protected boolean j() {
        return false;
    }

    @Override
    protected boolean k() {
        return false;
    }

    @Override
    protected boolean l() {
        return false;
    }

    @Override
    protected ajf_1 m() {
        return null;
    }

    @Override
    public int n() {
        return this.n.size();
    }

    @Override
    public void b(long l) {
    }

    @Override
    public void c(long l) {
    }
}

