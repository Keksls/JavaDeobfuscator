/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bYc
 */
public class byc_0
extends alk_2 {
    protected static final Logger a = Logger.getLogger(byc_0.class);
    private final Long b;

    public byc_0(long l) {
        this.b = l;
    }

    @Override
    public short a() {
        return 6;
    }

    @Override
    public akq_1 b() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof byc_0 && ((byc_0)object).b.equals(this.b);
    }
}

