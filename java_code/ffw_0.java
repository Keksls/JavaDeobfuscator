/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ffW
 */
class ffw_0
implements ffc_0 {
    private static final Logger a = Logger.getLogger(ffw_0.class);
    private int b;

    ffw_0() {
    }

    ffw_0(int n) {
        this.b = n;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.b);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
    }

    @Override
    public void a(ffv ffv2) {
        try {
            if (this.b > 0) {
                ffv2.f(this.b);
            } else {
                ffv2.d();
            }
        }
        catch (fgm fgm2) {
            a.error((Object)"Impossible de changer l'objet de sommeil du familier", (Throwable)fgm2);
        }
    }

    @Override
    public fff_0 b() {
        return fff_0.i;
    }

    public String toString() {
        return "PetSleepRefItemIdChange{m_sleepRefItemId=" + this.b + "}";
    }
}

