/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYk
 */
class cyk_0
implements Runnable {
    private int b;
    final /* synthetic */ cYe a;

    cyk_0(cYe cYe2) {
        this.a = cYe2;
    }

    @Override
    public void run() {
        ++this.b;
        if (this.a.c != null) {
            this.a.c.a(cYe.a(this.b));
        }
    }

    public String toString() {
        return "DungeonTimer{m_secondsCount=" + this.b + "}" + super.toString();
    }
}

