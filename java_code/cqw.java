/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

public final class cqw
extends Pw {
    private final long a;
    private final ArrayList<bq_0> b = new ArrayList(5);
    private final ArrayList<bj_0> c = new ArrayList(5);

    public cqw(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b.size());
        for (bq_0 enum_ : this.b) {
            abx_22.a(enum_.getNumber());
        }
        abx_22.a(this.c.size());
        for (bj_0 bj_02 : this.c) {
            abx_22.a(bj_02.getNumber());
        }
        return this.a((byte)3, abx_22.c());
    }

    public void a(bq_0 bq_02) {
        this.b.add(bq_02);
    }

    public void a(Collection<bq_0> collection) {
        this.b.addAll(collection);
    }

    public void a(bj_0 bj_02) {
        this.c.add(bj_02);
    }

    public void b(Collection<bj_0> collection) {
        this.c.addAll(collection);
    }

    @Override
    public int a() {
        return 12645;
    }
}

