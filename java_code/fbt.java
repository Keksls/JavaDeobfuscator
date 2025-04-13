/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbt
extends fbi_0 {
    private static final Logger d = Logger.getLogger(fbt.class);
    public static final fbj c = new fbu();
    private long e;
    private long f;
    private fcx_0 g;

    public fbt() {
        super(fbk.i);
    }

    public void a(long l) {
        this.e = l;
    }

    public void b(long l) {
        this.f = l;
    }

    public void a(fcx_0 fcx_02) {
        this.g = fcx_02;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            d.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        faX2.a(fcu_0.a(this.e), fcu_0.a(this.f), this.g);
    }

    @Override
    public boolean a(faU faU2) {
        faX faX2 = faU2.fE().m();
        if (faX2.c() != this.b) {
            return false;
        }
        fcq_0 fcq_02 = faX2.D().b(faU2.a_());
        if (fcq_02 == null) {
            return false;
        }
        if (fcq_02.b().a() != this.e) {
            return false;
        }
        return fcv_0.b(fcq_02.b(), fcu_0.a(this.e));
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.e);
        byteBuffer.putLong(this.f);
        byteBuffer.put(this.g.a());
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getLong();
        this.g = fcx_0.a(byteBuffer.get());
        return true;
    }

    @Override
    public int b() {
        return 17;
    }

    @Override
    public void c() {
        this.b = -1;
        this.e = -1L;
        this.f = -1L;
    }
}

