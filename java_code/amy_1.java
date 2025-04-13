/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

/*
 * Renamed from aMy
 */
public class amy_1
implements amx_1 {
    private are_1 a;
    private final File b;
    private final int c;

    public amy_1(File file) {
        this(file, -1);
    }

    public amy_1(File file, int n) {
        this.b = file;
        this.c = n;
    }

    @Override
    public void a() {
        this.a = this.c == -1 ? new are_1(this.b) : new are_1(this.b, this.c);
    }

    @Override
    public void b() {
        this.a.a(0L);
    }

    @Override
    public void c() {
        if (this.a != null) {
            this.a.close();
        }
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public void a(long l) {
        this.a.a(l);
    }

    @Override
    public long e() {
        return this.a.a();
    }

    @Override
    public long f() {
        return this.a.d();
    }

    @Override
    public String g() {
        return this.b.getPath();
    }

    @Override
    public String h() {
        return gi_0.k(this.b.getPath());
    }

    @Override
    public int i() {
        return this.a.b();
    }

    @Override
    public int a(byte[] byArray) {
        return this.a.a(byArray);
    }

    @Override
    public int a(byte[] byArray, int n, int n2) {
        return this.a.a(byArray, n, n2);
    }
}

