/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from boR
 */
public class bor_2 {
    private static final Logger a = Logger.getLogger(bor_2.class);
    private final bos_2 b;

    public bor_2(bos_2 bos_22) {
        this.b = bos_22;
    }

    public void a(biI biI2) {
        if (this.b.d() == 0L) {
            biI2.ck();
            return;
        }
        biI2.a(this.b);
    }
}

