/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from arH
 */
public class arh_1
extends InputStream
implements ark_1 {
    private final are_1 a;
    private final long b;
    private final long c;

    public arh_1(are_1 are_12, long l, long l2) {
        this.a = are_12;
        this.c = l;
        this.b = l2;
        are_12.a(l);
    }

    @Override
    public int read() {
        if (this.a.d() - this.c == this.b) {
            return -1;
        }
        return this.a.b();
    }

    @Override
    public int read(@NotNull byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(@NotNull byte[] byArray, int n, int n2) {
        long l = this.a.d() - this.c;
        return this.a.a(byArray, n, (int)Math.min(this.b - l, (long)n2));
    }

    @Override
    public void a(long l) {
        if (l < 0L) {
            throw new IOException("Position invalide dans le flux : " + l + ". Taille du fichier : " + this.b);
        }
        this.a.a(this.c + l);
    }

    @Override
    public long a() {
        return this.b;
    }

    @Override
    public long b() {
        return this.a.d() - this.c;
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
    public int available() {
        return (int)this.b;
    }
}

