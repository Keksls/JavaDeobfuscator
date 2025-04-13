/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from awE
 */
public abstract class awe_2<T extends avk_1>
extends awf_2<T> {
    private static final Logger c = Logger.getLogger(awd_2.class);
    public static final byte a = 1;
    public static final byte b = 2;

    public static avk_1 a(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return awp_2.c.c(dataInput, f2);
            }
            case 2: {
                return awq_2.c.c(dataInput, f2);
            }
        }
        c.error((Object)("type de definition inconnu " + by));
        return null;
    }
}

