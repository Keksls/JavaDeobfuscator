/*
 * Decompiled with CFR 0.152.
 */
public class bVq
extends bVn {
    public static final String a = "territoriesCount";
    public static final String b = "territoriesRatio";
    public static final String d = "territoriesRatioPerc";
    public static final String[] e = new String[]{"territoriesCount", "territoriesRatio", "territoriesRatioPerc"};
    private int f;

    public bVq(int n) {
        super(n);
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return Float.valueOf(this.h());
        }
        if (string.equals(d)) {
            int n = this.f - this.a();
            float f2 = (n == 0 ? (float)this.b() / 2.0f : (float)n + (float)this.a() / 2.0f) / (float)bUW.a().f() * 100.0f;
            return new fjv_1(f2);
        }
        return super.b(string);
    }

    private float h() {
        return (float)this.f / (float)bUW.a().f();
    }

    public int a() {
        return bUW.a().b(this.t);
    }

    public void a(int n) {
        this.f = n;
    }

    public int b() {
        return this.f;
    }
}

