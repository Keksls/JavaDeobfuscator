/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQQ
 */
public class bqq_0
extends bqp_0 {
    public bqq_0() {
        super(new fjD(10001, -1));
    }

    public void b(bqs_0 bqs_02) {
        this.e.remove(bqs_02);
        this.e.sort(bqr_0.a);
    }

    public void e() {
        this.e.clear();
    }

    @Override
    public Object b(String string) {
        if (string.equals("island")) {
            return bae.h().c("zaap.categories.favourite");
        }
        if (string.equals("links")) {
            return this.c();
        }
        return null;
    }
}

