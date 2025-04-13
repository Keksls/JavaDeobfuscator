/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJr
 */
public class ajr_1
implements ajh_2 {
    private long d = 0L;
    boolean a = false;
    boolean b = false;
    protected static final Logger c = Logger.getLogger("com.ankamagames.framework.net.torrent.storage");

    @Override
    public void a(ajg_2 ajg_22, String string, long l) {
        c.log(Level.FINE, "Cr\u00e9ation du fichier '" + string + "' de taille " + l + ": ");
    }

    @Override
    public void a(ajg_2 ajg_22, long l) {
        System.err.print(".");
        this.d += l;
        if (this.d == ajg_22.b().i()) {
            System.err.println();
            c.log(Level.INFO, "Allocation de m\u00e9moire termin\u00e9e");
        }
    }

    @Override
    public void a(ajg_2 ajg_22, int n, boolean bl) {
        if (!this.a && !this.b) {
            ais_2 ais_22 = ajg_22.b();
            if (ais_22 != null) {
                c.log(Level.INFO, "V\u00e9rification des " + ais_22.h() + " pieces: ");
            }
            this.b = true;
        }
        if (this.b) {
            if (bl) {
                System.err.print("+");
            } else {
                System.err.print("-");
            }
        } else {
            c.log(Level.FINE, "Got " + (bl ? "" : "BAD ") + "piece: " + n);
        }
    }

    @Override
    public void a(ajg_2 ajg_22) {
        this.a = true;
        this.b = false;
    }
}

