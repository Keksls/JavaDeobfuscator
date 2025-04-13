/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.LinkedList;

public final class QE
extends ps_0 {
    private long a;
    private boolean b;
    private byte[] c;
    private final LinkedList<abo_2<Long, byte[]>> d = new LinkedList();

    @Override
    public boolean a(byte[] byArray) {
        try {
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            this.a = byteBuffer.getLong();
            this.b = byteBuffer.get() == 1;
            int n = byteBuffer.getShort();
            if (n > 0) {
                this.c = new byte[n];
                byteBuffer.get(this.c);
            }
            n = byteBuffer.getShort();
            for (int k = 0; k < n; ++k) {
                long l = byteBuffer.getLong();
                byte[] byArray2 = new byte[byteBuffer.getShort()];
                byteBuffer.get(byArray2);
                this.d.add(new abo_2<Long, byte[]>(l, byArray2));
            }
        }
        catch (RuntimeException runtimeException) {
            A.error((Object)"Exception lev\u00e9e \u00e0 la d\u00e9s\u00e9rialisation d'un message de type GroupGlobalDataUpdateMessage");
            return false;
        }
        return true;
    }

    public boolean b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 1094;
    }

    public byte[] d() {
        return this.c;
    }

    public LinkedList<abo_2<Long, byte[]>> e() {
        return this.d;
    }
}

