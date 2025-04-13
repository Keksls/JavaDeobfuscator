/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aZo {
    public static final int a = 40;
    private int b;
    private int c;
    private int d;
    private int e;
    private final ArrayList<blx_1> f = new ArrayList();

    public boolean a(blx_1 blx_12) {
        if (this.c == 0) {
            return true;
        }
        aff_1 aff_12 = blx_12.gg();
        float f2 = afq_2.c(aff_12.d() - this.d, aff_12.e() - this.e);
        return f2 <= 40.0f;
    }

    public void b(blx_1 blx_12) {
        ++this.c;
        this.f.add(blx_12);
        aff_1 aff_12 = blx_12.gg();
        if (this.c == 1) {
            this.d = aff_12.d();
            this.e = aff_12.e();
            this.b = blx_12.Z_().t();
            return;
        }
        int n = aff_12.d() - this.d;
        int n2 = aff_12.e() - this.e;
        this.d += n / this.c;
        this.e += n2 / this.c;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public ArrayList<blx_1> e() {
        return this.f;
    }
}

