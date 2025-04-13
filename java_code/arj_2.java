/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arj
 */
public class arj_2
implements arh_2 {
    private int b = 0;
    private CharSequence c = null;

    public arj_2(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public char d() {
        if (this.b < this.c.length()) {
            return this.c.charAt(this.b++);
        }
        return '\uffff';
    }

    @Override
    public char e() {
        if (this.b < this.c.length()) {
            return this.c.charAt(this.b);
        }
        return '\u0000';
    }

    @Override
    public String a(int n, int n2) {
        if (n >= 0 && n <= this.c.length() && n2 >= 1 && n2 <= this.c.length() && n < n2) {
            return this.c.subSequence(n, n2).toString();
        }
        return null;
    }

    @Override
    public boolean c() {
        return this.b < this.c.length();
    }

    @Override
    public void a(int n) {
        this.b = n;
    }

    @Override
    public ari_2 f() {
        return null;
    }

    @Override
    public int b() {
        return this.c.length();
    }

    @Override
    public boolean b(int n) {
        if (this.b + n >= 0 && this.b + n < this.c.length()) {
            this.b += n;
            return true;
        }
        return false;
    }

    @Override
    public char c(int n) {
        return this.c.charAt(n);
    }
}

