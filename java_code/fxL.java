/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Color;
import org.apache.log4j.Logger;

public class fxL
extends fxH {
    private static Logger c = Logger.getLogger(fxL.class);
    private String d;
    private char[] e;
    private int f;
    private ayf_2 g = null;
    private ays_1 h = null;
    private Color i = null;
    private boolean j = false;
    private boolean k = false;
    private boolean l = true;
    private boolean m = true;

    public fxL() {
        this.a(fxI.b);
    }

    @Override
    public int f() {
        return this.d.length();
    }

    public String l() {
        return this.d;
    }

    public char[] m() {
        return this.e;
    }

    public void a(String string) {
        if (string != null && string.startsWith("\n")) {
            string = string.substring(1);
        }
        this.d = string;
        this.e = (char[])(string != null ? this.d.toCharArray() : null);
    }

    public fxS n() {
        return (fxS)this.a;
    }

    public ayf_2 o() {
        if (this.g == null && this.n() != null) {
            return this.n().l();
        }
        return this.g;
    }

    public void a(ayf_2 ayf_22) {
        this.g = ayf_22;
    }

    public ays_1 p() {
        return this.h;
    }

    public void a(ays_1 ays_12) {
        this.h = ays_12;
    }

    public int q() {
        return this.f;
    }

    public void e(int n) {
        this.f = n;
    }

    public Color r() {
        if (this.i == null && this.n() != null) {
            return this.n().m();
        }
        return this.i;
    }

    public void a(Color color) {
        this.i = color;
    }

    public boolean s() {
        if (this.l && this.n() != null) {
            return this.n().n();
        }
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
        this.l = false;
    }

    public boolean t() {
        if (this.m && this.n() != null) {
            return this.n().o();
        }
        return this.k;
    }

    public void b(boolean bl) {
        this.k = bl;
        this.m = false;
    }

    @Override
    public int a(ayf_2 ayf_22, int n) {
        double d2 = 0.0;
        ayf_2 ayf_23 = this.o();
        if (ayf_23 == null && ayf_22 != null) {
            ayf_23 = ayf_22;
        }
        if (ayf_23 != null) {
            String string = this.d;
            for (int k = 0; k < string.length(); ++k) {
                char c2 = string.charAt(k);
                int n2 = ayf_23.a(c2);
                if (d2 + (double)n2 >= (double)n) {
                    return k;
                }
                d2 += (double)n2;
            }
        }
        return -1;
    }

    @Override
    public int b(ayf_2 ayf_22, int n) {
        String string = this.d.substring(0, Hw.a(n, 0, this.d.length()));
        ayf_2 ayf_23 = this.o();
        if (ayf_23 == null && ayf_22 != null) {
            ayf_23 = ayf_22;
        }
        if (ayf_23 != null) {
            return ayf_23.a(string);
        }
        return 0;
    }

    @Override
    public int c(ayf_2 ayf_22, int n) {
        String string = this.d.substring(0, n);
        ayf_2 ayf_23 = this.o();
        if (ayf_23 == null && ayf_22 != null) {
            ayf_23 = ayf_22;
        }
        if (ayf_23 != null) {
            return ayf_23.a(string);
        }
        return 0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public /* synthetic */ fxQ h() {
        return this.n();
    }
}

