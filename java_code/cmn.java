/*
 * Decompiled with CFR 0.152.
 */
public class cmn
extends Pw {
    private final long a;
    private final ft_1 b;
    private boolean c;
    private final fk_2 e;

    public cmn(long l, ft_1 ft_12, boolean bl, fk_2 fk_22) {
        this.a = l;
        this.b = ft_12;
        this.c = bl;
        this.e = fk_22;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b.getNumber());
        abx_22.a(this.c);
        abx_22.b(this.e.toByteArray());
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12907;
    }
}

