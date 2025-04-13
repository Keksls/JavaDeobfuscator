/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class crY
extends ps_0 {
    private long a;
    private long b;
    @Nullable
    private eZb c;
    private int d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        List<eZb> list = eyy_0.b(byArray2);
        this.c = list.isEmpty() ? null : list.get(0);
        this.d = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12286;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Nullable
    public eZb d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}

