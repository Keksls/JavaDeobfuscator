/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDF
 */
class adf_2
extends Thread {
    protected boolean a;

    adf_2(Runnable runnable, String string) {
        super(runnable, string);
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public String toString() {
        return "WorkerThread{m_running=" + this.a + "}";
    }
}

