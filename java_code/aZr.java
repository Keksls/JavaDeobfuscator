/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aZr {
    public static final int a = 10;
    private short b;
    private int c;
    private int d;
    private int e;
    private final ArrayList<bNK> f = new ArrayList();

    public boolean a(bNK bNK2) {
        if (this.c == 0) {
            return true;
        }
        int n = bNK2.G();
        int n2 = bNK2.H();
        for (int k = this.f.size() - 1; k >= 0; --k) {
            bNK bNK3 = this.f.get(k);
            float f2 = afq_2.c(n - bNK3.G(), n2 - bNK3.H());
            if (!(f2 <= 10.0f)) continue;
            return true;
        }
        return false;
    }

    public void b(bNK bNK2) {
        ++this.c;
        this.f.add(bNK2);
        int n = bNK2.G();
        int n2 = bNK2.H();
        if (this.c == 1) {
            this.d = n;
            this.e = n2;
            this.b = bNK2.aR().j();
            return;
        }
        int n3 = n - this.d;
        int n4 = n - this.e;
        this.d += n3 / this.c;
        this.e += n4 / this.c;
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

    public ArrayList<bNK> e() {
        return this.f;
    }
}

