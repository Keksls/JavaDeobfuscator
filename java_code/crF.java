/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class crF
extends ps_0 {
    private final ArrayList<abo_2<Byte, Long>> a = new ArrayList();
    private boolean b = false;
    private boolean c = false;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 3, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.get() == 1;
        int n = byteBuffer.get() & 0xFF;
        if (!this.a(byteBuffer.remaining(), n * 9, true)) {
            return false;
        }
        for (int k = 0; k < n; ++k) {
            byte by = byteBuffer.get();
            long l = byteBuffer.getLong();
            this.a.add(new abo_2<Byte, Long>(by, l));
        }
        return true;
    }

    @Override
    public int a() {
        return 13243;
    }

    public ArrayList<abo_2<Byte, Long>> b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}

