/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQf
 */
public class bqf_1
implements ewb_2 {
    private final ArrayList<eru_1> a = new ArrayList();
    private short b;

    public void a(eru_1 eru_12) {
        this.a.add(eru_12);
        this.b = (short)(this.b + eru_12.b());
    }

    public void a() {
        this.a.clear();
        this.b = 0;
    }

    public ArrayList<eru_1> b() {
        return this.a;
    }

    public boolean c() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            eru_1 eru_12 = this.a.get(k);
            if (!eru_12.f()) continue;
            return true;
        }
        return false;
    }

    public short d() {
        return this.b;
    }

    @Override
    public boolean e() {
        return true;
    }

    eru_1 a(byte by) {
        int n = 0;
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            eru_1 eru_12 = this.a.get(k);
            if (by >= (n += eru_12.b())) continue;
            return eru_12;
        }
        return null;
    }

    byte b(byte by) {
        int n = 0;
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            eru_1 eru_12 = this.a.get(k);
            if (by < n + eru_12.b()) {
                return Hw.b((long)(by - n));
            }
            n += eru_12.b();
        }
        return -1;
    }

    byte f() {
        short s2 = 0;
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            eru_1 eru_12 = this.a.get(k);
            for (byte by = 0; by < eru_12.b(); by = (byte)(by + 1)) {
                if (eru_12.c(by) != null) continue;
                return Hw.b((long)(by + s2));
            }
            s2 = (byte)(s2 + eru_12.b());
        }
        return -1;
    }

    byte a(exk_2 exk_22, short s2) {
        short s3 = 0;
        byte by = -1;
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            eru_1 eru_12 = this.a.get(k);
            for (byte by2 = 0; by2 < eru_12.b(); by2 = (byte)(by2 + 1)) {
                exk_2 exk_23 = eru_12.c(by2);
                byte by3 = Hw.b((long)(by2 + s3));
                if (exk_23 != null) {
                    if (!exk_23.a(exk_22) || exk_23.aR_() == exk_23.e()) continue;
                    if (exk_23.e() + s2 <= exk_23.aR_()) {
                        return by3;
                    }
                    by = by3;
                    continue;
                }
                if (by != -1) continue;
                by = by3;
            }
            s3 = (byte)(s3 + eru_12.b());
        }
        return by;
    }

    @Override
    public boolean a(exk_2 exk_22) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            if (!this.a.get(k).a(exk_22)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(exk_2 exk_22) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            if (!this.a.get(k).b(exk_22)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(exk_2 exk_22, byte by) {
        eru_1 eru_12 = this.a(by);
        byte by2 = this.b(by);
        return eru_12.a(exk_22, by2);
    }

    @Override
    public boolean b(exk_2 exk_22, byte by) {
        eru_1 eru_12 = this.a(by);
        byte by2 = this.b(by);
        return eru_12.b(exk_22, by2);
    }

    @Override
    @Nullable
    public exk_2 a(long l) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            exk_2 exk_22 = this.a.get(k).a(l);
            if (exk_22 == null) continue;
            return exk_22;
        }
        return null;
    }

    @Override
    @Nullable
    public exk_2 c(byte by) {
        eru_1 eru_12 = this.a(by);
        byte by2 = this.b(by);
        return eru_12.c(by2);
    }

    @Override
    public byte b(long l) {
        byte by = 0;
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            eru_1 eru_12 = this.a.get(k);
            byte by2 = eru_12.b(l);
            if (by2 != -1) {
                return Hw.b((long)(by + by2));
            }
            by = (byte)(by + eru_12.b());
        }
        return -1;
    }

    @Override
    public boolean a(long l, short s2) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            if (!this.a.get(k).a(l, s2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean c(exk_2 exk_22) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            if (!this.a.get(k).c(exk_22)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(long l, short s2) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            if (!this.a.get(k).b(l, s2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean d(exk_2 exk_22) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            if (!this.a.get(k).d(exk_22)) continue;
            return true;
        }
        return false;
    }
}

