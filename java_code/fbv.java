/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbv
extends fbi_0 {
    private static final Logger d = Logger.getLogger(fbv.class);
    public static final fbj c = new fbw();
    private long e;

    public fbv() {
        super(fbk.e);
    }

    public void a(long l) {
        this.e = l;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            d.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        faX2.j(this.e);
    }

    @Override
    public boolean a(faU faU2) {
        return false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public int b() {
        return 8;
    }

    @Override
    public void c() {
        this.b = -1;
        this.e = -1L;
    }
}

