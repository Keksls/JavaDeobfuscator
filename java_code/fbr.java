/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbr
extends fbi_0 {
    public static final byte c = 1;
    public static final byte d = 2;
    public static final byte e = 3;
    public static final byte f = 4;
    public static final byte g = 5;
    private static final Logger i = Logger.getLogger(fbr.class);
    public static final fbj h = new fbs();
    private long j;
    private long k;
    private byte l;
    private int m;
    private float n;
    private eb o;

    public fbr() {
        super(fbk.h);
    }

    public void a(long l) {
        this.j = l;
    }

    public void b(int n) {
        this.m = n;
    }

    public long g() {
        return this.k;
    }

    public void b(long l) {
        this.k = l;
    }

    public void a(float f2) {
        this.n = f2;
    }

    public long h() {
        return this.j;
    }

    public int i() {
        return this.m;
    }

    public byte j() {
        return this.l;
    }

    public void a(byte by) {
        this.l = by;
    }

    public float k() {
        return this.n;
    }

    public eb l() {
        return this.o;
    }

    public void a(eb eb2) {
        this.o = eb2;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            i.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        faX2.a(this);
    }

    @Override
    public boolean a(faU faU2) {
        int n = faU2.fE().n();
        if (n != this.b) {
            return false;
        }
        return faU2.a_() == this.j;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.j);
        byteBuffer.putLong(this.k);
        byteBuffer.put(this.l);
        byteBuffer.putInt(this.m);
        byteBuffer.putFloat(this.n);
        if (this.o != null) {
            byteBuffer.put((byte)1);
            byteBuffer.put(this.o.toByteArray());
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.j = byteBuffer.getLong();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.get();
        this.m = byteBuffer.getInt();
        this.n = byteBuffer.getFloat();
        if (byteBuffer.get() == 1) {
            try {
                this.o = eb.a(byteBuffer);
            }
            catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                i.error((Object)"Error when unserializing appearance", (Throwable)invalidProtocolBufferException);
            }
        }
        return true;
    }

    @Override
    public int b() {
        return 26 + (this.o != null ? this.o.getSerializedSize() : 0);
    }

    @Override
    public void c() {
        this.b = -1;
        this.j = -1L;
        this.l = (byte)-1;
        this.m = 0;
        this.n = 0.0f;
    }
}

