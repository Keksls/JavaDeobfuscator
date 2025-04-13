/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRk
 */
public class brk_2
implements ajh_1 {
    private static final String f = "tutorialType";
    public static final String a = "imageUrl";
    public static final String b = "title";
    public static final String d = "description";
    public static final String e = "style";
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private int k = -1;

    public brk_2(String string, String string2, String string3, int n, int n2) {
        this(string, string2, string3, n);
        this.k = n2;
    }

    public brk_2(String string, String string2, String string3, int n) {
        this.g = string;
        this.h = string2;
        this.i = string3;
        this.j = n;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.g == null) {
                return null;
            }
            return azs_0.a().w(this.g);
        }
        if (string.equals(b)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.i;
        }
        if (string.equals(e)) {
            switch (this.j) {
                case 1: {
                    return f + this.j;
                }
            }
            return null;
        }
        return null;
    }

    public String a() {
        return this.h;
    }

    public int b() {
        return this.k;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof brk_2)) {
            return false;
        }
        brk_2 brk_22 = (brk_2)object;
        if (this.k != brk_22.k) {
            return false;
        }
        if (this.j != brk_22.j) {
            return false;
        }
        if (!this.i.equals(brk_22.i)) {
            return false;
        }
        if (this.g != null && !this.g.equals(brk_22.g)) {
            return false;
        }
        return this.h.equals(brk_22.h);
    }

    public int hashCode() {
        return 0;
    }
}

