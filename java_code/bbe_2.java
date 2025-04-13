/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bBE
 */
public class bbe_2
extends bap_2 {
    protected static final Logger s = Logger.getLogger(bbe_2.class);
    public static final short t = 1;
    private int u;

    protected bbe_2() {
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.u = byteBuffer.getInt();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.f(true);
        this.g(true);
        this.b(true);
        this.u = -1;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public Tv ap_() {
        return null;
    }

    @Override
    protected Tv[] s() {
        return Tv.O;
    }

    @Override
    protected cSS[] u() {
        return cSS.k;
    }

    @Override
    public boolean au_() {
        ezr_0 ezr_02 = this.ao();
        return ezr_02 != null;
    }

    @Override
    public String al_() {
        ezr_0 ezr_02 = this.ao();
        if (ezr_02 != null) {
            return ezr_02.e();
        }
        return "<UNKNOWN>";
    }

    private ezr_0 ao() {
        Object r2 = eyo_1.g().d(this.u);
        if (r2 != null) {
            return r2;
        }
        Optional<Integer> optional = eum_1.a().a(this.aC());
        return optional.map(n -> eyo_1.g().d((int)n)).orElse(null);
    }

    @Override
    protected void a(oq_0 oq_02) {
    }

    @Override
    public ffs at_() {
        return ffs.a;
    }

    static /* synthetic */ void a(bbe_2 bbe_22, abm_1 abm_12) {
        bbe_22.a(abm_12);
    }
}

