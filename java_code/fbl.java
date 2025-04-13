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

public class fbl
extends fbi_0 {
    private static final Logger d = Logger.getLogger(fbl.class);
    public static final fbj c = new fbm();
    private long e;
    private byte[] f;
    private int g;
    private float h;
    private eb i;

    public fbl() {
        super(fbk.f);
    }

    public void a(long l) {
        this.e = l;
    }

    public void a(String string) {
        this.f = Cz.a(string);
    }

    public void b(int n) {
        this.g = n;
    }

    public void a(float f2) {
        this.h = f2;
    }

    public long g() {
        return this.e;
    }

    public String h() {
        return Cz.a(this.f);
    }

    public int i() {
        return this.g;
    }

    public float j() {
        return this.h;
    }

    public eb k() {
        return this.i;
    }

    public void a(eb eb2) {
        this.i = eb2;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            d.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
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
        if (faU2.dt() < 1) {
            return false;
        }
        int n2 = faU2.fE().c(n);
        return fbo_0.a().a(n2).a(fbs_0.c);
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.e);
        byteBuffer.putShort((short)this.f.length);
        byteBuffer.put(this.f);
        byteBuffer.putInt(this.g);
        byteBuffer.putFloat(this.h);
        if (this.i != null) {
            byte[] byArray = this.i.toByteArray();
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.e = byteBuffer.getLong();
        short s2 = byteBuffer.getShort();
        this.f = new byte[s2];
        byteBuffer.get(this.f);
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getFloat();
        short s3 = byteBuffer.getShort();
        if (s3 > 0) {
            byte[] byArray = new byte[s3];
            byteBuffer.get(byArray);
            this.i = fbl.a(byArray);
        }
        return true;
    }

    protected static eb a(byte[] byArray) {
        try {
            return eb.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new RuntimeException("Error when unserializing appearance", invalidProtocolBufferException);
        }
    }

    @Override
    public int b() {
        return 10 + this.f.length + 4 + 4 + 2 + (this.i != null ? this.i.getSerializedSize() : 0);
    }

    @Override
    public void c() {
        this.b = -1;
        this.e = -1L;
        this.f = null;
        this.g = 0;
        this.h = 0.0f;
        this.i = null;
    }
}

