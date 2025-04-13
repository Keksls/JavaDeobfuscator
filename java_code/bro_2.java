/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRo
 */
public class bro_2 {
    private final int a;
    private final int b;
    private final String c;

    public bro_2(int n, int n2, String string) {
        this.a = n;
        this.b = n2;
        this.c = string;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bro_2)) {
            return false;
        }
        bro_2 bro_22 = (bro_2)object;
        if (!bro_22.a(this)) {
            return false;
        }
        if (this.a() != bro_22.a()) {
            return false;
        }
        if (this.b() != bro_22.b()) {
            return false;
        }
        String string = this.c();
        String string2 = bro_22.c();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    protected boolean a(Object object) {
        return object instanceof bro_2;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.a();
        n2 = n2 * 59 + this.b();
        String string = this.c();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public String toString() {
        return "GuideElement(m_id=" + this.a() + ", m_index=" + this.b() + ", m_iconName=" + this.c() + ")";
    }
}

