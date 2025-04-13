/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class ffU
implements ffc_0 {
    private static final Logger a = Logger.getLogger(ffU.class);
    private String b;

    ffU() {
    }

    ffU(String string) {
        this.b = string;
    }

    @Override
    public byte[] a() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.b = Cz.a(byArray);
    }

    @Override
    public void a(ffv ffv2) {
        try {
            ffv2.a(this.b);
        }
        catch (fgm fgm2) {
            a.error((Object)"Impossible de changer le nom du familier", (Throwable)fgm2);
        }
    }

    @Override
    public fff_0 b() {
        return fff_0.a;
    }

    public String toString() {
        return "PetNameChangeEvent{m_name='" + this.b + "'}";
    }
}

