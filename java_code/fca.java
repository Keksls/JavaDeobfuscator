/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fca {
    private static final Logger a = Logger.getLogger(fca.class);
    private final faX b;

    public fca(faX faX2) {
        this.b = faX2;
    }

    public final byte[] a(fby_0 fby_02) {
        int n = 1;
        for (fbz_0 fbz_02 : fby_02.a()) {
            fbu_0 object = this.b.a(fbz_02);
            if (object != null) {
                n += object.bg_();
                continue;
            }
            a.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration de la NationPart correspondant \u00e0 " + fbz_02 + " de la forme " + fby_02));
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put((byte)fby_02.ordinal());
        for (fbz_0 fbz_02 : fby_02.a()) {
            fbu_0 fbu_02 = this.b.a(fbz_02);
            if (fbu_02 != null) {
                fbu_02.a(byteBuffer);
                continue;
            }
            a.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration de la NationPart correspondant \u00e0 " + fbu_02 + " de la forme " + fby_02));
        }
        return byteBuffer.array();
    }

    public final void a(byte[] byArray, int n) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.get() & 0xFF;
        if (n2 < 0 || n2 >= fby_0.values().length) {
            a.error((Object)("Num\u00e9ro de part invalide : " + n2));
            return;
        }
        fby_0 fby_02 = fby_0.values()[n2];
        for (fbz_0 fbz_02 : fby_02.a()) {
            fbu_0 fbu_02 = this.b.a(fbz_02);
            if (fbu_02 != null) {
                fbu_02.a(byteBuffer, n);
                fbu_02.b();
                continue;
            }
            a.error((Object)("Impossible de trouver la NationPart correspondant \u00e0 " + fbz_02));
        }
    }

    public byte[] a(fbu_0 fbu_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(fbu_02.bg_());
        fbu_02.a(byteBuffer);
        return byteBuffer.array();
    }

    public void a(fbu_0 fbu_02, byte[] byArray, int n) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        fbu_02.a(byteBuffer, n);
        fbu_02.b();
    }
}

