/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class cmu
extends Pw {
    private final long a;
    private final Map<Integer, eci_0> b = new HashMap<Integer, eci_0>();

    public cmu(long l) {
        this.a = l;
    }

    public void a(int n, int n2) {
        if (this.b.containsKey(n)) {
            this.b.get(n).a(n2);
            return;
        }
        eci_0 eci_02 = new eci_0();
        eci_02.a(n2);
        this.b.put(n, eci_02);
    }

    public void a(int n, boolean bl) {
        if (this.b.containsKey(n)) {
            this.b.get(n).a(bl);
            return;
        }
        eci_0 eci_02 = new eci_0();
        eci_02.a(bl);
        this.b.put(n, eci_02);
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        this.b.forEach((n, eci_02) -> {
            abx_22.a((int)n);
            abx_22.b(eci_0.a(eci_02));
        });
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12804;
    }
}

