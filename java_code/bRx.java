/*
 * Decompiled with CFR 0.152.
 */
public class bRx
implements ajh_1 {
    private static final String a = "valueMin";
    private static final String b = "valueMax";
    private static final String d = "intervalText";
    private final int e;
    private final int f;
    private final int g;
    private final String[] h = new String[]{"valueMin", "valueMax", "intervalText"};

    public bRx(aeo_2 aeo_22, int n) {
        this.e = aeo_22.a();
        this.f = aeo_22.b();
        this.g = n;
    }

    @Override
    public String[] d() {
        return this.h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return Float.valueOf((float)this.e / (float)this.g);
        }
        if (string.equals(b)) {
            return Float.valueOf((float)this.f / (float)this.g);
        }
        if (string.equals(d)) {
            if (this.e > 100 && this.f > 100) {
                return bRy.a(this.e) + " - " + bRy.a(this.f);
            }
            return this.e + " - " + this.f;
        }
        return null;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public boolean a(int n) {
        return n <= this.f && n >= this.e;
    }

    public String toString() {
        return "interval : " + this.e + "-" + this.f;
    }
}

