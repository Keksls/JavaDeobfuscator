/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ffQ
 */
class ffq_0
implements ffc_0 {
    private static final Logger a = Logger.getLogger(ffq_0.class);
    private int b;

    ffq_0() {
    }

    ffq_0(int n) {
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
            if (this.b != 0) {
                ffv2.b(this.b);
            } else {
                ffv2.b();
            }
        }
        catch (fgm fgm2) {
            a.error((Object)"Impossible de changer le dernier repas du familier", (Throwable)fgm2);
        }
    }

    @Override
    public fff_0 b() {
        return fff_0.g;
    }

    public String toString() {
        return "PetEquipmentChange{m_equipmentRefItemId=" + this.b + "}";
    }
}

