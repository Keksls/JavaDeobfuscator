/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from clC
 */
public class clc_1
extends Pw {
    private final Set<Integer> a = new HashSet<Integer>();
    private boolean b = true;

    public void b(int n) {
        this.a.add(n);
    }

    public void a(Collection<Integer> collection) {
        this.a.addAll(collection);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(5 + this.a.size() * 4);
        abx_22.a(this.b);
        abx_22.a(this.a.size());
        this.a.forEach(abx_22::a);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12888;
    }
}

