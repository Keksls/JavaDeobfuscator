/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class cmo
extends Pw {
    private final ft_1 a;
    private final Set<Integer> b;

    public cmo(ft_1 ft_12, Set<Integer> set) {
        this.b = set;
        this.a = ft_12;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.getNumber());
        abx_22.a(this.b.size());
        for (int n : this.b) {
            abx_22.a(n);
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12725;
    }
}

