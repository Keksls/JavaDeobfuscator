/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ffP
 */
class ffp_0
implements ffc_0 {
    private static final Logger a = Logger.getLogger(ffp_0.class);
    private int b;

    ffp_0() {
    }

    ffp_0(int n) {
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
        ffv2.d(this.b);
    }

    @Override
    public fff_0 b() {
        return fff_0.f;
    }

    public String toString() {
        return "PetColorChange{m_colorItemRefId='" + this.b + "'}";
    }
}

