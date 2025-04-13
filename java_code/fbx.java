/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbx
extends fbi_0 {
    public static final byte c = 1;
    public static final byte d = 2;
    private static final Logger f = Logger.getLogger(fbx.class);
    public static final fbj e = new fby();
    private byte g;
    private long h;
    private byte i;

    public fbx() {
        super(fbk.j);
    }

    public void a(byte by) {
        this.g = by;
    }

    public void a(long l) {
        this.h = l;
    }

    public void a(fct_0 fct_02) {
        this.i = fct_02.a();
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            f.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        if (this.g == 1) {
            faX2.a(this.h, fct_0.a(this.i));
        } else if (this.g == 2) {
            faX2.b(this.h, fct_0.a(this.i));
        }
    }

    @Override
    public boolean a(faU faU2) {
        return false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.g);
        byteBuffer.putLong(this.h);
        byteBuffer.put(this.i);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.g = byteBuffer.get();
        this.h = byteBuffer.getLong();
        this.i = byteBuffer.get();
        return true;
    }

    @Override
    public int b() {
        return 10;
    }

    @Override
    public void c() {
        this.b = -1;
        this.g = (byte)-1;
        this.h = -1L;
        this.i = (byte)-1;
    }
}

