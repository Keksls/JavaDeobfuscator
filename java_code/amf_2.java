/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.net.URL;

/*
 * Renamed from aMF
 */
public class amf_2
implements amx_1 {
    private final URL a;
    private InputStream b;

    public amf_2(URL uRL) {
        this.a = uRL;
    }

    @Override
    public void a() {
        InputStream inputStream = this.a.openStream();
        StringBuilder stringBuilder = new StringBuilder();
        int n = inputStream.read();
        while (n != -1 && stringBuilder.length() < 3) {
            stringBuilder.append((char)n);
            n = inputStream.read();
        }
        inputStream.close();
        boolean bl = !stringBuilder.toString().toUpperCase().equals("OGG");
        this.b = bl ? new amg_2(this.a.openStream()) : this.a.openStream();
    }

    @Override
    public void b() {
        if (this.b != null) {
            this.b.close();
        }
        this.a();
    }

    @Override
    public void c() {
        if (this.b != null) {
            this.b.close();
            this.b = null;
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public long e() {
        return 0L;
    }

    @Override
    public long f() {
        return 0L;
    }

    @Override
    public int i() {
        return this.b.read();
    }

    @Override
    public int a(byte[] byArray) {
        return this.b.read(byArray);
    }

    @Override
    public int a(byte[] byArray, int n, int n2) {
        return this.b.read(byArray, n, n2);
    }

    @Override
    public String g() {
        return this.a.toString();
    }

    @Override
    public String h() {
        return gi_0.k(this.a.toString());
    }
}

