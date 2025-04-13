/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from csr
 */
public class csr_0
extends ps_0 {
    private long a;
    private boolean b;
    @Nullable
    private qg_1 c;

    @Override
    public boolean a(byte[] byArray) {
        boolean bl;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get() == 1;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.c = new qg_1();
            this.c.a(byteBuffer, epj.k);
        }
        return true;
    }

    @Override
    public int a() {
        return 13928;
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Nullable
    public qg_1 d() {
        return this.c;
    }
}

