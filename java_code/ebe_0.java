/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from eBE
 */
public class ebe_0
implements emy_0 {
    private static final Logger a = Logger.getLogger(ebe_0.class);
    private final Collection<ebg_0> b = new ArrayList<ebg_0>();
    private long c;
    private long d;
    private int e;
    private long f;
    private String g;
    private int h;
    private boolean i;

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.c);
        abx_22.a(this.d);
        abx_22.a(this.e);
        abx_22.a(this.f);
        byte[] byArray = Cz.a(this.g);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.h);
        abx_22.a(this.i ? (byte)1 : 0);
        return abx_22.c();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.g = Cz.a(byArray);
        this.h = byteBuffer.getInt();
        this.i = byteBuffer.get() == 1;
    }

    @Override
    public end_0 e() {
        return end_0.b;
    }

    public long h() {
        return this.c;
    }

    public void a(long l) {
        this.c = l;
        this.l();
    }

    public long a() {
        return this.d;
    }

    public void b(long l) {
        this.d = l;
        this.m();
    }

    public int b() {
        return this.e;
    }

    public void a(int n) {
        this.e = n;
        this.n();
    }

    public long c() {
        return this.f;
    }

    public void c(long l) {
        this.f = l;
        this.o();
    }

    public String i() {
        return this.g;
    }

    public void a(String string) {
        this.g = string;
    }

    public int j() {
        return this.h;
    }

    public void b(int n) {
        this.h = n;
        this.p();
    }

    public void c(int n) {
        this.h += n;
        this.p();
    }

    public boolean k() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
        this.q();
    }

    public boolean a(ebg_0 ebg_02) {
        if (this.b.contains(ebg_02)) {
            return false;
        }
        return this.b.add(ebg_02);
    }

    public boolean b(ebg_0 ebg_02) {
        return this.b.remove(ebg_02);
    }

    private void l() {
        for (ebg_0 ebg_02 : this.b) {
            try {
                ebg_02.a();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void m() {
        for (ebg_0 ebg_02 : this.b) {
            try {
                ebg_02.b();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void n() {
        for (ebg_0 ebg_02 : this.b) {
            try {
                ebg_02.c();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void o() {
        for (ebg_0 ebg_02 : this.b) {
            try {
                ebg_02.d();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void p() {
        for (ebg_0 ebg_02 : this.b) {
            try {
                ebg_02.e();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void q() {
        for (ebg_0 ebg_02 : this.b) {
            try {
                ebg_02.f();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public String toString() {
        return "Company{m_accountId=" + this.c + ", m_companyChiefId=" + this.d + ", m_nationId=" + this.e + ", m_guildId=" + this.f + ", m_isActivated=" + this.i + "}";
    }
}

