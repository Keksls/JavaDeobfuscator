/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fLN
 */
class fln_2
extends InputStream {
    RandomAccessFile a = null;
    final String b = "r";
    final /* synthetic */ flm_1 c;

    fln_2(flm_1 flm_12, String string) {
        this.c = flm_12;
        this.a = new RandomAccessFile(string, "r");
    }

    @Override
    public int read() {
        return this.a.read();
    }

    @Override
    public int read(@NotNull byte[] byArray) {
        return this.a.read(byArray);
    }

    @Override
    public int read(@NotNull byte[] byArray, int n, int n2) {
        return this.a.read(byArray, n, n2);
    }

    @Override
    public long skip(long l) {
        return this.a.skipBytes((int)l);
    }

    public long a() {
        return this.a.length();
    }

    public long b() {
        return this.a.getFilePointer();
    }

    @Override
    public int available() {
        return this.a.length() == this.a.getFilePointer() ? 0 : 1;
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public synchronized void mark(int n) {
    }

    @Override
    public synchronized void reset() {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    public void a(long l) {
        this.a.seek(l);
    }
}

