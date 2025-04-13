/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Strings
 */
import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import java.nio.ByteBuffer;

/*
 * Renamed from cBD
 */
public final class cbd_0
extends ps_0 {
    private long a;
    private long b;
    private String c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.c = new String(byArray2, Charsets.UTF_8);
        return true;
    }

    @Override
    public int a() {
        return 23506;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return Strings.emptyToNull((String)this.c);
    }

    public long d() {
        return this.b;
    }
}

