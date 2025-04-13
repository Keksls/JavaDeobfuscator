/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class Uy
extends ua_0 {
    public Uy() {
    }

    public Uy(String string) {
        super(string);
    }

    public Uy(String string, ts_0 ts_02, ts_0 ts_03) {
        super(string + " (old item : " + ts_03 + " refid : " + (Serializable)(ts_03 == null ? "<null>" : Integer.valueOf(ts_03.aT_())) + " new item : " + ts_02 + " refid : " + (Serializable)(ts_02 == null ? "<null>" : Integer.valueOf(ts_02.aT_())));
    }

    public Uy(String string, Throwable throwable) {
        super(string, throwable);
    }

    public Uy(Throwable throwable) {
        super(throwable);
    }
}

