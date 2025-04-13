/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cBE
 */
public final class cbe_0
extends ps_0 {
    private byte a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        if (byArray2.length > 0) {
            byteBuffer.get(byArray2);
            this.b = Cz.a(byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 22619;
    }

    public byte b() {
        return this.a;
    }

    @Nullable
    public String c() {
        return this.b;
    }
}

