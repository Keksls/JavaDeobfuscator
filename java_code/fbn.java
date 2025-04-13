/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbn
extends fbi_0 {
    private static final Logger d = Logger.getLogger(fbn.class);
    public static final fbj c = new fbo();
    private long e;
    private long f;

    public fbn() {
        super(fbk.g);
    }

    public void a(long l) {
        this.e = l;
    }

    public void b(long l) {
        this.f = l;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            d.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        faX2.a(this.e, this.f);
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
        return fbo_0.a().a(n2).a(fbs_0.e);
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.e);
        byteBuffer.putLong(this.f);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getLong();
        return true;
    }

    @Override
    public int b() {
        return 16;
    }

    @Override
    public void c() {
        this.b = -1;
        this.e = -1L;
        this.f = -1L;
    }

    public String toString() {
        return "NationCandidateVoteRequest{m_citizenId=" + this.e + ", m_candidateId=" + this.f + "}";
    }
}

