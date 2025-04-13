/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.InputStream;

/*
 * Renamed from ask
 */
class ask_1
extends BufferedInputStream {
    public ask_1(InputStream inputStream) {
        super(inputStream);
    }

    public ask_1(InputStream inputStream, int n) {
        super(inputStream, n);
    }

    public void a(InputStream inputStream) {
        this.in = inputStream;
        this.pos = 0;
        this.count = 0;
        this.marklimit = 0;
        this.markpos = -1;
        this.buf = new byte[8192];
    }

    @Override
    public void close() {
        super.close();
    }
}

