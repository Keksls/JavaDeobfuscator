/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cvt
 */
public class cvt_1
extends ps_0 {
    private long a;
    private int b;
    private long c;
    @Nullable
    private String d;
    private long e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        if (n > 0) {
            byte[] byArray2 = new byte[n];
            byteBuffer.get(byArray2);
            this.d = Cz.a(byArray2);
            this.e = byteBuffer.getLong();
        } else {
            this.d = null;
            this.e = 0L;
        }
        return true;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.e;
    }

    @Nullable
    public String f() {
        return this.d;
    }

    @Override
    public int a() {
        return 13357;
    }
}

