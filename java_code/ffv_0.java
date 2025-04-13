/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ffV
 */
class ffv_0
implements ffc_0 {
    private static final Logger a = Logger.getLogger(ffv_0.class);
    private long b;

    ffv_0() {
    }

    ffv_0(wu_0 wu_02) {
        this.b = wu_02.h();
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.b);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
    }

    @Override
    public void a(ffv ffv2) {
        try {
            if (this.b > 0L) {
                ffv2.c(wt_0.b(this.b));
            } else {
                ffv2.e();
            }
        }
        catch (fgm fgm2) {
            a.error((Object)"Impossible de changer la date de sommeil du familier", (Throwable)fgm2);
        }
    }

    @Override
    public fff_0 b() {
        return fff_0.h;
    }

    public String toString() {
        return "PetSleepDateChange{m_sleepDate=" + this.b + "}";
    }
}

