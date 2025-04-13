/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cmI
 */
public class cmi_0
extends Pw {
    private final long a;
    private final List<Long> b = new ArrayList<Long>();

    public cmi_0(long l) {
        this.a = l;
    }

    public void a(long l) {
        this.b.add(l);
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b.size());
        for (Long l : this.b) {
            abx_22.a(l);
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12618;
    }
}

