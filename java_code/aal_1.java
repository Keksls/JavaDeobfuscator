/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aAL
 */
public class aal_1 {
    private static final float a = 1.0E-6f;
    private final ArrayList<aam_1> b = new ArrayList(8);

    public aal_1(float f2, float f3) {
        this.b.add(new aam_1(f2, f3));
    }

    public void a(float f2, float f3) {
        this.b.clear();
        this.b.add(new aam_1(f2, f3));
    }

    public void a(int n, float f2, float f3) {
        this.b.add(n, new aam_1(f2, f3));
    }

    public void b(float f2, float f3) {
        if (f2 > (float)Math.PI * 2) {
            this.b(f2 - (float)Math.PI * 2, f3 - (float)Math.PI * 2);
        } else if (f3 < 0.0f) {
            this.b(f2 + (float)Math.PI * 2, f3 + (float)Math.PI * 2);
        } else if (f2 < 0.0f) {
            this.b(0.0f, f3);
            this.b(f2 + (float)Math.PI * 2, (float)Math.PI * 2);
        } else if (f3 > (float)Math.PI * 2) {
            this.b(f2, (float)Math.PI * 2);
            this.b(0.0f, f3 - (float)Math.PI * 2);
        } else if (this.b.size() != 0) {
            int n;
            if (f2 < this.b.get((int)0).a) {
                n = -1;
            } else {
                int n2 = 0;
                int n3 = 0;
                int n4 = this.b.size();
                while (n2 < n4 - 1) {
                    n3 = n2 + n4 >> 1;
                    if (this.b.get((int)n3).a < f2) {
                        n2 = n3;
                        continue;
                    }
                    n4 = n3;
                }
                n = n2;
            }
            if (n == -1) {
                n = 0;
            } else if (f2 < this.b.get((int)n).b) {
                float f4 = this.b.get((int)n).a;
                float f5 = this.b.get((int)n).b;
                if (f2 - f4 < 1.0E-6f) {
                    if (f3 < f5) {
                        this.b.get((int)n).a = f3;
                    } else {
                        this.b.remove(n);
                    }
                } else {
                    this.b.get((int)n).b = f2;
                    if (f3 < f5) {
                        this.a(n + 1, f3, f5);
                    }
                    ++n;
                }
            } else if (n < this.b.size() - 1 && f3 > this.b.get((int)(n + 1)).a) {
                ++n;
            } else {
                return;
            }
            while (n < this.b.size() && f3 > this.b.get((int)n).a) {
                if (this.b.get((int)n).b - f3 < 1.0E-6f) {
                    this.b.remove(n);
                    continue;
                }
                this.b.get((int)n).a = f3;
            }
        }
    }

    public ArrayList<aam_1> a() {
        return this.b;
    }
}

