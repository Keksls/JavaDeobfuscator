/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNb
 */
public final class anb_2
extends amq_2 {
    private boolean d;
    private add_2 e;

    @Override
    public void d() {
        this.e = add_2.b();
        this.d = true;
    }

    @Override
    public void f() {
        this.e.c();
    }

    @Override
    public void g() {
    }

    @Override
    public void h() {
    }

    @Override
    public boolean i() {
        return this.e.j();
    }

    @Override
    public boolean j() {
        return this.d;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void a(aqv_2 aqv_22) {
    }

    public String toString() {
        return "WorkerTask{m_initialized=" + this.d + ", m_worker=" + this.e.j() + "}";
    }
}

