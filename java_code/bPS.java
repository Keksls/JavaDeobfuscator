/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class bPS {
    private long a = 0L;
    private final Map<Integer, Integer> b = new HashMap<Integer, Integer>();

    public void a(int n, int n2) {
        this.b.merge(n, n2, Integer::sum);
    }

    public void a(long l) {
        this.a += l;
    }

    public long a() {
        return this.a;
    }

    public Map<Integer, Integer> b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bPS)) {
            return false;
        }
        bPS bPS2 = (bPS)object;
        if (!bPS2.a(this)) {
            return false;
        }
        if (this.a() != bPS2.a()) {
            return false;
        }
        Map<Integer, Integer> map = this.b();
        Map<Integer, Integer> map2 = bPS2.b();
        return !(map == null ? map2 != null : !((Object)map).equals(map2));
    }

    protected boolean a(Object object) {
        return object instanceof bPS;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        long l = this.a();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        Map<Integer, Integer> map = this.b();
        n2 = n2 * 59 + (map == null ? 43 : ((Object)map).hashCode());
        return n2;
    }

    public void b(long l) {
        this.a = l;
    }
}

