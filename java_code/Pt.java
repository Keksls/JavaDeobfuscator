/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TByteArrayList;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class Pt
extends Pw {
    private static final Logger e = Logger.getLogger(Pt.class);
    protected byte a;
    protected short b;
    protected final TByteArrayList c = new TByteArrayList(64);

    public void a(byte by) {
        this.a = by;
    }

    @Override
    public byte[] b() {
        if (this.c.size() > 65535) {
            e.error((Object)("Impossible d'encoder un message de taille " + this.c.size() + " > 0xFFFF"));
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + this.c.size());
        byteBuffer.putShort(this.b);
        byteBuffer.putShort((short)this.c.size());
        byteBuffer.put(this.c.toArray());
        return this.a(this.a, byteBuffer.array());
    }

    @Override
    public int a() {
        return 340;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public short c() {
        return this.b;
    }

    public void a(Object object) {
        if (object instanceof Integer) {
            this.a((Integer)object);
            return;
        }
        if (object instanceof Byte) {
            this.b((Byte)object);
            return;
        }
        if (object instanceof Long) {
            this.a((Long)object);
            return;
        }
        if (object instanceof Float) {
            this.a(((Float)object).floatValue());
            return;
        }
        if (object instanceof Short) {
            this.b((Short)object);
            return;
        }
        if (object instanceof Boolean) {
            this.a((Boolean)object);
            return;
        }
        if (object instanceof String) {
            this.a((String)object);
            return;
        }
        throw new IllegalArgumentException("type " + object.getClass().getSimpleName() + " non ajoutable au message");
    }

    public void a(String string) {
        byte[] byArray = Cz.a(string);
        if (byArray != null && byArray.length <= 65535) {
            this.b((short)byArray.length);
            this.c.add(byArray);
        } else {
            e.error((Object)"Impossible d'ajouter le param\u00e8tre de type cha\u00eene.");
        }
    }

    public void a(int n) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(n);
        this.c.add(byteBuffer.array());
    }

    public void a(boolean bl) {
        this.c.add(bl ? (byte)1 : 0);
    }

    public void b(byte by) {
        this.c.add(by);
    }

    public void a(long l) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(l);
        this.c.add(byteBuffer.array());
    }

    public void b(short s2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort(s2);
        this.c.add(byteBuffer.array());
    }

    public void a(float f2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putFloat(f2);
        this.c.add(byteBuffer.array());
    }
}

