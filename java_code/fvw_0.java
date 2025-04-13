/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uk.co.caprica.vlcj.player.direct.BufferFormat
 *  uk.co.caprica.vlcj.player.direct.BufferFormatCallback
 *  uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat
 */
import uk.co.caprica.vlcj.player.direct.BufferFormat;
import uk.co.caprica.vlcj.player.direct.BufferFormatCallback;
import uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat;

/*
 * Renamed from fvw
 */
class fvw_0
implements BufferFormatCallback {
    fvw_0() {
    }

    public BufferFormat getBufferFormat(int n, int n2) {
        return new RV32BufferFormat(n, n2);
    }
}

