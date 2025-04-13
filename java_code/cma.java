/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cma
extends Pw {
    private final long a;
    private final List<eBm> b;

    public cma(long l, List<eBm> list) {
        this.a = l;
        this.b = list;
    }

    @Override
    public byte[] b() {
        int n = this.b.stream().mapToInt(eBm::a).sum();
        abx_2 abx_22 = new abx_2(10 + n);
        abx_22.a(this.a);
        abx_22.a((short)this.b.size());
        this.b.forEach(eBm2 -> eBm2.a(abx_22));
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12822;
    }
}

