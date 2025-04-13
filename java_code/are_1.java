/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.log4j.Logger;

/*
 * Renamed from arE
 */
public class are_1
implements Closeable {
    protected static final Logger a = Logger.getLogger(are_1.class);
    public static final int b = 1024;
    public static final int c = 0x100000;
    private final RandomAccessFile d;
    private final byte[] e;
    private final int f;
    private int g;
    private int h;
    private long i;

    public are_1(File file, int n) {
        this.d = new RandomAccessFile(file, "r");
        this.f();
        if (n <= 0 || n > 0x100000) {
            throw new IOException("Invalid buffer size: " + n);
        }
        this.e = new byte[n];
        this.f = this.e.length;
    }

    public are_1(File file) {
        this(file, 1024);
    }

    @Override
    public final void close() {
        this.d.close();
    }

    public final long a() {
        return this.d.length();
    }

    public final int b() {
        if (this.g >= this.h && this.e() < 0) {
            return -1;
        }
        if (this.h == 0) {
            return -1;
        }
        return this.e[this.g++];
    }

    public final int a(byte[] byArray) {
        return this.a(byArray, 0, byArray.length);
    }

    public final int a(byte[] byArray, int n, int n2) {
        if (this.g >= this.h && this.e() < 0) {
            return -1;
        }
        int n3 = Math.min(n2, this.h - this.g);
        System.arraycopy(this.e, this.g, byArray, n, n3);
        this.g += n3;
        return n3;
    }

    public final String c() {
        if (this.g >= this.h && this.e() < 0) {
            return null;
        }
        int n = -1;
        for (int k = this.g; k < this.h; ++k) {
            if (this.e[k] != 10) continue;
            n = k;
            break;
        }
        if (n < 0) {
            StringBuilder stringBuilder = new StringBuilder(100);
            int n2 = this.b();
            while (n2 != -1 && n2 != 10) {
                stringBuilder.append((char)n2);
                n2 = this.b();
            }
            if (n2 == -1 && stringBuilder.length() == 0) {
                return null;
            }
            if (stringBuilder.charAt(stringBuilder.length() - 1) == '\r') {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            return stringBuilder.toString();
        }
        String string = n > 0 && this.e[n - 1] == 13 ? new String(this.e, this.g, n - this.g - 1) : new String(this.e, this.g, n - this.g);
        this.g = n + 1;
        return string;
    }

    public final long d() {
        return this.i - (long)this.h + (long)this.g;
    }

    public final void a(long l) {
        int n = (int)(this.i - l);
        if (n >= 0 && n <= this.h) {
            this.g = this.h - n;
        } else {
            this.d.seek(l);
            this.f();
        }
    }

    private int e() {
        int n = this.d.read(this.e, 0, this.f);
        if (n >= 0) {
            this.i += (long)n;
            this.h = n;
            this.g = 0;
        }
        return n;
    }

    private void f() {
        this.h = 0;
        this.g = 0;
        this.i = this.d.getFilePointer();
    }
}

