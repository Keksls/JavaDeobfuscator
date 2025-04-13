/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from awH
 */
public abstract class awh_2<T extends avn_1>
extends awf_2<T> {
    private static final Logger c = Logger.getLogger(awh_2.class);
    public static final byte a = 1;
    public static final byte b = 2;

    public static avn_1 a(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return awy_1.c.c(dataInput, f2);
            }
            case 2: {
                return awz_1.c.c(dataInput, f2);
            }
        }
        c.error((Object)("type de condition inconnu " + by));
        return null;
    }

    @Override
    protected abstract boolean a(T var1, T var2);
}

