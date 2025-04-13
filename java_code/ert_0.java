/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRt
 */
class ert_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(ert_0.class);
    private erl_1 b;

    ert_0() {
    }

    ert_0(erl_1 erl_12) {
        this.b = erl_12;
    }

    @Override
    public byte[] a() {
        return eQw.a(this.b);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = eQw.d(byteBuffer);
    }

    @Override
    public void a(eQk eQk2) {
        try {
            eQk2.b(this.b.a(), this.b.f());
            eQk2.a(this.b.a(), this.b.c());
            eQk2.c(this.b.a(), this.b.e());
            eQk2.a(this.b.a(), this.b.d());
            eQk2.a(this.b.a(), this.b.g());
            eQk2.a(this.b.a(), this.b.h());
            eQk2.b(this.b.a(), this.b.k());
            eQk2.a(this.b.a(), this.b.m(), this.b.o());
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de modifier le membre", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.c;
    }

    public String toString() {
        return "ModifyMemberChange{m_member=" + this.b + "}";
    }
}

