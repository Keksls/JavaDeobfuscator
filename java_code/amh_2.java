/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aMH
 */
public class amh_2
extends InputStream
implements ark_1 {
    private final arh_1 a;

    public amh_2(arh_1 arh_12) {
        this.a = arh_12;
    }

    @Override
    public int read() {
        int n = this.a.read();
        if (n == -1) {
            return -1;
        }
        return (n - 1 + 256) % 256;
    }

    @Override
    public int read(@NotNull byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(@NotNull byte[] byArray, int n, int n2) {
        int n3 = this.a.read(byArray, n, n2);
        int n4 = n + n2;
        for (int k = n; k < n4; ++k) {
            byArray[k] = (byte)((byArray[k] - 1 + 256) % 256);
        }
        return n3;
    }

    @Override
    public long skip(long l) {
        return this.a.skip(l);
    }

    @Override
    public int available() {
        return this.a.available();
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public void mark(int n) {
    }

    @Override
    public void reset() {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public void a(long l) {
        this.a.a(l);
    }

    @Override
    public long a() {
        return this.a.a();
    }

    @Override
    public long b() {
        return this.a.b();
    }
}

