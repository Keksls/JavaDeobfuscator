/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKo
 */
public class ako_1 {
    private final String b;
    public final Class a;
    private final String c;

    public ako_1(String string, Class clazz) {
        this.b = string;
        this.a = clazz;
        int n = this.b.indexOf(46);
        this.c = n == -1 ? "" : this.b.substring(0, n);
    }

    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.c.length() == 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ako_1 ako_12 = (ako_1)object;
        if (!this.a.equals(ako_12.a)) {
            return false;
        }
        return this.b.equals(ako_12.b);
    }

    public int hashCode() {
        int n = this.b.hashCode();
        n = 31 * n + this.a.hashCode();
        return n;
    }
}

