/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class Wa
extends vl_0 {
    private static final int b = -1;
    protected sd_0 a;
    private static final Logger c = Logger.getLogger(Wa.class);
    private long d;
    private long e;

    protected Wa() {
    }

    public sd_0 g() {
        if (this.a != null && this.a.c() != this.d) {
            c.error((Object)("Le running effect n'est plus le m\u00eame qu'a la creation de l'event " + this.d));
            return null;
        }
        return this.a;
    }

    @Override
    public boolean b() {
        return this.a != null && this.a.c() == this.d;
    }

    protected void a(sd_0 sd_02) {
        this.a = sd_02;
        this.d = sd_02.c();
        this.a.a(this);
    }

    protected void a(long l) {
        this.e = l;
    }

    protected void b(sd_0 sd_02, long l) {
        this.a(sd_02);
        this.e = l;
    }

    @Override
    public long a() {
        long l = this.e;
        if (this.a == null) {
            return l;
        }
        Object FX = this.a.f();
        if (FX == null) {
            return l;
        }
        if (FX.e() && this.a.h() != null) {
            return this.a.h().a_();
        }
        return l;
    }

    @Override
    protected int c() {
        return 16;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        if (this.a == null) {
            byteBuffer.putLong(-1L);
        } else {
            byteBuffer.putLong(this.d);
        }
        byteBuffer.putLong(this.e);
    }

    @Override
    protected void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        if (l == -1L) {
            return;
        }
        sd_0 sd_02 = vz_02.b(l);
        if (sd_02 == null) {
            c.warn((Object)("D\u00e9s\u00e9rialisation de timeline : on ne trouve pas le RunningEffect d'UID " + l));
            return;
        }
        this.a(sd_02);
    }

    public void h() {
        this.a = null;
        this.f();
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{m_runningEffectId=" + this.d + ", m_targetId=" + this.e + "}";
    }
}

