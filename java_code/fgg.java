/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class fgg
extends ffy_0 {
    private final Map<Integer, wx_0> h = new HashMap<Integer, wx_0>();
    private final Set<Integer> i = new HashSet<Integer>();
    private final Map<Integer, fgf> j = new HashMap<Integer, fgf>();
    private final int k;

    public fgg(int n, int n2, int n3, int n4, long l, long l2, byte by, short s2, short s3) {
        super(n, n2, n4, l, l2, by, s2, s3);
        this.k = n3;
    }

    public void a(int n, wx_0 wx_02) {
        this.h.put(n, wx_02);
    }

    @Override
    public boolean f(int n) {
        return this.h.containsKey(n);
    }

    @Override
    public wx_0 g(int n) {
        return this.h.get(n);
    }

    public boolean i(int n) {
        return this.i.add(n);
    }

    public void a(int n2, int n3, int n4) {
        fgf fgf2 = this.j.computeIfAbsent(n2, n -> new fgf());
        fgf2.a(n3, new azf_2(n4));
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public int n() {
        return this.k;
    }

    @Override
    public fgf h(int n) {
        return this.j.get(n);
    }

    @Override
    public boolean d(int n) {
        return this.i.contains(n);
    }

    @Override
    public boolean e(int n) {
        return this.j.containsKey(n);
    }

    public String toString() {
        return "PetDefinitionImpl{m_id=" + this.a + "}";
    }

    @Override
    public int[] l() {
        return this.i.stream().mapToInt(n -> n).toArray();
    }

    @Override
    public int[] m() {
        return this.j.keySet().stream().mapToInt(n -> n).toArray();
    }
}

