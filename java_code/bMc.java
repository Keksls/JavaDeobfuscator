/*
 * Decompiled with CFR 0.152.
 */
class bMc
implements Runnable {
    private final apl_1 a;
    private final biE b;

    bMc(apl_1 apl_12, biE biE2) {
        this.a = apl_12;
        this.b = biE2;
    }

    @Override
    public void run() {
        this.b.a(this.a, false);
    }

    public String toString() {
        return "PetPathRunnable{m_petPath=" + this.a + "}";
    }
}

