/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from awG
 */
public abstract class awg_2<T extends avj_1>
extends awf_2<T> {
    private static final Logger c = Logger.getLogger(awg_2.class);
    public static final byte a = 1;
    public static final byte b = 2;

    public static avj_1 a(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return awl_1.c.c(dataInput, f2);
            }
            case 2: {
                return awm_1.c.c(dataInput, f2);
            }
        }
        c.error((Object)("type de condition inconnu " + by));
        return null;
    }
}

