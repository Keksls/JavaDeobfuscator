/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from cow
 */
public class cow_0
extends Pw {
    private List<Ow> a;
    private xz_0 b;

    public void a(List<Ow> list) {
        this.a = list;
    }

    public void a(xz_0 xz_02) {
        this.b = xz_02;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(Ow.a(this.a));
        abx_22.a((byte)this.b.a());
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13551;
    }
}

