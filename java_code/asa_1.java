/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from asa
 */
public final class asa_1
extends arr_1 {
    private static final Logger f = Logger.getLogger(asa_1.class);
    private static final asa_1 g = new asa_1();

    public static asa_1 i() {
        return g;
    }

    private asa_1() {
        super("data.bdat", "indexes.bdat", true);
        this.setName("SimpleBinaryStorage");
    }

    public asa_1(String string) {
        super("data.bdat", "indexes.bdat", true);
        this.setName(string);
    }
}

