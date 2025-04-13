/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cqL
extends Pw {
    private final long a;
    private final List<Integer> b;
    private final List<Integer> c;

    @Override
    public byte[] b() {
        short s2 = (short)this.b.size();
        short s3 = (short)this.c.size();
        int n = 10 + s2 * 4 + 2 + s3 * 4;
        abx_2 abx_22 = new abx_2(n);
        abx_22.a(this.a);
        abx_22.a(s2);
        for (Integer n2 : this.b) {
            abx_22.a(n2);
        }
        abx_22.a(s3);
        for (Integer n2 : this.c) {
            abx_22.a(n2);
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12329;
    }

    public cqL(long l, List<Integer> list, List<Integer> list2) {
        this.a = l;
        this.b = list;
        this.c = list2;
    }
}

