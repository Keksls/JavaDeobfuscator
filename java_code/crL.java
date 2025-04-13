/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class crL
extends ps_0 {
    private final ArrayList<abp_2<Integer, Long, Short>> a = new ArrayList();
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            this.a.add(new abp_2<Integer, Long, Short>(byteBuffer.getInt(), byteBuffer.getLong(), byteBuffer.getShort()));
        }
        return true;
    }

    @Override
    public int a() {
        return 13191;
    }

    public ArrayList<abp_2<Integer, Long, Short>> b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

