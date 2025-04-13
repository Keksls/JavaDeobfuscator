/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Pl
 */
public abstract class pl_0
implements adc_2<ps_0> {
    protected static final Logger a = Logger.getLogger(pl_0.class);

    @Nullable
    public ps_0 a(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        int n = byteBuffer.remaining();
        if (n < 2) {
            byteBuffer.reset();
            return null;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 < 4) {
            a.error((Object)("D\u00e9codage impossible car taille trop petite (taille = " + n2 + ", minimum = 6"));
            return null;
        }
        if (byteBuffer.remaining() < 2) {
            byteBuffer.reset();
            return null;
        }
        short s2 = byteBuffer.getShort();
        if (byteBuffer.remaining() < n2 - 4) {
            byteBuffer.reset();
            return null;
        }
        int n3 = byteBuffer.position() + n2 - 4;
        ps_0 ps_02 = null;
        switch (s2) {
            case 360: {
                ps_02 = new Pr();
                break;
            }
            case 346: {
                ps_02 = new pu_0();
                break;
            }
            case 309: {
                ps_02 = new pv_0();
                break;
            }
            case 333: {
                ps_02 = new PC();
                break;
            }
            case 349: {
                ps_02 = new Py();
                break;
            }
            case 369: {
                ps_02 = new Pn();
                break;
            }
            case 356: {
                ps_02 = new PA();
                break;
            }
            case 36: {
                ps_02 = new Pp();
                break;
            }
            case 1: {
                ps_02 = new Pm();
                break;
            }
            case 22: {
                ps_02 = new pz_0();
                break;
            }
            default: {
                ps_02 = this.a(s2);
            }
        }
        if (ps_02 == null) {
            byteBuffer.position(n3);
            a.error((Object)("Le message type=" + s2 + " inconnu du d\u00e9codeur !"));
        }
        if (ps_02 != null && byteBuffer.remaining() != 0) {
            byte[] byArray = new byte[n2 - 4];
            byteBuffer.get(byArray);
            try {
                ps_02.a(byArray);
            }
            catch (Throwable throwable) {
                a.error((Object)"Exception during decode", throwable);
            }
        }
        return ps_02;
    }

    protected abstract ps_0 a(int var1);

    @Override
    @Nullable
    public /* synthetic */ adt_1 b(ByteBuffer byteBuffer) {
        return this.a(byteBuffer);
    }
}

