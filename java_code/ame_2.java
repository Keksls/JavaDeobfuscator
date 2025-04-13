/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aME
 */
public class ame_2
implements amx_1 {
    public ark_1 a;
    private final String b;
    private final arg_1 c;
    private final String d;

    public ame_2(arg_1 arg_12, String string, String string2) {
        this.b = string2;
        this.c = arg_12;
        this.d = string;
    }

    @Override
    public void a() {
        arh_1 arh_12 = this.c.a(this.d);
        StringBuilder stringBuilder = new StringBuilder();
        int n = arh_12.read();
        while (n != -1 && stringBuilder.length() < 3) {
            stringBuilder.append((char)n);
            n = arh_12.read();
        }
        arh_12.a(0L);
        this.a = stringBuilder.toString().toUpperCase().equals("OGG") ? arh_12 : new amh_2(arh_12);
        this.b();
    }

    @Override
    public void b() {
        this.a.a(0L);
    }

    @Override
    public void c() {
        this.a.close();
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
        return this.a.b();
    }

    @Override
    public int i() {
        return this.a.read();
    }

    @Override
    public int a(byte[] byArray) {
        return this.a.read(byArray);
    }

    @Override
    public int a(byte[] byArray, int n, int n2) {
        return this.a.read(byArray, n, n2);
    }

    @Override
    public String g() {
        return this.b;
    }

    @Override
    public String h() {
        return gi_0.k(this.b);
    }
}

