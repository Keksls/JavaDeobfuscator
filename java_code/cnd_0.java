/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cnD
 */
public final class cnd_0
extends Pw {
    private final long a;
    private final ArrayList<abo_2<Long, Short>> b = new ArrayList();

    public cnd_0(long l) {
        this.a = l;
    }

    public void a(long l, short s2) {
        this.b.add(new abo_2<Long, Short>(l, s2));
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        for (abo_2<Long, Short> abo_22 : this.b) {
            abx_22.a(abo_22.a());
            abx_22.a(abo_22.b());
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12622;
    }
}

